package com.harsh.colorchanginginteraction

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.harsh.colorchanginginteraction.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    lateinit var binding: FragmentFirstBinding
    lateinit var mainActivity: MainActivity
    var TAG = FirstFragment::class.java.canonicalName
    lateinit var colorViewModel: ColorViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivity = activity as MainActivity
        colorViewModel = ViewModelProvider(mainActivity)[ColorViewModel::class.java]
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //binding.mainLayout.setBackgroundColor(ContextCompat.getColor(mainActivity,R.color.Red))
        colorViewModel.color.observe(mainActivity) {
            when (it) {
                1 -> {
                    binding.mainLayout.setBackgroundColor(
                        ContextCompat.getColor(
                            mainActivity,
                            R.color.Red
                        )
                    )
                    Toast.makeText(mainActivity, "Red Clicked Fragment", Toast.LENGTH_SHORT).show()

                }

                2 -> binding.mainLayout.setBackgroundColor(
                    ContextCompat.getColor(
                        mainActivity,
                        R.color.Blue
                    )
                )

                3 -> binding.mainLayout.setBackgroundColor(
                    ContextCompat.getColor(
                        mainActivity,
                        R.color.Green
                    )
                )
            }
        }
    }


}