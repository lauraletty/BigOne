package com.example.emergencylink.ui.theme.screens.login


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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.emergencylink.R
import com.example.emergencylink.data.AuthViewModel
import com.example.emergencylink.navigation.FIRST_URL
import com.example.emergencylink.navigation.HOME_URL
import com.example.emergencylink.navigation.SIGNUP_URL


@Composable
fun LoginScreen(navController:NavHostController){
    val context = LocalContext.current
   Column (modifier = Modifier
       .fillMaxSize()
       .paint(painterResource(id = R.drawable.login3), contentScale = ContentScale.FillBounds),
       horizontalAlignment = Alignment.CenterHorizontally){
       var email by remember { mutableStateOf("") }
       var password by remember { mutableStateOf("") }
       Text(
           text = "Log In",
           color = Color.White,
           fontWeight = FontWeight.Bold,
           fontSize = 30.sp,
       )
       Spacer(modifier = Modifier.height(10.dp))
       Text(
           text = "Enter your Account Details",
           color = Color.White,
           fontWeight = FontWeight.Bold,
           fontSize = 20.sp,
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
       Spacer(modifier = Modifier.height(45.dp))
       Box(
           modifier = Modifier.fillMaxWidth(),
           contentAlignment = Alignment.Center
       ) {
           Button(
               onClick = {
                   val authViewModel = AuthViewModel(navController,context)
                   authViewModel.login(email, password)
               },
               colors = ButtonDefaults.buttonColors(Color.Blue),
               shape = RoundedCornerShape(5.dp),
               modifier = Modifier.padding(top = 10.dp)
           ) {
               Text(text = "LOGIN")
           }

       }
       Spacer(modifier = Modifier.height(30.dp))
     Row {
         Column {
             Text(
                 text = "Don't have an Account ?",
                 modifier = Modifier
                     .padding(start = 20.dp, top = 20.dp),
                 fontSize = 20.sp,
                 fontFamily = FontFamily.Serif,
                 fontWeight = FontWeight.Bold,
                 textDecoration = TextDecoration.Underline
             )
         }
         Spacer(modifier = Modifier.width(20.dp))

         Column {
                 Box (modifier = Modifier
                     .padding(start = 15.dp)){
                     Button(onClick = { navController.navigate(SIGNUP_URL) },colors = ButtonDefaults.buttonColors(Color.Blue),
                         shape = RoundedCornerShape(5.dp)) {
                         Text(text = "SIGN UP")

                     }

             }
         }
     }
       Spacer(modifier = Modifier.height(20.dp))
       Text(text = "Continue as a guest.",
           fontSize = 20.sp,
           fontFamily = FontFamily.Serif,
           fontWeight = FontWeight.Bold,
           textDecoration = TextDecoration.Underline,
           modifier = Modifier
               .clickable {
                   navController.navigate(FIRST_URL)
               }
               .padding(start = 20.dp))
       Spacer(modifier = Modifier.height(15.dp))
   }
}

@Composable
@Preview(showBackground = true)
fun LoginScreenPreview(){

    LoginScreen(navController = rememberNavController())

}