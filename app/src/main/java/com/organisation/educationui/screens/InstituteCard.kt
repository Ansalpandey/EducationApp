package com.organisation.educationui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.organisation.educationui.R
import com.organisation.educationui.ui.theme.ExoFamily
import com.organisation.educationui.ui.theme.RobotoFamily
import com.organisation.educationui.ui.theme.StarColor
import com.organisation.educationui.ui.theme.TextColor
import com.organisation.educationui.ui.theme.TextColorDescription

@Composable
fun InstituteCard(
  modifier: Modifier,
  collegeName: String,
  rating: String,
  reviews: String,
  subject: String,
  description: String,
  backgroundColor: Color,
  image: Int,
) {
  Card(
    modifier = modifier.height(220.dp).width(380.dp).fillMaxSize(),
    shape = RoundedCornerShape(12.dp),
    colors = CardDefaults.cardColors(Color.White)
  ) {
    Row(modifier = modifier.padding(15.dp)) {
      Card(
        modifier = modifier.height(190.dp).width(160.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(backgroundColor)
      ) {
        Image(
          modifier = modifier.size(190.dp).padding(5.dp),
          painter = painterResource(id = image),
          contentDescription = "college_first"
        )
      }
      Column {
        Text(
          text = collegeName,
          fontSize = 16.sp,
          modifier = modifier.padding(top = 7.dp, start = 7.dp),
          fontFamily = ExoFamily,
          fontWeight = FontWeight.SemiBold,
          color = TextColor
        )
        Row(
          horizontalArrangement = Arrangement.Center,
          verticalAlignment = Alignment.CenterVertically,
          modifier = modifier.padding(start = 7.dp, top = 3.dp)
        ) {
          Icon(
            painter = painterResource(id = R.drawable.star_full),
            contentDescription = "rating",
            modifier = modifier.size(18.dp).padding(2.dp),
            tint = StarColor
          )
          Icon(
            painter = painterResource(id = R.drawable.star_full),
            contentDescription = "rating",
            modifier = modifier.size(18.dp).padding(2.dp),
            tint = StarColor
          )
          Icon(
            painter = painterResource(id = R.drawable.star_full),
            contentDescription = "rating",
            modifier = modifier.size(18.dp).padding(2.dp),
            tint = StarColor
          )
          Icon(
            painter = painterResource(id = R.drawable.star_full),
            contentDescription = "rating",
            modifier = modifier.size(18.dp).padding(2.dp),
            tint = StarColor
          )
          Icon(
            painter = painterResource(id = R.drawable.star_half),
            contentDescription = "rating",
            modifier = modifier.size(18.dp).padding(2.dp),
            tint = StarColor
          )
          Text(
            text = "$rating ($reviews)",
            fontSize = 10.sp,
            fontFamily = RobotoFamily,
            fontWeight = FontWeight.Normal,
            color = TextColorDescription
          )
        }
        Column(modifier = modifier.padding(start = 10.dp, top = 2.dp)) {
          Text(
            text = subject,
            fontSize = 14.sp,
            fontFamily = RobotoFamily,
            fontWeight = FontWeight.SemiBold,
            color = TextColor
          )

          Text(
            text = description,
            fontSize = 12.sp,
            fontFamily = RobotoFamily,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            maxLines = 10,
            lineHeight = 12.sp
          )
        }
      }
    }
  }
}

@Preview
@Composable
fun InstituteCardPreview() {
  //  InstituteCard()
}
