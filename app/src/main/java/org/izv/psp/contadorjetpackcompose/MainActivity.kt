package org.izv.psp.contadorjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import org.izv.psp.contadorjetpackcompose.ui.MainScreen
import org.izv.psp.contadorjetpackcompose.ui.theme.ContadorJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ContadorJetpackComposeTheme {
                MainScreen()
            }
        }
    }
}