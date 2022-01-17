package com.jslee.loveMyTrip.data.model

import com.jslee.loveMyTrip.data.dto.TripDate

/**
 * 사진 클래스
 */
data class TripPhoto(
    val imgUrl: String, // 사진 이미지 URL

    val user: User,         // 사진 게시자
    val contents: String,   // 사진 설명

    val trip: Trip,         // 해당 사진이 포햠된 여행 (해당 사진과 연관된 사람 참조가능)

    val date: TripDate,     // 사진 촬영 날짜
    val place: TripPlace    // 사진 지역

)
