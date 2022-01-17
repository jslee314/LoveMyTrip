package com.jslee.loveMyTrip.data.model

import com.jslee.loveMyTrip.data.dto.CheckItem
import com.jslee.loveMyTrip.data.dto.TripDate

/**
 * 여행 클래스
 *
 */
data class Trip (
    val id: Int,    // 여행 식별자(자동생성)

    val user: User,             // 여행자
    val companions: List<User>, // 함께 여행가는 유저 목록
    val name: String, // 여행 이름
    val date: List<TripDate>, // 여행 일정 리스트

    val place: List<TripPlace>, // 여행 지역 리스트
    val photos: List<TripPhoto>,// 여행 사진 리스트

    val checkItems: List<CheckItem> // 여행 준비물 리스트
)
