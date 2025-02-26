package com.example.myapplicationnumber2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplicationnumber2.ui.theme.MyApplicationNumber2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationNumber2Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    GreetingImage(name = "Tom Oblocki", email = "Email me at tom@oblocki.com")
                }
            }
        }
    }
}

@Composable
fun GreetingText(name: String, email: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
    ) {
        Text(
            text = name,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            color = Color.Red,
            textAlign = TextAlign.Center
        )

        Text(
            text = email,
            fontSize = 36.sp,
            lineHeight = 45.sp,
            textAlign = TextAlign.Center

        )
    }
}

@Composable
fun GreetingImage(name: String, email: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.panel_106568328_image_46764aeb_7366_40dc_aa9a_76a631ad1d32)
    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F,
            modifier = Modifier.fillMaxSize()
        )

        GreetingText(
            name = name,
            email = email,
            modifier = Modifier.fillMaxSize().padding(8.dp)
        )
    }
}
@Preview(showBackground = true)
@Composable
fun PostCardPreview() {
    MyApplicationNumber2Theme {
        GreetingImage(name = "Tom Oblocki", email = "Email me at tom@oblocki.com")
    }
}