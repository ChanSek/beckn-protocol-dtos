@file:UseSerializers(OffsetDateTimeSerializer::class)

package org.beckn.protocol.schemas

import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.beckn.protocol.serializers.OffsetDateTimeSerializer
import java.time.OffsetDateTime

@Serializable
data class ProtocolOrder @Default constructor(
  val provider: ProtocolSelectMessageSelectedProvider? = null,
  val items: List<ProtocolSelectMessageSelectedItems>,
  val addOns: List<ProtocolSelectMessageSelectedAddOns>?,
  val offers: List<ProtocolSelectMessageSelectedOffers>?,
  val billing: ProtocolBilling,
  val fulfillment: ProtocolFulfillment,
  val quote: ProtocolQuotation? = null,
  val payment: ProtocolPayment? = null, //todo: is this surely nullable?
  val id: String? = null,
  val state: String? = null,
  val createdAt: OffsetDateTime? = null,
  val updatedAt: OffsetDateTime? = null
)

@Serializable
data class ProtocolSelectMessageSelectedProvider @Default constructor(
  val id: String,
  val locations: List<ProtocolSelectMessageSelectedProviderLocations>?
)

@Serializable
data class ProtocolSelectMessageSelectedProviderLocations @Default constructor(
  val id: String
)

// TODO can be common
@Serializable
data class ProtocolSelectMessageSelectedAddOns @Default constructor(
  val id: String
)

// TODO similar to OnInitMessageInitializedItems
@Serializable
data class ProtocolSelectMessageSelectedItems @Default constructor(
  val id: String,
  val quantity: ProtocolItemQuantityAllocated
)

@Serializable
data class ProtocolSelectMessageSelectedOffers @Default constructor(
  val id: String
)