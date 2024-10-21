package com.example.prestamolibros.Screen

import android.graphics.fonts.FontStyle
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.prestamolibros.R

@Composable
fun MainScreen(navController: NavController) {
    // Definir un gradiente vertical de color morado claro
    val backgroundBrush = Brush.verticalGradient(
        colors = listOf(
            Color(0xFFD1C4E9),
            Color(0xFFEDE7F6)
        ) // Cambia estos colores según tus preferencias
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(brush = backgroundBrush), // Aplicar el gradiente como fondo
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Sistema de Préstamo de Libros",
            style = MaterialTheme.typography.titleLarge.copy(
                fontWeight = FontWeight.Bold,
            ),
            modifier = Modifier.padding(bottom = 16.dp) // Espaciado inferior
            )
            Image(
                painter = painterResource(id = R.drawable.libros), // Reemplaza "tu_imagen" con el nombre de tu archivo de imagen
                contentDescription = "Descripción de la imagen", // Proporciona una descripción para accesibilidad
                modifier = Modifier.padding(bottom = 16.dp) // Espaciado inferior
            )

            Button(onClick = { navController.navigate("author_screen") }) {
                Text(text = "Registrar autor")
            }
            Button(onClick = { navController.navigate("book_screen") }) {
                Text(text = "Registrar Libro")
            }
            Button(onClick = { navController.navigate("member_screen") }) {
                Text(text = "Registrar Miembro")
            }
            Button(onClick = { navController.navigate("loan_screen") }) {
                Text(text = "Realizar Préstamo")
            }
        }
    }
}