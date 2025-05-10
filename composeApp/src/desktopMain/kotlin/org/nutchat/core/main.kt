package org.nutchat.core

import androidx.compose.ui.Alignment
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.remember
import androidx.compose.ui.window.WindowPlacement

fun main() = application {
    val windowState = remember {
        WindowState(
            placement = WindowPlacement.Maximized,
            position = WindowPosition(Alignment.Center)
        )
    }


    Window(
        onCloseRequest = ::exitApplication,
        title = "NutChat",
        state = windowState,
        resizable = true
    ) {
        App()
    }
}
