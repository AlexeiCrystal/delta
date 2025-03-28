package dev.shadoe.delta.data.softap.internal

import android.net.MacAddress

internal data class InternalState(
  val fallbackPassphrase: String = "",
  val macAddressCache: Map<MacAddress, String> = emptyMap(),
)
