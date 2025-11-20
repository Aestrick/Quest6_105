# Praktikum 8 - Aplikasi Pendaftaran Siswa (MVVM & Navigation) 📱

Aplikasi Android sederhana yang dibangun menggunakan **Kotlin** dan **Jetpack Compose**. Project ini mendemonstrasikan implementasi arsitektur **MVVM (Model-View-ViewModel)** dan **Navigation Compose** untuk mengirim data antar halaman.

## 📸 Screenshots

Berikut adalah tampilan aplikasi:

| Halaman Formulir Input | Halaman Tampilan Data |
|:----------------------:|:---------------------:|
| <img width="470" height="811" alt="Screenshot 2025-11-20 170712" src="https://github.com/user-attachments/assets/980b9fc9-328d-4eb4-93e8-03d6b082d067" />
| <img width="474" height="818" alt="Screenshot 2025-11-20 170735" src="https://github.com/user-attachments/assets/8523ef38-7e5c-48d3-94e6-605552e46057" />

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
