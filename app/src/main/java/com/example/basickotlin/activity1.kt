package com.example.basickotlin

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun album(modifier: Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(all = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        val gambar = painterResource(id = R.drawable.ellipse_47)
        Image(
            painter = gambar,
            contentDescription = null,
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(height = 24.dp))

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center,

        ){
            val album1 = painterResource(id = R.drawable.rcpresents)
            Image(
                painter = album1,
                contentDescription = null,
                modifier = Modifier
                    .size(120.dp)
                    .border(
                        width = 2.dp,
                        color = colorResource(id = R.color.black)
                    )
            )
        }
    }
}
