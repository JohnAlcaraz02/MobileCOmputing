# MobileComputing

A modern Android application built with Kotlin, showcasing best practices in mobile development and clean architecture.

## 📱 About

This project demonstrates contemporary Android development using Jetpack Compose, MVVM architecture, and modern Android libraries. Built as part of our Mobile Computing coursework, it implements [describe your app's main purpose/features here].

## ✨ Features

- 🎨 Modern UI with Jetpack Compose
- 🏗️ Clean Architecture (MVVM pattern)
- 🔄 Reactive programming with Kotlin Coroutines and Flow
- 💾 Local data persistence with Room Database
- 🌐 Network integration with Retrofit
- 🎯 Dependency Injection with Hilt
- 🧪 Unit and Integration testing
- 📱 Material Design 3 components
- 🌙 Dark mode support

## 🛠️ Tech Stack

### Core
- **Language**: Kotlin
- **Min SDK**: 24 (Android 7.0)
- **Target SDK**: 34 (Android 14)

### Architecture & Patterns
- **Architecture**: MVVM (Model-View-ViewModel)
- **Design Pattern**: Repository Pattern
- **Dependency Injection**: Hilt

### Jetpack Libraries
- **Compose**: Modern declarative UI toolkit
- **Navigation**: Navigation Component for Compose
- **Room**: Database persistence library
- **ViewModel**: Lifecycle-aware UI data handling
- **LiveData/Flow**: Observable data holder classes

### Networking & Data
- **Retrofit**: Type-safe HTTP client
- **OkHttp**: HTTP client with interceptors
- **Gson/Moshi**: JSON serialization
- **Coil**: Image loading library

### Async & Reactive
- **Coroutines**: Asynchronous programming
- **Flow**: Reactive streams

### Testing
- **JUnit**: Unit testing framework
- **Espresso**: UI testing
- **MockK**: Mocking library
- **Truth**: Assertion library

## 📋 Prerequisites

Before you begin, ensure you have the following installed:
- [Android Studio](https://developer.android.com/studio) (Latest stable version)
- JDK 17 or higher
- Android SDK with API level 34
- Gradle 8.0+

## 🚀 Getting Started

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/JohnAlcaraz02/MobileCOmputing.git
   cd MobileCOmputing
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Select "Open an Existing Project"
   - Navigate to the cloned directory
   - Wait for Gradle sync to complete

3. **Configure API keys (if applicable)**
   - Create a `local.properties` file in the root directory
   - Add your API keys:
     ```properties
     API_KEY=your_api_key_here
     BASE_URL=your_base_url_here
     ```

4. **Build the project**
   ```bash
   ./gradlew build
   ```

5. **Run the app**
   - Connect an Android device or start an emulator
   - Click the "Run" button in Android Studio or use:
     ```bash
     ./gradlew installDebug
     ```

## 📁 Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/yourcompany/mobilecomputing/
│   │   │   ├── data/           # Data layer (repositories, data sources)
│   │   │   ├── di/             # Dependency injection modules
│   │   │   ├── ui/             # UI layer (screens, components, theme)
│   │   │   └── utils/          # Utility classes and extensions
│   │   ├── res/                # Resources (layouts, drawables, strings)
│   │   └── AndroidManifest.xml
│   ├── test/                   # Unit tests
│   └── androidTest/            # Instrumented tests
└── build.gradle.kts
```

## 🏗️ Architecture

This project follows **Clean Architecture** principles with clear separation of concerns:

### Layers

1. **Presentation Layer** (`ui/`)
   - Composable screens
   - ViewModels
   - UI state management

2. **Domain Layer** (Business logic)
   - Use cases
   - Business models
   - Repository interfaces

3. **Data Layer** (`data/`)
   - Repository implementations
   - Local data sources (Room)
   - Remote data sources (Retrofit)
   - Data models

### Data Flow
```
UI (Compose) → ViewModel → Repository → Data Source (Local/Remote)
```

## 🧪 Testing

### Run Unit Tests
```bash
./gradlew test
```

### Run Instrumented Tests
```bash
./gradlew connectedAndroidTest
```

### Test Coverage
```bash
./gradlew jacocoTestReport
```

## 📦 Building

### Debug Build
```bash
./gradlew assembleDebug
```

### Release Build
```bash
./gradlew assembleRelease
```

The APK will be generated in `app/build/outputs/apk/`

## 🤝 Contributing

We welcome contributions! Please follow these steps:

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

### Code Style
- Follow [Kotlin coding conventions](https://kotlinlang.org/docs/coding-conventions.html)
- Use meaningful variable and function names
- Add comments for complex logic
- Write unit tests for new features

## 👥 Team Members

- **John Alcaraz** - [@JohnAlcaraz02](https://github.com/JohnAlcaraz02)
- [Add other team members here]

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 📞 Contact

For questions or support, please reach out to:
- Email: [your-email@example.com]
- GitHub Issues: [Project Issues](https://github.com/JohnAlcaraz02/MobileCOmputing/issues)

## 🙏 Acknowledgments

- [Android Developers Documentation](https://developer.android.com/)
- [Jetpack Compose Samples](https://github.com/android/compose-samples)
- Course Instructor and Teaching Assistants
- Open source community

---

**Made with ❤️ for Mobile Computing Course**
