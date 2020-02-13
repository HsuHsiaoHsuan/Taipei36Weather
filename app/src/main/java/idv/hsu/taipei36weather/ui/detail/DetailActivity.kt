package idv.hsu.taipei36weather.ui.detail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import idv.hsu.taipei36weather.R
import idv.hsu.taipei36weather.databinding.ActivityDetailBinding
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail)
        binding.minT = intent.getStringExtra("DATA")
    }

    companion object {
        fun newIntent(context: Context, data: String): Intent =
            Intent(context, DetailActivity::class.java).apply {
                putExtra("DATA", data)
            }
    }
}