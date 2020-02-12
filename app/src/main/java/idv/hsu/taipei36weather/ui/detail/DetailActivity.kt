package idv.hsu.taipei36weather.ui.detail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import idv.hsu.taipei36weather.R
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val data = intent.getStringExtra("DATA")
        tv_content.text = data
    }

    companion object {
        fun newIntent(context: Context, data: String): Intent =
            Intent(context, DetailActivity::class.java).apply {
                putExtra("DATA", data)
            }
    }
}