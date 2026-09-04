# DevTap 📱

A lightweight Android developer utility that provides quick access to debugging settings and useful device information.

<img width="1672" height="941" alt="devtap_cover" src="https://github.com/user-attachments/assets/0fbf626e-5799-4de4-9377-efbce1eef885" />

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

**Project Structure**
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

##📋 Requirements
- Android device or emulator
- Android 12+
- Developer Options supported by the device

## 📸 Screenshots

<img width="250" height="500" alt="12" src="https://github.com/user-attachments/assets/3469bf62-253e-4858-804d-848de2893de5" />
<img width="250" height="500" alt="w2" src="https://github.com/user-attachments/assets/bc5ae52f-c3ff-47c1-bc80-75a44f11c6f3" />
<img width="250" height="500" alt="s1" src="https://github.com/user-attachments/assets/c0c3b284-1906-4cde-a001-e6b389243f01" />

## 🗺️ Roadmap
- Quick access to more Android settings
- Better wireless debugging support
- More device information
- More widget actions
- Additional developer utilities
- More customization options
- Quick Settings Tile











Built for Android developers who live in Developer Options. ⚡
