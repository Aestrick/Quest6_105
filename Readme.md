# Praktikum 8 - Aplikasi Pendaftaran Siswa (MVVM & Navigation) 📱

Aplikasi Android sederhana yang dibangun menggunakan **Kotlin** dan **Jetpack Compose**. Project ini mendemonstrasikan implementasi arsitektur **MVVM (Model-View-ViewModel)** dan **Navigation Compose** untuk mengirim data antar halaman.

## 📸 Screenshots

Berikut adalah tampilan aplikasi:

| Halaman Formulir Input | Halaman Tampilan Data |
|:----------------------:|:---------------------:|
| <img width="470" height="811" alt="screenshot_form png" src="https://github.com/user-attachments/assets/4ac06274-de42-4d79-a984-490a84d3dbf4" /> | <img width="474" height="818" alt="screenshot_hasil" src="https://github.com/user-attachments/assets/9e585c46-a0ce-4c66-9334-fb3db4f23ba5" /> |


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
