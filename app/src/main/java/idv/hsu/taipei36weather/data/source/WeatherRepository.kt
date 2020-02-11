package idv.hsu.taipei36weather.data.source

class WeatherRepository(
    private val weatherRemoteDataSource: WeatherDataSource
) : WeatherDataSource {

    override suspend fun getNormal36Weather(auth: String, callback: Normal36Callback) {
        weatherRemoteDataSource.getNormal36Weather(auth, callback)
    }

    companion object {
        private var INSTANCE: WeatherRepository? = null

        fun getInstance(weatherRemoteDataSource: WeatherDataSource) : WeatherRepository {
            return INSTANCE?:WeatherRepository(weatherRemoteDataSource).apply { INSTANCE = this }
        }
    }
}