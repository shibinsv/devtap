package shibin.kmp.devtap.data.device

import android.os.Build
import shibin.kmp.devtap.model.DeviceInfo

object DeviceDetails {

    fun getDeviceInfo(): DeviceInfo {
        return DeviceInfo(
            manufacturer = Build.MANUFACTURER,
            brand = Build.BRAND,
            model = Build.MODEL,
            device = Build.DEVICE,
            product = Build.PRODUCT,
            androidVersion = Build.VERSION.RELEASE,
            sdk = Build.VERSION.SDK_INT,
            buildId = Build.ID,
            hardware = Build.HARDWARE,
            abis = Build.SUPPORTED_ABIS.toList(),
            cpuCores = Runtime.getRuntime()
                .availableProcessors()
        )
    }

    fun getDeviceInfoText(
        deviceInfo: DeviceInfo
    ): String {
        return """
            Manufacturer: ${deviceInfo.manufacturer}
            Brand: ${deviceInfo.brand}
            Model: ${deviceInfo.model}
            Device: ${deviceInfo.device}
            Product: ${deviceInfo.product}
            Android: ${deviceInfo.androidVersion}
            SDK: ${deviceInfo.sdk}
            Build ID: ${deviceInfo.buildId}
            Hardware: ${deviceInfo.hardware}
            ABI: ${deviceInfo.abis.firstOrNull() ?: "Unknown"}
            CPU Cores: ${deviceInfo.cpuCores}
        """.trimIndent()
    }
}