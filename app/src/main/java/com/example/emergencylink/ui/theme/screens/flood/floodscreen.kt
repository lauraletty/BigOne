package com.example.emergencylink.ui.theme.screens.flood

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.emergencylink.R
import com.example.emergencylink.navigation.CALL_URL
import com.example.emergencylink.ui.theme.Purple80

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun floodscreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        //TopAppBar
        val mContext = LocalContext.current
        TopAppBar(title = { Text(text = "CALL FOR HELP ->>>", fontSize = 25.sp, color = Color.White)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(Purple80),


            actions = {
                IconButton(onClick = {
                    navController.navigate(CALL_URL)
                }) {
                    Icon(
                        imageVector = Icons.Default.Call,
                        contentDescription = "call",
                        tint = Color.White
                    )
                }
            }
        )
        //end of TopAppBar
        Image(painter = painterResource(id = R.drawable.floodalert),
            contentDescription = "faint aid",
            modifier = Modifier
                .fillMaxSize())

        Spacer(modifier = Modifier.height(40.dp))



    }

}

@Composable
@Preview(showBackground = true)
fun floodscreenPreview(){
    floodscreen(navController = rememberNavController())

}