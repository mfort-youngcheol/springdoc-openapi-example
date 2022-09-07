package com.example.oas.ui.web.user

import com.example.oas.ui.web.user.request.UserRegistrationRequest
import com.example.oas.ui.web.user.response.UserInfoResponse
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.*

@Tag(name = "유저 API", description = "유저 데이터를 관리한다")
@RestController
@RequestMapping("/users")
class UserController {
    @Operation(summary = "유저 등록", description = "유저를 등록한다")
    @PostMapping
    fun register(@RequestBody request: UserRegistrationRequest): UserInfoResponse =
        UserInfoResponse(
            id = 1L,
            name = request.name,
            address = request.address.roadName + (request.address.detail ?: ""),
        )

    @Operation(
        summary = "유저 조회",
        description = "- 특정 id의 유저를 조회한다\n" +
                "- 해당 id의 유저가 존재하지 않으면 [404](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/404) 응답"
    )
    @GetMapping("/{id}")
    fun getUser(
        @PathVariable("id") id: Long,
        @Parameter(name = "보여지는 파라미터", description = "보여지는 파라미터에 대한 값입니다") @RequestParam show: String,
        @Parameter(hidden = true) @RequestParam hidden: String,
    ): UserInfoResponse =
        UserInfoResponse(
            id = 1L,
            name = "맘편한",
            address = "서울시 강남구 강남대로94길 10 케이스퀘어 12층 맘편한세상",
        )
}
