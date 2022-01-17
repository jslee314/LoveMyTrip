package com.jslee.loveMyTrip.data.dto

/**
 * 여행 등급 - 여행 점수에 따라 부과됨 (enum???)
 */
data class UserClass (
    val id: Int,
    val name: String,
    val threshold: Int, // 점수 범위 threshold
    val mainImgUrl: String
)
