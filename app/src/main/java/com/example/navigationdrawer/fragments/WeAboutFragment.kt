package com.example.navigationdrawer.fragments

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import com.example.navigationdrawer.R
import com.example.navigationdrawer.databinding.FragmentWeAboutBinding


class WeAboutFragment : Fragment() {

    private lateinit var binding: FragmentWeAboutBinding

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP_MR1)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        activity?.window?.statusBarColor = ContextCompat.getColor(requireContext(), R.color.purple_700)


        binding = FragmentWeAboutBinding.inflate(inflater, container, false)

        binding.btnKanal.setOnClickListener {
            startActivity(Intent.parseUri("https://t.me/Programmers_Dasturchi", Intent.URI_ALLOW_UNSAFE))
        }

        binding.btnGuruh.setOnClickListener {
            startActivity(Intent.parseUri("https://t.me/Cpp_java_dasturlash", Intent.URI_ALLOW_UNSAFE))
        }

        binding.btnBot.setOnClickListener {
            startActivity(Intent.parseUri("https://t.me/programmersQuiz_bot", Intent.URI_ALLOW_UNSAFE))
        }

        binding.btnBoshqa.setOnClickListener {
            startActivity(Intent.parseUri("https://t.me/ProgrammersPortfolio", Intent.URI_ALLOW_UNSAFE))
        }

        return binding.root
    }

}