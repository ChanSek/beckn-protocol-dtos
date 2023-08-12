package org.beckn.protocol.schemas

import kotlinx.serialization.Serializable

@Serializable
data class ProtocolAck(
  val status: ResponseStatus
)
