package com.example.oas.ui.web.user.response

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "유저 정보 응답")
data class UserInfoResponse(
    @field:Schema(description = "id", example = "123", required = true)
    val id: Long,

    @field:Schema(description = "이름", example = "맘편한", required = true)
    val name: String,

    @field:Schema(description = "주소", example = "서울시 강남구 강남대로94길 10 케이스퀘어 12층 맘편한세상", required = true)
    val address: String,
)

