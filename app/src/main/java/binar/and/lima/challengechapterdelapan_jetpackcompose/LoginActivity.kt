package binar.and.lima.challengechapterdelapan_jetpackcompose

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import binar.and.lima.challengechapterdelapan_jetpackcompose.ui.theme.ChallengeChapterDelapan_JetpackComposeTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChallengeChapterDelapan_JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting2("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String) {
    Column(modifier = Modifier
        .border(width = 3.dp, color = Color.Red)
        .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(text = "Login", fontSize = 30.sp, fontWeight = FontWeight.Bold)


        var email by remember {
            mutableStateOf("") }
        TextField(value = "email", onValueChange = {email = it},
            modifier = Modifier.padding(5.dp))

        var pas by remember {
            mutableStateOf("") }
        TextField(value = "password", onValueChange = {pas = it},
            modifier = Modifier.padding(5.dp))


        val mContext = LocalContext.current
        Button(onClick = { mContext.startActivity(Intent(mContext,HomeActivity::class.java))})
        {
            Text(text = "Login")

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview2() {
    ChallengeChapterDelapan_JetpackComposeTheme {
        Greeting2("Android")
    }
}