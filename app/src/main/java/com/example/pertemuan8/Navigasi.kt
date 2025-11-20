package com.example.pertemuan8

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pertemuan8.model.DataJK
import com.example.pertemuan8.view.FormSiswa
import com.example.pertemuan8.view.TampilSiswa
import com.example.pertemuan8.viewmodel.SiswaViewModel

// Enum untuk nama-nama halaman
enum class Halaman {
    Formulir,
    Tampil
}

@Composable
fun PengelolaHalaman(
    modifier: Modifier = Modifier,
    viewModel: SiswaViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
) {
    // Mengambil data state dari ViewModel
    val uiState by viewModel.statusUI.collectAsState()

    Scaffold { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Halaman.Formulir.name,
            modifier = modifier.padding(innerPadding)
        ) {
            // Halaman 1: Formulir Input
            composable(route = Halaman.Formulir.name) {
                val context = LocalContext.current
                FormSiswa(
                    // Ambil pilihan JK dari DataJK yang sudah kita buat (convert ID ke String)
                    pilihanJK = DataJK.isiJK.map { id -> context.resources.getString(id) },
                    onSubmitButtonClicked = { dataList ->
                        // Simpan data ke ViewModel
                        viewModel.saveDataSiswa(dataList)
                        // Pindah ke halaman Tampil
                        navController.navigate(Halaman.Tampil.name)
                    }
                )
            }

            // Halaman 2: Tampil Data
            composable(route = Halaman.Tampil.name) {
                TampilSiswa(
                    statusUiSiswa = uiState, // Kirim data dari ViewModel ke View
                    onBackButtonClicked = {
                        // Kembali ke halaman sebelumnya
                        navController.popBackStack()
                    }
                )
            }
        }
    }
}