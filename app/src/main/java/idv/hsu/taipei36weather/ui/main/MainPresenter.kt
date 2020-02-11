package idv.hsu.taipei36weather.ui.main

import idv.hsu.taipei36weather.BuildConfig
import idv.hsu.taipei36weather.data.normal36.Normal36Response
import idv.hsu.taipei36weather.data.source.Normal36Callback
import idv.hsu.taipei36weather.data.source.WeatherRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainPresenter(
    private val weatherRepository: WeatherRepository,
    private val mainView: MainContract.View
) : MainContract.Presenter {

    init {
        mainView.presenter = this
    }

    override fun getNormal36Taipei() {
        GlobalScope.apply {
            launch(Dispatchers.IO) {
                weatherRepository.getNormal36Weather(BuildConfig.WEATHER_KEY, callback = object :
                    Normal36Callback {
                    override fun onDataLoaded(result: Normal36Response) {
                        mainView.showNormal36Taipei(true, result)
                    }

                    override fun onDataNotAvailable() {
                        mainView.showNormal36Taipei(false, null)
                    }
                })
            }
        }
    }
}