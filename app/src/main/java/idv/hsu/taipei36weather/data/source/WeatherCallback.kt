package idv.hsu.taipei36weather.data.source

import idv.hsu.taipei36weather.data.normal36.Normal36Response

interface Normal36Callback {
    fun onDataLoaded(result: Normal36Response)

    fun onDataNotAvailable()
}