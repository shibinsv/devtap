package shibin.kmp.devtap.model

data class HomeUiState(
    val debugStatus: DebugStatus = DebugStatus(),
    val deviceInfo: DeviceInfo = DeviceInfo()
)