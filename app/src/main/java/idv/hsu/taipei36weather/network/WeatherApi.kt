package idv.hsu.taipei36weather.network

import idv.hsu.taipei36weather.data.normal36.Normal36Response
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("F-C0032-001")
    suspend fun get36Weather(
        @Query("Authorization") auth: String,
        @Query("locationName") location: String = "臺北市",
        @Query("sort") sorting: String = "time",
        @Query("elementName") element: String = "MinT"
    ) : Response<Normal36Response>

    companion object {
        const val ENDPOINT = "https://opendata.cwb.gov.tw/api/v1/rest/datastore/"
    }
}

/*
https://opendata.cwb.gov.tw/api/v1/rest/datastore/F-C0032-001?Authorization=CWB-6BB990FB-5524-470B-ABE8-9E0934D5271C&locationName=%E8%87%BA%E5%8C%97%E5%B8%82&elementName=MinT&sort=time
 */