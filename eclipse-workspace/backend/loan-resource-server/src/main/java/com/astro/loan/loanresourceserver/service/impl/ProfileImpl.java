package com.astro.loan.loanresourceserver.service.impl;

import com.astro.loan.loanresourceserver.dto.StatusRequestDto;
import com.astro.loan.loanresourceserver.exceptions.UserAlreadyExistException;
import com.astro.loan.loanresourceserver.model.Profile;
import com.astro.loan.loanresourceserver.proxy.FileUploadProxy;
import com.astro.loan.loanresourceserver.repository.ProfileRepository;
import com.astro.loan.loanresourceserver.service.ProfileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileImpl implements ProfileService {

    @Autowired
    private FileUploadProxy fileUploadProxy;

    @Autowired
    private ProfileRepository profileRepository;
    private static final Logger logger = LoggerFactory.getLogger(ProfileService.class);

    public String saveProfile(Profile profile, @RequestParam("nationalId") MultipartFile nationalId, @RequestParam("proofOfResidence") MultipartFile proofOfResidence, @RequestParam("paySlip") MultipartFile paySlip, @RequestParam("bankStatement") MultipartFile bankStatement, @RequestParam("mugshot") MultipartFile mugshot){

        Optional<Profile> optionalProfile = profileRepository.findProfileByPhonenumber(profile.getPhonenumber());

        if(optionalProfile.isPresent()){
            throw new UserAlreadyExistException("User with the same phone number already exist");
        }
        Profile profile1 = profileRepository.save(profile);
        if(profile1 != null)
            fileUploadProxy.upload(profile.getPhonenumber(), nationalId, proofOfResidence, paySlip, bankStatement, mugshot);

        return "Successfully saved profile";
    }

    public List<Profile> getByStatus(boolean isVerified){
        logger.info("status DTO is "+isVerified);
        return profileRepository.findAllByStatus(isVerified).orElse(null);
    }

    public String verifyCustomer(String phonenumber, boolean status){
        Profile profile = profileRepository.findProfileByPhonenumber(phonenumber).orElse(null);
        profile.setVerified(status);
        profileRepository.save(profile);
        return "Successfully changed status ";
    }
}
