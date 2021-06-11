package p2pdops.crops

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cropsListView = findViewById<ListView>(R.id.crops)
        val simpleAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)

        val crops = arrayOf("crop1 ", "crop2", "crop3")
        simpleAdapter.addAll(*crops)
        cropsListView.adapter = simpleAdapter

        cropsListView.setOnItemClickListener { parent, view, position, id ->
            startActivity(Intent(this@MainActivity, DetailsActivity::class.java))
        }

        findViewById<View>(R.id.add_crop).setOnClickListener {
            startActivity(Intent(this@MainActivity, AddCropActivity::class.java))
        }
        findViewById<View>(R.id.add_fertilizer).setOnClickListener {
            startActivity(Intent(this@MainActivity, AddCropActivity::class.java))
        }
    }
}