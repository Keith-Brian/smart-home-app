package com.chiefdeveloper.dribblesmarthome

//import android.widget.Space
import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.graphics.painter.Painter
//import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//import androidx.compose.ui.unit.sp


@Composable
@Preview
fun MainScreenUI() {
    Surface(modifier = Modifier.fillMaxSize()){
        Column {
            TopHeader()
            Spacer(modifier = Modifier.height(8.dp))

            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center){
                Text(text = "Sweet Home",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Medium
                )

            }

            Spacer(modifier = Modifier.height(8.dp))

            DevicesIConButton()

        }

    }
    
}



@Composable
@Preview
fun TopHeader() {
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically) {

        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically){
                Image(painter = painterResource(id = R.drawable.cloudy),
                    contentDescription = "",
                    modifier = Modifier.size(40.dp))
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = "28°C", fontSize = 20.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Medium
                )
            }

            Spacer(modifier = Modifier.height(4.dp))
            Text(text = "Today's Weather",
                fontSize = 18.sp,
                color = Color.Gray,
                fontWeight = FontWeight.Medium)
        }

        Image(painter = painterResource(id = R.drawable.dummy),
            contentDescription = "",
            modifier = Modifier
                .size(60.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop)

    }
}


@Composable
@Preview
fun DevicesIConButton() {

    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ){

        RoundedIconButton(
            text = "Front Door",
            "Open",
            icon = painterResource(id = R.drawable.door),
            color = Color(0xffFEF4E7)
        )

        RoundedIconButton(
            text = "2 Lights",
            "On",
            icon = painterResource(id = R.drawable.lamp),
            color = Color(0xffF6FBF3)
        )

        RoundedIconButton(
            text = "Camera",
            "Off",
            icon = painterResource(id = R.drawable.camera),
            color = Color(0xffF6E6E9)
        )

        RoundedIconButton(
            text = "WiFi",
            "On",
            icon = painterResource(id = R.drawable.wifi),
            color = Color(0xffFFFBF3)
        )


    }
    
}


