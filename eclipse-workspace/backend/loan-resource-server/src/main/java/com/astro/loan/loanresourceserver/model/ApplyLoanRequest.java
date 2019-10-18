package com.astro.loan.loanresourceserver.model;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

public class ApplyLoanRequest implements Serializable {

    private MultipartFile paySlip;

    public MultipartFile getPaySlip() {
        return paySlip;
    }

    public void setPaySlip(MultipartFile paySlip) {
        this.paySlip = paySlip;
    }

    @Override
    public String toString() {
        return "ApplyLoanRequest{" +
                "paySlip=" + paySlip +
                '}';
    }
}
