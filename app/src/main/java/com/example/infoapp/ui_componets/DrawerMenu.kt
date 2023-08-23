package com.example.infoapp.ui_componets
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.infoapp.ui.theme.MainColor
import com.example.infoapp.R
import com.example.infoapp.ui.theme.Bg
import com.example.infoapp.ui.theme.Grey
import com.example.infoapp.ui.theme.PurpleGrey40
import com.example.infoapp.utils.DrawerEvents


@Composable
fun DrawerMenu(onEvent: (DrawerEvents)-> Unit) {
    val color = Color(0xFF232324)
    Box(modifier = Modifier.fillMaxSize().background(color)) {
        Column(modifier = Modifier.fillMaxSize()) {
            Head()
            Body() {drawerEvents ->
                onEvent(drawerEvents)
                
            }
            
        }
    }
}

@Composable
fun Head() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
        border = BorderStroke(3.dp, Grey),
        shape = RoundedCornerShape(0.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomCenter
        ) {
            Image(
                painter = painterResource(id = R.drawable.head),
                contentDescription = "Header Image",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "-Рецепты-",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Grey)
                    .padding(17.dp),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                color = Color.White

            )

        }

    }
}

@Composable
fun Body(onEvent: (DrawerEvents)-> Unit) {
    val list = stringArrayResource(id = R.array.drawer_list)
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        itemsIndexed(list) {index, title ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp),
                backgroundColor = Bg,
                border = BorderStroke(5.dp, Grey),
                shape = RoundedCornerShape(0.dp)

            ) {
                Text(
                    text = title,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            onEvent(DrawerEvents.OnItemClick(title, index))
                        }
                        .padding(20.dp)
                        .wrapContentWidth(),
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        }
    }
}