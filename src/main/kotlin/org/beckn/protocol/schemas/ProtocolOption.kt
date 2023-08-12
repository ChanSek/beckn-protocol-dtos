package org.beckn.protocol.schemas

import kotlinx.serialization.Serializable

@Serializable
data class ProtocolOption(
  val id: String,
  val descriptor: ProtocolDescriptor,
)
