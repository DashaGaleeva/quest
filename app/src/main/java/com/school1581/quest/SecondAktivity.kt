package com.school1581.quest

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import android.content.pm.PackageManager



@SuppressLint("QueryPermissionsNeeded")
private fun openYandexMap(context: Context, latitude: Double, longitude: Double) {
    val uri = Uri.parse("yandexmaps://maps.yandex.ru/?pt=$longitude,$latitude")
    val intent = Intent(Intent.ACTION_VIEW, uri)
    intent.`package` = "ru.yandex.yandexmaps"
    if (intent.resolveActivity(context.packageManager) != null) {
        context.startActivity(intent)
    } else {
        // Если Яндекс.Карты не установлены, открываем веб-версию
        val webUri = Uri.parse("https://maps.yandex.ru/?ll=$longitude,$latitude")
        val webIntent = Intent(Intent.ACTION_VIEW, webUri)
        if (webIntent.resolveActivity(context.packageManager) != null) {
            context.startActivity(webIntent)
        }
    }
}





class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val buttonOnPlace : Button = findViewById(R.id.ButtonOnPlace)
        val buttonHint : Button = findViewById(R.id.buttonHint)




        // Ваш код для настройки второго экрана
    }
}
