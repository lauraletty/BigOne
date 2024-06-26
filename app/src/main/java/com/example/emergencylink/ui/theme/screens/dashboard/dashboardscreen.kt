package com.example.emergencylink.ui.theme.screens.dashboard


import android.content.Intent
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
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
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.emergencylink.R
import com.example.emergencylink.navigation.ANKLE_URL
import com.example.emergencylink.navigation.BROKENLIMB_URL
import com.example.emergencylink.navigation.BURN_URL
import com.example.emergencylink.navigation.CALL_URL
import com.example.emergencylink.navigation.CHEST_URL
import com.example.emergencylink.navigation.FAINT_URL
import com.example.emergencylink.navigation.HEARTATTACK_URL
import com.example.emergencylink.navigation.NOSEBLEED_URL
import com.example.emergencylink.navigation.SPINAL_URL
import com.example.emergencylink.ui.theme.PurpleGrey40


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun dashboardscreen(navController: NavHostController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(PurpleGrey40))
    {

        //TopAppBar
        val mContext = LocalContext.current
        TopAppBar(title = { Text(text = "Firstaid", fontSize = 30.sp, color = Color.Red)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.DarkGray),


            actions = {
                IconButton(onClick = {
                    navController.navigate(CALL_URL)
                    }) {
                    Icon(
                        imageVector = Icons.Default.Call,
                        contentDescription = "call",
                        tint = Color.Red
                    )
                }
            }
        )
        //end of TopAppBar
        Column(modifier = Modifier
            .verticalScroll(rememberScrollState())) {
            androidx.compose.material3.Text(
                text = "Easy and Fast aid guide",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(start = 40.dp))
            Spacer(modifier = Modifier.height(10.dp))
            Row (modifier = Modifier
                .padding(25.dp)){
                //Column1
                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)) {
                        Box (modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.nosebleed),
                                contentDescription = "nosebleed",
                                modifier = Modifier.fillMaxSize()
                                    .clickable {
                                        navController.navigate(NOSEBLEED_URL)
                                    },
                                contentScale = ContentScale.FillBounds)


                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "Nosebleed",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        modifier = Modifier
                            .clickable {
                                       navController.navigate(NOSEBLEED_URL)
                            },
                        fontWeight = FontWeight.ExtraBold)
                    Spacer(modifier = Modifier.height(5.dp))


                }
                //End of Column1
                Spacer(modifier = Modifier.width(20.dp))
                //Column2
                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)) {
                        Box (modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.faint),
                                contentDescription = "Faint",
                                modifier = Modifier.fillMaxSize()
                                    .clickable {
                                        navController.navigate(FAINT_URL)
                                    },
                                contentScale = ContentScale.FillBounds)

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "Faint",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        modifier = Modifier
                            .clickable {
                                navController.navigate(FAINT_URL)
                            },
                        fontWeight = FontWeight.ExtraBold)
                    Spacer(modifier = Modifier.height(3.dp))


                }
                //End of Column2
            }
            //End of Row 1
            Row (modifier = Modifier
                .padding(25.dp)){
                //Column1
                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)) {
                        Box (modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.chestpain),
                                contentDescription = "chestpain",
                                modifier = Modifier.fillMaxSize()
                                    .clickable {
                                        navController.navigate(CHEST_URL)
                                    },
                                contentScale = ContentScale.FillBounds)

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "Chestpain",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        modifier = Modifier
                            .clickable {
                                navController.navigate(CHEST_URL)
                            },
                        fontWeight = FontWeight.ExtraBold)

                    Spacer(modifier = Modifier.height(3.dp))

                }
                //End of Column1
                Spacer(modifier = Modifier.width(20.dp))
                //Column2
                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)) {
                        Box (modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.hearattack),
                                contentDescription = "heartattack",
                                modifier = Modifier.fillMaxSize()
                                    .clickable {
                                        navController.navigate(HEARTATTACK_URL)
                                    },
                                contentScale = ContentScale.FillBounds)

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "Heartattack",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        modifier = Modifier
                            .clickable {
                                navController.navigate(HEARTATTACK_URL)
                            },
                        fontWeight = FontWeight.ExtraBold)
                    Spacer(modifier = Modifier.height(3.dp))

                }
                //End of Column2
            }
            //  End of Row 2
            //Start of Row 3
            Row (modifier = Modifier
                .padding(25.dp)){
                //Column1
                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)) {
                        Box (modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.brokenleg),
                                contentDescription = "anklesprain",
                                modifier = Modifier.fillMaxSize()
                                    .clickable {
                                        navController.navigate(BROKENLIMB_URL)
                                    },
                                contentScale = ContentScale.FillBounds)

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Broken Limbs",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        modifier = Modifier
                            .clickable {
                                navController.navigate(BROKENLIMB_URL)
                            },
                        fontWeight = FontWeight.ExtraBold)
                    Spacer(modifier = Modifier.height(3.dp))

                }

                //End of Column1
                Spacer(modifier = Modifier.width(20.dp))
                //Column2
                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)) {
                        Box (modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.anklesprain),
                                contentDescription = "anklesprain",
                                modifier = Modifier.fillMaxSize()
                                    .clickable {
                                        navController.navigate(ANKLE_URL)
                                    },
                                contentScale = ContentScale.FillBounds)

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "AnkleSprain",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        modifier = Modifier
                            .clickable {
                                navController.navigate(ANKLE_URL)
                            },
                        fontWeight = FontWeight.ExtraBold)
                    Spacer(modifier = Modifier.height(3.dp))

                }
                //End of Column3
            }
            //End of Row 3

            Row (modifier = Modifier
                .padding(25.dp)){
                //Column1
                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)) {
                        Box (modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.spinalinjury),
                                contentDescription = "Fever",
                                modifier = Modifier.fillMaxSize()
                                    .clickable {
                                        navController.navigate(SPINAL_URL)
                                    },
                                contentScale = ContentScale.FillBounds)

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Spinal injury",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        modifier = Modifier
                            .clickable {
                                navController.navigate(SPINAL_URL)
                            },
                        fontWeight = FontWeight.ExtraBold)
                    Spacer(modifier = Modifier.height(3.dp))

                }
                //End of Column1
                Spacer(modifier = Modifier.width(20.dp))
                //Column2

                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)) {
                        Box (modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.burn),
                                contentDescription = "Fever",
                                modifier = Modifier.fillMaxSize()
                                    .clickable {
                                        navController.navigate(BURN_URL)
                                    },
                                contentScale = ContentScale.FillBounds)

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Burn",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        modifier = Modifier
                            .clickable {
                                navController.navigate(BURN_URL)
                            },
                        fontWeight = FontWeight.ExtraBold)
                    Spacer(modifier = Modifier.height(3.dp))

                }

                //End of Column2
            }
            //End of Row 3



        }


    }
}


@Preview(showBackground = true)
@Composable
fun dashboardPreview(){
    dashboardscreen(rememberNavController())
}