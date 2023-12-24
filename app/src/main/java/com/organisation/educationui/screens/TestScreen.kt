package com.organisation.educationui.screens

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults.shape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material3.ContentAlpha

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExpandableCard() {
  var expandedState by remember { mutableStateOf(false) }
  val rotationState by animateFloatAsState(targetValue = if (expandedState) 180f else 0f)

  Card(
    modifier =
      Modifier.fillMaxWidth()
        .animateContentSize(
          animationSpec = tween(durationMillis = 3000, easing = LinearOutSlowInEasing)
        ),
    shape = shape,
    onClick = { expandedState = !expandedState }
  ) {
    Column(modifier = Modifier.fillMaxWidth().padding(12.dp)) {
      Row(verticalAlignment = Alignment.CenterVertically) {
        Text(
          modifier = Modifier.weight(6f),
          text = "My Card",
          fontSize = 28.sp,
          fontWeight = FontWeight.Bold,
          maxLines = 1,
          overflow = TextOverflow.Ellipsis
        )
        IconButton(
          modifier = Modifier.weight(1f).alpha(ContentAlpha.medium).rotate(rotationState),
          onClick = { expandedState = !expandedState }
        ) {
          Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = "Drop-Down Arrow")
        }
      }
      if (expandedState) {
        Text(
          text =
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
              "sed do eiusmod tempor incididunt ut labore et dolore magna " +
              "aliqua. Ut enim ad minim veniam, quis nostrud exercitation " +
              "ullamco laboris nisi ut aliquip ex ea commodo consequat." +
              "ullamco laboris nisi ut aliquip ex ea commodo consequat.",
          fontSize = 21.sp,
          fontWeight = FontWeight.Normal,
          maxLines = 15,
          overflow = TextOverflow.Ellipsis
        )
      }
    }
  }
}

@Composable
@Preview
fun ExpandableCardPreview() {
  ExpandableCard()
}
