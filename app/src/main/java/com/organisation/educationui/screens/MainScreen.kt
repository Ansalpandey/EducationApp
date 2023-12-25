package com.organisation.educationui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CornerSize
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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.organisation.educationui.R
import com.organisation.educationui.ui.theme.ExoFamily
import com.organisation.educationui.ui.theme.TextColor
import com.organisation.educationui.ui.theme.TextColorDescription
import com.organisation.educationui.ui.theme.TextColorSkip

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
  LazyColumn {
    item {
      Row() {
        Column {
          Text(
            modifier = Modifier.padding(top = 20.dp, start = 20.dp, end = 70.dp),
            text = "Good evening!",
            fontFamily = ExoFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 32.sp,
            color = TextColor,
          )

          Text(
            modifier = Modifier.padding(start = 21.dp),
            text = "Ansal Pandey",
            fontFamily = ExoFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            color = TextColorDescription
          )
        }

        Image(
          painter = painterResource(id = R.drawable.profileimage),
          contentDescription = "profile image",
          modifier =
            Modifier.padding(top = 30.dp)
              .size(65.dp)
              .clip(shape = RoundedCornerShape(14.dp))
              .border(7.dp, Color.White, RoundedCornerShape(14.dp))
        )
      }
      Spacer(modifier = Modifier.height(40.dp))
      Row(verticalAlignment = Alignment.CenterVertically) {
        var text by remember { mutableStateOf("") }
        TextField(
          modifier =
            Modifier.fillMaxWidth()
              .weight(4f)
              .padding(top = 5.dp, start = 20.dp)
              .shadow(elevation = 8.dp, shape = RoundedCornerShape(corner = CornerSize(12.dp))),
          value = text,
          onValueChange = { text = it },
          textStyle = TextStyle(color = Color.Black),
          placeholder = {
            Text(
              text = "Search your teacher",
              fontFamily = ExoFamily,
              fontWeight = FontWeight.SemiBold,
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
              modifier = Modifier.padding(start = 10.dp, end = 10.dp),
              shape =
                RoundedCornerShape(
                  topStart = 12.dp,
                  topEnd = 12.dp,
                  bottomStart = 12.dp,
                  bottomEnd = 12.dp
                )
            ) {
              Icon(
                Icons.Filled.Search,
                contentDescription = "Search",
                modifier = Modifier.size(30.dp),
                tint = Color.White
              )
            }
          }
        )
        Icon(
          painter = painterResource(id = R.drawable.filter),
          contentDescription = "filter",
          tint = TextColor,
          modifier =
            Modifier.size(38.dp).padding(start = 5.dp).weight(1f).clickable(
              indication = null,
              interactionSource = remember { MutableInteractionSource() }
            ) {
              /*TODO*/
            }
        )
      }
    }
  }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun MainScreenPreview() {
  MainScreen()
}
