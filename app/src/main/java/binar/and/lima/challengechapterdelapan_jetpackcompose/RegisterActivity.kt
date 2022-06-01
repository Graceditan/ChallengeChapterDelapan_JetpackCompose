package binar.and.lima.challengechapterdelapan_jetpackcompose

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import binar.and.lima.challengechapterdelapan_jetpackcompose.ui.theme.ChallengeChapterDelapan_JetpackComposeTheme

class RegisterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChallengeChapterDelapan_JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting4("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting4(name: String) {
    Spacer(modifier = Modifier.padding(20.dp))

    Column(modifier = Modifier
        .border(width = 3.dp, color = Color.Red)
        .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(text = "Register", fontSize = 30.sp, fontWeight = FontWeight.Bold)


        Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "registimg",
            modifier = Modifier.padding(20.dp))


        var username by remember {
            mutableStateOf("") }
        TextField(value = "Username", onValueChange = {username = it},
            modifier = Modifier.padding(5.dp))

        var email by remember {
            mutableStateOf("") }
        TextField(value = "email", onValueChange = {email = it},
            modifier = Modifier.padding(5.dp))

        var pas by remember {
            mutableStateOf("") }
        TextField(value = "password", onValueChange = {pas = it},
            modifier = Modifier.padding(5.dp))

        var kp by remember {
            mutableStateOf("") }
        TextField(value = "konfirmasi password", onValueChange = {kp = it},
            modifier = Modifier.padding(5.dp))

        val mContext = LocalContext.current
        Button(onClick = { mContext.startActivity(Intent(mContext,LoginActivity::class.java))})
        {
            Text(text = "Register")

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview4() {
    ChallengeChapterDelapan_JetpackComposeTheme {
        Greeting4("Android")
    }
}