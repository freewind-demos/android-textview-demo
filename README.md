# android-textview-demo

## 简介

演示 TextView 组件的各种属性和用法。

## 基本原理

- TextView 是 Android 中用于显示文本的组件
- 可以通过 XML 或代码设置文本内容和样式
- 支持多种文本属性：颜色、大小、背景、阴影等

## 启动和使用

### 环境要求
- Android Studio 4.0+
- JDK 11+

### 安装和运行
1. 用 Android Studio 打开此项目
2. 运行应用查看不同样式的 TextView

## 教程

### TextView 基础

TextView 是 Android 中最常用的组件之一，用于显示静态文本。

```xml
<TextView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="显示文本"
    android:textSize="18sp" />
```

### 常用属性

| 属性 | 说明 |
|------|------|
| android:text | 显示的文本内容 |
| android:textSize | 文本大小 |
| android:textColor | 文本颜色 |
| android:background | 背景颜色 |
| android:shadowColor | 阴影颜色 |
| android:shadowDx | 阴影 X 偏移 |
| android:shadowDy | 阴影 Y 偏移 |

### 通过代码设置

```kotlin
val textView = findViewById<TextView>(R.id.textView)
textView.text = "动态设置的文本"
textView.setTextColor(Color.RED)
```

### 注意事项

- 使用 sp 作为字体大小单位，支持用户系统字体大小设置
- 颜色可以使用十六进制值如 #FF0000
- ConstraintLayout 中使用 0dp 配合约束实现自适应宽度
