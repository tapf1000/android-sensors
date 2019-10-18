package com.astro.loan.loanresourceserver.service.impl;

import com.astro.loan.loanresourceserver.dto.Message;
import com.astro.loan.loanresourceserver.exceptions.InvalidPeriodException;
import com.astro.loan.loanresourceserver.exceptions.MinimumAmountException;
import com.astro.loan.loanresourceserver.model.Loan;
import com.astro.loan.loanresourceserver.proxy.FileUploadProxy;
import com.astro.loan.loanresourceserver.proxy.MessagingProxy;
import com.astro.loan.loanresourceserver.repository.LoanRepository;
import com.astro.loan.loanresourceserver.service.ApplyLoanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class ApplyLoanImpl implements ApplyLoanService {

    @Autowired
    private LoanRepository loanRepository;

    private static final Logger logger = LoggerFactory.getLogger(ApplyLoanImpl.class);

    @Autowired
    private MessagingProxy messagingProxy;

    @Value("${loan.amount.maximum}")
    private double maximum;

    @Value("${loan.amount.minimum}")
    private double minimum;

    @Value("${loan.amount.rate}")
    private double interestRate;

    @Value("${loan.amount.salary}")
    private double salarayPercentage;

    @Value("${loan.period.maximum}")
    private double minPeriod;

    @Value("${loan.period.minimum}")
    private double maxPeriod;

    @Autowired
    private FileUploadProxy fileUploadProxy;


    public boolean validateLoanAmount(double loanAmount, int period){

        logger.info("Loan amount "+loanAmount+" period "+period+" months");

        if(period < minPeriod || period > maxPeriod) {
            if (loanAmount < minimum || loanAmount > maximum) {
                return false;
            } else {

                return true;
            }
        }
        else {
            throw new InvalidPeriodException("The minimum period for a loan is "+minPeriod+" /n "+" maximum is "+maxPeriod);
        }
    }

    public String caculateInterest(String loanId, String phonenumber, int months, double loanAmount, double salary, MultipartFile paySlip, MultipartFile bankStatement){

        logger.info("months "+months+" Loan amount "+loanAmount+" salary "+salary);
        double monthlyAmount;

        boolean validate = validateLoanAmount(loanAmount,months);

        if(validate){
           //monthlyAmount = (loanAmount * interestRate) + (loanAmount/months);
           monthlyAmount = (loanAmount * interestRate);

           logger.info("monthly amount "+monthlyAmount);

           if(compareSalary(salary,monthlyAmount)){
               Message message = new Message();
               message.setMessage("Your loan application of $ "+loanAmount+" has been submitted succcessfully. Loan ID is "+loanId);
               message.setPhonenumber(phonenumber);
               logger.info("message {}",message);

               messagingProxy.sendMessage(message);
               fileUploadProxy.update(phonenumber,paySlip,bankStatement);

               return "Your details have been successfuly Submitted, we will contact you soon";
           }
           else{
               return "Your salary does not meet your required borrow amount";
           }
        }
        else {
            throw new MinimumAmountException("The minimum amount for a loan is "+minimum+" /n "+" maximum is "+maximum);
        }
    }

    public boolean compareSalary(double salary, double monthlyAmount){

        logger.info("salary "+salary+" monthly amount "+monthlyAmount);
        double salaryPercent = salary*salarayPercentage;
        logger.info("salary percentage "+salaryPercent);

        if(salaryPercent > monthlyAmount){
            return true;
        }
        return false;
    }

    @Override
    public String saveLoan(Loan loan, MultipartFile paySlip, MultipartFile bankStatement){

        logger.info("recieved loan {}",loan);
        caculateInterest(loan.getLoanId(),loan.getPhonenumber(), loan.getMonths(), loan.getAmount(), loan.getSalary(), paySlip, bankStatement);
        loanRepository.save(loan);
        return "Successfully saved loan";
    }

    public List<Loan> findLoanByStatus(String status){
        return loanRepository.getLoansByStatus(status).orElse(null);
    }
}
