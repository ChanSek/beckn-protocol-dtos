package org.beckn.protocol.schemas

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.beckn.protocol.serializers.PriceSerializer

@Serializable(with = PriceSerializer::class)
data class ProtocolPrice @Default constructor(
  val currency: String,
  val value: String? = null,
  @SerialName("estimated_value") val estimatedValue: String? = null,
  @SerialName("computed_value") val computedValue: String? = null,
  @SerialName("listed_value") val listedValue: String? = null,
  @SerialName("offered_value") val offeredValue: String? = null,
  @SerialName("minimum_value") val minimumValue: String? = null,
  @SerialName("maximum_value") val maximumValue: String? = null,
)
