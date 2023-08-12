package org.beckn.protocol.schemas

import kotlinx.serialization.Serializable

@Serializable
data class ProtocolOnRatingMessageFeedback @Default constructor(
  val id: String? = null,
  val descriptor: String? = null,
  val parentId: String? = null,
)