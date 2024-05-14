package com.example.emergencylink.ui.theme.screens.signup

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.emergencylink.R
import com.example.emergencylink.data.AuthViewModel
import com.example.emergencylink.navigation.LOGIN_URL


@Composable
fun SignupScreen(navController:NavHostController) {
    val context = LocalContext.current
    Column(modifier = Modifier
        .fillMaxSize()
        .paint(painterResource(id = R.drawable.login2), contentScale = ContentScale.FillBounds),
        horizontalAlignment =  Alignment.CenterHorizontally) {
        Text(
            text = "Create Account.",
            color = Color.White,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive
        )
        Spacer(modifier = Modifier.height(30.dp))
        var username by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        Text(
            text = "Username",
            color = Color.White,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(end = 190.dp)
        )
        Spacer(modifier = Modifier.height(5.dp))
        TextField(
            value = username,
            onValueChange = { username = it },
            placeholder = {
                Text(
                    text = "Username",
                    color = Color.Black,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
            },
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Email Address",
            color = Color.White,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(end = 190.dp)
        )
        Spacer(modifier = Modifier.height(5.dp))
        TextField(
            value = email,
            onValueChange = { email = it },
            placeholder = {
                Text(
                    text = "Enter your Email",
                    color = Color.Black,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
            },
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Password",
            color = Color.White,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(end = 190.dp)
        )
        Spacer(modifier = Modifier.height(5.dp))
        TextField(
            value = password,
            onValueChange = { password = it },
            placeholder = {
                Text(
                    text = "Enter your Password",
                    color = Color.Black,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
            },
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.height(30.dp))
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Button(
                onClick = {
                    val authViewModel = AuthViewModel(navController,context)
                    authViewModel.signup(username,email,password )
                },
                colors = ButtonDefaults.buttonColors(Color.Blue),
                shape = RoundedCornerShape(5.dp)
            ) {
                Text(text = "Sign Up")
            }
        }

        Spacer(modifier = Modifier.height(15.dp))

        Row {
            Spacer(modifier = Modifier.width(25.dp))

            Divider(modifier = Modifier
                .width(150.dp)
                .padding(top = 10.dp, end = 10.dp)
                .height(2.dp), color = Color.Black)

            Text(text = "OR", fontSize = 15.sp)

            Divider(modifier = Modifier
                .width(150.dp)
                .padding(top = 10.dp, start = 10.dp)
                .height(2.dp), color = Color.Black)

            Spacer(modifier = Modifier.width(15.dp))
        }
        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = "Have an Account.LOGIN ?",
            modifier = Modifier
                .padding(start = 20.dp)
                .clickable {
                           navController.navigate(LOGIN_URL)
                },
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.Underline
        )

    }
}
@Composable
@Preview(showBackground = true)
fun SignupScreenPreview(){

    SignupScreen(navController = rememberNavController())
}
