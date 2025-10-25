package com.example.basickotlin

import android.graphics.Paint
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun album(modifier: Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(all = 60.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Image(
            painter = painterResource(id = R.drawable.ellipse_47),
            contentDescription = null,
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
                .border(
                    width = 5.dp,
                    color = colorResource(id = R.color.white),
                    shape = CircleShape
                )
        )

        Spacer(modifier = Modifier.height(height = 30.dp))

        Text(
            text = stringResource(id = R.string.teks1),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.white)
        )

        Spacer(modifier = Modifier.height(height = 30.dp))

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center

        ){

            Image(
                painter = painterResource(id = R.drawable.rcpresents),
                contentDescription = null,
                modifier = Modifier
                    .size(120.dp)
                    .border(
                        width = 5.dp,
                        color = colorResource(id = R.color.white)
                    )
            )

        }

        Spacer(modifier = Modifier.height(height = 24.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
            Box(

            ){
                Image(painterResource(id = R.drawable.nicole), contentDescription = null,
                    modifier = Modifier
                        .size(120.dp)
                        .border(
                            width = 5.dp,
                            color = colorResource(id = R.color.white)
                        )
                )
            }

           Spacer(modifier = Modifier.width(width = 30.dp))

            Box(
            ){
                Image(painterResource(id = R.drawable.hitmehardandsoft), contentDescription = null,
                    modifier = Modifier
                        .size(120.dp)
                        .border(
                            width = 5.dp,
                            color = colorResource(id = R.color.white)
                        )
                )
            }



        }

    }
}
