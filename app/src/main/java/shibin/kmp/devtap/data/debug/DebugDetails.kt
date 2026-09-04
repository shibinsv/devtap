package shibin.kmp.devtap.data.debug

import android.content.Context
import android.provider.Settings
import shibin.kmp.devtap.model.DebugStatus

object DebugDetails {

    fun getDebugStatus(context: Context): DebugStatus {
        return DebugStatus(
            usbDebugging = isAdbEnabled(context),
            wirelessDebugging = isWirelessDebuggingEnabled(context),
            developerOptions = isDeveloperOptionsEnabled(context)
        )
    }

    fun isAdbEnabled(context: Context): Boolean {
        return Settings.Global.getInt(
            context.contentResolver,
            Settings.Global.ADB_ENABLED,
            0
        ) == 1
    }

    fun isDeveloperOptionsEnabled(context: Context): Boolean {
        return Settings.Global.getInt(
            context.contentResolver,
            Settings.Global.DEVELOPMENT_SETTINGS_ENABLED,
            0
        ) == 1
    }

    fun isWirelessDebuggingEnabled(context: Context): Boolean? {
        // TODO
        return null
    }
}