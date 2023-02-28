package com.example.assignment

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.assignment.databinding.ActivityProgrammingBinding
import com.example.assignment.databinding.ActivityQuizTimeBinding

class Programming : AppCompatActivity() {

    private lateinit var binding : ActivityProgrammingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        supportActionBar?.hide()
        binding = ActivityProgrammingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener{
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





        binding.txt1.setOnClickListener {
            val choices = arrayOf("A button that performs an action", "A screen in android app that displays user interface elements and interacts with the user",
                "A component in android that handles background task")
            val build2 = AlertDialog.Builder(this)
            build2.setTitle("What is an Activity in Android?")
            lateinit var Yourans: String
            build2.setSingleChoiceItems(choices, -1, DialogInterface.OnClickListener{dialog, a->
//                Toast.makeText()
                Yourans = choices[a]
            })
            build2.setPositiveButton("Submit", DialogInterface.OnClickListener{dialog, w->
                if(Yourans==choices[1]){
                    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this, "Try again", Toast.LENGTH_SHORT).show()
                }
            })
            build2.setNegativeButton("Cancel", DialogInterface.OnClickListener{which, o->
//
            })
            build2.show()
        }


        binding.txt2.setOnClickListener {
            val choices = arrayOf("The amount of memory to be allocated should be known beforehand", "Elements of array can be accessed in constant time",
                "Elements are stored in contiguous memory blocks")
            val build2 = AlertDialog.Builder(this)
            build2.setTitle("What are the disadvantages of array in C?")
            lateinit var Yourans: String
            build2.setSingleChoiceItems(choices, -1, DialogInterface.OnClickListener{dialog, a->
//                Toast.makeText()
                Yourans = choices[a]
            })
            build2.setPositiveButton("Submit", DialogInterface.OnClickListener{dialog, w->
                if(Yourans==choices[0]){
                    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this, "Try again", Toast.LENGTH_SHORT).show()
                }
            })
            build2.setNegativeButton("Cancel", DialogInterface.OnClickListener{which, o->
//
            })
            build2.show()
        }


        binding.txt3.setOnClickListener {
            val choices = arrayOf("While Loop", "For Loop", "do-while Loop")
            val build2 = AlertDialog.Builder(this)
            build2.setTitle("Which of the following is an exit controlled loop?")
            lateinit var Yourans: String
            build2.setSingleChoiceItems(choices, -1, DialogInterface.OnClickListener{dialog, a->
//                Toast.makeText()
                Yourans = choices[a]
            })
            build2.setPositiveButton("Submit", DialogInterface.OnClickListener{dialog, w->
                if(Yourans==choices[2]){
                    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this, "Try again", Toast.LENGTH_SHORT).show()
                }
            })
            build2.setNegativeButton("Cancel", DialogInterface.OnClickListener{which, o->
//
            })
            build2.show()
        }


        binding.txt4.setOnClickListener {
            val choices = arrayOf("sealed", "public", "protected")
            val build2 = AlertDialog.Builder(this)
            build2.setTitle("In Kotlin the default visibility modifier is?")
            lateinit var Yourans: String
            build2.setSingleChoiceItems(choices, -1, DialogInterface.OnClickListener{dialog, a->
//                Toast.makeText()
                Yourans = choices[a]
            })
            build2.setPositiveButton("Submit", DialogInterface.OnClickListener{dialog, w->
                if(Yourans==choices[1]){
                    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this, "Try again", Toast.LENGTH_SHORT).show()
                }
            })
            build2.setNegativeButton("Cancel", DialogInterface.OnClickListener{which, o->
//
            })
            build2.show()
        }


        binding.txt5.setOnClickListener {
            val choices = arrayOf("arrays and Boolean", "Characters", "All of the above")
            val build2 = AlertDialog.Builder(this)
            build2.setTitle("Which are the basic types in kotlin?")
            lateinit var Yourans: String
            build2.setSingleChoiceItems(choices, -1, DialogInterface.OnClickListener{dialog, a->
//                Toast.makeText()
                Yourans = choices[a]
            })
            build2.setPositiveButton("Submit", DialogInterface.OnClickListener{dialog, w->
                if(Yourans==choices[2]){
                    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this, "Try again", Toast.LENGTH_SHORT).show()
                }
            })
            build2.setNegativeButton("Cancel", DialogInterface.OnClickListener{which, o->
//
            })
            build2.show()
        }

    }
}