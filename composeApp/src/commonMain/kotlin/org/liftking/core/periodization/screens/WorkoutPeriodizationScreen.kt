package org.liftking.core.periodization.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.room.util.TableInfo
import lift_king.composeapp.generated.resources.Res
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.liftking.core.periodization.components.PeriodizationCard
import org.liftking.core.periodization.viewmodels.WorkoutPeriodizationViewModel
import org.liftking.core.utils.DeepBlack


@Preview
@Composable
fun WorkoutPeriodizationScreen(
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = DeepBlack,
        topBar = {
            Column(modifier = Modifier.fillMaxWidth().padding(20.dp)) {
                Text(
                    text = "Periodização",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 30.sp,
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold,
                )
            }
        }
    ) {
        LazyColumn(modifier = Modifier.fillMaxSize().padding(20.dp)) {
            item() {
                PeriodizationCard()
            }
        }
    }
}