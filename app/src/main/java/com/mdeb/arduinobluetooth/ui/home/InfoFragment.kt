package com.mdeb.arduinobluetooth.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mdeb.arduinobluetooth.R
import com.mdeb.arduinobluetooth.databinding.FragmentInfoBinding


class InfoFragment : Fragment() {

    private var _binding:FragmentInfoBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentInfoBinding.inflate(layoutInflater, container, false)
        return binding.root

    }


}