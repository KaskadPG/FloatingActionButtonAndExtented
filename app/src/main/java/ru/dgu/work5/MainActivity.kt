package ru.dgu.work5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import ru.dgu.work5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding?.fab?.hide()

        binding?.fab?.setOnClickListener(this)
        binding?.but1?.setOnClickListener(this)
        binding?.but2?.setOnClickListener(this)
        binding?.fabExtended?.setOnClickListener(this)
    }

    override fun onClick(view: View?) {

        when(view?.id) {
            R.id.fab -> supportFragmentManager.beginTransaction().replace(R.id.content, Shop()).commit()
            R.id.but1 -> binding?.fab?.show()
            R.id.but2 -> binding?.fab?.hide()
            R.id.fabExtended -> supportFragmentManager.beginTransaction().replace(R.id.content, Shop()).commit()
        }
    }
}