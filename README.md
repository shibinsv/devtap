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
  
- **⚡ Home Screen Widget**
  - DevTap also includes a small home-screen widget.
  - Tap the widget to jump directly to **Developer Options**, without opening DevTap first.

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

📸 Screenshots
 Coming soon

🗺️ Roadmap
 Quick access to more Android settings
 Better wireless debugging support
 More device information
 More widget actions
 Additional developer utilities
 More customization options
 Quick Settings Tile
