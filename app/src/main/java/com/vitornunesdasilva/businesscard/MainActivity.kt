package com.vitornunesdasilva.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vitornunesdasilva.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    BusinessApp()
                }
            }
        }
    }
}

@Composable
fun BusinessApp(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = modifier.padding(horizontal = 16.dp, vertical = 10.dp)
    ) {
        Spacer(modifier)
        Presentation()
        Contact()
    }
}

@Composable
fun Contact() {
    Column(

    ) {
        ContactItem(text = "+55 (14) 99706-1888")
        ContactItem(text = "@vitornunesdasilva")
        ContactItem(text = "vitor1nuness@gmail.com")
    }
}

@Composable
fun ContactItem(modifier: Modifier = Modifier, text: String = "Contact") {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 64.dp, vertical = 10.dp)
    ) {
        Icon()
        Spacer(modifier.width(10.dp))
        Text(
            text = text,
            fontSize = 16.sp,
            modifier = modifier.fillMaxWidth()
        )
    }
}

@Composable
fun Logo() {
    Text(
        text = "",
        textAlign = TextAlign.Center,
        modifier = Modifier
            .size(90.dp)
            .background(Color.DarkGray)
    )
}

@Composable
fun FullName(text: String = "Full Name") {
    Text(
        text = text,
        textAlign = TextAlign.Center,
        fontSize = 36.sp,
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun Title(text: String = "Title") {
    Text(
        text = text,
        textAlign = TextAlign.Center,
        fontSize = 24.sp,
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun Presentation(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(10.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = modifier
                .fillMaxWidth()
                .padding(4.dp)
        ) {
            Logo()
        }
        Row {
            FullName(text = "Vitor Nunes da Silva")
        }
        Row {
            Title(text = "Desenvolvedor")
        }
    }
}

@Composable
fun Icon() {
    Text(
        text = "",
        textAlign = TextAlign.Center,
        modifier = Modifier
            .size(30.dp)
            .background(Color.DarkGray)
    )
}

@Preview
@Composable
fun BusinessAppPreview() {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        BusinessApp()
    }
}
