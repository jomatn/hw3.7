package com.example.hw37

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val musicFragment = MusicFragment()

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_music, musicFragment)
            .commit()
    }
}
