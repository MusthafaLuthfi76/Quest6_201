package com.example.praktikumnavigasi.ui.view.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.praktikumnavigasi.model.Mahasiswa
import com.example.praktikumnavigasi.model.RencanaStudi


@Composable
fun TampilKrsView(
    mhs: Mahasiswa,
    rs: RencanaStudi,
    onClickButton: () -> Unit
)
{
    Column (modifier = Modifier.fillMaxSize()) {
        TampilData(
            judul = "NIM",
            isinya = mhs.nim
        )
        TampilData(
            judul = "Nama",
            isinya = mhs.nama
        )
        TampilData(
            judul = "E-mail",
            isinya = mhs.email
        )
        TampilData(
            judul = "Nama Mata Kuliah",
            isinya = rs.namaMK
        )
        TampilData(
            judul = "Nama Kelas",
            isinya = rs.kelas
        )
        Button(
            onClick = {onClickButton()},
            modifier = Modifier.padding(vertical = 10.dp)) {
            Text("Back")
        }
    }
}
@Composable
fun TampilData(
    judul:String,
    isinya:String
){
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween){
        Text(text = judul, modifier = Modifier.weight(0.8f))
        Text(text = ":", modifier = Modifier.weight(0.2f))
        Text(text = isinya, modifier = Modifier.weight(2f))

    }
}