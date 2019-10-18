package com.astro.loan.loanresourceserver.service;

import com.astro.loan.loanresourceserver.model.Loan;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ApplyLoanService {

    boolean validateLoanAmount(double loanAmount, int period);

    String caculateInterest(String loanId,String phonenumber,int months, double loanAmount, double Salary, MultipartFile paySlip, MultipartFile bankStatement);

    String saveLoan(Loan loan, MultipartFile paySlip, MultipartFile bankStatement);

    List<Loan> findLoanByStatus(String status);

}
