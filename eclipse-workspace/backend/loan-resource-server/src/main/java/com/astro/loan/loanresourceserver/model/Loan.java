package com.astro.loan.loanresourceserver.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Loan {

    @Id
    private int id;

    @NotNull(message = "please enter type of loan")
    @Column(name = "loan_type")
    private String loanType;
    @Column(name = "loan_id")
    private String loanId;
    @Column(name = "approved_by")
    private String approvedBy;
    private int months;
    private double salary;
    @Column(name = "recommended_by")
    private String recommendedBy;
    @NotNull(message = "please enter amount")
    private Double amount;

    private String status;
    @Column(name = "application_date")
    private LocalDate applicationDate;

    private String phonenumber;

    private String message;


    private String purposeOfLoan;
    private String disbursmentOption;
    private double existingLoanAmount;
    private double approvedLoanAmount;
    private double loanInsuranceFees;
    private double loanApplicationFees;
    private double arrangmentFees;
    private double cashDisbursed;
    private double interestRate;
    private int numberOfInstallments;
    private double monthlyPayment;



    
    public String getPurposeOfLoan() {
        return purposeOfLoan;
    }

    public void setPurposeOfLoan(String purposeOfLoan) {
        this.purposeOfLoan = purposeOfLoan;
    }

    public String getDisbursmentOption() {
        return disbursmentOption;
    }

    public void setDisbursmentOption(String disbursmentOption) {
        this.disbursmentOption = disbursmentOption;
    }

    public double getExistingLoanAmount() {
        return existingLoanAmount;
    }

    public void setExistingLoanAmount(double existingLoanAmount) {
        this.existingLoanAmount = existingLoanAmount;
    }

    public double getApprovedLoanAmount() {
        return approvedLoanAmount;
    }

    public void setApprovedLoanAmount(double approvedLoanAmount) {
        this.approvedLoanAmount = approvedLoanAmount;
    }

    public double getLoanInsuranceFees() {
        return loanInsuranceFees;
    }

    public void setLoanInsuranceFees(double loanInsuranceFees) {
        this.loanInsuranceFees = loanInsuranceFees;
    }

    public double getLoanApplicationFees() {
        return loanApplicationFees;
    }

    public void setLoanApplicationFees(double loanApplicationFees) {
        this.loanApplicationFees = loanApplicationFees;
    }

    public double getArrangmentFees() {
        return arrangmentFees;
    }

    public void setArrangmentFees(double arrangmentFees) {
        this.arrangmentFees = arrangmentFees;
    }

    public double getCashDisbursed() {
        return cashDisbursed;
    }

    public void setCashDisbursed(double cashDisbursed) {
        this.cashDisbursed = cashDisbursed;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getNumberOfInstallments() {
        return numberOfInstallments;
    }

    public void setNumberOfInstallments(int numberOfInstallments) {
        this.numberOfInstallments = numberOfInstallments;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMonths() {
        return months;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(LocalDate applicationDate) {
        this.applicationDate = applicationDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRecommendedBy() {
        return recommendedBy;
    }

    public void setRecommendedBy(String recommendedBy) {
        this.recommendedBy = recommendedBy;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", loanType='" + loanType + '\'' +
                ", loanId='" + loanId + '\'' +
                ", approvedBy='" + approvedBy + '\'' +
                ", months=" + months +
                ", salary=" + salary +
                ", recommendedBy='" + recommendedBy + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                ", applicationDate=" + applicationDate +
                ", phonenumber='" + phonenumber + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
