package shibin.kmp.devtap.widget

import android.content.Context
import android.content.Intent
import android.provider.Settings
import androidx.glance.action.ActionParameters
import androidx.glance.appwidget.action.ActionCallback

class OpenDeveloperOptionsAction : ActionCallback {

    override suspend fun onAction(
        context: Context,
        glanceId: androidx.glance.GlanceId,
        parameters: ActionParameters
    ) {
        val intent = Intent(
            Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS
        ).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }

        context.startActivity(intent)
    }
}