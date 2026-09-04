package shibin.kmp.devtap.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun AdbStatusCard(
    usbDebugging: Boolean, wirelessDebugging: Boolean?, developerOptions: Boolean
) {
    Card(
        modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(20.dp)
    ) {
        Column(
            modifier = Modifier.padding(20.dp), verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {

            Text(
                text = "ADB Status",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.SemiBold
            )

            DebugStatusRow(
                title = "USB Debugging", enabled = usbDebugging
            )

            DebugStatusRow(
                title = "Wireless Debugging", enabled = wirelessDebugging
            )

            DebugStatusRow(
                title = "Developer Options", enabled = developerOptions
            )
        }
    }
}

@Composable
private fun DebugStatusRow(
    title: String, enabled: Boolean?
) {
    val color = when (enabled) {
        true -> MaterialTheme.colorScheme.primary
        false -> MaterialTheme.colorScheme.error
        null -> Color.Gray
    }
    val text = when (enabled) {
        true -> "Enabled"
        false -> "Disabled"
        null -> "Unknown"
    }
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title, style = MaterialTheme.typography.bodyMedium
        )

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "●", color = color)
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = text, style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}