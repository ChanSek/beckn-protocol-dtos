package org.beckn.protocol.schemas

import kotlinx.serialization.Serializable

@Serializable
data class ProtocolOnSelectMessageSelected @Default constructor(
  val provider: ProtocolProvider? = null,
  val providerLocation: ProtocolLocation? = null,
  val items: List<ProtocolOnSelectedItem>? = null,
  val addOns: List<ProtocolAddOn>? = null,
  val offers: List<ProtocolOffer>? = null,
  val quote: ProtocolQuotation? = null
)

@Serializable
data class ProtocolSelectMessageSelected @Default constructor(
  val provider: ProtocolProvider? = null,
  val providerLocation: ProtocolLocation? = null,
  val items: List<ProtocolSelectedItem>? = null,
  val addOns: List<ProtocolAddOn>? = null,
  val offers: List<ProtocolOffer>? = null,
  val quote: ProtocolQuotation? = null
)

@Serializable
data class ProtocolOnSelectedItem @Default constructor(
  val id: String,
  val parentItemId: String? = null,
  val descriptor: ProtocolDescriptor? = null,
  val price: ProtocolPrice? = null,
  val categoryId: String? = null,
  val locationId: String? = null,
  val time: ProtocolTime? = null,
  val tags: Map<String, String>? = null,
  val quantity: ProtocolItemQuantity,
)

@Serializable
data class ProtocolSelectedItem @Default constructor(
  val id: String,
  val parentItemId: String? = null,
  val descriptor: ProtocolDescriptor? = null,
  val price: ProtocolPrice? = null,
  val categoryId: String? = null,
  val locationId: String? = null,
  val time: ProtocolTime? = null,
  val tags: Map<String, String>? = null,
  val quantity: ProtocolItemQuantityAllocated,
)

@Serializable
data class ProtocolItemQuantity @Default constructor(
  val allocated: ProtocolItemQuantityAllocated? = null,
  val available: ProtocolItemQuantityAllocated? = null,
  val maximum: ProtocolItemQuantityAllocated? = null,
  val minimum: ProtocolItemQuantityAllocated? = null,
  val selected: ProtocolItemQuantityAllocated? = null
)
