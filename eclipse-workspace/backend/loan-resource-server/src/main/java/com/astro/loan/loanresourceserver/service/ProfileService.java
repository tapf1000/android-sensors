package com.astro.loan.loanresourceserver.service;

import com.astro.loan.loanresourceserver.model.Profile;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ProfileService {

    String saveProfile(Profile profile, @RequestParam("nationalIdPic") MultipartFile nationalIdPic, @RequestParam("proofOfResidence") MultipartFile proofOfResidence, @RequestParam("paySlip") MultipartFile paySlip, @RequestParam("bankStatement") MultipartFile bankStatement, @RequestParam("mugshot") MultipartFile mugshot);
    List<Profile> getByStatus(boolean isVerified);
    String verifyCustomer(String phonenumber, boolean status);
}
