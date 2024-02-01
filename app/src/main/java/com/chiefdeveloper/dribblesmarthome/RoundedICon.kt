package com.chiefdeveloper.dribblesmarthome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun RoundedIconButton(
    text: String,
    icon: Painter,
    color: Color
) {
    Column(
        Modifier
            .size(80.dp)
            .clickable { },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        
        Box(modifier = Modifier
            .size(60.dp)
            .background(
                color = color,
                shape = CircleShape
            )
            .padding(18.dp),
            contentAlignment = Alignment.Center){
            Image(painter = icon, modifier = Modifier.size(30.dp),contentDescription = "Null")
        }

        Spacer(Modifier.height(4.dp))
        
        Text(text = text, modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 12.sp,
            color = Color.Black)
        
    }

}

@Preview
@Composable
fun DefaultPreview() {
    RoundedIconButton(text = "Camera",
        icon = painterResource(id = R.drawable.camera),
        color = Color(0xffFEF4E7)
    )
}
