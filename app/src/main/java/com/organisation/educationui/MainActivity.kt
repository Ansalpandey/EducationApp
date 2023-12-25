package com.organisation.educationui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.organisation.educationui.screens.CardTeachers
import com.organisation.educationui.screens.MainScreen
import com.organisation.educationui.ui.theme.Background
import com.organisation.educationui.ui.theme.ColorCard2
import com.organisation.educationui.ui.theme.EducationUITheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      EducationUITheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = Background) { MainScreen() }
      }
    }
  }
}
