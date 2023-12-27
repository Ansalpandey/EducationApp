package com.organisation.educationui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import com.organisation.educationui.ui.theme.InstituteCard1
import com.organisation.educationui.ui.theme.InstituteCard2
import com.organisation.educationui.ui.theme.InstituteCard3
import com.organisation.educationui.ui.theme.TeacherCard1
import com.organisation.educationui.ui.theme.TeacherCard2
import com.organisation.educationui.ui.theme.TeacherCard3
import com.organisation.educationui.ui.theme.TeacherCard4
import com.organisation.educationui.ui.theme.TextColor
import com.organisation.educationui.ui.theme.TextColorDescription
import com.organisation.educationui.ui.theme.TextColorSkip

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {

  Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
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
        contentDescription = "customization",
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

    Spacer(modifier = Modifier.height(40.dp))
    Row() {
      Text(
        text = "Popular Teachers",
        fontFamily = ExoFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
        color = TextColor,
        modifier = Modifier.padding(start = 25.dp).weight(5f)
      )
      Image(
        painter = painterResource(id = R.drawable.filterdata),
        contentDescription = "filter",
        modifier = Modifier.size(30.dp).weight(2f)
      )
    }
    Spacer(modifier = Modifier.height(20.dp))
    Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
      Spacer(modifier = Modifier.width(20.dp))
      CardTeachers(
        title = "Cassie Valdez",
        subject = "Biology",
        backgroundColor = TeacherCard1,
        image = R.drawable.firstperson,
        modifier =
          Modifier.clickable(
            indication = null,
            interactionSource = remember { MutableInteractionSource() }
          ) {}
      )
      Spacer(modifier = Modifier.width(20.dp))
      CardTeachers(
        title = "Paul Simons",
        subject = "Chemistry",
        backgroundColor = TeacherCard2,
        image = R.drawable.secondperson,
        modifier =
          Modifier.clickable(
            indication = null,
            interactionSource = remember { MutableInteractionSource() }
          ) {}
      )
      Spacer(modifier = Modifier.width(20.dp))
      CardTeachers(
        title = "Graham Osbor",
        subject = "Physics",
        backgroundColor = TeacherCard3,
        image = R.drawable.thirdperson,
        modifier =
          Modifier.clickable(
            indication = null,
            interactionSource = remember { MutableInteractionSource() }
          ) {}
      )
      Spacer(modifier = Modifier.width(20.dp))
      CardTeachers(
        title = "Veer Cope",
        subject = "Bio Science",
        backgroundColor = TeacherCard4,
        image = R.drawable.fourthperson,
        modifier =
          Modifier.clickable(
            indication = null,
            interactionSource = remember { MutableInteractionSource() }
          ) {}
      )
      Spacer(modifier = Modifier.width(20.dp))
    }

    Spacer(modifier = Modifier.height(40.dp))
    Row() {
      Text(
        text = "Popular Institution",
        fontFamily = ExoFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
        color = TextColor,
        modifier = Modifier.padding(start = 25.dp).weight(5f)
      )
      Image(
        painter = painterResource(id = R.drawable.filterdata),
        contentDescription = "filter",
        modifier = Modifier.size(30.dp).weight(2f)
      )
    }
    Spacer(modifier = Modifier.height(20.dp))
    Column(modifier = Modifier.padding(start = 20.dp, end = 20.dp)) {
      InstituteCard(
        modifier =
          Modifier.clickable(
            indication = null,
            interactionSource = remember { MutableInteractionSource() }
          ) {},
        collegeName = "Victory College",
        rating = "4.5",
        reviews = "413",
        subject = "Bio Science",
        description =
          "Studying how CBD awareness and availability as it related to pain management alternatives.",
        backgroundColor = InstituteCard1,
        image = R.drawable.institute_victoria
      )
      Spacer(modifier = Modifier.height(20.dp))
      InstituteCard(
        modifier =
          Modifier.clickable(
            indication = null,
            interactionSource = remember { MutableInteractionSource() }
          ) {},
        collegeName = "New Montana",
        rating = "4.1",
        reviews = "354",
        subject = "Bio Science",
        description = "Montana Higher Educational Institute. Gampaha montana.gampaha@gmail.com.",
        backgroundColor = InstituteCard2,
        image = R.drawable.institute_montana
      )
      Spacer(modifier = Modifier.height(20.dp))
      InstituteCard(
        modifier =
          Modifier.clickable(
            indication = null,
            interactionSource = remember { MutableInteractionSource() }
          ) {},
        collegeName = "Susipwan Institute",
        rating = "3.0",
        reviews = "745",
        subject = "Bio Science",
        description =
          "This is a private higher education center which conducting classes for GCE AL Students.",
        backgroundColor = InstituteCard3,
        image = R.drawable.institute_susipwan
      )
      Spacer(modifier = Modifier.height(20.dp))
    }
  }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun MainScreenPreview() {
  MainScreen()
}
