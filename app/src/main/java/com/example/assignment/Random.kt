package com.example.assignment

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.assignment.databinding.ActivityAboutEarthBinding
import com.example.assignment.databinding.ActivityRandomBinding

class Random : AppCompatActivity() {

    lateinit var binding : ActivityRandomBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        supportActionBar?.hide()
        binding = ActivityRandomBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn4.setOnClickListener{
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


        binding.txt16.setOnClickListener {
            val choices = arrayOf("Have It Your Way", "Never Too Late", "Until You Try!")
            val build2 = AlertDialog.Builder(this)
            build2.setTitle("What is the company motto of Burger King?")
            lateinit var Yourans: String
            build2.setSingleChoiceItems(choices, -1, DialogInterface.OnClickListener{ dialog, a->
//                Toast.makeText()
                Yourans = choices[a]
            })
            build2.setPositiveButton("Submit", DialogInterface.OnClickListener{ dialog, w->
                if(Yourans==choices[0]){
                    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this, "Try again", Toast.LENGTH_SHORT).show()
                }
            })
            build2.setNegativeButton("Cancel", DialogInterface.OnClickListener{ which, o->
//
            })
            build2.show()
        }

        binding.txt17.setOnClickListener {
            val choices = arrayOf("Calvin Coolidge", "Norman Mailer", "Albert Phillips")
            val build2 = AlertDialog.Builder(this)
            build2.setTitle("Who wrote the famous book The Executioner’s Song?")
            lateinit var Yourans: String
            build2.setSingleChoiceItems(choices, -1, DialogInterface.OnClickListener{ dialog, a->
//                Toast.makeText()
                Yourans = choices[a]
            })
            build2.setPositiveButton("Submit", DialogInterface.OnClickListener{ dialog, w->
                if(Yourans==choices[1]){
                    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this, "Try again", Toast.LENGTH_SHORT).show()
                }
            })
            build2.setNegativeButton("Cancel", DialogInterface.OnClickListener{ which, o->
//
            })
            build2.show()
        }

        binding.txt18.setOnClickListener {
            val choices = arrayOf("Rome", "Italy", "Greece")
            val build2 = AlertDialog.Builder(this)
            build2.setTitle("Which is called City of the Seven Hills?")
            lateinit var Yourans: String
            build2.setSingleChoiceItems(choices, -1, DialogInterface.OnClickListener{ dialog, a->
//                Toast.makeText()
                Yourans = choices[a]
            })
            build2.setPositiveButton("Submit", DialogInterface.OnClickListener{ dialog, w->
                if(Yourans==choices[0]){
                    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this, "Try again", Toast.LENGTH_SHORT).show()
                }
            })
            build2.setNegativeButton("Cancel", DialogInterface.OnClickListener{ which, o->
//
            })
            build2.show()
        }

        binding.txt19.setOnClickListener {
            val choices = arrayOf("North Atlantic Sea", "Bay of Bengal", "Sargasso Sea")
            val build2 = AlertDialog.Builder(this)
            build2.setTitle("What is the only sea on earth with no coastline?")
            lateinit var Yourans: String
            build2.setSingleChoiceItems(choices, -1, DialogInterface.OnClickListener{ dialog, a->
//                Toast.makeText()
                Yourans = choices[a]
            })
            build2.setPositiveButton("Submit", DialogInterface.OnClickListener{ dialog, w->
                if(Yourans==choices[2]){
                    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this, "Try again", Toast.LENGTH_SHORT).show()
                }
            })
            build2.setNegativeButton("Cancel", DialogInterface.OnClickListener{ which, o->
//
            })
            build2.show()
        }

        binding.txt20.setOnClickListener {
            val choices = arrayOf("Astatine", "Cesium", "Radon")
            val build2 = AlertDialog.Builder(this)
            build2.setTitle("Which is the rarest element on Earth/Universe")
            lateinit var Yourans: String
            build2.setSingleChoiceItems(choices, -1, DialogInterface.OnClickListener{ dialog, a->
//                Toast.makeText()
                Yourans = choices[a]
            })
            build2.setPositiveButton("Submit", DialogInterface.OnClickListener{ dialog, w->
                if(Yourans==choices[0]){
                    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this, "Try again", Toast.LENGTH_SHORT).show()
                }
            })
            build2.setNegativeButton("Cancel", DialogInterface.OnClickListener{ which, o->
//
            })
            build2.show()
        }
    }
}