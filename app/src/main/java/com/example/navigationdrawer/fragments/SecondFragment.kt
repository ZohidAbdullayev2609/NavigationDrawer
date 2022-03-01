package com.example.navigationdrawer.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.navigationdrawer.R
import com.example.navigationdrawer.databinding.FragmentSecondBinding
import com.example.navigationdrawer.model.About
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class SecondFragment : Fragment(), OnMapReadyCallback {

    private lateinit var binding: FragmentSecondBinding
    private lateinit var mMap: GoogleMap
    private lateinit var position: About
    private val args: SecondFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)

        activity?.actionBar?.title = "Masjidlar"

        position = args.dates

        binding.iv.setImageResource(position.image)
        binding.tv.text = position.titul
        binding.dv.text = position.description

        val supportMapFragment =
            childFragmentManager.findFragmentById(R.id.maps) as SupportMapFragment
        supportMapFragment.getMapAsync(this)
//            mMap = it
//            mMap.addMarker(
//                MarkerOptions().position(
//                    LatLng(
//                        position.x,
//                        position.y
//                    )
//                ).title("Marker in ${position.titul}")
//            )
//
//            mMap.moveCamera(
//                CameraUpdateFactory.newLatLngZoom(
//                    LatLng(
//                        position.x,
//                        position.y
//                    ), 17f
//                )
//            )
//
//            mMap.uiSettings.isZoomControlsEnabled = true
//            mMap.uiSettings.isZoomGesturesEnabled = true
//            mMap.uiSettings.isMapToolbarEnabled = true

//        })

        return binding.root
    }

    override fun onMapReady(pos: GoogleMap) {
        mMap = pos
//        val point = LatLng(position.x, position.y)
//        mMap.addMarker(MarkerOptions().position(point).title("Marker is ${position.titul}"))
//        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(point, 14f))

        val sydney = LatLng(-34.0, 151.0)
        mMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))

        mMap.uiSettings.isZoomControlsEnabled = true
        mMap.uiSettings.isZoomGesturesEnabled = true
        mMap.uiSettings.isMapToolbarEnabled = true
    }

}