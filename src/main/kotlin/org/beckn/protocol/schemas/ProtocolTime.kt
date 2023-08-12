@file:UseSerializers(OffsetDateTimeSerializer::class)

package org.beckn.protocol.schemas

import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.beckn.protocol.serializers.OffsetDateTimeSerializer
import java.time.OffsetDateTime

@Serializable
data class ProtocolTime @Default constructor(
  val label: String? = null,
  val timestamp: OffsetDateTime? = null,
  val duration: String? = null,
  val range: ProtocolTimeRange? = null,
  val days: String? = null,
  val schedule: ProtocolSchedule? = null
)

@Serializable
data class ProtocolTimeRange @Default constructor(
  val start: OffsetDateTime? = null,
  val end: OffsetDateTime? = null
)
