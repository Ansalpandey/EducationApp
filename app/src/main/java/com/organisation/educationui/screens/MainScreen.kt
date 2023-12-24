package com.organisation.educationui.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.organisation.educationui.ui.theme.ExoFamily
import com.organisation.educationui.ui.theme.TextColor
import com.organisation.educationui.ui.theme.TextColorDescription

@Composable
fun MainScreen() {
  Row(modifier = Modifier.verticalScroll(rememberScrollState())) {
    Text(
      text = "Good evening!",
      fontFamily = ExoFamily,
      fontWeight = FontWeight.SemiBold,
      fontSize = 32.sp,
      modifier = Modifier.padding(start = 20.dp, top = 20.dp),
      color = TextColor
    )
  }
  Text(
    modifier = Modifier.padding(top = 55.dp, start = 20.dp),
    text = "Hardline Scott",
    fontFamily = ExoFamily,
    fontWeight = FontWeight.SemiBold,
    fontSize = 20.sp,
    color = TextColorDescription
  )
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun MainScreenPreview() {
  MainScreen()
}
