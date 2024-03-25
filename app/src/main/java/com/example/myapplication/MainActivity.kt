package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginPag()
                }
            }
        }
    }
}

@Composable
fun LoginPag() {
    var phoneNumber by remember { mutableStateOf("") }
    Column (modifier = Modifier.padding(all = 0.dp)){
        Image(painter = painterResource(id = R.drawable.eac73dd3dafdc6bb0cc84cf18213072), contentDescription = null)
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Welcome to",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 20.dp),
            fontSize = 22.sp,
            style = MaterialTheme.typography.bodyLarge
            )
        Image(
            painter = painterResource(id = R.drawable.monashpark), contentDescription = null,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .size(100.dp),
        )

        Spacer(modifier = Modifier.height(100.dp))
        Row (modifier = Modifier.absolutePadding(left = 20.dp)){
            if (phoneNumber.isNotEmpty()){
                Text(
                    text = "      Enter you mobile number",
                    fontSize = 20.sp,
                    style = MaterialTheme.typography.bodyLarge
                )
            }
            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = "phone",
                modifier = Modifier
                    .size(24.dp)
                    .offset(y = 2.dp)
            )
            Text(
                text = "      Enter you mobile number",
                fontSize = 20.sp,
                style = MaterialTheme.typography.bodyLarge
            )
        }
        Divider(color = Color.LightGray, thickness = 1.dp)
    }


}




