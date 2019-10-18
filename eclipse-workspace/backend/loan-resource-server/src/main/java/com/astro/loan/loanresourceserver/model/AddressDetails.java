package com.astro.loan.loanresourceserver.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AddressDetails {

    @Id
    private int id;
    private String addressStatus;
    private String currentHouseNumber;
    private String currentStreetName;
    private String currentCityOrTown;
    private String currentCountry;
    private int yearsAtCurrentAddress;
    private String postalPhysicalAddress;


    private String previousHouseNumber;
    private String previousStreetName;
    private String previousCityOrTown;
    private String previousCountry;
    private int yearsAtPreviousAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddressStatus() {
        return addressStatus;
    }

    public void setAddressStatus(String addressStatus) {
        this.addressStatus = addressStatus;
    }

    public String getCurrentHouseNumber() {
        return currentHouseNumber;
    }

    public void setCurrentHouseNumber(String currentHouseNumber) {
        this.currentHouseNumber = currentHouseNumber;
    }

    public String getCurrentStreetName() {
        return currentStreetName;
    }

    public void setCurrentStreetName(String currentStreetName) {
        this.currentStreetName = currentStreetName;
    }

    public String getCurrentCityOrTown() {
        return currentCityOrTown;
    }

    public void setCurrentCityOrTown(String currentCityOrTown) {
        this.currentCityOrTown = currentCityOrTown;
    }

    public String getCurrentCountry() {
        return currentCountry;
    }

    public void setCurrentCountry(String currentCountry) {
        this.currentCountry = currentCountry;
    }

    public int getYearsAtCurrentAddress() {
        return yearsAtCurrentAddress;
    }

    public void setYearsAtCurrentAddress(int yearsAtCurrentAddress) {
        this.yearsAtCurrentAddress = yearsAtCurrentAddress;
    }

    public String getPostalPhysicalAddress() {
        return postalPhysicalAddress;
    }

    public void setPostalPhysicalAddress(String postalPhysicalAddress) {
        this.postalPhysicalAddress = postalPhysicalAddress;
    }

    public String getPreviousHouseNumber() {
        return previousHouseNumber;
    }

    public void setPreviousHouseNumber(String previousHouseNumber) {
        this.previousHouseNumber = previousHouseNumber;
    }

    public String getPreviousStreetName() {
        return previousStreetName;
    }

    public void setPreviousStreetName(String previousStreetName) {
        this.previousStreetName = previousStreetName;
    }

    public String getPreviousCityOrTown() {
        return previousCityOrTown;
    }

    public void setPreviousCityOrTown(String previousCityOrTown) {
        this.previousCityOrTown = previousCityOrTown;
    }

    public String getPreviousCountry() {
        return previousCountry;
    }

    public void setPreviousCountry(String previousCountry) {
        this.previousCountry = previousCountry;
    }

    public int getYearsAtPreviousAddress() {
        return yearsAtPreviousAddress;
    }

    public void setYearsAtPreviousAddress(int yearsAtPreviousAddress) {
        this.yearsAtPreviousAddress = yearsAtPreviousAddress;
    }

    @Override
    public String toString() {
        return "AddressDetails{" +
                "id=" + id +
                ", addressStatus='" + addressStatus + '\'' +
                ", currentHouseNumber='" + currentHouseNumber + '\'' +
                ", currentStreetName='" + currentStreetName + '\'' +
                ", currentCityOrTown='" + currentCityOrTown + '\'' +
                ", currentCountry='" + currentCountry + '\'' +
                ", yearsAtCurrentAddress=" + yearsAtCurrentAddress +
                ", postalPhysicalAddress='" + postalPhysicalAddress + '\'' +
                ", previousHouseNumber='" + previousHouseNumber + '\'' +
                ", previousStreetName='" + previousStreetName + '\'' +
                ", previousCityOrTown='" + previousCityOrTown + '\'' +
                ", previousCountry='" + previousCountry + '\'' +
                ", yearsAtPreviousAddress=" + yearsAtPreviousAddress +
                '}';
    }
}
