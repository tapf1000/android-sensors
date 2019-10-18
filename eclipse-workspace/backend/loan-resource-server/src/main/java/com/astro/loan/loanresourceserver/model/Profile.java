package com.astro.loan.loanresourceserver.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Profile {

    @Id
    @NotNull(message = "please enter phone number")
    private String phonenumber;
    @Column(name = "is_verified")
    private boolean isVerified;
    @NotNull(message = "Please enter agent number")
    @Column(name = "registeredby_agent")
    private String registeredbyAgent;
    @NotNull(message = "name cannot be null ")
    @Column(name = "first_names")
    private String firstNames;
    @NotNull(message = "enter admin number")
    @Column(name = "admin_number")
    private String adminNumber;
    @NotNull(message = "surname cannot be null")
    private String surname;
    @NotNull(message = "state country of birth")
    @Column(name = "country_of_birth")
    private String countryOfBirth;
    private String email;
    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;
    @NotNull(message ="please enter national ID number ")
    @Column(name = "national_id")
    private String nationalId;
    @NotNull(message ="please enter gender ")
    private String gender;
    @NotNull(message ="please select your title ")
    private String title;
    private String maidenSurname;
    @NotNull(message ="please enter number of dependancies")
    private int numberOfDependants;
    @NotNull(message ="please select your marital status")
    private String maritalStatus;
    @NotNull(message ="please select residence status")
    private String residenceStatus;
    @NotNull(message ="please enter home telephone")
    private String homeTelephone;
    @NotNull(message ="please enter current citizenship")
    private String currentCitizenship;

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

    public String getRegisteredbyAgent() {
        return registeredbyAgent;
    }

    public void setRegisteredbyAgent(String registeredbyAgent) {
        this.registeredbyAgent = registeredbyAgent;
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

    public String getAdminNumber() {
        return adminNumber;
    }

    public void setAdminNumber(String adminNumber) {
        this.adminNumber = adminNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }

    public String getCurrentCitizenship() {
        return currentCitizenship;
    }

    public void setCurrentCitizenship(String currentCitizenship) {
        this.currentCitizenship = currentCitizenship;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMaidenSurname() {
        return maidenSurname;
    }

    public void setMaidenSurname(String maidenSurname) {
        this.maidenSurname = maidenSurname;
    }

    public int getNumberOfDependants() {
        return numberOfDependants;
    }

    public void setNumberOfDependants(int numberOfDependants) {
        this.numberOfDependants = numberOfDependants;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getResidenceStatus() {
        return residenceStatus;
    }

    public void setResidenceStatus(String residenceStatus) {
        this.residenceStatus = residenceStatus;
    }

    public String getHomeTelephone() {
        return homeTelephone;
    }

    public void setHomeTelephone(String homeTelephone) {
        this.homeTelephone = homeTelephone;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "phonenumber='" + phonenumber + '\'' +
                ", isVerified=" + isVerified +
                ", registeredbyAgent='" + registeredbyAgent + '\'' +
                ", firstNames='" + firstNames + '\'' +
                ", adminNumber='" + adminNumber + '\'' +
                ", surname='" + surname + '\'' +
                ", countryOfBirth='" + countryOfBirth + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", nationalId='" + nationalId + '\'' +
                ", gender='" + gender + '\'' +
                ", title='" + title + '\'' +
                ", maidenSurname='" + maidenSurname + '\'' +
                ", numberOfDependants=" + numberOfDependants +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", residenceStatus='" + residenceStatus + '\'' +
                ", homeTelephone='" + homeTelephone + '\'' +
                ", currentCitizenship='" + currentCitizenship + '\'' +
                '}';
    }
}
