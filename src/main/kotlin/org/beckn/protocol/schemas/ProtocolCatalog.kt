@file:UseSerializers(LocalDateTimeSerializer::class)
package org.beckn.protocol.schemas

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.UseSerializers
import org.beckn.protocol.serializers.LocalDateTimeSerializer
import java.time.LocalDateTime

@Serializable
data class ProtocolCatalog @Default constructor(
  @SerialName("bpp/descriptor") val bppDescriptor: ProtocolDescriptor? = null,
  @SerialName("bpp/providers") val bppProviders: List<ProtocolProviderCatalog>? = null,
  @SerialName("bpp/categories") val bppCategories: List<ProtocolCategory>? = null,
  val id: String? = null,
  val exp: LocalDateTime? = null
)

@Serializable
data class ProtocolProviderCatalog @Default constructor(
  val id: String? = null,
  val descriptor: ProtocolDescriptor? = null,
  val locations: List<ProtocolLocation>? = null,
  val categories: List<ProtocolCategory>? = null,
  val items: List<ProtocolItem>? = null,
  val fulfillments: List<ProtocolFulfillment>? = null,
  val tags: Map<String, String>? = null,
  val exp: LocalDateTime? = null,
  val matched: Boolean? = null
)