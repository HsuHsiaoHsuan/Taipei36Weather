package idv.hsu.taipei36weather.data.normal36

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Field(

    @field:Json(name = "id")
    val id: String = "",

    @field:Json(name = "type")
    val type: String = ""
)