package com.example.dona2_core.embeddable

import jakarta.persistence.Column
import jakarta.persistence.Embeddable
import java.io.Serializable

@Embeddable
class AccountRoleId(
    @Column(name = "account_id")
    var accountId: String = "",

    @Column(name = "role_id")
    var roleId: String = ""
) : Serializable {

    companion object {
        private const val serialVersionUID = 1L
    }
}
