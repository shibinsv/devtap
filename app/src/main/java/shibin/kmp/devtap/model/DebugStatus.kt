package shibin.kmp.devtap.model

data class DebugStatus(
    val usbDebugging: Boolean = false,
    val wirelessDebugging: Boolean? = null,
    val developerOptions: Boolean = false
)