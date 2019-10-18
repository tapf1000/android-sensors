package com.astro.loan.loanresourceserver.repository;

import com.astro.loan.loanresourceserver.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProfileRepository extends JpaRepository<Profile,String> {


    Optional<Profile> findProfileByPhonenumber(String phonenumber);

    @Query("from Profile where isVerified=:isVerified")
    Optional<List<Profile>> findAllByStatus(boolean isVerified);

}
