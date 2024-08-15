package com.example.propertyplus.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.propertyplus.R
import com.example.propertyplus.navigation.ROUT_HOME
import com.example.propertyplus.navigation.ROUT_PROPERTY
import com.example.propertyplus.ui.theme.BlueIvy

@Composable
fun DashboardScreen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Property Plus",
            fontSize = 60.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Magenta,
        )

        Spacer(modifier = Modifier.height(10.dp))

        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "home",
            modifier = Modifier
                .size(150.dp),
            contentScale = ContentScale.Crop

        )

        Text(
            text = "Manage your properties with ease.",
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,

            )

        Spacer(modifier = Modifier.height(10.dp))

        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            //Start of main card
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(700.dp)
                .clickable { navController.navigate(ROUT_HOME) },
                shape = RoundedCornerShape(40.dp),
                colors = CardDefaults.cardColors(BlueIvy)
            ) {

                //Row1
                Row(modifier = Modifier.padding(20.dp)) {
                    //Card
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)) {
                        Column {

                            Spacer(modifier = Modifier.height(10.dp))
                            Box(modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center) {
                                Image(painter = painterResource(
                                    id = R.drawable.home0
                                ),
                                    contentDescription ="home",
                                    modifier = Modifier.size(100.dp) )


                            }
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(text = "Home",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Serif,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )

                        }
                    }
                    //End of card
                    Spacer(modifier = Modifier.width(10.dp))

                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                        .clickable { navController.navigate(ROUT_PROPERTY) }) {
                        Column {

                            Spacer(modifier = Modifier.height(10.dp))
                            Box(modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center) {
                                Image(painter = painterResource(
                                    id = R.drawable.property
                                ),
                                    contentDescription ="home",
                                    modifier = Modifier.size(100.dp) )


                            }
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(text = "Property",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Serif,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )

                        }
                    }
                    //End of card

                }
                //End of row1


                //Row2
                Row(modifier = Modifier.padding(20.dp)) {
                    //Card
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation()) {
                        Column {

                            Spacer(modifier = Modifier.height(10.dp))
                            Box(modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center) {
                                Image(painter = painterResource(
                                    id = R.drawable.profile
                                ),
                                    contentDescription ="home",
                                    modifier = Modifier.size(100.dp) )


                            }
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(text = "Profile",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Serif,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )

                        }
                    }
                    //End of card
                    Spacer(modifier = Modifier.width(10.dp))

                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)) {
                        Column {

                            Spacer(modifier = Modifier.height(10.dp))
                            Box(modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center) {
                                Image(painter = painterResource(
                                    id = R.drawable.settings
                                ),
                                    contentDescription ="home",
                                    modifier = Modifier.size(100.dp) )


                            }
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(text = "Settings",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Serif,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )

                        }
                    }
                    //End of card

                }
                //End of row2



                //Row3
                Row(modifier = Modifier.padding(20.dp)) {
                    //Card
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)) {
                        Column {

                            Spacer(modifier = Modifier.height(10.dp))
                            Box(modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center) {
                                Image(painter = painterResource(
                                    id = R.drawable.home0
                                ),
                                    contentDescription ="home",
                                    modifier = Modifier.size(100.dp) )


                            }
                            Spacer(modifier = Modifier.height(10.dp))



                        }
                    }
                    //End of card
                    Spacer(modifier = Modifier.width(10.dp))

                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)) {
                        Column {

                            Spacer(modifier = Modifier.height(10.dp))
                            Box(modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center) {
                                Image(painter = painterResource(
                                    id = R.drawable.icon),
                                    contentDescription ="home",
                                    modifier = Modifier.size(100.dp) )


                            }
                            Spacer(modifier = Modifier.height(10.dp))



                        }
                    }
                    //End of card

                }
                //End of row3


            }

        }
        //End of main card

    }





}

@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}