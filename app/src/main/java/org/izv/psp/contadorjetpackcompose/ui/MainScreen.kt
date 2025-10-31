package org.izv.psp.contadorjetpackcompose.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.izv.psp.contadorjetpackcompose.ui.theme.ContadorJetpackComposeTheme

@Composable
fun MainScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        CounterScreen(innerPadding)
    }
}

@Composable
fun CounterScreen(innerPadding: PaddingValues) {
    var count by remember { mutableStateOf(0) }
    Button(
        modifier = Modifier.padding(innerPadding),
        onClick = { count++ }) {
        Text("Contador: $count")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ContadorJetpackComposeTheme {
        MainScreen()
    }
}