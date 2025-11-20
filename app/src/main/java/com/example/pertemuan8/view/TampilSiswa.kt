package com.example.pertemuan8.view

import androidx.compose.foundation.background // Import ini
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
                .background(Color.White) // <-- INI FIX NYA: Paksa background putih
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items.forEach { item ->
                Column {
                    Text(
                        text = item.first.uppercase(), // Label uppercase biar mirip foto
                        color = Color.Gray // Warna label abu-abu
                    )
                    Text(
                        text = item.second,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black // Warna isi data HITAM PEKAT
                    )
                    Divider(modifier = Modifier.padding(top = 8.dp))
                }
            }

            Spacer(modifier = Modifier.weight(1f))

            Button(
                onClick = onBackButtonClicked,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = stringResource(id = R.string.back))
            }
        }
    }
}