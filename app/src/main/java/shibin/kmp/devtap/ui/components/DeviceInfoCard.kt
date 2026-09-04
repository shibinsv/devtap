package shibin.kmp.devtap.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import shibin.kmp.devtap.model.DeviceInfo

@Composable
fun DeviceInfoCard(
    deviceInfo: DeviceInfo,
    onCopy: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp)
    ) {
        Column(
            modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Device Information",
                    modifier = Modifier.weight(1f),
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold
                )

                IconButton(
                    onClick = onCopy
                ) {
                    Icon(
                        imageVector = Icons.Default.ContentCopy,
                        contentDescription = "Copy device information"
                    )
                }
            }

            HorizontalDivider()

            DeviceInfoRow(
                label = "Manufacturer",
                value = deviceInfo.manufacturer
            )

            DeviceInfoRow(
                label = "Brand",
                value = deviceInfo.brand
            )

            DeviceInfoRow(
                label = "Model",
                value = deviceInfo.model
            )

            DeviceInfoRow(
                label = "Device",
                value = deviceInfo.device
            )

            DeviceInfoRow(
                label = "Product",
                value = deviceInfo.product
            )

            DeviceInfoRow(
                label = "Android",
                value = deviceInfo.androidVersion
            )

            DeviceInfoRow(
                label = "SDK",
                value = deviceInfo.sdk.toString()
            )

            DeviceInfoRow(
                label = "Build ID",
                value = deviceInfo.buildId
            )

            DeviceInfoRow(
                label = "Hardware",
                value = deviceInfo.hardware
            )

            DeviceInfoRow(
                label = "ABI",
                value = deviceInfo.abis.firstOrNull() ?: "Unknown"
            )

            DeviceInfoRow(
                label = "CPU Cores",
                value = deviceInfo.cpuCores.toString()
            )
        }
    }
}

@Composable
private fun DeviceInfoRow(
    label: String,
    value: String
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = label,
            modifier = Modifier.weight(0.4f),
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )

        Spacer(
            modifier = Modifier.width(16.dp)
        )

        Text(
            text = value,
            modifier = Modifier.weight(0.6f),
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Medium
        )
    }
}
