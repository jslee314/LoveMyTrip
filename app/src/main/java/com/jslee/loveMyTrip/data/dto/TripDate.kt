package com.jslee.loveMyTrip.data.dto

import java.time.LocalDate

/**
 * 여행 일정
 */
data class TripDate(
    val startDate: LocalDate,
    val endDate: LocalDate,
)

// 이 기간의 계절별 특징 -> 준비물, 추천지가 달라짐

// LocalDate.now(); // 2020-08-30
