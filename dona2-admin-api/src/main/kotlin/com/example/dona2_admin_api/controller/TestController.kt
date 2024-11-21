package com.example.dona2_admin_api.controller

import com.example.dona2_core.domain.Account
import com.example.dona2_core.domain.AccountRole
import com.example.dona2_core.domain.Role
import com.example.dona2_core.repository.AccountRepository
import com.example.dona2_core.repository.AccountRoleRepository
import com.example.dona2_core.repository.RoleRepository
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@Tag(name = "測試程式")
@RestController
@RequestMapping("test")
class TestController(
    @Autowired private val accountRepository: AccountRepository,
    private val roleRepository: RoleRepository,
    private val accountRoleRepository: AccountRoleRepository,
) {

    @GetMapping("testInsertAccount")
    @Operation(description = "測試InsertAccount")
    fun testInsertAccount(): ResponseEntity<Any> {
        val uname = "${UUID.randomUUID()}|test"
        val account = Account(
            username = uname,
            password = "{bcrypt}\$2a\$10\$mKe7VAD4FDZA61LGaiLpuOnSc3bRBxSrOa.KNIBUEPBfZgvsXyKwG",
            email = "a@a.com",
            name = "蕭志豪"
        )
        accountRepository.save(account)

        val role = Role(authority = "ROLE_USER_${UUID.randomUUID()}", attributes = "1")
        roleRepository.save(role)

        val role2 = Role(authority = "ROLE_ADMINE_${UUID.randomUUID()}", attributes = "2")
        roleRepository.save(role2)


        val accRoleList = listOf<AccountRole>(
            AccountRole(account = account, role = role),
            AccountRole(account = account, role = role2)
        )
        accountRoleRepository.saveAll(accRoleList)

        return ResponseEntity<Any>(account, HttpStatus.OK)
    }
}