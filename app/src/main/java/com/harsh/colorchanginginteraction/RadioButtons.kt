package com.harsh.colorchanginginteraction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.harsh.colorchanginginteraction.databinding.ActivityRadioButtonsBinding

lateinit var binding: ActivityRadioButtonsBinding
class RadioButtons : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRadioButtonsBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}