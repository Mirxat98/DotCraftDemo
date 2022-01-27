package com.example.assignmentone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.time.seconds

class MainActivity : AppCompatActivity() {
//    val button: Button = findViewById(R.id.button)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mRingArray: Array<ImageView> = arrayOf(findViewById(R.id.ring1), findViewById(R.id.ring4), findViewById(R.id.ring7), findViewById(R.id.ring2), findViewById(R.id.ring5), findViewById(R.id.ring8), findViewById(R.id.ring3), findViewById(R.id.ring6), findViewById(R.id.ring9))
        val mDotArray: Array<ImageView> = arrayOf(findViewById(R.id.dot1), findViewById(R.id.dot4), findViewById(R.id.dot7), findViewById(R.id.dot2), findViewById(R.id.dot5), findViewById(R.id.dot8), findViewById(R.id.dot3), findViewById(R.id.dot6), findViewById(R.id.dot9))

        val mButton: Button = findViewById(R.id.button)

        mButton.setOnClickListener {
            mButton.setText(R.string.restart)

            val randomRing1 = randomNum(0, 2)
            val randomRing2 = randomNum(3, 5)
            val randomRing3 = randomNum(6, 8)

            var randomDot1 = randomNum(0, 2)
            var randomDot2 = randomNum(3, 5)
            var randomDot3 = randomNum(6, 8)

            for (i in 0..8) {
                mRingArray[i].setImageResource(R.drawable.shape_ring_grey)
                mDotArray[i].setImageResource(R.drawable.shape_dot_black)
            }

            if (randomDot1 == randomRing1) {
                while (randomDot1 == randomRing1) {
                    randomDot1 = randomNum(0, 2)
                }
            }
            if (randomDot2 == randomRing2) {
                while (randomDot2 == randomRing2) {
                    randomDot2 = randomNum(3, 5)
                }
            }
            if (randomDot3 == randomRing3) {
                while (randomDot3 == randomRing3) {
                    randomDot3 = randomNum(6, 8)
                }
            }

            mRingArray[randomRing1].setImageResource(R.drawable.shape_ring_white)
            mRingArray[randomRing2].setImageResource(R.drawable.shape_ring_white)
            mRingArray[randomRing3].setImageResource(R.drawable.shape_ring_white)

            mDotArray[randomDot1].setImageResource(R.drawable.shape_dot_white)
            mDotArray[randomDot2].setImageResource(R.drawable.shape_dot_white)
            mDotArray[randomDot3].setImageResource(R.drawable.shape_dot_white)

//            println("123")
        }

    }

    fun randomNum(n: Int, m: Int): Int {
        val random = (n..m).random()
        return random;
    }
}

