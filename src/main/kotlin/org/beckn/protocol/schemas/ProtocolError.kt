package org.beckn.protocol.schemas

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
data class ProtocolError @Default constructor(
  val code: String,
  val message: String,
  val type: Type? = null,
  val path: String? = null,
) {

  enum class Type(val value: String) {
    @SerialName("CONTEXT-ERROR")
    CONTEXTERROR("CONTEXT-ERROR"),
    @SerialName("CORE-ERROR")
    COREERROR("CORE-ERROR"),
    @SerialName("DOMAIN-ERROR")
    DOMAINERROR("DOMAIN-ERROR"),
    @SerialName("POLICY-ERROR")
    POLICYERROR("POLICY-ERROR"),
    @SerialName("JSON-SCHEMA-ERROR")
    JSONSCHEMAERROR("JSON-SCHEMA-ERROR");
  }
}