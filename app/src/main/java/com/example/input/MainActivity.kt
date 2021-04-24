package com.example.input

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.*

var etcnt = 1

class MainActivity : AppCompatActivity() {
    var editText1: EditText? = null
    var ll: LinearLayout? = null
    var list_of_items = arrayOf("g", "ml", "개", "수저")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ll = findViewById(R.id.inputbar)
        val items = resources.getStringArray(R.array.arraymeterage)

        val spinner: Spinner = findViewById(R.id.spinner1)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
                this,
                R.array.arraymeterage,
                android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }

        val imageclick = findViewById(R.id.addingredient) as ImageView
        imageclick.setOnClickListener {
//                LinearLayout linear = new LinearLayout(this)
//
//                val num = etcnt++
//                for (i in 0 until num) {
//                    val et = EditText(applicationContext)
//                    val p = LinearLayout.LayoutParams(
//                        ViewGroup.LayoutParams.MATCH_PARENT,
//                        ViewGroup.LayoutParams.WRAP_CONTENT
//                    )
//                    et.layoutParams = p
//                    et.setText("editText" + i + "번")
//                    et.id = num
//                    ll.addView(et)
//                }
//            Toast.makeText(this@MainActivity, "Count " + etcnt, Toast.LENGTH_SHORT).show()
//            etcnt++
        }

    }


}


//class MainActivity : AppCompatActivity() {
//    var editText1: EditText? = null
//    var ll: LinearLayout? = null
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        ll = findViewById(R.id.i)
//        editText1 = findViewById(R.id.editText1)
//        val button1: Button = findViewById(R.id.button1)
//        val button2: Button = findViewById(R.id.button2)
//
//        // 숫자 개수 만큼 editText 추가 생성
//        button1.setOnClickListener(object : OnClickListener() {
//            fun onClick(view: View?) {
//                val num = editText1.getText().toString().toInt()
//                for (i in 0 until num) {
//                    val et = EditText(applicationContext)
//                    val p = LinearLayout.LayoutParams(
//                        ViewGroup.LayoutParams.MATCH_PARENT,
//                        ViewGroup.LayoutParams.WRAP_CONTENT
//                    )
//                    et.layoutParams = p
//                    et.setText("editText" + i + "번")
//                    et.id = num
//                    ll.addView(et)
//                }
//            }
//        })
//        button2.setOnClickListener(object : OnClickListener() {
//            fun onClick(view: View?) {
//                ll.removeAllViews()
//            }
//        })
//    }
//}