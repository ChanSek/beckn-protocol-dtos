@file:UseSerializers(BigDecimalSerializer::class)

package org.beckn.protocol.schemas

import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.beckn.protocol.serializers.BigDecimalSerializer
import java.math.BigDecimal

@Serializable
data class ProtocolLocation @Default constructor(
  val id: String? = null,
  val descriptor: ProtocolDescriptor? = null,
  val gps: String? = null,
  val address: ProtocolAddress? = null,
  val stationCode: String? = null,
  val city: ProtocolCity? = null,
  val country: ProtocolCountry? = null,
  val circle: ProtocolCircle? = null,
  val polygon: String? = null,
  val `3dspace`: String? = null
)

@Serializable
data class ProtocolCity @Default constructor(
  val name: String? = null,
  val code: String? = null
)

@Serializable
data class ProtocolCountry @Default constructor(
  val name: String? = null,
  val code: String? = null
)

@Serializable
data class ProtocolCircle @Default constructor(
  val radius: ProtocolScalar? = null
)

@Serializable
data class ProtocolScalar @Default constructor(
  val value: BigDecimal,
  val unit: String,
  val type: Type? = null,
  val estimatedValue: BigDecimal? = null,
  val computedValue: BigDecimal? = null,
  val range: ProtocolScalarRange? = null
) {

  @Serializable
  enum class Type(val value: String) {
    CONSTANT("CONSTANT"),
    VARIABLE("VARIABLE");
  }
}

@Serializable
data class ProtocolScalarRange @Default constructor(
  val min: BigDecimal? = null,
  val max: BigDecimal? = null
)