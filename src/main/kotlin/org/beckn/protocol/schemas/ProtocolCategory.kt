@file:UseSerializers(LocalDateTimeSerializer::class)
package org.beckn.protocol.schemas

import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.beckn.protocol.serializers.LocalDateTimeSerializer
import java.time.LocalDateTime

interface Category{
  val id: String?
  val parentCategoryId: String?
  val descriptor: ProtocolDescriptor
  val time: LocalDateTime?
  val tags: Map<String, String>?
}

@Serializable
data class ProtocolCategory @Default constructor(
  override val id: String? = null,
  override val parentCategoryId: String? = null,
  override val descriptor: ProtocolDescriptor,
  override val time: LocalDateTime? = null,
  override val tags: Map<String, String>? = null
) : Category

@Serializable
data class ProtocolRatingCategory @Default constructor(
  override val id: String,
  override val parentCategoryId: String? = null,
  override val descriptor: ProtocolDescriptor,
  override val time: LocalDateTime? = null,
  override val tags: Map<String, String>? = null,
  val question: String? = null
) : Category