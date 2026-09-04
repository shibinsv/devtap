# DevTap 📱

A lightweight Android developer utility that provides quick access to debugging settings and useful device information.

## ✨ Features

- 🔌 **USB Debugging**
  - Quickly open USB debugging settings

- 📡 **Wireless Debugging**
  - Quickly open wireless debugging settings

- 🛠️ **Developer Options**
  - Quick access to Android Developer Options

- 📊 **Debugging Status**
  - USB debugging status
  - Wireless debugging status
  - Developer options status

- 📱 **Device Information**
  - Manufacturer
  - Brand
  - Model
  - Device
  - Product
  - Android version
  - SDK version
  - Build ID
  - Hardware
  - ABI
  - CPU cores

- 📋 **Copy Device Information**
  - Copy device details to the clipboard with one tap

- 🖥️ **Screen Information**
  - Display resolution
  - Density
  - Refresh rate

- 🔋 **Battery Information**
  - Battery status and details

- 🌙 **Dark UI**
  - Developer-focused dark interface

## 🛠️ Tech Stack

- Kotlin
- Jetpack Compose
- Material 3
- Android SDK
- AndroidX Lifecycle
- ViewModel
- StateFlow

## 🏗️ Architecture

DevTap follows a simple separation of responsibilities:

```text
UI
 ↓
HomeViewModel
 ↓
HomeUiState
 ↓
Data
 ↓
Android APIs
Project Structure
devtap
├── data
│   ├── debug
│   └── device
│
├── model
│   ├── DebugStatus
│   ├── DeviceInfo
│   └── HomeUiState
│
├── ui
│   ├── HomeScreen
│   └── components
│
├── utils
│   ├── ClipboardUtils
│   └── DebugSettingsLauncher
│
├── viewmodel
│   └── HomeViewModel
│
└── MainActivity
📋 Requirements
Android device or emulator
Android 12+
Developer Options supported by the device
🚀 Getting Started

Clone the repository:

git clone https://github.com/YOUR_USERNAME/devtap.git

Open the project in Android Studio and run it on an Android device or emulator.

📸 Screenshots

Coming soon.

🗺️ Roadmap
 USB debugging quick access
 Wireless debugging quick access
 Developer Options quick access
 Debugging status
 Device information
 Copy device information
 Screen information
 Battery information
 USB configuration shortcut
 Improved wireless debugging detection
 Network information
 Memory information
 Storage information
 Quick Settings Tile
🤝 Contributing

Contributions, suggestions, and improvements are welcome.

Feel free to open an issue or submit a pull request.

📄 License

This project is licensed under the MIT License.
