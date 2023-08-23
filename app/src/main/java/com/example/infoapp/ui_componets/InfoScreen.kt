package com.example.infoapp.ui_componets

import android.graphics.BitmapFactory
import android.text.Html
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.example.infoapp.ui.theme.Grey
import com.example.infoapp.utils.ListItem


@Composable
fun InfoScreen(item: ListItem) {
    Card(
        modifier = Modifier
            .fillMaxSize()
            .border(2.dp, Color(0xCE454546), RoundedCornerShape(0.5.dp)),
        shape = RoundedCornerShape(0.dp)
    ){
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(270.dp)
                    .padding(0.dp)
                    .border(2.dp, Color(0xCE454546), RoundedCornerShape(0.5.dp)),
                shape = RoundedCornerShape(0.dp)
            ) {
                AssetImage(
                    ImageName = item.imageName,
                    contentDescription = item.title,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xCE454546))
                )
            }
            HtmlLoader(htmlName = item.htmlName)
        }
    }
}
@Composable
fun HtmlLoader(htmlName: String){
    val context = LocalContext.current
    val assetManger = context.assets
    val inputStream = assetManger.open("html/$htmlName")
    val size = inputStream.available()
    val buffer = ByteArray(size)
    inputStream.read(buffer)
    val htmlString = String(buffer)

    AndroidView(factory = {
        WebView(it).apply {
            webViewClient = WebViewClient()
            loadData(htmlString, "text/html", "utf-8")
        }
    })
}

