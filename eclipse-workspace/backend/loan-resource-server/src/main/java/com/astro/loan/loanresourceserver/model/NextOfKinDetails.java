package com.astro.loan.loanresourceserver.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class NextOfKinDetails {

    @Id
    @NotNull(message = "please enter phone number")
    private String phonenumber;

    @NotNull(message = "name cannot be null ")
    @Column(name = "first_names")
    private String firstNames;

    @NotNull(message = "surname cannot be null")
    private String surname;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @NotNull(message ="please enter national ID number ")
    @Column(name = "national_id")
    private String nationalId;

    @NotNull(message ="please select your title ")
    private String title;

    private String maidenSurname;

    @NotNull(message ="please enter home telephone")
    private String homeTelephone;

    @NotNull(message ="please enter current citizenship")
    private String currentCitizenship;

    private String streetName;
    private String townOrCity;
    private String country;
    private String relationship;
    private String employer;
    private String proffesion;

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
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

    public String getTitle() {
        return title;
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

    public String getHomeTelephone() {
        return homeTelephone;
    }

    public void setHomeTelephone(String homeTelephone) {
        this.homeTelephone = homeTelephone;
    }

    public String getCurrentCitizenship() {
        return currentCitizenship;
    }

    public void setCurrentCitizenship(String currentCitizenship) {
        this.currentCitizenship = currentCitizenship;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getTownOrCity() {
        return townOrCity;
    }

    public void setTownOrCity(String townOrCity) {
        this.townOrCity = townOrCity;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getProffesion() {
        return proffesion;
    }

    public void setProffesion(String proffesion) {
        this.proffesion = proffesion;
    }

    @Override
    public String toString() {
        return "NextOfKinDetails{" +
                "phonenumber='" + phonenumber + '\'' +
                ", firstNames='" + firstNames + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", nationalId='" + nationalId + '\'' +
                ", title='" + title + '\'' +
                ", maidenSurname='" + maidenSurname + '\'' +
                ", homeTelephone='" + homeTelephone + '\'' +
                ", currentCitizenship='" + currentCitizenship + '\'' +
                ", streetName='" + streetName + '\'' +
                ", townOrCity='" + townOrCity + '\'' +
                ", country='" + country + '\'' +
                ", relationship='" + relationship + '\'' +
                ", employer='" + employer + '\'' +
                ", proffesion='" + proffesion + '\'' +
                '}';
    }
}
