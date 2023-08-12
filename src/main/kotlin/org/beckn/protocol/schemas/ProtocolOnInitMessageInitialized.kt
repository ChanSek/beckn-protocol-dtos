package org.beckn.protocol.schemas

import kotlinx.serialization.Serializable

@Serializable
data class ProtocolOnInitMessageInitialized @Default constructor(
  val provider: ProtocolOnInitMessageInitializedProvider? = null,
  val providerLocation: ProtocolOnInitMessageInitializedProviderLocation? = null,
  val items: List<ProtocolOnInitMessageInitializedItems>? = null,
  val addOns: List<ProtocolOnInitMessageInitializedAddOns>? = null,
  val offers: List<ProtocolOnInitMessageInitializedOffers>? = null,
  val billing: ProtocolBilling? = null,
  val fulfillment: ProtocolFulfillment? = null,
  val quote: ProtocolQuotation? = null,
  val payment: ProtocolPayment? = null
)

@Serializable
data class ProtocolOnInitMessageInitializedProviderLocation @Default constructor(
  val id: String? = null
)

@Serializable
data class ProtocolOnInitMessageInitializedProvider @Default constructor(
  val id: String? = null
)

@Serializable
data class ProtocolOnInitMessageInitializedItems @Default constructor(
  val id: String? = null,
  val quantity: ProtocolItemQuantityAllocated? = null
)

// TODO: Example of inline declaration
@Serializable
data class ProtocolItemQuantityAllocated @Default constructor(
  val count: Int? = null,
  val measure: ProtocolScalar? = null
)

@Serializable
data class ProtocolOnInitMessageInitializedAddOns @Default constructor(
  val id: String? = null
)

@Serializable
data class ProtocolOnInitMessageInitializedOffers @Default constructor(
  val id: String? = null
)

