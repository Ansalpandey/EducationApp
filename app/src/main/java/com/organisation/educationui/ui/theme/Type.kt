package com.organisation.educationui.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.organisation.educationui.R

// Set of Material typography styles to start with
val Typography =
  Typography(
    bodyLarge =
      TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
      )
  )

val ExoFamily =
  FontFamily(
    Font(R.font.exo_semibold, FontWeight.ExtraBold),
    Font(R.font.exo_medium, FontWeight.Medium),
    Font(R.font.exo_regular, FontWeight.Normal)
  )

val RobotoFamily =
  FontFamily(
    Font(R.font.roboto_medium, FontWeight.Medium),
    Font(R.font.roboto_medium, FontWeight.Normal)
  )
