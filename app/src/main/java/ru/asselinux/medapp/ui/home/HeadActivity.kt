package ru.asselinux.medapp.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import ru.asselinux.medapp.R

class HeadActivity : AppCompatActivity() {

    private lateinit var hatViewModel: HeadViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_head)

        hatViewModel = ViewModelProvider(this).get(HeadViewModel::class.java)
    }
}