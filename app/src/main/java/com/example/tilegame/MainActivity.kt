package com.example.tilegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.tilegame.databinding.ActivityMainBinding
import com.popuplost
import com.popupwin
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_popuplost.*
import kotlin.random.Random
import kotlin.random.nextInt


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private  var  count = 0
    private var Popuplost = popuplost()
    private var Popupwin = popupwin()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val numberList = arrayListOf("1","2","3","4","5","6","7","8","9")

        for (i in 1..9) {
            binding.tv1.setOnClickListener {
                val random = Random.nextInt(1..9)
                tv1.text = random.toString()

                tv1.isEnabled=false
                count = count+1

                if (count ==3){
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.mainactivitty,Popuplost)
                    transaction.commit()
                }
                if (tv1.text.toString() == "7") {
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.mainactivitty,Popupwin)
                    transaction.commit()
                }
            }

            binding.tv2.setOnClickListener {
                val random = Random.nextInt(1..9)
                tv2.text = random.toString()

                tv2.isEnabled=false
                count = count+1

                if (count ==3){
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.mainactivitty,Popuplost)
                    transaction.commit()
                }

                if (tv2.text.toString() == "7") {
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.mainactivitty,Popupwin)
                    transaction.commit()
                }
            }
            binding.tv3.setOnClickListener {
                val random = Random.nextInt(1..9)
                tv3.text = random.toString()

                tv3.isEnabled = false
                count = count+1
                if (count ==3){
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.mainactivitty,Popuplost)
                    transaction.commit()
                }

                if (tv3.text.toString() == "7") {
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.mainactivitty,Popupwin)
                    transaction.commit()
                }
            }
            binding.tv4.setOnClickListener {
                val random = Random.nextInt(1..9)
                tv4.text = random.toString()

                tv4.isEnabled = true
                count = count+1

                if (count ==3){
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.mainactivitty,Popuplost)
                    transaction.commit()
                }

                if (tv4.text.toString() == "7") {
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.mainactivitty,Popupwin)
                    transaction.commit()
                }
            }
            binding.tv5.setOnClickListener {
                val random = Random.nextInt(1..9)
                tv5.text = random.toString()

                tv5.isEnabled = false
                count++

                if (count ==3){
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.mainactivitty,Popuplost)
                    transaction.commit()
                }

                if (tv5.text.toString() == "7") {
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.mainactivitty,Popupwin)
                    transaction.commit()
                }
            }
            binding.tv6.setOnClickListener {
                val random = Random.nextInt(1..9)
                tv6.text = random.toString()

                tv6.isEnabled = false
                count++

                if (count ==3){
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.mainactivitty,Popuplost)
                    transaction.commit()
                }
                if (tv6.text.toString() == "7") {
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.mainactivitty,Popupwin)
                    transaction.commit()
                }
            }
            binding.tv7.setOnClickListener {
                val random = Random.nextInt(1..9)
                tv7.text = random.toString()

                tv7.isEnabled = false
                count++

                if (count ==3){
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.mainactivitty,Popuplost)
                    transaction.commit()
                }
                if (tv7.text.toString() == "7") {
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.mainactivitty,Popupwin)
                    transaction.commit()
                }
            }
            binding.tv8.setOnClickListener {
                val random = Random.nextInt(1..9)
                tv8.text = random.toString()

                tv8.isEnabled = false
                count++

                if (count ==3){
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.mainactivitty,Popuplost)
                    transaction.commit()
                }
                if (tv8.text.toString() == "7") {
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.mainactivitty,Popupwin)
                    transaction.commit()
                }
            }
            binding.tv9.setOnClickListener {
                val random = Random.nextInt(1..9)
                tv9.text = random.toString()

                tv9.isEnabled = false
                count++

                if (count ==3){
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.mainactivitty,Popuplost)
                    transaction.commit()
                }
                if (tv9.text.toString() == "7") {
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.mainactivitty,Popupwin)
                    transaction.commit()

                }
            }



        }
//        else{
//            tv1.isEnabled = false
//            tv2.isEnabled = false
//            tv3.isEnabled = false
//            tv4.isEnabled = false
//            tv5.isEnabled = false
//            tv6.isEnabled = false
//            tv7.isEnabled = false
//            tv8.isEnabled = false
//            tv9.isEnabled = false
//
//            Toast.makeText(this, "Game Lose", Toast.LENGTH_SHORT).show()
//
//        }

    }


}