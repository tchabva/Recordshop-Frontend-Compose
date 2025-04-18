# Record Shop - Android Frontend 🎵
A modern and user-friendly record shop Android application built with Jetpack Compose for the frontend and Spring Boot for the backend.
## Overview
This application provides a digital platform for browsing, searching, and managing a record shop inventory. The app features a clean, intuitive interface designed with Jetpack Compose, Google's modern toolkit for building native Android UI.
## Features ✨
- Full integration with [Record Shop Backend API](https://github.com/tchabva/recordshopbackend)
- Browse record catalogue with cover art and details
- Search functionality with instant results
- Adaptive dark/light theme
- Responsive UI for different screen sizes
- Smooth animations and transitions

## Screenshots
<table>
  <!-- Row 1 -->
  <tr>
    <td style="text-align:center">
      <img src="screenshots/home_screen.png" alt="Home Screen" width="1080"/>
      <p><em>Record Shop Home Screen</em></p>
    </td>
    <td style="text-align:center">
      <img src="screenshots/home_screen_dark.png" alt="Home Screen Dark Mode" width="1080"/>
      <p><em>Record Shop Home Screen Dark Mode</em></p>
    </td>
  </tr>

  <!-- Row 2 -->
  <tr>
    <td style="text-align:center">
      <img src="screenshots/add_album_screen.png" alt="Add Album Screen" width="1080"/>
      <p><em>Add Album Screen</em></p>
    </td>
    <td style="text-align:center">
      <img src="screenshots/add_album_screen_dark.png" alt="Add Album Screen Dark Mode" width="1080"/>
      <p><em>Add Album Screen Dark Mode</em></p>
    </td>
  </tr>

<!-- Row 3 -->
  <tr>
    <td style="text-align:center">
      <img src="screenshots/view_album.png" alt="View Album Screen" width="1080"/>
      <p><em>View Album Screen</em></p>
    </td>
    <td style="text-align:center">
      <img src="screenshots/view_album_dark.png" alt="View Album Screen Dark Mode" width="1080"/>
      <p><em>View Album Screen Dark Mode</em></p>
    </td>
  </tr>

  <!-- Row 4 -->
  <tr>
    <td style="text-align:center">
      <img src="screenshots/view_album_delete_album_dialog.png" alt="View Album Screen Delete Dialog" width="1080"/>
      <p><em>View Album Screen Delete Album Dialog</em></p>
    </td>
    <td style="text-align:center">
      <img src="screenshots/view_album_delete_album_dialog_dark.png" alt="View Album Screen Delete Album Dialog" width="1080"/>
      <p><em>View Album Screen Delete Album Dialog Dark Mode</em></p>
    </td>
  </tr>

<!-- Row 5 -->
  <tr>
    <td style="text-align:center">
      <img src="screenshots/edit_album_screen.png" alt="Edit Album Screen " width="1080"/>
      <p><em>Edit Album Screen</em></p>
    </td>
    <td style="text-align:center">
      <img src="screenshots/edit_album_screen_dark.png" alt="Edit Album Screen Dark Mode" width="1080"/>
      <p><em>Edit Album Screen Dark Mode</em></p>
    </td>
  </tr>
</table>

## Tech Stack 🛠️
### Frontend:
- Kotlin
- Jetpack Compose
- MVVM Architecture
- Material Design Components
- Dependency Injection: Hilt
- Networking: Retrofit, Kotlin Coroutines
- Image Loading: Glide Compose
- Navigation: Compose Navigation
### Backend:
The application requires the backend service to function properly:
- [Record Shop Backend](https://github.com/tchabva/recordshopbackend)
- Built with Spring Boot using Java
- RESTful API design
- Postgres Database Integration
## Getting Started
### Prerequisites ⚙️
1. Android Studio Flamingo or newer
2. JDK 11+
3. An Android device running API 21 (Lollipop) or higher
4. Backend server running (see setup instructions below)
### Installation
1. Clone the repository:
    ```bash
    git clone https://github.com/tchabva/Recordshop-Frontend-Compose.git
    ```
2. Open the project in Android Studio and let Gradle sync the project.
3. Set up the backend server. Follow the README:
    - Clone and run the [Record Shop Backend](https://github.com/tchabva/recordshopbackend)
4. Update the API Base URL in the frontend - if required
5. Build & run the application on your device or emulator
### Configuration
The app is configured to connect to the backend service. You may need to adjust the backend URL in the app's configuration based on your setup environment.