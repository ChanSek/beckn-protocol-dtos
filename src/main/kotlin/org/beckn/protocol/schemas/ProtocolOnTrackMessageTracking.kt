package org.beckn.protocol.schemas

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ProtocolOnTrackMessageTracking @Default constructor(
  val url: String? = null,
  val status: ProtocolTrackingStatus? = null,
) {
  enum class ProtocolTrackingStatus {
    @SerialName("active")
    Active,

    @SerialName("inactive")
    Inactive
  }
}