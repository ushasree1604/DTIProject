package p2pdops.crops

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)


        val cropsListView = findViewById<ListView>(R.id.details)
        val simpleAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)

        val crops = arrayOf("Data1 ", "Data2", "Data3")
        simpleAdapter.addAll(*crops)
        cropsListView.adapter = simpleAdapter
    }
}