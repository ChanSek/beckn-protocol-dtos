package org.beckn.protocol.schemas

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ProtocolDescriptor @Default constructor(
  val name: String?,
  val code: String? = null,
  val symbol: String? = null,
  val shortDesc: String? = null,
  val longDesc: String? = null,
  val images: List<String>? = null,
  val audio: String? = null,
  @SerialName("3d_render") val threeDRender: String? = null
)
