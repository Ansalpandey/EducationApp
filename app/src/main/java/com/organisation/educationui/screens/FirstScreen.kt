package com.organisation.educationui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.organisation.educationui.R
import com.organisation.educationui.ui.theme.BackgroundButton
import com.organisation.educationui.ui.theme.ExoFamily
import com.organisation.educationui.ui.theme.TextColor
import com.organisation.educationui.ui.theme.TextColorDescription
import com.organisation.educationui.ui.theme.TextColorSkip

@Composable
fun OnBoardScreen() {
  Column(
    modifier = Modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.SpaceEvenly
  ) {
    Image(painter = painterResource(id = R.drawable.firstimage), contentDescription = "Image")
    Column(
      modifier = Modifier.padding(top = 30.dp),
      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.Center
    ) {
      Text(
        text = "Let's find the \"A\" with us",
        textAlign = TextAlign.Center,
        fontFamily = ExoFamily,
        fontSize = 20.sp,
        fontWeight = FontWeight.ExtraBold,
        color = TextColor
      )

      Text(
        text = "Please Sign in to view personalized recommendations",
        fontFamily = ExoFamily,
        fontSize = 18.sp,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Normal,
        color = TextColorDescription
      )
    }

    Column(modifier = Modifier.padding(top = 30.dp).align(Alignment.CenterHorizontally)) {
      Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(BackgroundButton),
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier.size(267.dp, 61.dp).align(Alignment.CenterHorizontally),
        enabled = true
      ) {
        Text(
          text = "Sign up",
          color = Color.White,
          fontFamily = ExoFamily,
          fontSize = 18.sp,
          textAlign = TextAlign.Center,
          fontWeight = FontWeight.Normal
        )
      }
      Text(
        modifier =
          Modifier.align(Alignment.CenterHorizontally).padding(top = 30.dp).clickable(
            indication = null,
            interactionSource = remember { MutableInteractionSource() }
          ) {
            //
          },
        text = "Skip",
        fontFamily = ExoFamily,
        fontSize = 18.sp,
        fontWeight = FontWeight.Normal,
        color = TextColorSkip
      )
    }
  }
}
