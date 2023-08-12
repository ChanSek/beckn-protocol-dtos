@file:UseSerializers(OffsetDateTimeSerializer::class)

package org.beckn.protocol.schemas

import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.beckn.protocol.serializers.OffsetDateTimeSerializer
import java.time.OffsetDateTime

@Serializable
data class ProtocolSchedule @Default constructor(
  val frequency: String? = null,
  val holidays: List<OffsetDateTime>? = null,
  val times: List<OffsetDateTime>? = null
)