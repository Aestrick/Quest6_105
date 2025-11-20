package com.example.pertemuan8.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.pertemuan8.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormSiswa(
    pilihanJK: List<String>,
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    modifier: Modifier = Modifier
) {
    var txtNama by rememberSaveable { mutableStateOf("") }
    var txtAlamat by remember { mutableStateOf("") }
    var txtGender by remember { mutableStateOf("") }

    val listData: MutableList<String> = mutableListOf(txtNama, txtGender, txtAlamat)

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = {
                    Text(text = stringResource(id = R.string.app_name))
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(id = R.color.purple_500),
                    titleContentColor = Color.White
                )
            )
        }
    ) { isiRuang ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(isiRuang)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Edit 3: value, onValueChange, selected, onClick (sesuai foto)
            OutlinedTextField(
                value = txtNama,
                onValueChange = { txtNama = it },
                label = { Text(text = "Nama Lengkap") }, // Atau stringResource(R.string.nama)
                singleLine = true,
                shape = MaterialTheme.shapes.medium,
                modifier = Modifier.fillMaxWidth().padding(top = 20.dp),
                placeholder = { Text(text = "Masukkan Nama") }
            )

            // Sesuai foto, ada Divider atau Spacer setelah TextField
            Spacer(modifier = Modifier.padding(8.dp))
            // Atau bisa pakai Divider jika mau garis:
            // HorizontalDivider(modifier = Modifier.padding(vertical = 12.dp))

            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                pilihanJK.forEach { item ->
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .selectable(
                                selected = txtGender == item,
                                onClick = { txtGender = item }
                            )
                    ) {
                        RadioButton(
                            selected = txtGender == item,
                            onClick = { txtGender = item }
                        )
                        Text(text = item)
                    }
                }
            }

            Spacer(modifier = Modifier.padding(8.dp))

            OutlinedTextField(
                value = txtAlamat,
                onValueChange = { txtAlamat = it },
                label = { Text(text = "Alamat Lengkap") }, // Atau stringResource(R.string.alamat)
                singleLine = true,
                shape = MaterialTheme.shapes.medium,
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text(text = "Masukkan Alamat") }
            )

            Spacer(modifier = Modifier.height(20.dp)) // Sesuai foto terakhir (height=20.dp)

            // Edit 4: Menambahkan variabel List Data pada onClick (sesuai foto)
            Button(
                onClick = { onSubmitButtonClicked(listData) },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = stringResource(id = R.string.submit))
            }
        }
    }
}