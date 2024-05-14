package com.example.emergencylink.ui.theme.screens.emergency

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.emergencylink.R
import com.example.emergencylink.navigation.CALL_URL
import com.example.emergencylink.navigation.HOME_URL
import com.example.emergencylink.ui.theme.Purple80

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun emergencyscreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //TopAppBar
        val mContext = LocalContext.current
        TopAppBar(title = { Text(text = "REPORT",
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            color = Color.White)
        },
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            colors = TopAppBarDefaults.mediumTopAppBarColors(Purple80),
            navigationIcon = {
                IconButton(onClick = {
                    navController.navigate(HOME_URL)
                }) {
                    Icon(imageVector = Icons.Default.KeyboardArrowLeft,
                        contentDescription = "arrowback",
                        tint = Color.White,
                        modifier = Modifier
                            .size(30.dp))
                }
            },

            )
        //end of TopAppBar

        Spacer(modifier = Modifier.height(30.dp))

        Text(text = "What kind of emergency?",
            color = Color.Red, fontSize = 30.sp,
            textAlign = TextAlign.Left,
            modifier = Modifier
                .padding(end = 60.dp))

        Spacer(modifier = Modifier.height(30.dp))

        //ROW 1

        Row (modifier = Modifier
            .padding()){
            //Column1
            Column {
                Card(modifier = Modifier
                    .height(100.dp)
                    .width(150.dp)) {
                    Box (modifier = Modifier
                        .fillMaxWidth(),
                        contentAlignment = Alignment.Center){
                        Image(painter = painterResource(id = R.drawable.fire),
                            contentDescription = "fire",
                            modifier = Modifier
                                .fillMaxSize()
                                .clickable {
                                    navController.navigate(CALL_URL)
                                },
                            contentScale = ContentScale.FillBounds)

                    }

                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "FIRE",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.Red,
                    modifier = Modifier
                        .clickable {
                            navController.navigate(CALL_URL)
                        }
                        .padding(start = 25.dp),
                    fontWeight = FontWeight.ExtraBold)
                Spacer(modifier = Modifier.height(5.dp))


            }
            //End of Column1
            Spacer(modifier = Modifier.width(40.dp))
            //Column2
            Column {
                Card(modifier = Modifier
                    .height(100.dp)
                    .width(150.dp)) {
                    Box (modifier = Modifier
                        .fillMaxWidth(),
                        contentAlignment = Alignment.Center){
                        Image(painter = painterResource(id = R.drawable.floods),
                            contentDescription = "Floods",
                            modifier = Modifier
                                .fillMaxSize()
                                .clickable {
                                    navController.navigate(CALL_URL)
                                },
                            contentScale = ContentScale.FillBounds)

                    }

                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "FLOODS",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.Red,
                    modifier = Modifier
                        .clickable {
                            navController.navigate(CALL_URL)
                        }
                        .padding(start = 25.dp),
                    fontWeight = FontWeight.ExtraBold)
                Spacer(modifier = Modifier.height(5.dp))


            }
            //End of Column2
            Spacer(modifier = Modifier.width(40.dp))

        }
        //End of Row 1

        Spacer(modifier = Modifier.height(40.dp))

        //row 2
        Row (modifier = Modifier
            .padding(end = 65.dp)) {
            //Column1
            Column {
                Card(
                    modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.accident),
                            contentDescription = "fire",
                            modifier = Modifier
                                .fillMaxSize()
                                .clickable {
                                    navController.navigate(CALL_URL)
                                },
                            contentScale = ContentScale.FillBounds
                        )

                    }

                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "ACCIDENT",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.Red,
                    modifier = Modifier
                        .clickable {
                            navController.navigate(CALL_URL)
                        }
                        .padding(start = 25.dp),
                    fontWeight = FontWeight.ExtraBold)
                Spacer(modifier = Modifier.height(5.dp))


            }
            //End of Column1
            Spacer(modifier = Modifier.width(45.dp))
            //Column2
            Column {
                Card(
                    modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.eartquacke),
                            contentDescription = "Floods",
                            modifier = Modifier
                                .fillMaxSize()
                                .clickable {
                                    navController.navigate(CALL_URL)
                                },
                            contentScale = ContentScale.FillBounds
                        )

                    }

                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "EARTHQUAKE",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.Red,
                    modifier = Modifier
                        .clickable {
                            navController.navigate(CALL_URL)
                        }
                        .padding(start = 25.dp),
                    fontWeight = FontWeight.ExtraBold)
                Spacer(modifier = Modifier.height(5.dp))


            }
            //End of Column2
        }
        //End of Row 2

        Spacer(modifier = Modifier.height(40.dp))

        Row {

            //column 3

            Column {
                Card(modifier = Modifier
                    .height(100.dp)
                    .width(150.dp)) {
                    Box (modifier = Modifier
                        .fillMaxWidth(),
                        contentAlignment = Alignment.Center){
                        Image(painter = painterResource(id = R.drawable.crime),
                            contentDescription = "Floods",
                            modifier = Modifier
                                .fillMaxSize()
                                .clickable {
                                    navController.navigate(CALL_URL)
                                },
                            contentScale = ContentScale.FillBounds)

                    }

                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "CRIME",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.Serif,
                    color = Color.Red,
                    modifier = Modifier
                        .clickable {
                            navController.navigate(CALL_URL)
                        }
                        .padding(start = 25.dp),
                    fontWeight = FontWeight.ExtraBold)
                Spacer(modifier = Modifier.height(5.dp))


            }

            //end of collumn 3
        }









    }

}

@Composable
@Preview(showBackground = true)
fun emergencyscreenPreview(){

        emergencyscreen(navController = rememberNavController())

}




