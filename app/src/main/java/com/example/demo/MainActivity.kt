package com.example.demo

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * TextView 演示 Activity
 * 展示 TextView 的基本用法和属性设置
 */
class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 初始化 TextView
        textView = findViewById(R.id.textView)

        // 动态设置文本内容
        textView.text = "这是通过代码设置的文本内容\n\n" +
                "TextView 是 Android 中最常用的组件之一\n" +
                "用于显示文本信息"

        // 可以通过代码设置其他属性
        // textView.setTextColor(Color.BLACK)
        // textView.setTextSize(16f)
    }
}
