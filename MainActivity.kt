package com.example.sitemademonitoreoanimal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.sitemademonitoreoanimal.ui.theme.SitemaDeMonitoreoAnimalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SitemaDeMonitoreoAnimalTheme {
                PantallaPrincipal()
            }
        }
    }
}

@Composable
fun PantallaPrincipal() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            text = "Sistema de Monitoreo de Salud Animal",
            style = MaterialTheme.typography.headlineSmall
        )

        Spacer(modifier = Modifier.height(20.dp))

        Modulo(
            titulo = "Módulo 1: Registro de animales",
            descripcion = "Permite registrar datos básicos del animal como nombre, especie, edad y propietario."
        )

        Modulo(
            titulo = "Módulo 2: Historial clínico",
            descripcion = "Permite registrar consultas veterinarias, diagnósticos, observaciones y antecedentes médicos."
        )

        Modulo(
            titulo = "Módulo 3: Vacunación",
            descripcion = "Permite llevar el control de vacunas aplicadas y fechas de próximas dosis."
        )

        Modulo(
            titulo = "Módulo 4: Tratamientos",
            descripcion = "Permite registrar medicamentos, tratamientos indicados y duración del proceso."
        )

        Modulo(
            titulo = "Módulo 5: Reportes básicos",
            descripcion = "Permite consultar información general del estado de salud y seguimiento del animal."
        )
    }
}

@Composable
fun Modulo(titulo: String, descripcion: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 12.dp)
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Text(text = titulo, style = MaterialTheme.typography.titleMedium)
            Spacer(modifier = Modifier.height(6.dp))
            Text(text = descripcion)
        }
    }
}