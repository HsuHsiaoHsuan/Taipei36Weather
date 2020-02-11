package idv.hsu.taipei36weather.data.source

import android.util.Log
import com.orhanobut.logger.Logger
import idv.hsu.taipei36weather.network.WeatherApiBuilder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class WeatherRemoteDataSource : WeatherDataSource {

    private val api = WeatherApiBuilder.instance.api

    override suspend fun getNormal36Weather(auth: String, callback: Normal36Callback) {
        CoroutineScope(Dispatchers.IO).launch {
            val result = api.get36Weather(auth = auth)

            if (result.isSuccessful && result.body() != null) {
                callback.onDataLoaded(result.body()!!)
            } else {
                callback.onDataNotAvailable()
            }
        }
    }

    companion object {
        private var INSTANCE: WeatherRemoteDataSource? = null

        fun getInstance(): WeatherRemoteDataSource {
            return INSTANCE?:WeatherRemoteDataSource().apply { INSTANCE = this }
        }
    }
}