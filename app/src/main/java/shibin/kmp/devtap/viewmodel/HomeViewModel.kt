package shibin.kmp.devtap.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import shibin.kmp.devtap.data.debug.DebugDetails
import shibin.kmp.devtap.data.device.DeviceDetails
import shibin.kmp.devtap.model.HomeUiState

class HomeViewModel(application: Application) : AndroidViewModel(application) {

    private val _uiState = MutableStateFlow(HomeUiState())

    val uiState = _uiState.asStateFlow()

    init {
        refresh()
    }

    fun refresh() {
        val context = getApplication<Application>()
        _uiState.value = HomeUiState(
            debugStatus = DebugDetails.getDebugStatus(context),
            deviceInfo = DeviceDetails.getDeviceInfo()
        )
    }
}