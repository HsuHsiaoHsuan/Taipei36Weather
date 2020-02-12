package idv.hsu.taipei36weather.ui.main

import idv.hsu.taipei36weather.data.normal36.Normal36Response

interface MainContract {

    interface View {
        var presenter: Presenter

        fun showNormal36Taipei(success: Boolean, data: Normal36Response?)
    }

    interface Presenter {
        fun getNormal36Taipei()
    }
}