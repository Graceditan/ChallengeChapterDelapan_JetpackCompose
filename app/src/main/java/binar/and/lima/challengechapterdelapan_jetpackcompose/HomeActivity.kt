package binar.and.lima.challengechapterdelapan_jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import binar.and.lima.challengechapterdelapan_jetpackcompose.ui.theme.ChallengeChapterDelapan_JetpackComposeTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChallengeChapterDelapan_JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting3("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting3(name: String) {
    Column(Modifier.padding(15.dp)) {

        Card (
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
        ){

            Row(
                modifier = Modifier.fillMaxWidth(),

                ) {

                Image(painter = painterResource(id = binar.and.lima.challengechapterdelapan_jetpackcompose.R.drawable.ic_launcher_background), contentDescription = "homeimg",
                    modifier = Modifier.padding(10.dp))
                Text(text = "Judul",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(10.dp)
                )
                Text(text = "Penulis",
                    color = Color.Black,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(10.dp)
                )

                Text(text = "Tanggal",
                    color = Color.Blue,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(10.dp)
                )
            }
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview3() {
    ChallengeChapterDelapan_JetpackComposeTheme {
        Greeting3("Android")
    }
}