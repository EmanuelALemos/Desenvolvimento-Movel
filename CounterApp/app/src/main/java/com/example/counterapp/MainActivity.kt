package com.example.counterapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.counterapp.ui.theme.CounterAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CounterAppTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    CounterApp()
                }
            }
        }
    }
}

@Composable
fun CounterApp() {

    var result by remember { mutableStateOf(0.0) }

    var input by remember { mutableStateOf("") }


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Resultado: $result",
            fontSize = 24.sp,
            modifier = Modifier.padding(8.dp)
        )


        OutlinedTextField(
            value = input,
            onValueChange = { input = it },
            label = { Text("Digite um número") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Cyan,
                unfocusedBorderColor = Color.Gray,
                cursorColor = Color.Black
            )
        )

        Spacer(modifier = Modifier.height(16.dp))


        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.fillMaxWidth()
        ) {

            Button(
                onClick = {
                    result += input.toDoubleOrNull() ?: 0.0
                    input = ""
                },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = MaterialTheme.colors.secondary,
                    contentColor = MaterialTheme.colors.onSecondary
                )
            ) {
                Text("Incrementar")
            }

            Button(
                onClick = {
                    result -= input.toDoubleOrNull() ?: 0.0
                    input = ""
                },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = MaterialTheme.colors.secondary,
                    contentColor = MaterialTheme.colors.onSecondary
                )
            ) {
                Text("Decrementar")
            }
        }


        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)
        ) {

            Button(
                onClick = {
                    result *= input.toDoubleOrNull() ?: 1.0
                    input = ""
                },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = MaterialTheme.colors.secondary,
                    contentColor = MaterialTheme.colors.onSecondary
                )
            ) {
                Text("Multiplicar")
            }

            Button(
                onClick = {
                    val value = input.toDoubleOrNull() ?: 1.0
                    if (value != 0.0) {
                        result /= value
                    }
                    input = ""
                },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = MaterialTheme.colors.secondary,
                    contentColor = MaterialTheme.colors.onSecondary
                )
            ) {
                Text("Dividir")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                result = 0.0
                input = ""
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = MaterialTheme.colors.secondary,
                contentColor = MaterialTheme.colors.onSecondary
            )
        ) {
            Text("Limpar")
        }
    }
}




@Composable
@Preview
fun CounterAppPreview(){
    CounterApp()
}