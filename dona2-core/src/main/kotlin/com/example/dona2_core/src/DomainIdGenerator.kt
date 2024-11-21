package com.example.dona2_core.src

import org.hibernate.HibernateException
import org.hibernate.engine.spi.SharedSessionContractImplementor
import org.hibernate.id.IdentifierGenerator
import java.io.Serializable
import java.util.UUID
import com.google.common.base.CaseFormat

class DomainIdGenerator : IdentifierGenerator {

    @Throws(HibernateException::class)
    override fun generate(session: SharedSessionContractImplementor?, obj: Any?): Serializable {
        val className = obj?.javaClass?.simpleName ?: throw HibernateException("Object has no class name")
        val name = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_HYPHEN, className)
        return "$name-${UUID.randomUUID()}"
    }
}