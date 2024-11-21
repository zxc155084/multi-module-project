package com.example.dona2_core.repository

import com.example.dona2_core.domain.Role
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface RoleRepository : JpaRepository<Role, String>, JpaSpecificationExecutor<Role> {
}