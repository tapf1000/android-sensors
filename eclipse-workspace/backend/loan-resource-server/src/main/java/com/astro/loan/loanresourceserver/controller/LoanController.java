package com.astro.loan.loanresourceserver.controller;

import com.astro.loan.loanresourceserver.model.Loan;
import com.astro.loan.loanresourceserver.model.Profile;
import com.astro.loan.loanresourceserver.proxy.FileUploadProxy;
import com.astro.loan.loanresourceserver.service.ApplyLoanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.util.List;

@RestController
public class LoanController {

    @Autowired
    private ApplyLoanService applyLoanService;

    private static final Logger logger = LoggerFactory.getLogger(LoanController.class);

    @PostMapping(value = "/loan/application",consumes = {"multipart/form-data"})
    public String getLoan(@RequestParam("recommendedBy") String recommendedBy,@RequestParam("loanType") String loanType,@RequestParam("status") String status,@RequestParam("loanId") String loanId,@RequestParam("approvedBy") String approvedBy,@RequestParam("salary") double salary,@RequestParam("amount") double amount,@RequestParam("phonenumber") String phonenumber,@RequestParam("months") int months,@RequestParam("paySlip") MultipartFile paySlip, @RequestParam("bankStatement") MultipartFile bankStatement){
        logger.info("recieved loan application from "+phonenumber);

        Loan loan = new Loan();
        loan.setPhonenumber(phonenumber);
        loan.setMonths(months);
        loan.setSalary(salary);
        loan.setAmount(amount);
        loan.setLoanType(loanType);
        loan.setApplicationDate(LocalDate.now());
        loan.setStatus(status);
        loan.setLoanId(loanId);
        loan.setApprovedBy(approvedBy);
        loan.setRecommendedBy(recommendedBy);

        return applyLoanService.saveLoan( loan,  paySlip, bankStatement);
    }

    @GetMapping(value = "/loan/status/{status}")
    public List<Loan> getLoanByVerificationStatus(@PathVariable("status") String status){
        return applyLoanService.findLoanByStatus(status);
    }
}
