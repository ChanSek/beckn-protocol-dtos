@file:UseSerializers(OffsetDateTimeSerializer::class)

package org.beckn.protocol.schemas

import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.beckn.protocol.serializers.OffsetDateTimeSerializer
import java.time.OffsetDateTime

@Serializable
data class ProtocolBilling @Default constructor(
  val name: String,
  val phone: String,
  val organization: ProtocolOrganization? = null,
  val address: ProtocolAddress? = null,
  val email: String? = null,
  val time: ProtocolTime? = null,
  val taxNumber: String? = null,
  val createdAt: OffsetDateTime? = null,
  val updatedAt: OffsetDateTime? = null
)

@Serializable
data class ProtocolOrganization @Default constructor(
  val name: String? = null,
  val cred: String? = null
)
