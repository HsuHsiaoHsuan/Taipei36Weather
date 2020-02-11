package idv.hsu.taipei36weather.data

import idv.hsu.taipei36weather.data.source.WeatherRemoteDataSource
import idv.hsu.taipei36weather.data.source.WeatherRepository

object DataInjection {
    fun provideWeatherRepository() : WeatherRepository {
        return WeatherRepository.getInstance(WeatherRemoteDataSource.getInstance())
    }
}