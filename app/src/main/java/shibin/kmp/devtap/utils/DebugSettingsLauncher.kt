package shibin.kmp.devtap.utils

import android.content.Context
import android.content.Intent
import android.os.Build
import android.provider.Settings

object DebugSettingsLauncher {

    fun openDeveloperOptions(context: Context) {
        val intent =
            Intent(Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS)

        context.startActivity(intent)
    }

    fun openWirelessDeveloperOptions(context: Context) {
        // Launch Main Development Settings (USB Debugging)
        val intentUsb = Intent(Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS)
        context.startActivity(intentUsb)

        // Launch Wireless Debugging sub-page directly (Android 11 / API 30+)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            val intentWireless = Intent(Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS).apply {
                // Direct deep link extra for Wireless Debugging on supported OEM ROMs
                putExtra(":settings:fragment_args_key", "wireless_debugging")
            }
            context.startActivity(intentWireless)
        }
    }


    fun openSettings(context: Context) {
        val intent =
            Intent(Settings.ACTION_SETTINGS)

        context.startActivity(intent)
    }
}