package idv.hsu.taipei36weather.data.normal36

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Time(

    @field:Json(name = "endTime")
    val endTime: String = "",

    @field:Json(name = "parameter")
    val parameter: Parameter = Parameter(),

    @field:Json(name = "startTime")
    val startTime: String = ""
)