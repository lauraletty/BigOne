package com.example.emergencylink.ui.theme.screens.upload

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.emergencylink.R
import com.example.emergencylink.navigation.ADDANKLESCREEN_URL
import com.example.emergencylink.navigation.ADDBROKENLIMBSSCREEN_URL
import com.example.emergencylink.navigation.ADDBURNSCREEN_URL
import com.example.emergencylink.navigation.ADDCHESTPAINSCREEN_URL
import com.example.emergencylink.navigation.ADDFAINTSCREEN_URL
import com.example.emergencylink.navigation.ADDHEARTATTACKSCREEN_URL
import com.example.emergencylink.navigation.ADDNOSEBLEEDSCREEN_URL
import com.example.emergencylink.navigation.ADDSPINALSCREEN_URL


@Composable
fun uploadscreen(navController :NavHostController){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .paint(painterResource(id = R.drawable.login), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Button(onClick = {
            navController.navigate(ADDBURNSCREEN_URL)
        },
            colors = ButtonDefaults.buttonColors(Color.Blue)) {
            Text(text = "BURN AID",
                color = Color.White)

        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navController.navigate(ADDANKLESCREEN_URL)
        },
            colors = ButtonDefaults.buttonColors(Color.Blue)) {
            Text(text = "ANKLESPRAIN AID",
                color = Color.White)

        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navController.navigate(ADDCHESTPAINSCREEN_URL)
        },
            colors = ButtonDefaults.buttonColors(Color.Blue)) {
            Text(text = "CHESTPAIN AID",
                color = Color.White)

        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navController.navigate(ADDFAINTSCREEN_URL)
        },
            colors = ButtonDefaults.buttonColors(Color.Blue)) {
            Text(text = "FAINT AID",
                color = Color.White)

        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navController.navigate(ADDSPINALSCREEN_URL)
        },
            colors = ButtonDefaults.buttonColors(Color.Blue)) {
            Text(text = "SPINALINJURY AID",
                color = Color.White)

        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navController.navigate(ADDHEARTATTACKSCREEN_URL)
        },
            colors = ButtonDefaults.buttonColors(Color.Blue)) {
            Text(text = "HEARTATTACK AID",
                color = Color.White)

        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navController.navigate(ADDNOSEBLEEDSCREEN_URL)
        },
            colors = ButtonDefaults.buttonColors(Color.Blue)) {
            Text(text = "NOSEBLEED AID",
                color = Color.White)

        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navController.navigate(ADDBROKENLIMBSSCREEN_URL)
        },
            colors = ButtonDefaults.buttonColors(Color.Blue)) {
            Text(text = "BROKENLIMBS AID",
                color = Color.White)

        }

        Spacer(modifier = Modifier.height(20.dp))

    }

}
@Composable
@Preview(showBackground = true)
fun uploadscreenpreview(){
        uploadscreen(navController = rememberNavController())
    }


