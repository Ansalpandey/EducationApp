package com.organisation.educationui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.organisation.educationui.R
import com.organisation.educationui.ui.theme.BackgroundButton
import com.organisation.educationui.ui.theme.ExoFamily
import com.organisation.educationui.ui.theme.RobotoFamily
import com.organisation.educationui.ui.theme.TextColor
import com.organisation.educationui.ui.theme.TextColorDescription

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(navController: NavController) {

  Text(
    modifier = Modifier.padding(top = 30.dp, start = 20.dp),
    text = "Create An Account....",
    fontSize = 24.sp,
    fontFamily = ExoFamily,
    fontWeight = FontWeight.Bold,
    color = Color.Black
  )

  Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
    Image(
      painter = painterResource(id = R.drawable.signup),
      contentDescription = null,
      modifier = Modifier.size(400.dp)
    )
  }

  Column(modifier = Modifier.padding(top = 380.dp, start = 20.dp)) {
    Text(
      text = "Name",
      fontSize = 16.sp,
      fontFamily = ExoFamily,
      fontWeight = FontWeight.Normal,
      color = TextColorDescription
    )
  }
  Column(modifier = Modifier.fillMaxSize().padding(start = 20.dp, top = 400.dp)) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    TextField(
      modifier =
        Modifier.fillMaxWidth()
          .padding(top = 10.dp, end = 20.dp)
          .shadow(elevation = 8.dp, shape = RoundedCornerShape(8.dp)),
      value = email,
      onValueChange = { email = it },
      textStyle = TextStyle(color = Color.Green),
      placeholder = {
        Text(
          text = "Your Name",
          fontFamily = RobotoFamily,
          fontWeight = FontWeight.Normal,
          fontSize = 14.sp,
          color = TextColor
        )
      },
      shape = RoundedCornerShape(8.dp),
      colors =
        TextFieldDefaults.textFieldColors(
          focusedIndicatorColor = Color.Transparent,
          unfocusedIndicatorColor = Color.Transparent,
          containerColor = Color.White
        ),
      maxLines = 1,
    )

    Text(
      modifier = Modifier.padding(top = 5.dp),
      text = "Email address",
      fontSize = 16.sp,
      fontFamily = ExoFamily,
      fontWeight = FontWeight.Normal,
      color = TextColorDescription
    )

    TextField(
      modifier =
        Modifier.fillMaxWidth()
          .padding(top = 5.dp, end = 20.dp)
          .shadow(elevation = 8.dp, shape = RoundedCornerShape(8.dp)),
      value = password,
      onValueChange = { password = it },
      textStyle = TextStyle(color = Color.Green),
      placeholder = {
        Text(
          text = "name@example.com",
          fontFamily = RobotoFamily,
          fontWeight = FontWeight.Normal,
          fontSize = 14.sp,
          color = TextColor
        )
      },
      shape = RoundedCornerShape(8.dp),
      colors =
        TextFieldDefaults.textFieldColors(
          focusedIndicatorColor = Color.Transparent,
          unfocusedIndicatorColor = Color.Transparent,
          containerColor = Color.White
        ),
      maxLines = 1,
    )

    Text(
      modifier = Modifier.padding(top = 5.dp),
      text = "Password",
      fontSize = 16.sp,
      fontFamily = ExoFamily,
      fontWeight = FontWeight.Normal,
      color = TextColorDescription
    )

    TextField(
      modifier =
        Modifier.fillMaxWidth()
          .padding(top = 5.dp, bottom = 28.dp, end = 20.dp)
          .shadow(elevation = 8.dp, shape = RoundedCornerShape(8.dp)),
      value = password,
      onValueChange = { password = it },
      textStyle = TextStyle(color = Color.Green),
      placeholder = {
        Text(
          text = "******",
          fontFamily = RobotoFamily,
          fontWeight = FontWeight.Normal,
          fontSize = 14.sp,
          color = TextColor
        )
      },
      shape = RoundedCornerShape(8.dp),
      colors =
        TextFieldDefaults.textFieldColors(
          focusedIndicatorColor = Color.Transparent,
          unfocusedIndicatorColor = Color.Transparent,
          containerColor = Color.White
        ),
      maxLines = 1,
      trailingIcon = {
        Icon(
          painter = painterResource(id = R.drawable.baseline_remove_red_eye_24),
          contentDescription = null
        )
      }
    )

    Button(
      onClick = { /*TODO*/},
      colors = ButtonDefaults.buttonColors(BackgroundButton),
      shape = RoundedCornerShape(12.dp),
      modifier =
        Modifier.size(267.dp, 61.dp)
          .padding(end = 10.dp)
          .align(Alignment.CenterHorizontally)
          .shadow(elevation = 8.dp, shape = RoundedCornerShape(12.dp)),
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
    Row(modifier = Modifier.align(Alignment.CenterHorizontally).padding(top = 20.dp, end = 10.dp)) {
      Text(
        text = "You have account? ",
        fontFamily = ExoFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
        color = TextColorDescription
      )
      Text(
        text = "Sign in",
        textAlign = TextAlign.Center,
        modifier =
          Modifier.clickable(
            indication = null,
            interactionSource = remember { MutableInteractionSource() }
          ) {
            //
          },
        fontFamily = ExoFamily,
        fontWeight = FontWeight.Normal,
        color = BackgroundButton,
        fontSize = 18.sp
      )
    }
  }
}

