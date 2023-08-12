@file:UseSerializers(URISerializer::class)

package org.beckn.protocol.schemas

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.beckn.protocol.serializers.URISerializer
import java.net.URI

@Serializable
data class ProtocolPayment @Default constructor(
  val uri: URI? = null,
  val tlMethod: TlMethod? = null,
  val params: Map<String, String>? = null,
  val type: Type? = null,
  val status: Status? = null,
  val time: ProtocolTime? = null
) {

  /**
   *
   * Values: get,post
   */
  @Serializable
  enum class TlMethod(val value: String) {
    @SerialName("http/get")
    GET("http/get"),
    @SerialName("http/post")
    POST("http/post");
  }

  /**
   *
   * Values: oNMinusORDER,pREMinusFULFILLMENT,oNMinusFULFILLMENT,pOSTMinusFULFILLMENT
   */
  @Serializable
  enum class Type(val value: String) {
    @SerialName("ON-ORDER")
    ONORDER("ON-ORDER"),
    @SerialName("PRE-FULFILLMENT")
    PREFULFILLMENT("PRE-FULFILLMENT"),
    @SerialName("ON-FULFILLMENT")
    ONFULFILLMENT("ON-FULFILLMENT"),
    @SerialName("POST-FULFILLMENT")
    POSTFULFILLMENT("POST-FULFILLMENT");
  }

  @Serializable
  enum class Status(val value: String) {
    PAID("PAID"),
    @SerialName("NOT-PAID")
    NOTPAID("NOT-PAID");
  }
}

@Serializable
data class PaymentParams @Default constructor(
  val transaction_id: String? = null,
  val transaction_status: String? = null,
  val amount: String? = null,
  val currency: ProtocolPrice? = null,
)