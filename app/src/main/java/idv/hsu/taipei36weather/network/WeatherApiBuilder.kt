package idv.hsu.taipei36weather.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class WeatherApiBuilder {

    val api: WeatherApi by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(WeatherApi.ENDPOINT)
            .addConverterFactory(MoshiConverterFactory.create())
            .client(provideOkHttpClient())
            .build()

        return@lazy retrofit.create(WeatherApi::class.java)
    }

    private fun provideOkHttpClient(): OkHttpClient {
        val builder = OkHttpClient.Builder()
            .addInterceptor(provideLoggingInterceptor())

        return builder.build()
    }

    private fun provideLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
    }

    companion object {
        val instance = WeatherApiBuilder()
    }
}