package com.astro.loan.loanresourceserver.repository;

import com.astro.loan.loanresourceserver.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LoanRepository extends JpaRepository<Loan,Integer> {

    Optional<List<Loan>> getLoansByStatus(String status);
    Optional<Loan> findLoanByLoanId(String loanId);
}
