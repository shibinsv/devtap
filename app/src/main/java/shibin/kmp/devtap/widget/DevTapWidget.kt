package shibin.kmp.devtap.widget

import android.content.Intent
import android.provider.Settings
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.action.clickable
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.action.actionStartActivity
import androidx.glance.appwidget.cornerRadius
import androidx.glance.appwidget.provideContent
import androidx.glance.background
import androidx.glance.layout.Alignment
import androidx.glance.layout.Column
import androidx.glance.layout.Row
import androidx.glance.layout.Spacer
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.padding
import androidx.glance.layout.width
import androidx.glance.text.FontWeight
import androidx.glance.text.Text
import androidx.glance.text.TextStyle

class DevTapWidget : GlanceAppWidget() {

    val developerOptionsIntent = Intent(
        Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS
    ).apply {
        addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
    }

    override suspend fun provideGlance(
        context: android.content.Context,
        id: GlanceId
    ) {
        provideContent {
            Row(
                modifier = GlanceModifier
                    .fillMaxSize()
                    .background(DevTapWidgetColors.background)
                    .cornerRadius(18.dp)
                    .padding(10.dp)
                    .clickable(
                        actionStartActivity(developerOptionsIntent)
                    ),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    text = "⚡",
                    style = TextStyle(
                        color = DevTapWidgetColors.accent,
                        fontSize = 20.sp
                    )
                )
                Spacer(modifier = GlanceModifier.width(10.dp))
                Column(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "DevTap",
                        style = TextStyle(
                            color = DevTapWidgetColors.primaryText,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Text(
                        text = "Developer Options",
                        style = TextStyle(
                            color = DevTapWidgetColors.secondaryText
                        )
                    )
                }
            }
        }
    }
}