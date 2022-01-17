package com.jslee.loveMyTrip.data.dto

data class CheckItem(
    val id: Int,
    val title: String,
    val isComplete: Boolean, // 체크(완료) 여부

    val attributes: List<ItemAttribute>// 속성 리스트 - 여름용, 수영장, 숙박, 캠핑, 아이, ..등등
) {
}