package com.example.babillard.SplashScreen.Connexion.Ecoles.Filieres3IAC.InfosTIPAM.InfosTIPAMevens




import androidx.compose.foundation.Image
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.layout.ColumnScopeInstance.weight
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowLeft
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.babillard.R



//////////////////////////// Main de la  page ///////////////////////////////
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Preview
@Composable
fun InfosTIPAMevensScreen( /*navController: NavHostController*/ ){
    val scrollState = rememberLazyListState()
    //val scaffoldState2 = rememberScaffoldState()
    Box{
        InfosTIPAMevens_Content(scrollState)
    }
    Scaffold(scaffoldState = rememberScaffoldState(),
        topBar = { InfosTIPAMevens_Headline() },
        drawerContent = {},
        content = { InfosTIPAMevens_Card() },
        bottomBar = { InfosTIPAMevens_Footer() }
    )
}
/////////////////////// Terminé ////////////////////////////////



//////////////////////// L'entete de la page ///////////////////
@Composable
fun InfosTIPAMevens_Headline() {
    Column {
        Row(
            Modifier
                .clip(
                    RoundedCornerShape(
                        bottomStart = 30.dp,
                        bottomEnd = 30.dp
                    )
                )
                .fillMaxWidth()
                .background(Color.Red)
                .padding(
                    horizontal = 8.dp,
                    vertical = 4.dp
                ),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Start
        ) {
            IconButton(
                /////////////////////////////////////////////// Click retour ///////////
                onClick = { /*TODO*/}
                ////////////////////////////////////////////// Click retour /////////
            ) {
                Icon(
                    Icons.Rounded.KeyboardArrowLeft ,
                    contentDescription = null ,
                    tint = Color.White,
                    modifier = Modifier.size(48.dp)
                )
            }

            Row(
                modifier = Modifier
                    .height(60.dp)
                    .padding(start = 30.dp, top = 4.dp, end = 4.dp, bottom = 4.dp),
            ) {
                Text(
                    text = "Informations",
                    style = MaterialTheme.typography.h4,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        }
    }
}
/////////////////////// Terminé ////////////////////////////////



////////////////////// Le pied de la page /////////////////
@Composable
fun InfosTIPAMevens_Footer() {
    Box(modifier = Modifier
        .height(20.dp)
        .fillMaxWidth()
        .background(color = Color.Red)
    ){
        Row(
            modifier = Modifier.padding(start = 170.dp, top = 4.dp, end = 4.dp, bottom = 4.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(100.dp)
        )
        {
            IconButton(
                /////////////////////////////////////////////// Click retour ///////////
                onClick = { /*TODO*/ },
                /////////////////////////////////////////////// Click retour ///////////
                modifier = Modifier.size(32.dp, 32.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.iuc),
                    contentDescription = "My Image",
                    modifier = Modifier
                )
            }
        }
    }
}
/////////////////////// Terminé ////////////////////////////////



//////////////////////////// Corps de la page /////////////////
@Composable
fun InfosTIPAMevens_Card() {
    //Icon(painterResource(R.drawable.arrow_back) , contentDescription = "" )

    ///////////////// Scroll Horizontal ///////////////
    LazyColumn {


        /////////////// Logo centré //////////////////////
        item{
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .height(80.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.tipam),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp).padding(start = 1.dp).width(1.dp)
                )
            }
        }

        /////////////// Premier cadre //////////////////////////
        item {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth()
            ){

                LazyRow(horizontalArrangement = Arrangement.spacedBy(30.dp),) {
                    items(1) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 30.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(30.dp),
                                verticalAlignment = Alignment.Bottom
                            ) {
                                ////////////////// Colonne A /////////////////
                                Column {
                                    IconButton(
                                        /////////////////////////////////////////////// Click retour ///////////
                                        onClick = { /*TODO*/}
                                        ////////////////////////////////////////////// Click retour /////////
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.general),
                                            contentDescription = "Image 1",
                                            modifier = Modifier.size(80.dp)
                                        )
                                    }
                                    Text(text = "Générale")
                                }

                                //////////////////// Colonne B /////////////////////////////
                                Column {
                                    IconButton(
                                        /////////////////////////////////////////////// Click retour ///////////
                                        onClick = { /*TODO*/}
                                        ////////////////////////////////////////////// Click retour /////////
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.emploprof_removebg_preview),
                                            contentDescription = "Image 1",
                                            modifier = Modifier.size(80.dp)
                                        )
                                    }
                                    Text(text = "EDT_P")
                                }

                                //////////////// Colonne C ///////////////////
                                Column {
                                    IconButton(
                                        /////////////////////////////////////////////// Click retour ///////////
                                        onClick = { /*TODO*/}
                                        ////////////////////////////////////////////// Click retour /////////
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.listprof),
                                            contentDescription = "Image 1",
                                            modifier = Modifier.size(80.dp)
                                        )
                                    }
                                    Text(text = "Liste_P")
                                }

                                //////////////// Colonne d ///////////////////
                                Column {
                                    IconButton(
                                        /////////////////////////////////////////////// Click retour ///////////
                                        onClick = { /*TODO*/}
                                        ////////////////////////////////////////////// Click retour /////////
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.sport),
                                            contentDescription = "Image 1",
                                            modifier = Modifier.size(80.dp)
                                        )
                                    }
                                    Text(text = "Sport")
                                }

                            }
                        }
                    }
                }
            }
        }

        /////////////// Deuxième cadre //////////////////////////
        item {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth()
            ){
                LazyRow(horizontalArrangement = Arrangement.spacedBy(30.dp),) {
                    items(1) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 30.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(30.dp),
                                verticalAlignment = Alignment.Bottom
                            ) {
                                ////////////////// Colonne A /////////////////
                                Column {
                                    IconButton(
                                        /////////////////////////////////////////////// Click retour ///////////
                                        onClick = { /*TODO*/}
                                        ////////////////////////////////////////////// Click retour /////////
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.img3),
                                            contentDescription = "Image 1",
                                            modifier = Modifier.size(80.dp)
                                        )
                                    }
                                    Text(text = "SN")
                                }

                                //////////////////// Colonne B /////////////////////////////
                                Column {
                                    IconButton(
                                        /////////////////////////////////////////////// Click retour ///////////
                                        onClick = { /*TODO*/}
                                        ////////////////////////////////////////////// Click retour /////////
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.vector_removebg_preview),
                                            contentDescription = "Image 1",
                                            modifier = Modifier.size(80.dp)
                                        )
                                    }
                                    Text(text = "EDT_E")
                                }
                                //////////////// Colonne C ///////////////////
                                Column {
                                    IconButton(
                                        /////////////////////////////////////////////// Click retour ///////////
                                        onClick = { /*TODO*/}
                                        ////////////////////////////////////////////// Click retour /////////
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.listetudiant_removebg_preview),
                                            contentDescription = "Image 1",
                                            modifier = Modifier.size(80.dp)
                                        )
                                    }
                                    Text(text = "Liste_E")
                                }
                                //////////////// Colonne d ///////////////////
                                Column {
                                    IconButton(
                                        /////////////////////////////////////////////// Click retour ///////////
                                        onClick = { /*TODO*/}
                                        ////////////////////////////////////////////// Click retour /////////
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.evenement),
                                            contentDescription = "Image 1",
                                            modifier = Modifier.size(80.dp)
                                        )
                                    }
                                    Text(text = "Evens")
                                }
                            }
                        }
                    }
                }
            }
        }

        /////////////// Texte centré //////////////////////
        item{
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .height(100.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "<<     Détails     >>",
                    fontWeight = FontWeight.Bold,
                    color = Color.Red,
                    fontSize = 22.sp,
                )
            }
        }

        /////////////// Détail 1 ///////////////////
        item{
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth(),
            ){
                LazyRow {
                    /////////////////////// Premier détail //////////////////////
                    items(1){
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 1.dp),
                            //verticalAlignment = Alignment.CenterVertically,
                        ) {

                            IconButton(
                                /////////////////////////////////////////////// Click retour ///////////
                                onClick = { /*TODO*/}
                                ////////////////////////////////////////////// Click retour /////////
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.evenement),
                                    contentDescription = null,
                                    modifier = Modifier.size(130.dp).padding(start = 1.dp).width(1.dp)
                                )
                            }

                            Column {
                                Row{
                                    Text("Info: ", fontWeight = FontWeight.Bold)
                                    Text("Evènement")
                                }
                                Row{
                                    Text("Thème: ", fontWeight = FontWeight.Bold)
                                    Text("Défilé")
                                }
                                Row{
                                    Text("Lieu: ", fontWeight = FontWeight.Bold)
                                    Text("Bonapriso")
                                }
                                Row{
                                    Text("Date: ", fontWeight = FontWeight.Bold)
                                    Text("07/09/2023")
                                }
                                Row{
                                    Text("Auteur: ", fontWeight = FontWeight.Bold)
                                    Text("M. DONGMO")
                                }
                            }
                        }
                    }
                }
            }
        }

        /////////////// Détail 2 ///////////////////
        item{
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth(),
            ){
                LazyRow {
                    /////////////////////// Premier détail //////////////////////
                    items(1){
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 1.dp),
                            //verticalAlignment = Alignment.CenterVertically,
                        ) {

                            IconButton(
                                /////////////////////////////////////////////// Click retour ///////////
                                onClick = { /*TODO*/}
                                ////////////////////////////////////////////// Click retour /////////
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.img_11_1684431392656),
                                    contentDescription = null,
                                    modifier = Modifier.size(130.dp).padding(start = 1.dp).width(1.dp)
                                )
                            }

                            Column {
                                Row{
                                    Text("Info: ", fontWeight = FontWeight.Bold)
                                    Text("Evènement")
                                }
                                Row{
                                    Text("Thème: ", fontWeight = FontWeight.Bold)
                                    Text("Compétitions")
                                }
                                Row{
                                    Text("Lieu: ", fontWeight = FontWeight.Bold)
                                    Text("Kol éton")
                                }
                                Row{
                                    Text("Date: ", fontWeight = FontWeight.Bold)
                                    Text("13/05/2023")
                                }
                                Row{
                                    Text("Auteur: ", fontWeight = FontWeight.Bold)
                                    Text("M. TEKOUDJOU")
                                }
                            }
                        }
                    }
                }
            }
        }

        /////////////// Détail 3 ///////////////////
        item{
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth(),
            ){
                LazyRow {
                    /////////////////////// Premier détail //////////////////////
                    items(1){
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 1.dp),
                            //verticalAlignment = Alignment.CenterVertically,
                        ) {

                            IconButton(
                                /////////////////////////////////////////////// Click retour ///////////
                                onClick = { /*TODO*/}
                                ////////////////////////////////////////////// Click retour /////////
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.img_17_1684431615886),
                                    contentDescription = null,
                                    modifier = Modifier.size(130.dp).padding(start = 1.dp).width(1.dp)
                                )
                            }

                            Column {
                                Row{
                                    Text("Info: ", fontWeight = FontWeight.Bold)
                                    Text("Evènement")
                                }
                                Row{
                                    Text("Thème: ", fontWeight = FontWeight.Bold)
                                    Text("La visite")
                                }
                                Row{
                                    Text("Lieu: ", fontWeight = FontWeight.Bold)
                                    Text("Kribi")
                                }
                                Row{
                                    Text("Date: ", fontWeight = FontWeight.Bold)
                                    Text("11/08/2023")
                                }
                                Row{
                                    Text("Auteur: ", fontWeight = FontWeight.Bold)
                                    Text("M. TEKOUDJOU")
                                }
                            }
                        }
                    }
                }
            }
        }

        /////////////// Détail 4 ///////////////////
        item{
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth(),
            ){
                LazyRow {
                    /////////////////////// Premier détail //////////////////////
                    items(1){
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 1.dp),
                            //verticalAlignment = Alignment.CenterVertically,
                        ) {

                            IconButton(
                                /////////////////////////////////////////////// Click retour ///////////
                                onClick = { /*TODO*/}
                                ////////////////////////////////////////////// Click retour /////////
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.trashed_1687023165_img_3_1684430978412),
                                    contentDescription = null,
                                    modifier = Modifier.size(130.dp).padding(start = 1.dp).width(1.dp)
                                )
                            }

                            Column {
                                Row{
                                    Text("Info: ", fontWeight = FontWeight.Bold)
                                    Text("Evènement")
                                }
                                Row{
                                    Text("Thème:", fontWeight = FontWeight.Bold)
                                    Text("Fete du travail")
                                }
                                Row{
                                    Text("Lieu: ", fontWeight = FontWeight.Bold)
                                    Text("Logbessou")
                                }
                                Row{
                                    Text("Date: ", fontWeight = FontWeight.Bold)
                                    Text("01/05/2023")
                                }
                                Row{
                                    Text("Auteur: ", fontWeight = FontWeight.Bold)
                                    Text("M. TEKOUDJOU")
                                }
                            }
                        }
                    }
                }
            }
        }

        /////////////// Détail 5 ///////////////////
        item{
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth(),
            ){
                LazyRow {
                    /////////////////////// Premier détail //////////////////////
                    items(1){
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 1.dp),
                            //verticalAlignment = Alignment.CenterVertically,
                        ) {

                            IconButton(
                                /////////////////////////////////////////////// Click retour ///////////
                                onClick = { /*TODO*/}
                                ////////////////////////////////////////////// Click retour /////////
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.img_22_1684432201769),
                                    contentDescription = null,
                                    modifier = Modifier.size(130.dp).padding(start = 1.dp).width(1.dp)
                                )
                            }

                            Column {
                                Row{
                                    Text("Info: ", fontWeight = FontWeight.Bold)
                                    Text("Evènement")
                                }
                                Row{
                                    Text("Thème: ", fontWeight = FontWeight.Bold)
                                    Text("Parrainage")
                                }
                                Row{
                                    Text("Lieu: ", fontWeight = FontWeight.Bold)
                                    Text("Logbessou")
                                }
                                Row{
                                    Text("Date: ", fontWeight = FontWeight.Bold)
                                    Text("21/01/2023")
                                }
                                Row{
                                    Text("Auteur: ", fontWeight = FontWeight.Bold)
                                    Text("M. BABAGNACK")
                                }
                            }
                        }
                    }
                }
            }
        }

        /////////////// Détail 6 ///////////////////
        item{
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth(),
            ){
                LazyRow {
                    /////////////////////// Premier détail //////////////////////
                    items(1){
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 1.dp),
                            //verticalAlignment = Alignment.CenterVertically,
                        ) {

                            IconButton(
                                /////////////////////////////////////////////// Click retour ///////////
                                onClick = { /*TODO*/}
                                ////////////////////////////////////////////// Click retour /////////
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.img_21_1684432155499),
                                    contentDescription = null,
                                    modifier = Modifier.size(130.dp).padding(start = 1.dp).width(1.dp)
                                )
                            }

                            Column {
                                Row{
                                    Text("Info: ", fontWeight = FontWeight.Bold)
                                    Text("Evènement")
                                }
                                Row{
                                    Text("Thème: ", fontWeight = FontWeight.Bold)
                                    Text("Bilinguisme")
                                }
                                Row{
                                    Text("Lieu: ", fontWeight = FontWeight.Bold)
                                    Text("Akwa")
                                }
                                Row{
                                    Text("Date: ", fontWeight = FontWeight.Bold)
                                    Text("05/02/2023")
                                }
                                Row{
                                    Text("Auteur: ", fontWeight = FontWeight.Bold)
                                    Text("M. MOUKOKO")
                                }
                            }
                        }
                    }
                }
            }
        }

        /////////////// Détail 7 ///////////////////
        item{
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth(),
            ){
                LazyRow {
                    /////////////////////// Premier détail //////////////////////
                    items(1){
                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 1.dp),
                            //verticalAlignment = Alignment.CenterVertically,
                        ) {

                            IconButton(
                                /////////////////////////////////////////////// Click retour ///////////
                                onClick = { /*TODO*/}
                                ////////////////////////////////////////////// Click retour /////////
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.img_2_1684432480633),
                                    contentDescription = null,
                                    modifier = Modifier.size(130.dp).padding(start = 1.dp).width(1.dp)
                                )
                            }

                            Column {
                                Row{
                                    Text("Info: ", fontWeight = FontWeight.Bold)
                                    Text("Evènement")
                                }
                                Row{
                                    Text("Thème: ", fontWeight = FontWeight.Bold)
                                    Text("Gamers")
                                }
                                Row{
                                    Text("Lieu: ", fontWeight = FontWeight.Bold)
                                    Text("Deido")
                                }
                                Row{
                                    Text("Date: ", fontWeight = FontWeight.Bold)
                                    Text("21/04/2023")
                                }
                                Row{
                                    Text("Auteur: ", fontWeight = FontWeight.Bold)
                                    Text("M. BABAGNACK")
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
/////////////////////////// Terminé ////////////////////////////////




//////////////////////////////////////////////////////////////////////////////////////
////////////////////////////// Main prinicipal de la page ///////////////////////////
////////////////////////////////////////////////////////////////////////////////////
@Composable
fun InfosTIPAMevens_Content(scaffoldState: LazyListState) {
    InfosTIPAMevens_Card()
}
////////////////////////////// Terminé ///////////////////////////////////

