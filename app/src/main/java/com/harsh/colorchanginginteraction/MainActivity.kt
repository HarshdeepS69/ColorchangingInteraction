package com.harsh.colorchanginginteraction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider

import com.harsh.colorchanginginteraction.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var colorViewModel: ColorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.activity = this
        setContentView(binding.root)
        colorViewModel = ViewModelProvider(this)[ColorViewModel::class.java]

        binding.btnRed.setOnClickListener(){
            //colorViewModel.color = MutableLiveData(1)
            colorViewModel.color.setValue(1)
            Toast.makeText(this, "Red Clicked", Toast.LENGTH_SHORT).show()
        }
        binding.btnGreen.setOnClickListener(){
            colorViewModel.color.setValue(2)
            Toast.makeText(this, "Green Clicked", Toast.LENGTH_SHORT).show()
        }
        binding.btnBlue.setOnClickListener(){
            colorViewModel.color.setValue(3)
            Toast.makeText(this, "Blue Clicked", Toast.LENGTH_SHORT).show()
        }

    }
    fun buttonClicked(value : Int){
        colorViewModel.isSHOW.setValue(value)
    }
}