package com.example.assignment

import android.content.Intent
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.assignment.databinding.ActivityQuizTimeBinding

class QuizTime : AppCompatActivity() {

    lateinit var binding : ActivityQuizTimeBinding

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)


        supportActionBar?.hide()
        binding = ActivityQuizTimeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnExit.setOnClickListener{
            val build1 = AlertDialog.Builder(this)
            build1.setTitle("Are you Sure?")
            build1.setTitle("Do you want to exit from the Quiz?")
            build1.setIcon(R.drawable.baseline_exit_to_app_24)
            build1.setPositiveButton("Yes", DialogInterface.OnClickListener{dialogInterface, i->
                finish()
            })
            build1.setNegativeButton("No", DialogInterface.OnClickListener{dialogInterface, p->
            })
            build1.show()
        }

        binding.btnP.setOnClickListener {
            val intent = Intent(this, Programming::class.java)
            startActivity(intent)
        }

        binding.btnA.setOnClickListener {
            val intent = Intent(this, AstroPhysics::class.java)
            startActivity(intent)
        }

        binding.btnAB.setOnClickListener {
            val intent = Intent(this, AboutEarth::class.java)
            startActivity(intent)
        }

        binding.btnW.setOnClickListener {
            val intent = Intent(this, Random::class.java)
            startActivity(intent)
        }


    }
}