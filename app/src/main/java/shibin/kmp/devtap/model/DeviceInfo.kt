package shibin.kmp.devtap.model

data class DeviceInfo(
    val manufacturer: String = "",
    val brand: String = "",
    val model: String = "",
    val device: String = "",
    val product: String = "",
    val androidVersion: String = "",
    val sdk: Int=0,
    val buildId: String = "",
    val hardware: String = "",
    val abis: List<String> = emptyList(),
    val cpuCores: Int=0
)