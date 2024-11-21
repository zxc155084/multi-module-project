package com.example.dona2_core.domain

import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator

@Entity
@Table(name = "account")
data class Account(
    @Id
    @GeneratedValue(generator = "custom-id")
    @GenericGenerator(name = "custom-id", strategy = "com.example.dona2_core.src.DomainIdGenerator")
    var id: String? = null,

    @Column(nullable = false, unique = true)
    var username: String = "",

    @Column(nullable = false)
    var password: String = "",

    var email: String? = null,
    var name: String? = null,
) {
    // 無參構造函數
    constructor() : this(username = "", password = "")
}
