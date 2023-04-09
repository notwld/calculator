package com.example.calcowolator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    lateinit var btn1:ImageView
    lateinit var btn2:ImageView
    lateinit var btn3:ImageView
    lateinit var btn4:ImageView
    lateinit var btn5:ImageView
    lateinit var btn6:ImageView
    lateinit var btn7:ImageView
    lateinit var btn8:ImageView
    lateinit var btn9:ImageView
    lateinit var btn_plus:ImageView
    lateinit var btn_minus:ImageView
    lateinit var btn_divide:ImageView
    lateinit var btn_mul:ImageView
    lateinit var btn_open:ImageView
    lateinit var btn_close:ImageView
    lateinit var btn_clear:ImageView
    lateinit var btn_zero:ImageView
    lateinit var btn_dot:ImageView
    lateinit var btn_equals:ImageView

    lateinit var input:TextView
    lateinit var output:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        input = findViewById(R.id.input)
        output = findViewById(R.id.result)

        btn1 = findViewById(R.id.one)
        btn2 = findViewById(R.id.two)
        btn3 = findViewById(R.id.three)
        btn4 = findViewById(R.id.four)
        btn5 = findViewById(R.id.five)
        btn6 = findViewById(R.id.six)
        btn7 = findViewById(R.id.seven)
        btn8 = findViewById(R.id.eight)
        btn9 = findViewById(R.id.nine)
        btn_zero = findViewById(R.id.zero)
        btn_plus = findViewById(R.id.add)
        btn_minus = findViewById(R.id.minus)
        btn_divide = findViewById(R.id.divide)
        btn_mul = findViewById(R.id.multiply)
        btn_open = findViewById(R.id.open)
        btn_close = findViewById(R.id.close)
        btn_clear = findViewById(R.id.clear)
        btn_dot = findViewById(R.id.dot)
        btn_equals = findViewById(R.id.equals)

        btn1.setOnClickListener {
            input.append("1")
        }
        btn2.setOnClickListener {
            input.append("2")
        }
        btn3.setOnClickListener {
            input.append("3")
        }
        btn4.setOnClickListener {
            input.append("4")
        }
        btn5.setOnClickListener {
            input.append("5")
        }
        btn6.setOnClickListener {
            input.append("6")
        }
        btn7.setOnClickListener {
            input.append("7")
        }
        btn8.setOnClickListener {
            input.append("8")
        }
        btn9.setOnClickListener {
            input.append("9")
        }
        btn_zero.setOnClickListener {
            input.append("0")
        }
        btn_open.setOnClickListener {
            input.append(" ( ")
        }
        btn_close.setOnClickListener {
            input.append(" ) ")
        }
        btn_divide.setOnClickListener {
            input.append(" / ")
        }
        btn_minus.setOnClickListener {
            input.append(" - ")
        }
        btn_plus.setOnClickListener {
            input.append(" + ")
        }
        btn_mul.setOnClickListener {
            input.append(" * ")
        }
        btn_dot.setOnClickListener {
            input.append(".")
        }
        btn_equals.setOnClickListener {


            try{
                val expression = ExpressionBuilder(input.text.toString()).build()
                val res = expression.evaluate()
                val lres = res.toLong()
                if(res==lres.toDouble()){
                    output.text = lres.toString()
                }
                else{
                    output.text = res.toString()
                }
            }
            catch (e: Exception){
                output.text = "Err"

            }
        }

        btn_clear.setOnClickListener {
            input.text = ""
            output.text = "0"
        }


    }



}
