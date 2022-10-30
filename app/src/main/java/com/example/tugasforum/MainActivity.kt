package com.example.tugasforum

import android.os.Bundle
import android.os.Message
import android.widget.ImageSwitcher
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugasforum.ui.theme.TugasForumTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            display(com.example.tugasforum.Message("Recommendations for You"))
        }
    }
}
data class Message(val salutation: String)

@Composable
fun display(msg : com.example.tugasforum.Message){
    Column() {
        Image(painter = painterResource(id = R.drawable.valorant),
            contentDescription = "Image displayer")
        Spacer(modifier = Modifier.height(40.dp))
        Text(text = msg.salutation,
            color = Color.Blue,
            fontSize = 20.sp)
        Row() {
            Image(painter = painterResource(id = R.drawable.img),
                contentDescription = "Image displayer",
            modifier = Modifier
                .size(120.dp))
            Spacer(modifier = Modifier.width(20.dp))
            Image(painter = painterResource(id = R.drawable.img_1),
                contentDescription = "Image displayer",
                modifier = Modifier
                    .size(120.dp))
            Spacer(modifier = Modifier.width(20.dp))
            Image(painter = painterResource(id = R.drawable.img_2),
                contentDescription = "Image displayer",
                modifier = Modifier
                    .size(120.dp))
        }
        Spacer(modifier = Modifier.height(40.dp))
        Row() {
            Spacer(modifier = Modifier.width(40.dp))
            Button(
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Cyan),
                onClick = {}) {
                Text(text = "Review Game", color = Color.Blue)
            }
            Spacer(modifier = Modifier.width(70.dp))
            Button(
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Cyan),
                onClick = {}) {
                Text(text = "Top Up Game", color = Color.Blue)
            }
        }
        Spacer(modifier = Modifier.height(50.dp))
        Row() {
            Spacer(modifier = Modifier.width(40.dp))
            Button(
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Cyan),
                onClick = {}) {
                Text(text = "Event Game", color = Color.Blue)
            }
            Spacer(modifier = Modifier.width(70.dp))
            Button(
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Cyan),
                onClick = {}) {
                Text(text = "History Top Up", color = Color.Blue)
            }
        }
        Spacer(modifier = Modifier.height(122.dp))
        Surface(modifier = Modifier
            .width(500.dp)
            .height(50.dp),
        color = Color.Cyan) {
            Row() {
                Spacer(modifier = Modifier.width(70.dp))
                Image(painter = painterResource(id = R.drawable.home),
                    contentDescription = "Image Home")
                Spacer(modifier = Modifier.width(70.dp))
                Image(painter = painterResource(id = R.drawable.profile),
                    contentDescription = "Image Profile")
                Spacer(modifier = Modifier.width(70.dp))
                Image(painter = painterResource(id = R.drawable.settings),
                    contentDescription = "Image Settings")
            }
        }
    }
}
