package p2pdops.crops

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AddCropActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_crop)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}