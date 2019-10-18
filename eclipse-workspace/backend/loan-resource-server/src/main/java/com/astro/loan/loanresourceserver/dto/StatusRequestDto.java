package com.astro.loan.loanresourceserver.dto;

public class StatusRequestDto {
    private boolean verified;

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    @Override
    public String toString() {
        return "StatusRequestDto{" +
                "verified=" + verified +
                '}';
    }
}
