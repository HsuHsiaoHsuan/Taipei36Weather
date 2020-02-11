package idv.hsu.taipei36weather.data.normal36

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Location(

    @field:Json(name = "locationName")
    val locationName: String = "",

    @field:Json(name = "weatherElement")
    val weatherElement: List<WeatherElement> = emptyList()
)