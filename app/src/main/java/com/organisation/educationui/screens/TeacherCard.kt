package com.organisation.educationui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.organisation.educationui.ui.theme.ExoFamily
import com.organisation.educationui.ui.theme.RobotoFamily
import com.organisation.educationui.ui.theme.TextColor
import com.organisation.educationui.ui.theme.TextColorDescription

@Composable
fun CardTeachers(
  modifier: Modifier,
  title: String,
  subject: String,
  backgroundColor: Color,
  image: Int,
) {

  Card(
    modifier =
      modifier
        .height(240.dp)
        .width(160.dp)
        .shadow(elevation = 8.dp, shape = RoundedCornerShape(12.dp)),
    shape = RoundedCornerShape(12.dp),
    colors = CardDefaults.cardColors(Color.White)
  ) {
    Card(
      modifier = modifier.height(160.dp).width(140.dp).padding(start = 20.dp, top = 20.dp),
      colors = CardDefaults.cardColors(backgroundColor)
    ) {
      Column() {
        Image(
          painter = painterResource(image),
          contentDescription = "teacher first",
          modifier = modifier.size(150.dp).padding(top = 20.dp)
        )
      }
    }
    Text(
      text = title,
      fontFamily = ExoFamily,
      fontWeight = FontWeight.SemiBold,
      fontSize = 16.sp,
      color = TextColor,
      modifier = modifier.padding(start = 20.dp)
    )
    Text(
      text = subject,
      fontFamily = RobotoFamily,
      fontWeight = FontWeight.Normal,
      fontSize = 12.sp,
      color = TextColorDescription,
      modifier = modifier.padding(start = 20.dp)
    )
  }
}

@Composable
@Preview
fun CardTeachersPreview() {
  //  CardTeachers()
}
