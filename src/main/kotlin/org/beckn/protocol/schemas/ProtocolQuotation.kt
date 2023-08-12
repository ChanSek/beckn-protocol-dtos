package org.beckn.protocol.schemas

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ProtocolQuotation @Default constructor(
  val price: ProtocolPrice? = null,
  val breakup: List<ProtocolQuotationBreakup>? = null,
  val ttl: String? = null
)

@Serializable
data class ProtocolQuotationBreakup @Default constructor(
  val title: String? = null,
  val price: ProtocolPrice? = null
) {

  enum class Type(val value: String) {
    ITEM("item"),
    OFFER("offer"),
    @SerialName("add-on")
    ADDON("add-on"),
    FULFILLMENT("fulfillment");
  }
}