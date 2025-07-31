package com.example.learning_plan

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.InspectableModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Learning_Plate() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "My Position",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        }
        Spacer(modifier = Modifier.height(4.dp))

        Card (
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            elevation = CardDefaults.cardElevation(8.dp),
            shape = RoundedCornerShape(12.dp)
        ){
            Row (
                modifier = Modifier.fillMaxWidth().padding(8.dp),
                   horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ){
                    Image(
                        painter = painterResource(id = R.drawable.ic_launcher_background),
                        contentDescription = "",
                        modifier = Modifier
                            .height(48.dp)
                            .width(48.dp)
                            .clip(CircleShape)
                    )
                Column {
                    Row (modifier = Modifier.padding(6.dp),
                        verticalAlignment = Alignment.CenterVertically){
                        Text(
                            text = "Debbie K",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Row (modifier = Modifier.fillMaxWidth().padding(start=6.dp),
                        verticalAlignment = Alignment.CenterVertically){
                        Text(
                            text = "Product Designer",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(6.dp))

            Column  (
                modifier = Modifier.fillMaxWidth()
            ){
                Row (
                    modifier = Modifier.padding(top=12.dp, start=12.dp),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Leaderboard Position",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal
                    )
                }
                Row (
                    modifier = Modifier.padding(start=12.dp),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text = "48",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(6.dp))
            Column  (
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(top=12.dp, start=12.dp),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Points",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal
                    )
                }
                Row(
                    modifier = Modifier.padding(start=12.dp),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text = "102451",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(6.dp))
            Column  (
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(top=12.dp, start=12.dp),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Skills",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal
                    )
                }
                Row(
                    modifier = Modifier.padding(start=12.dp),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ){
                Text(
                        text = "Infographics, Banner, Motion Design",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(4.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFADD8E6)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Row(modifier = Modifier.fillMaxWidth().padding(top = 16.dp,start =16.dp, end = 16.dp)) {
                Text(text = "1311 points away from the top",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)
            }
            Row(modifier = Modifier.fillMaxWidth().padding(start =16.dp, end = 16.dp,bottom = 16.dp)){
                Text(text = "You can earn points by completing content and by earning badges",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal)
            }
        }

        Spacer(modifier = Modifier.height(4.dp))

        Column (
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Button(onClick = {},
                modifier = Modifier.padding(8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFA500)),
                shape = RoundedCornerShape(6.dp)
            ) {
                Text(text = " Goto My Learning Plan",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center)
            }
        }
    }
}