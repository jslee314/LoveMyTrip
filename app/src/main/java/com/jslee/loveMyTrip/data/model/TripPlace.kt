package com.jslee.loveMyTrip.data.model

import android.location.Location

/**
 * 여행 지역
 */
data class TripPlace(
    val id: Int,
    val title: String,
    val locations: List<Location> // 위도경도 리스트들..?
)

