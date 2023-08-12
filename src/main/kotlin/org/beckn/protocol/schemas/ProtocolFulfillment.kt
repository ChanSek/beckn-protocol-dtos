@file:UseSerializers(OffsetDateTimeSerializer::class, LocalDateSerializer::class)

package org.beckn.protocol.schemas

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.beckn.protocol.serializers.LocalDateSerializer
import org.beckn.protocol.serializers.OffsetDateTimeSerializer
import java.time.LocalDate
import java.time.OffsetDateTime

@Serializable
data class ProtocolFulfillment @Default constructor(
  val id: String? = null,
  val type: String? = null,//todo: is this a string or an enum?
  val state: ProtocolState? = null,
  val tracking: Boolean? = null,
  val agent: ProtocolPerson? = null,
  val person: ProtocolPerson? = null,
  val vehicle: ProtocolVehicle? = null,
  val start: ProtocolFulfillmentStart? = null,
  val end: ProtocolFulfillmentEnd? = null,
  val customer: ProtocolCustomer? = null,
  val tags: Map<String, String>? = null,
  @SerialName("provider_id")
  val providerId: String? = null,
  val rating: Int? = null
)

@Serializable
data class ProtocolCustomer @Default constructor(
  val person: ProtocolPerson? = null,
  val contact: ProtocolContact? = null
)

@Serializable
data class ProtocolState @Default constructor(
  val descriptor: ProtocolDescriptor? = null,
  val updatedAt: OffsetDateTime? = null,
  val updatedBy: String? = null
)

@Serializable
data class ProtocolPerson @Default constructor(
  val name: String? = null,
  val id: String? = null,
  val image: String? = null,
  val dob: LocalDate? = null,
  val gender: String? = null,
  val cred: String? = null,
  val tags: Map<String, String>? = null,
  val descriptor: ProtocolDescriptor? = null,
)

@Serializable
data class ProtocolVehicle @Default constructor(
  val category: String? = null,
  val capacity: Int? = null,
  val make: String? = null,
  val model: String? = null,
  val size: String? = null,
  val variant: String? = null,
  val color: String? = null,
  val energyType: String? = null,
  val registration: String? = null
)

// TODO Similar classes
@Serializable
data class ProtocolFulfillmentStart @Default constructor(
  val location: ProtocolLocation? = null,
  val time: ProtocolTime? = null,
  val instructions: ProtocolDescriptor? = null,
  val contact: ProtocolContact? = null
)

// TODO Similar classes
@Serializable
data class ProtocolFulfillmentEnd @Default constructor(
  val location: ProtocolLocation? = null,
  val time: ProtocolTime? = null,
  val instructions: ProtocolDescriptor? = null,
  val contact: ProtocolContact? = null
)

@Serializable
data class ProtocolContact @Default constructor(
  val phone: String? = null,
  val email: String? = null,
  val tags: Map<String, String>? = null
)