package com.example.navigationdrawer.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationdrawer.R
import com.example.navigationdrawer.adapter.MyRecycleAdapter
import com.example.navigationdrawer.databinding.FragmentGalleryBinding
import com.example.navigationdrawer.model.About

class GalleryFragment : Fragment() {

    private lateinit var binding: FragmentGalleryBinding
    private lateinit var list: ArrayList<About>
    private val myAdapter: MyRecycleAdapter by lazy {
        MyRecycleAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        activity?.window?.statusBarColor = ContextCompat.getColor(requireContext(), R.color.blue)

        binding = FragmentGalleryBinding.inflate(inflater, container, false)

//        loadData()

        myAdapter.list = list
        binding.rvMuzaeylar.adapter = myAdapter

        myAdapter.setClickListener {
            findNavController().navigate(
                GalleryFragmentDirections.actionNavGalleryToSecondFragment(it)
            )
        }

        return binding.root
    }

//    private fun loadData() {
//        list = ArrayList()
//        for (i in 0..10) {
//
//            list.add(
//                About(
//                    R.drawable.alisher,
//                    "Alisher Navoiy muzeyi",
//                    context!!.getString(R.string.alisher_navoiy_muzeyi)
//                )
//            )
//            list.add(
//                About(
//                    R.drawable.ozbekiston,
//                    "O'zbekiston tarixi muzeyi",
//                    context!!.getString(R.string.Ozbekiston_tarixi_muzeyi)
//                )
//            )
//            list.add(
//                About(
//                    R.drawable.shahidlar,
//                    "Shahidlar muzeyi",
//                    context!!.getString(R.string.shahidlar_muzeyi)
//                )
//            )
//            list.add(
//                About(
//                    R.drawable.temur,
//                    "Temuriylar muzeyi",
//                    context!!.getString(R.string.temuriylar_muzeyi)
//                )
//            )
//            list.add(
//                About(
//                    R.drawable.geologiya,
//                    "Geologiya muzeyi",
//                    context!!.getString(R.string.geologiya_muzeyi)
//                )
//            )
//            list.add(
//                About(
//                    R.drawable.qurolli_kuchlar,
//                    "Qurolli kuchlar muzeyi",
//                    context!!.getString(R.string.qurolli_kuchlar_muzeyi)
//                )
//            )
//            list.add(
//                About(
//                    R.drawable.sanat,
//                    "San'at muzeyi",
//                    context!!.getString(R.string.sanat_muzeyi)
//                )
//            )
//            list.add(
//                About(
//                    R.drawable.tabiat,
//                    "Tabiat muzeyi",
//                    context!!.getString(R.string.tabiat_muzeyi)
//                )
//            )
//        }
//    }

}