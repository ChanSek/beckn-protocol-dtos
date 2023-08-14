package org.beckn.protocol.serializers

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import org.beckn.protocol.schemas.ProtocolPrice

object PriceSerializer : KSerializer<ProtocolPrice> {
  override val descriptor: SerialDescriptor = ProtocolPrice.serializer().descriptor

  override fun serialize(encoder: Encoder, value: ProtocolPrice) {
    encoder.encodeSerializableValue(ProtocolPrice.serializer(), value)
  }

  override fun deserialize(decoder: Decoder): ProtocolPrice {
    val input = decoder.decodeSerializableValue(ProtocolPrice.serializer())
    val newValue = if (input.value != null) {
      if (input.value.toIntOrNull() != null) {
        input.value.toInt().toString()
      } else {
        input.value
      }
    } else {
      null
    }
    return input.copy(value = newValue)
  }
}