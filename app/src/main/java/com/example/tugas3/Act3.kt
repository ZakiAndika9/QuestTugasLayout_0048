package com.example.tugas3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas3.ui.theme.Tugas3Theme

/**
 * Komponen CardWidget terpisah yang reusable untuk menampilkan informasi data Mahasiswa.
 */
@Composable
fun CardWidget(
    namaRes: Int,
    alamatRes: Int,
    bgColorRes: Int,
    modifier: Modifier = Modifier,
    nimRes: Int? = null,
    isCursive: Boolean = true,
    alamatColorRes: Int = R.color.yellow
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 6.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(bgColorRes)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.logo_umy),
                contentDescription = stringResource(R.string.logo_desc),
                modifier = Modifier.size(70.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = stringResource(namaRes),
                    fontSize = 22.sp,
                    fontWeight = if (isCursive) FontWeight.Normal else FontWeight.Bold,
                    fontFamily = if (isCursive) FontFamily.Cursive else FontFamily.Default,
                    color = colorResource(R.color.white)
                )
                if (nimRes != null) {
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = stringResource(nimRes),
                        fontSize = 15.sp,
                        color = colorResource(R.color.cyan)
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = stringResource(alamatRes),
                    fontSize = 15.sp,
                    color = colorResource(alamatColorRes)
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Image(
                painter = painterResource(R.drawable.logo_umy),
                contentDescription = stringResource(R.string.logo_desc),
                modifier = Modifier.size(70.dp)
            )
        }
    }
}

/**
 * Layout utama AktivitasPertama menyusun header prodi dan ke-4 CardWidget.
 */
@Composable
fun AktivitasPertama(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 40.dp, bottom = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.prodi),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.black)
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = stringResource(R.string.univ),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.black)
        )
        Spacer(modifier = Modifier.height(24.dp))

        // Card 1
        CardWidget(
            namaRes = R.string.nama_1,
            nimRes = R.string.nim_1,
            alamatRes = R.string.alamat_1,
            bgColorRes = R.color.card_1_bg,
            isCursive = true,
            alamatColorRes = R.color.yellow
        )

        // Card 2
        CardWidget(
            namaRes = R.string.nama_2,
            nimRes = R.string.nim_2,
            alamatRes = R.string.alamat_2,
            bgColorRes = R.color.card_2_bg,
            isCursive = true,
            alamatColorRes = R.color.yellow
        )

        // Card 3
        CardWidget(
            namaRes = R.string.nama_3,
            nimRes = R.string.nim_3,
            alamatRes = R.string.alamat_3,
            bgColorRes = R.color.card_3_bg,
            isCursive = true,
            alamatColorRes = R.color.yellow
        )

        // Card 4
        CardWidget(
            namaRes = R.string.nama_4,
            nimRes = R.string.nim_4,
            alamatRes = R.string.alamat_4,
            bgColorRes = R.color.card_4_bg,
            isCursive = true,
            alamatColorRes = R.color.yellow
        )

        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = stringResource(R.string.copy),
            fontSize = 14.sp,
            color = colorResource(R.color.black),
            modifier = Modifier.padding(bottom = 16.dp)
        )
    }
}
