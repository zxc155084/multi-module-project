package com.example.dona2_core.domain

import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator

@Entity
@Table(name = "role")
data class Role(
    @Id
    @GeneratedValue(generator = "custom-id")
    @GenericGenerator(name = "custom-id", strategy = "com.example.dona2_core.src.DomainIdGenerator")
    var id: String? = null,

    @Column(nullable = false, unique = true)
    var authority: String = "",

    @Column(length = 30)
    var attributes: String? = null,
)
