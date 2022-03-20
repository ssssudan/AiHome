package com.example.aihome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.aihome.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater); //inflate 메서드를 활용해서 엑티비티에서 사용할 바인딩 클래스의 인스턴스 생성
        setContentView(binding.root)
        //setContentView((R.layout.activity_main))

        //intent 메서드로 activity간 화면 전환
        binding.homeBtn.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        binding.alarmBtn.setOnClickListener{
            val intent = Intent(this, AlarmActivity::class.java)
            startActivity(intent)
        }
        binding.graphBtn.setOnClickListener{
            val intent = Intent(this, GraphActivity::class.java)
            startActivity(intent)
        }
        binding.cctvBtn.setOnClickListener{
            val intent = Intent(this, CctvActivity::class.java)
            startActivity(intent)
        }

    }
}
