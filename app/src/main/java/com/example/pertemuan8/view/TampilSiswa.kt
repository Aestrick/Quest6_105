package com.example.pertemuan8.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.pertemuan8.R
import com.example.pertemuan8.model.Siswa

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilSiswa(
    statusUiSiswa: Siswa,
    onBackButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    // Kita buat list data agar kode tampilan lebih ringkas dan rapi
    val items = listOf(
        Pair(stringResource(id = R.string.nama), statusUiSiswa.nama),
        Pair(stringResource(id = R.string.gender), statusUiSiswa.gender),
        Pair(stringResource(id = R.string.alamat), statusUiSiswa.alamat)
    )

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = {
                    Text(text = stringResource(id = R.string.detail), color = Color.White)
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(id = R.color.purple_500)
                )
            )
        }
    ) { isiRuang ->
        Column(
            modifier = Modifier
                .padding(isiRuang)
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Loop untuk menampilkan setiap item data
            items.forEach { item ->
                Column {
                    // Label (misal: Nama Lengkap) - Warna Abu
                    Text(
                        text = item.first,
                        color = Color.Gray
                    )
                    // Isi Data (misal: Isinya) - Tebal & Hitam
                    Text(
                        text = item.second,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    // Garis pemisah di bawah setiap data
                    Divider(modifier = Modifier.padding(top = 8.dp))
                }
            }

            // Spacer ini mendorong tombol ke paling bawah layar
            Spacer(modifier = Modifier.weight(1f))

            // Tombol Kembali (Back)
            Button(
                onClick = onBackButtonClicked,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = stringResource(id = R.string.back))
            }
        }
    }
}