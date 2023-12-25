package com.organisation.educationui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.organisation.educationui.R
import com.organisation.educationui.ui.theme.RobotoFamily
import com.organisation.educationui.ui.theme.TextColorDescription
import com.organisation.educationui.ui.theme.TextColorSkip

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExpandableCard() {
  Column {
    val items = 0
    Row() {
      var text by remember { mutableStateOf("") }
      TextField(
        modifier =
          Modifier.fillMaxWidth()
            .weight(3f)
            .padding(top = 5.dp, start = 20.dp)
            .shadow(elevation = 8.dp, shape = RoundedCornerShape(12.dp)),
        value = text,
        onValueChange = { text = it },
        textStyle = TextStyle(color = Color.Black),
        placeholder = {
          Text(
            text = "Search your teacher",
            fontFamily = RobotoFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            color = TextColorDescription
          )
        },
        colors =
          TextFieldDefaults.textFieldColors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            containerColor = Color.White
          ),
        singleLine = true,
        trailingIcon = {
          Button(
            onClick = { /* ... */},
            colors = ButtonDefaults.buttonColors(TextColorSkip),
            modifier = Modifier.padding().padding(end = 10.dp),
            shape = RoundedCornerShape(10.dp)
          ) {
            Icon(
              Icons.Filled.Search,
              contentDescription = "Search",
              modifier = Modifier.size(24.dp),
              tint = Color.White
            )
          }
        }
      )
      Icon(
        painter = painterResource(id = R.drawable.filter),
        contentDescription = "filter",
        modifier = Modifier.size(55.dp).padding(10.dp).weight(1f)
      )
    }
  }
}

@Composable
@Preview
fun ExpandableCardPreview() {
  ExpandableCard()
}
