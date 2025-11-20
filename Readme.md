# Praktikum 8 - Aplikasi Pendaftaran Siswa (MVVM & Navigation) 📱

Aplikasi Android sederhana yang dibangun menggunakan **Kotlin** dan **Jetpack Compose**. Project ini mendemonstrasikan implementasi arsitektur **MVVM (Model-View-ViewModel)** dan **Navigation Compose** untuk mengirim data antar halaman.

## 📸 Screenshots

Berikut adalah tampilan aplikasi:

| Halaman Formulir Input | Halaman Tampilan Data |
|:----------------------:|:---------------------:|
| <img src="screenshot_form.png" width="300" /> | <img src="screenshot_hasil.png" width="300" /> |
| *User mengisi data diri (Nama, Gender, Alamat)* | *Data ditampilkan setelah tombol Submit ditekan* |

## 🚀 Fitur Utama

* **Formulir Input:** Menggunakan `OutlinedTextField` untuk teks dan `RadioButton` untuk pilihan jenis kelamin.
* **State Management:** Menggunakan `ViewModel` dan `StateFlow` untuk menyimpan data siswa agar tidak hilang saat rotasi layar atau perpindahan konfigurasi.
* **Navigasi:** Menggunakan `NavHost` dan `NavController` untuk berpindah dari halaman Form ke halaman Tampil Data.
* **UI Styling:** Desain bersih dengan tema warna Ungu dan Putih sesuai Material Design 3.

## 🛠️ Teknologi & Library

Project ini dibuat menggunakan:
* **Language:** Kotlin
* **UI Framework:** Jetpack Compose (Material3)
* **Architecture:** MVVM (Model-View-ViewModel)
* **Dependencies:**
    * `androidx.navigation:navigation-compose:2.7.7`
    * `androidx.lifecycle:lifecycle-viewmodel-compose:2.8.0`
    * `androidx.lifecycle:lifecycle-runtime-compose:2.8.0`

## 📂 Struktur Project

* **model**: Berisi data class `Siswa` dan object `DataJK`.
* **view**: Berisi tampilan UI (`FormSiswa.kt`, `TampilSiswa.kt`).
* **viewmodel**: Berisi `SiswaViewModel.kt` sebagai pengelola data.
* **Navigasi.kt**: Mengatur rute dan perpindahan halaman.

---
*Dibuat untuk memenuhi tugas Praktikum Pemrograman Aplikasi Mobile (PAM).*
