package com.example.oas.ui.web.user.request

import io.swagger.v3.oas.annotations.media.Schema
import java.time.LocalDate

@Schema(description = "유저 등록 요청")
data class UserRegistrationRequest(
    @field:Schema(description = "이름", example = "맘편한", required = true)
    val name: String,

    @field:Schema(description = "주소", required = true)
    val address: Address,

    @field:Schema(description = "생년월일 (yyyy-MM-dd)", example = "1991-11-09", required = true)
    val birthDate: LocalDate,
) {
    @Schema(description = "등록 주소")
    data class Address(
        @field:Schema(description = "도로명 주소", example = "서울시 강남구 강남대로94길 10", required = true)
        val roadName: String,

        @field:Schema(description = "지번 주소", example = "서울특별시 강남구 역삼동 819", required = true)
        val lotNumber: String,

        @field:Schema(description = "상세 주소", example = "케이스퀘어 12층 맘편한세상", required = false)
        val detail: String?,
    )
}
