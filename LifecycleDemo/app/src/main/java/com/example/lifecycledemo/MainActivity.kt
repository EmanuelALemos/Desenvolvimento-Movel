package com.example.lifecycledemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lifecycledemo.ui.theme.LifecycleDemoTheme

import android.util.Log
import android.widget.Toast

import android.content.Context
import androidx.core.app.NotificationCompat

import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build


class MainActivity : ComponentActivity() {
    private val channelId = "lifecycle_demo_channel"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LifecycleDemoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }

        createNotificationChannel()

        Log.d("LifecycleDemo", "onCreate chamado")
        Toast.makeText(this, "onCreate chamado", Toast.LENGTH_SHORT).show()
    }

    //Para conseguir receber as notificações é preciso que você tenha concedido permissão
    //nas configurações do dispositivo, a principio ela somente será exibida, não tendo assim
    //nenhuma outra função, como abrir o app caso ele esteja fechado
    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "Lifecycle Demo Channel"
            val descriptionText = "LifecycleDemo Chanel"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(channelId, name, importance).apply {
                description = descriptionText
            }
            val notificationManager: NotificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }


    override fun onStart() {
        super.onStart()

        Log.d("LifecycleDemo", "onStart chamado")
        Toast.makeText(this, "onStart chamado", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()

        Log.d("LifecycleDemo", "onResume chamado")
        Toast.makeText(this, "onResume chamado", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()

        Log.d("LifecycleDemo", "onPause chamado")
        Toast.makeText(this, "onPause chamado", Toast.LENGTH_SHORT).show()
    }

    //Envia uma notificação quando o onStop é chamado, ahcei melhor
    //colocar como notificação pois percebi que nem sempre o Toast era exibido na minha aplicação.
    //Como nem sempre o onDestroy era chamado, quis colocar esse método para enviar notificações
    //para aprender como faço isso, e poder ver funcionando,
    //já que ele é chamado com maior frequência.
    override fun onStop() {
        super.onStop()

        Log.d("LifecycleDemo", "onStop chamado")

        val notificationId = 2
        val notificationBuilder = NotificationCompat.Builder(this, channelId)
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle("LifecycleDemo")
            .setContentText("onStop foi chamado")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.notify(notificationId, notificationBuilder.build())
    }

    //Também envia notificação quando o método onDestroy é chamado,
    //aparentemente nem sempre esse método é chamado quando fecho o app,
    //consegui que ele fosse chamado mais vezes quando usava a seta de voltar
    //do menu de navegação do dispositivo
    override fun onDestroy() {
        super.onDestroy()

        Log.d("LifecycleDemo", "onDestroy Chamado")

        val notificationId = 1
        val notificationBuilder = NotificationCompat.Builder(this, channelId)
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle("LifecycleDemo")
            .setContentText("onDestroy foi chamado")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.notify(notificationId, notificationBuilder.build())
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LifecycleDemoTheme {
        Greeting("Android")
    }
}