package idv.hsu.taipei36weather.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import idv.hsu.taipei36weather.data.DataInjection
import idv.hsu.taipei36weather.R
import idv.hsu.taipei36weather.data.normal36.Normal36Response
import java.lang.StringBuilder

class MainActivity : AppCompatActivity(), MainContract.View {

    override lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(
            DataInjection.provideWeatherRepository(),
            this
        )
        presenter.getNormal36Taipei()
    }

    override fun showLoadingIndicator(activate: Boolean) {

    }

    override fun showNormal36Taipei(success: Boolean, data: Normal36Response?) {
        if (success) {
            if (data != null) {
                val list = mutableListOf<String>()
                val typeList = mutableListOf<DataTypeEnum>()

                for (time in data.records.location[0].weatherElement[0].time) {
                    val result = StringBuilder(time.startTime).append("\n").append(time.endTime).append("\n")
                        .append(time.parameter.parameterName).append(time.parameter.parameterUnit)
                    list.add(result.toString())
                    typeList.add(DataTypeEnum.TXT)

                    list.add("來插花的")
                    typeList.add(DataTypeEnum.PIC)
                }
                Log.d("FREEMAN", "$list")
                Log.d("FREEMAN", "---------------")
                Log.d("FREEMAN", "$typeList")
            } else {
                runOnUiThread {
                    Toast.makeText(this, "沒有資料啊啊啊~~", Toast.LENGTH_SHORT).show()
                }
            }
        } else {
            Toast.makeText(this, "沒有資料啊啊啊~~", Toast.LENGTH_SHORT).show()
        }
    }
}