package idv.hsu.taipei36weather.data.normal36

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class WeatherElement(

    @field:Json(name = "elementName")
    val elementName: String = "",

    @field:Json(name = "time")
    val time: List<Time> = emptyList()
)