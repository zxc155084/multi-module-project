package com.example.dona2_core.repository

import com.example.dona2_core.domain.Account
import com.example.dona2_core.domain.AccountRole
import com.example.dona2_core.domain.Role
import com.example.dona2_core.embeddable.AccountRoleId
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.transaction.annotation.Transactional

interface AccountRoleRepository : JpaRepository<AccountRole, AccountRoleId> {

    @Transactional
    @Modifying
    @Query("DELETE FROM AccountRole ar WHERE ar.account = :account")
    fun removeAllByAccount(@Param("account") account: Account): Int

    @Transactional
    @Modifying
    @Query("DELETE FROM AccountRole ar WHERE ar.role = :role")
    fun removeAllByRole(@Param("role") role: Role): Int
}