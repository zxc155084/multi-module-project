package com.example.dona2_core.domain

import com.example.dona2_core.embeddable.AccountRoleId
import jakarta.persistence.*
import java.io.Serializable

@Entity
@Table(name = "account_role")
class AccountRole() : Serializable {

    @EmbeddedId
    lateinit var id: AccountRoleId

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("accountId")
    @JoinColumn(name = "account_id", nullable = false)
    lateinit var account: Account

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("roleId")
    @JoinColumn(name = "role_id", nullable = false)
    lateinit var role: Role

    constructor(account: Account, role: Role) : this() {
        this.account = account
        this.role = role
        this.id = AccountRoleId(account.id ?: "", role.id ?: "")
    }

    companion object {
        private const val serialVersionUID = 1L
    }
}
