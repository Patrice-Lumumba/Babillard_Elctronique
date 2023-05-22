package com.example.babillard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.babillard.SplashScreen.Connexion.Ecoles.Filieres3IAC.Filieres3IACScreen
import com.example.babillard.SplashScreen.Connexion.Ecoles.Filieres3IAC.InfosTIPAM.InfosTIPAMevens.*
import com.example.babillard.SplashScreen.Connexion.Ecoles.Filieres3IAC.InfosTIPAM.InfosTIPAMgenerale.*
import com.example.babillard.SplashScreen.Screen
import com.example.babillard.SplashScreen.SplashScreen
import com.example.babillard.SplashScreen.SplashScreen_Content
import com.example.babillard.ui.theme.BabillardTheme
import com.example.babillard.SplashScreen.Connexion.Ecoles.EcolesScreen as EcolesScreen


////////////////////////////// Pour insérer toutes les navigations ///////////////////////////////////
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val navController = rememberNavController()

            /*
            NavHost(navController = navController, startDestination = "Screen", builder = {
                composable("Screen", content = { Screen(navController = navController) })
            })
            */

            BabillardTheme{
                //ouverture()

                Screen( navController )
                //EcolesScreen(navController)
                //EcolesScreen( navController )
                //Filieres3IACScreen( navController )
                // InfosTIPAMgeneralScreen( navController )
                //TIPAMgeneral1Screen( navController )
                //TIPAMgeneral2Screen( navController )
                //TIPAMgeneral3Screen( navController )
                //TIPAMgeneral4Screen(  navController )
                //TIPAMgeneral5Screen( navController )
                //TIPAMgeneral6Screen( navController )
                //TIPAMgeneral7Screen( navController )
                //InfosTIPAMevensScreen( navController )
                //TIPAMevents1Screen( navController )
                //TIPAMevents2Screen( navController )
                //TIPAMevents3Screen( navController )
                //TIPAMevents4Screen( navController )
                //TIPAMevents5Screen( navController )
                //TIPAMevents6Screen( navController )
                //TIPAMevents7Screen( navController )


                /*
                NavHost(navController = navController, startDestination = "Screen", builder = {
                    composable("Screen", content = { Screen(navController = navController) })
                })
                 */
            }
        }
    }

}
/////////////////////////// Terminé //////////////////////////////////

@Composable
fun ouverture() {
    /*
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "EcolesScreen", builder = {
        composable("EcolesScreen", content = { EcolesScreen(navController = navController) })
    })
    */
}



