package com.astro.loan.loanresourceserver.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class EmploymentDetails {

    @Id
    private int id;
    private String nameOfEmployer;
    private String employerContactPerson;
    private String employeeNumber;
    private LocalDate dateJoined;
    private double grossSalary;
    private int yearsAtCurrentEmployer;
    private String employerTelNumber;
    private String districtAndPayrollAreaCode;
    private String proffession;
    private LocalDate expiryOfEmployment;
    private double netSalaryAsPerCurrentPayslip;
    private int yearsAtPreviousEmployer;
    private String employerAddress;
    private String employerTown;
    private String employerCountry;

    private String employerMailingAddressTownOrCity;
    private String employerMailingAddressCountry;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfEmployer() {
        return nameOfEmployer;
    }

    public void setNameOfEmployer(String nameOfEmployer) {
        this.nameOfEmployer = nameOfEmployer;
    }

    public String getEmployerContactPerson() {
        return employerContactPerson;
    }

    public void setEmployerContactPerson(String employerContactPerson) {
        this.employerContactPerson = employerContactPerson;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public LocalDate getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(LocalDate dateJoined) {
        this.dateJoined = dateJoined;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public int getYearsAtCurrentEmployer() {
        return yearsAtCurrentEmployer;
    }

    public void setYearsAtCurrentEmployer(int yearsAtCurrentEmployer) {
        this.yearsAtCurrentEmployer = yearsAtCurrentEmployer;
    }

    public String getEmployerTelNumber() {
        return employerTelNumber;
    }

    public void setEmployerTelNumber(String employerTelNumber) {
        this.employerTelNumber = employerTelNumber;
    }

    public String getDistrictAndPayrollAreaCode() {
        return districtAndPayrollAreaCode;
    }

    public void setDistrictAndPayrollAreaCode(String districtAndPayrollAreaCode) {
        this.districtAndPayrollAreaCode = districtAndPayrollAreaCode;
    }

    public String getProffession() {
        return proffession;
    }

    public void setProffession(String proffession) {
        this.proffession = proffession;
    }

    public LocalDate getExpiryOfEmployment() {
        return expiryOfEmployment;
    }

    public void setExpiryOfEmployment(LocalDate expiryOfEmployment) {
        this.expiryOfEmployment = expiryOfEmployment;
    }

    public double getNetSalaryAsPerCurrentPayslip() {
        return netSalaryAsPerCurrentPayslip;
    }

    public void setNetSalaryAsPerCurrentPayslip(double netSalaryAsPerCurrentPayslip) {
        this.netSalaryAsPerCurrentPayslip = netSalaryAsPerCurrentPayslip;
    }

    public int getYearsAtPreviousEmployer() {
        return yearsAtPreviousEmployer;
    }

    public void setYearsAtPreviousEmployer(int yearsAtPreviousEmployer) {
        this.yearsAtPreviousEmployer = yearsAtPreviousEmployer;
    }

    public String getEmployerAddress() {
        return employerAddress;
    }

    public void setEmployerAddress(String employerAddress) {
        this.employerAddress = employerAddress;
    }

    public String getEmployerTown() {
        return employerTown;
    }

    public void setEmployerTown(String employerTown) {
        this.employerTown = employerTown;
    }

    public String getEmployerCountry() {
        return employerCountry;
    }

    public void setEmployerCountry(String employerCountry) {
        this.employerCountry = employerCountry;
    }

    public String getEmployerMailingAddressTownOrCity() {
        return employerMailingAddressTownOrCity;
    }

    public void setEmployerMailingAddressTownOrCity(String employerMailingAddressTownOrCity) {
        this.employerMailingAddressTownOrCity = employerMailingAddressTownOrCity;
    }

    public String getEmployerMailingAddressCountry() {
        return employerMailingAddressCountry;
    }

    public void setEmployerMailingAddressCountry(String employerMailingAddressCountry) {
        this.employerMailingAddressCountry = employerMailingAddressCountry;
    }
}
