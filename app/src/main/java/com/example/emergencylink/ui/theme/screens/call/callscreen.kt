package com.example.emergencylink.ui.theme.screens.call

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.emergencylink.R
import com.example.emergencylink.navigation.EMERGENCY_URL
import com.example.emergencylink.navigation.HOME_URL
import com.example.emergencylink.ui.theme.Purple80


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun callscreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Purple80),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        //TopAppBar
        val mContext = LocalContext.current
        TopAppBar(title = { Text(text = "EMERGENCY",
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            color = Color.White)},
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            colors = TopAppBarDefaults.mediumTopAppBarColors(Purple80),
            navigationIcon = {
                IconButton(onClick = {
                    navController.navigate(EMERGENCY_URL)
                }) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription = "arrowback",
                        tint = Color.White,
                        modifier = Modifier
                            .size(30.dp))
                }
            },


            actions = {
                IconButton(onClick = {
                    navController.navigate(HOME_URL) }) {
                    Icon(
                        imageVector = Icons.Default.Home,
                        contentDescription = "call",
                        tint = Color.White,
                        modifier = Modifier
                            .size(40.dp)
                    )
                }
            }
        )
        //end of TopAppBar


        Spacer(modifier = Modifier.height(60.dp))

        Text(text = "After pressing the SOS button we will contact the nearest hospital,police station to your current location.",
            color = Color.White,
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = FontFamily.Serif,
            modifier = Modifier
                .padding(start = 30.dp, end = 20.dp))

        Spacer(modifier = Modifier.height(50.dp))


        Image(
            painter = painterResource(id = R.drawable.sosbutton),
            contentDescription = "call",
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(5.dp))
                .size(width = 300.dp, height = 200.dp)
                .clickable {
                    val callIntent = Intent(Intent.ACTION_DIAL)
                    callIntent.data = "tel:911".toUri()
                    mContext.startActivity(callIntent)
                },
            alignment = Alignment.Center
        )






        Spacer(modifier = Modifier.height(60.dp))

        Text(text = "Please standby,we are currently requesting for help.",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = FontFamily.Serif,
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp))


    }
}



@Composable
@Preview(showBackground = true)
fun callscreenPreview(){

        callscreen(navController = rememberNavController())

}