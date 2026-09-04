package shibin.kmp.devtap.widget

import androidx.compose.ui.graphics.Color
import androidx.glance.color.ColorProvider

object DevTapWidgetColors {

    val background = ColorProvider(
        day = Color(0xFF0B0F14),
        night = Color(0xFF0B0F14)
    )

    val primaryText = ColorProvider(
        day = Color(0xFFFFFFFF),
        night = Color(0xFFFFFFFF)
    )

    val secondaryText = ColorProvider(
        day = Color(0xFF666666),
        night = Color(0xFF9AA6B2)
    )

    val accent = ColorProvider(
        day = Color(0xFF00896F),
        night = Color(0xFF35E0B0)
    )
}