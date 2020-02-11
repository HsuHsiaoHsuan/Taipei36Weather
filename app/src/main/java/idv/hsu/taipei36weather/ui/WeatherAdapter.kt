package idv.hsu.taipei36weather.ui

import android.view.LayoutInflater
import android.view.OrientationEventListener
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import idv.hsu.taipei36weather.R
import kotlinx.android.synthetic.main.item_pic.view.*

class WeatherAdapter(
    private var data: List<String>,
    private var dataType: List<DataTypeEnum>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var onItemClickListener: View.OnClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val context = parent.context

        return when (DataTypeEnum.fromInt(viewType)) {
            DataTypeEnum.TXT -> {
                val view =
                    LayoutInflater.from(context).inflate(R.layout.item_txt, parent, false)
                WeatherTxtViewHolder(view)
            }
            DataTypeEnum.PIC -> {
                val view =
                    LayoutInflater.from(context).inflate(R.layout.item_pic, parent, false)
                WeatherPicViewHolder(view)
            }
            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun getItemCount() = data.size

    override fun getItemViewType(position: Int): Int {
        return dataType[position].value
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(dataType[position]) {
            DataTypeEnum.TXT -> {
                (holder as WeatherTxtViewHolder).data
            }
            DataTypeEnum.PIC -> {

            }
        }
    }

    fun setOnItemClickListener(listener: View.OnClickListener) {
        onItemClickListener = listener
    }

    fun setDataAndType(data: List<String>, type: List<DataTypeEnum>) {
        this.data = data
        this.dataType = type

    }

    inner class WeatherTxtViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val data: String = ""
        init {
            itemView.tag = this
            view.setOnClickListener(onItemClickListener)
        }
    }

    inner class WeatherPicViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        init {
            itemView.tag = this
            view.setOnClickListener(null)
        }
    }
}