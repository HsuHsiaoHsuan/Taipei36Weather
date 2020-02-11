package idv.hsu.taipei36weather.data.normal36

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Parameter(

    @field:Json(name = "parameterName")
    val parameterName: String = "",

    @field:Json(name = "parameterUnit")
    val parameterUnit: String = "",

    @field:Json(name = "parameterValue")
    val parameterValue: String = ""
)