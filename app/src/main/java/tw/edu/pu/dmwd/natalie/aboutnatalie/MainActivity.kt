package tw.edu.pu.dmwd.natalie.aboutnatalie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var txv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv = findViewById(R.id.txv)
        txv.setOnClickListener({
            if (txv.text == "Natalie 您好!"){
                txv.text = "海青班很棒,數媒更是好的方向"
            }
            else{
                txv.text = "Natalie 您好!"
            }
        })
    }



}
