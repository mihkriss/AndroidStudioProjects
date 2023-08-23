package com.example.infoapp.ui_componets

import android.accounts.AuthenticatorDescription
import android.graphics.BitmapFactory
import android.webkit.WebSettings.TextSize
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.infoapp.MainViewModel
import com.example.infoapp.R
import com.example.infoapp.ui.theme.Bg
import com.example.infoapp.ui.theme.Gray
import com.example.infoapp.ui.theme.Grayb
import com.example.infoapp.ui.theme.Grey
import com.example.infoapp.ui.theme.PurpleGrey40
import com.example.infoapp.ui.theme.Redd
import com.example.infoapp.utils.ListItem


@Composable
fun MainListItem(
    mainViewModel: MainViewModel = hiltViewModel(),
    item: ListItem,
    onClick: (ListItem)-> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(209.dp)
            .clickable {
                onClick(item)
            },
        shape = RoundedCornerShape(1.5.dp)
    ) {
        ConstraintLayout(
            modifier = Modifier.fillMaxSize()
        ) {
            val (image, text, favoriteButton) = createRefs()



            AssetImage(
                ImageName = item.imageName,
                contentDescription = item.title,
                modifier = Modifier
                    .fillMaxSize()
                    .constrainAs(image) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        bottom.linkTo(parent.bottom)


                    }
            )
            Text(
                text = item.title,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Gray)
                    .padding(20.dp)
                    .constrainAs(text) {
                        bottom.linkTo(parent.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
                ,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                color = Color.White

            )
            IconButton(
                onClick = {
                    mainViewModel.insertItem(
                        item.copy(isFav = !item.isFav)
                    )
                },
                modifier = Modifier.constrainAs(favoriteButton)  {
                    top.linkTo(parent.top)
                    end.linkTo(parent.end)                }
            ) {
                Icon(imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = "Favorite",
                    tint = if(item.isFav) Redd else Bg,
                    modifier = Modifier
                        .clip(CircleShape)
                        .padding(16.dp)
                    )

            }

        }

    }
}

@Composable
fun AssetImage(ImageName: String, contentDescription: String, modifier: Modifier ) {
    val context = LocalContext.current
    val assetManger = context.assets
    val inputStream = assetManger.open(ImageName)
    val bitMap = BitmapFactory.decodeStream(inputStream)
    Image(
        bitmap = bitMap.asImageBitmap() ,
        contentDescription = contentDescription,
        contentScale = ContentScale.Crop,
        modifier = modifier

    )
}