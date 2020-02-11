package idv.hsu.taipei36weather.data.source

interface WeatherDataSource {
    suspend fun getNormal36Weather(auth: String, callback: Normal36Callback)
}