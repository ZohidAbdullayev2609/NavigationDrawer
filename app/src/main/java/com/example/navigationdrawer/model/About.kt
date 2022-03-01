package com.example.navigationdrawer.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class About(
    var image: Int,
    var titul: String,
    var description: String,
    var x: Double,
    var y: Double
) : Parcelable