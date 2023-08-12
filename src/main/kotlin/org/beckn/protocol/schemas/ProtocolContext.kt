@file:UseSerializers(OffsetDateTimeSerializer::class)

package org.beckn.protocol.schemas

import kotlinx.serialization.Transient
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.UseSerializers
import org.beckn.protocol.serializers.OffsetDateTimeSerializer
import java.time.Clock
import java.time.OffsetDateTime

@Serializable
data class ProtocolContext @Default constructor(
  val domain: String,
  val country: String,
  val city: String,
  val action: Action?,
  val coreVersion: String,
  val bapId: String? = null,
  val bapUri: String? = null,
  val bppId: String? = null,
  val bppUri: String? = null,
  val transactionId: String = "d4d65ff8-0d60-49bf-9288-a07261bb3f29",
  val messageId: String = "d883b720-2100-4a4e-a779-8685cd501e94",
  @Transient val clock: Clock = Clock.systemUTC(),
  val timestamp: OffsetDateTime = OffsetDateTime.now(clock),
  val key: String? = null,
  val ttl: String? = null,
) {
  enum class Action(val value: String) {
    @SerialName("search")
    SEARCH("search"),
    @SerialName("select")
    SELECT("select"),
    @SerialName("init")
    INIT("`init`"),
    @SerialName("confirm")
    CONFIRM("confirm"),
    @SerialName("update")
    UPDATE("update"),
    @SerialName("status")
    STATUS("status"),
    @SerialName("track")
    TRACK("track"),
    @SerialName("cancel")
    CANCEL("cancel"),
    @SerialName("rating")
    RATING("rating"),
    @SerialName("support")
    SUPPORT("support"),
    @SerialName("on_search")
    ON_SEARCH("on_search"),
    @SerialName("on_select")
    ON_SELECT("on_select"),
    @SerialName("on_init")
    ON_INIT("on_init"),
    @SerialName("on_confirm")
    ON_CONFIRM("on_confirm"),
    @SerialName("on_update")
    ON_UPDATE("on_update"),
    @SerialName("on_status")
    ON_STATUS("on_status"),
    @SerialName("on_track")
    ON_TRACK("on_track"),
    @SerialName("on_cancel")
    ON_CANCEL("on_cancel"),
    @SerialName("on_rating")
    ON_RATING("on_rating"),
    @SerialName("on_support")
    ON_SUPPORT("on_support")
  }
}