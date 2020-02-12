package idv.hsu.taipei36weather.ui.main

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import idv.hsu.taipei36weather.R
import idv.hsu.taipei36weather.data.DataInjection
import idv.hsu.taipei36weather.data.normal36.Normal36Response
import idv.hsu.taipei36weather.ui.detail.DetailActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.View {

    override lateinit var presenter: MainContract.Presenter
    private lateinit var weatherAdapter: WeatherAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(
            DataInjection.provideWeatherRepository(),
            this
        )
        presenter.getNormal36Taipei()

        weatherAdapter = WeatherAdapter(
            data = emptyList(),
            dataType = emptyList()
        )
        weatherAdapter.setOnItemClickListener(listener = View.OnClickListener { v: View? ->
            v?.run {
                val holder = this.tag as WeatherAdapter.WeatherTxtViewHolder
                Toast.makeText(this@MainActivity, holder.data, Toast.LENGTH_SHORT).show()
                startActivity(DetailActivity.newIntent(this@MainActivity, holder.data))
            }
        })

        rv_content.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = weatherAdapter
        }
    }

    override fun showNormal36Taipei(success: Boolean, data: Normal36Response?) {
        if (success) {
            if (data != null) {
                val list = mutableListOf<String>()
                val typeList = mutableListOf<DataTypeEnum>()

                for (time in data.records.location[0].weatherElement[0].time) {
                    val result =
                        StringBuilder(time.startTime).append("\n").append(time.endTime).append("\n")
                            .append(time.parameter.parameterName)
                            .append(time.parameter.parameterUnit)
                    list.add(result.toString())
                    typeList.add(DataTypeEnum.TXT)

                    list.add("來插花的")
                    typeList.add(DataTypeEnum.PIC)
                }

                runOnUiThread {
                    weatherAdapter.setDataAndType(data = list, type = typeList)
                }
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