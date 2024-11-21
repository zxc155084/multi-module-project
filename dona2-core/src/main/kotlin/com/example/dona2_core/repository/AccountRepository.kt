package com.example.dona2_core.repository

import com.example.dona2_core.domain.Account
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface AccountRepository : JpaRepository<Account, String>, JpaSpecificationExecutor<Account> {
}