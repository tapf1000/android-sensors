package com.astro.loan.loanresourceserver.controller;
import com.astro.loan.loanresourceserver.dto.StatusRequestDto;
import com.astro.loan.loanresourceserver.model.Profile;
import com.astro.loan.loanresourceserver.service.ProfileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.util.List;

@RestController
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    private static final Logger logger = LoggerFactory.getLogger(ProfileController.class);

    @PostMapping("/agent/save/profile")
    public String saveProfile(@RequestParam("gender") String gender,@RequestParam("nationalIdd") String nationalIdd,@RequestParam("email") String email, @RequestParam("dateOfBirth") String dateOfBirth, @RequestParam("firstNames") String firstNames, @RequestParam("surname") String surname, @RequestParam("countryOfBirth") String countryOfBirth, @RequestParam("phonenumber") String phonenumber,@RequestParam("verifiedByAdmin") String verifiedByAdmin, @RequestParam("agentmobilenumber") String agentmobilenumber, @RequestParam("nationalId") MultipartFile nationalId, @RequestParam("proofOfResidence") MultipartFile proofOfResidence, @RequestParam("paySlip") MultipartFile paySlip, @RequestParam("bankStatement") MultipartFile bankStatement, @RequestParam("mugshot") MultipartFile mugshot){
        Profile profile = new Profile();
        profile.setDateOfBirth(LocalDate.parse(dateOfBirth));
        profile.setNationalId(nationalIdd);
        profile.setPhonenumber(phonenumber);
        profile.setVerified(false);
        profile.setAdminNumber(verifiedByAdmin);
        profile.setCountryOfBirth(countryOfBirth);
        profile.setEmail(email);
        profile.setFirstNames(firstNames);
        profile.setSurname(surname);
        profile.setGender(gender);
        profile.setRegisteredbyAgent(agentmobilenumber);

        return profileService.saveProfile(profile,nationalId, proofOfResidence, paySlip, bankStatement, mugshot);
    }

    @GetMapping(value = "/customer/status/{isVerified}")
    public List<Profile> getCustomeryVerificationStatus(@PathVariable("isVerified") boolean isVerified){
        logger.info("Get loan where verification status is "+isVerified);

        return profileService.getByStatus(isVerified);
    }

    @GetMapping(value = "/verify/customer/{phonenumber}/{isVerified}")
    public String verifyCustomer(@PathVariable("phonenumber") String phonenumber,@PathVariable("isVerified") boolean isVerified){
        logger.info("Customer phonenumber is "+phonenumber+" and status is "+isVerified);

        return profileService.verifyCustomer(phonenumber,isVerified);
    }
}
