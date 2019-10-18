package com.astro.loan.loanresourceserver.dto;

import com.astro.loan.loanresourceserver.model.Documents;

import java.time.LocalDate;
import java.util.List;

public class ProfileDto {


    private String phonenumber;

    private boolean isVerified;

    private String agentmobilenumber;

    private String firstNames;

    private String surname;

    private String countryOfBirth;

    private String email;

    private LocalDate dateOfBirth;

    private String nationalId;

    private List<Documents> documentsList;

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public String getAgentmobilenumber() {
        return agentmobilenumber;
    }

    public void setAgentmobilenumber(String agentmobilenumber) {
        this.agentmobilenumber = agentmobilenumber;
    }

    public String getFirstNames() {
        return firstNames;
    }

    public void setFirstNames(String firstNames) {
        this.firstNames = firstNames;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }


    public List<Documents> getDocumentsList() {
        return documentsList;
    }

    public void setDocumentsList(List<Documents> documentsList) {
        this.documentsList = documentsList;
    }


    @Override
    public String toString() {
        return "Profile{" +
                "phonenumber='" + phonenumber + '\'' +
                ", isVerified=" + isVerified +
                ", agentmobilenumber='" + agentmobilenumber + '\'' +
                ", firstNames='" + firstNames + '\'' +
                ", surname='" + surname + '\'' +
                ", countryOfBirth='" + countryOfBirth + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", nationalId='" + nationalId + '\'' +
                ", documentsList=" + documentsList +
                '}';
    }
}
