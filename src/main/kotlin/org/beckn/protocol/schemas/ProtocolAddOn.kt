package org.beckn.protocol.schemas

import kotlinx.serialization.Serializable

@Serializable
data class ProtocolAddOn @Default constructor(
  val id: String? = null,
  val descriptor: ProtocolDescriptor? = null,
  val price: ProtocolPrice? = null
)
