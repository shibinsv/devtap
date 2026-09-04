package shibin.kmp.devtap.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Usb
import androidx.compose.material.icons.filled.Wifi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.lifecycle.viewmodel.compose.viewModel
import shibin.kmp.devtap.data.device.DeviceDetails
import shibin.kmp.devtap.ui.components.AdbStatusCard
import shibin.kmp.devtap.ui.components.BatteryInfoCard
import shibin.kmp.devtap.ui.components.DebugCard
import shibin.kmp.devtap.ui.components.DeveloperCard
import shibin.kmp.devtap.ui.components.DeviceInfoCard
import shibin.kmp.devtap.ui.components.Header
import shibin.kmp.devtap.ui.components.ScreenInfoCard
import shibin.kmp.devtap.ui.components.SectionTitle
import shibin.kmp.devtap.utils.ClipboardUtils
import shibin.kmp.devtap.utils.DebugSettingsLauncher
import shibin.kmp.devtap.viewmodel.HomeViewModel

@Composable
fun HomeScreen(
    innerPadding: PaddingValues, viewModel: HomeViewModel = viewModel()
) {

    val context = LocalContext.current
    val lifecycleOwner = LocalLifecycleOwner.current

    val uiState by viewModel.uiState.collectAsState()

    val debugStatus = uiState.debugStatus
    val deviceInfo = uiState.deviceInfo

    DisposableEffect(lifecycleOwner) {
        val observer = LifecycleEventObserver { _, event ->
            if (event == Lifecycle.Event.ON_RESUME) {
                viewModel.refresh()
            }
        }
        lifecycleOwner.lifecycle.addObserver(observer)
        onDispose {
            lifecycleOwner.lifecycle.removeObserver(observer)
        }
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        item {
            Header()
        }

        item {
            SectionTitle("Debugging")
        }

        item {
            AdbStatusCard(
                usbDebugging = debugStatus.usbDebugging,
                wirelessDebugging = debugStatus.wirelessDebugging,
                developerOptions = debugStatus.developerOptions
            )
        }

        item {
            DebugCard(
                icon = Icons.Default.Usb,
                title = "USB Debugging",
                description = "Open USB debugging settings",
                onClick = {
                    DebugSettingsLauncher.openDeveloperOptions(context)
                })
        }

        item {
            DebugCard(
                icon = Icons.Default.Wifi,
                title = "Wireless Debugging",
                description = "Open wireless debugging settings",
                onClick = {
                    DebugSettingsLauncher.openDeveloperOptions(context)
                })
        }

        item {
            SectionTitle("Developer")
        }

        item {
            Row(
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {

                DeveloperCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Default.Settings,
                    title = "Developer\nOptions",
                    onClick = {
                        DebugSettingsLauncher.openDeveloperOptions(context)
                    })

                DeveloperCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Default.Usb,
                    title = "USB\nConfiguration",
                    onClick = {
                        // TODO
                    })
            }
        }

        item {
            SectionTitle("Device")
        }

        item {
            DeviceInfoCard(
                deviceInfo = deviceInfo,
                onCopy = {
                    ClipboardUtils.copy(
                        context = context,
                        label = "Device Information",
                        text = DeviceDetails.getDeviceInfoText(deviceInfo)
                    )
                })
        }
        item {
            SectionTitle("Screen Information")
        }
        item {
            ScreenInfoCard()
        }

        item {
            SectionTitle("Battery Information")
        }
        item {
            BatteryInfoCard()
        }
    }
}

