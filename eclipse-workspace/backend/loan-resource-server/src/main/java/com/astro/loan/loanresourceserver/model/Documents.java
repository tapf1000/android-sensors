package com.astro.loan.loanresourceserver.model;

public class Documents {

    private int id;
    private String nationalId;
    private String proofOfResidence;
    private String paySlip;
    private String bankStatement;
    private String mugshot;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getProofOfResidence() {
        return proofOfResidence;
    }

    public void setProofOfResidence(String proofOfResidence) {
        this.proofOfResidence = proofOfResidence;
    }

    public String getPaySlip() {
        return paySlip;
    }

    public void setPaySlip(String paySlip) {
        this.paySlip = paySlip;
    }

    public String getBankStatement() {
        return bankStatement;
    }

    public void setBankStatement(String bankStatement) {
        this.bankStatement = bankStatement;
    }

    public String getMugshot() {
        return mugshot;
    }

    public void setMugshot(String mugshot) {
        this.mugshot = mugshot;
    }

    @Override
    public String toString() {
        return "Documents{" +
                "id=" + id +
                ", nationalId='" + nationalId + '\'' +
                ", proofOfResidence='" + proofOfResidence + '\'' +
                ", paySlip='" + paySlip + '\'' +
                ", bankStatement='" + bankStatement + '\'' +
                ", mugshot='" + mugshot + '\'' +
                '}';
    }
}
