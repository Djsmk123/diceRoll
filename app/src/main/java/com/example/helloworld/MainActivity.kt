package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button:Button=findViewById(R.id.Roll)
        button.setOnClickListener {
            var dice=Dice(6)
            var result=when(dice.roll()){
                1->R.drawable.dice_1
                2->R.drawable.dice_2
                3->R.drawable.dice_3
                4->R.drawable.dice_4
                5->R.drawable.dice_5
                else -> {
                    R.drawable.dice_6
                }
            }
            var image:ImageView=findViewById(R.id.imageView)
            image.setImageResource(result)
        }
    }

}
class Dice(private val num:Int){
    fun roll():Int{
        return (1..num).random()
    }
}