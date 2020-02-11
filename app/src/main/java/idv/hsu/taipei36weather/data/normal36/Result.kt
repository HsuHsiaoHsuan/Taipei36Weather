package idv.hsu.taipei36weather.data.normal36

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Result(

    @field:Json(name = "fields")
    val fields: List<Field> = emptyList(),

    @field:Json(name = "resource_id")
    val resource_id: String = ""
)