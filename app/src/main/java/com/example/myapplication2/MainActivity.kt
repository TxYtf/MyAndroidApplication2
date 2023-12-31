package com.example.myapplication2

//import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        val okButton:Button = findViewById(R.id.ok_button)
        val cancelButton:Button = findViewById(R.id.cancel_button)

        okButton.setOnClickListener { _:View ->
            val toast = Toast.makeText(this, R.string.ok_toast, Toast.LENGTH_LONG)
            toast.setGravity(Gravity.TOP, 0, 200)
            toast.show()
        }
        cancelButton.setOnClickListener {_:View ->
            val toast = Toast.makeText(this, R.string.cancel_toast, Toast.LENGTH_LONG)
            toast.setGravity(Gravity.TOP, 0, 200)
            toast.show()
            // треба зробити паузу перш ніж згортати додаток
            finishAffinity()
        }
    }
}