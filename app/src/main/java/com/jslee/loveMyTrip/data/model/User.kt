package com.jslee.loveMyTrip.data.model

import com.jslee.loveMyTrip.data.dto.UserClass
import com.jslee.loveMyTrip.data.model.Trip

/**
 * 사용자 계정
 */
data class User(

    val id: String,             // 사용자 식별자(아이디?)
    val name: String,           // 사용자 이름
    val tripPoints: Int,        // 사용자 여행점수 -> 등급 산출 기준임

    val trips: List<Trip>       // 여행지 목록들
    ){
        //var tripClass: UserClass    // 나의 여행 등급
        //var trips: List<Trip>       // 여행 목록 리스트
}
