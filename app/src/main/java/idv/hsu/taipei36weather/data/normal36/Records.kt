package idv.hsu.taipei36weather.data.normal36

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Records(

    @field:Json(name = "datasetDescription")
    val datasetDescription: String = "",

    @field:Json(name = "location")
    val location: List<Location> = emptyList()
)