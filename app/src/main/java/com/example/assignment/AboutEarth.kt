package com.example.assignment

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.assignment.databinding.ActivityAboutEarthBinding
import com.example.assignment.databinding.ActivityProgrammingBinding

class AboutEarth : AppCompatActivity() {

    lateinit var binding : ActivityAboutEarthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.hide()
        binding = ActivityAboutEarthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn3.setOnClickListener{
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


        binding.txt11.setOnClickListener {
            val choices = arrayOf("30,000 Km", "35,000 Km", "40,000 Km")
            val build2 = AlertDialog.Builder(this)
            build2.setTitle("What is the approximate equatorial circumference of the earth?")
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


        binding.txt12.setOnClickListener {
            val choices = arrayOf("3200 Km", "6400 Km", "9600 Km")
            val build2 = AlertDialog.Builder(this)
            build2.setTitle("The mean radius of the earth is approximately")
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


        binding.txt13.setOnClickListener {
            val choices = arrayOf("47%", "51%", "66%")
            val build2 = AlertDialog.Builder(this)
            build2.setTitle("What percentage of insolation is received by the earth’s surface?")
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


        binding.txt14.setOnClickListener {
            val choices = arrayOf("5.52", "4.50", "5.52")
            val build2 = AlertDialog.Builder(this)
            build2.setTitle("The specific gravity of the earth as a whole is: ")
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


        binding.txt15.setOnClickListener {
            val choices = arrayOf("Equator", "Poles", "Tropic of Cnacer")
            val build2 = AlertDialog.Builder(this)
            build2.setTitle("Equinox occurs when the sun is vertically above")
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

    }
}