package com.example.assignment

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.assignment.databinding.ActivityAstroPhysicsBinding
import com.example.assignment.databinding.ActivityProgrammingBinding

class AstroPhysics : AppCompatActivity() {

    lateinit var binding : ActivityAstroPhysicsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        supportActionBar?.hide()
        binding = ActivityAstroPhysicsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btn2.setOnClickListener{
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


        binding.txt6.setOnClickListener {
            val choices = arrayOf("3 Years", "11 Years", "26 Years")
            val build2 = AlertDialog.Builder(this)
            build2.setTitle("The sunspot cycle is:")
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


        binding.txt7.setOnClickListener {
            val choices = arrayOf("Spiral", "Elliptical", "Irregular")
            val build2 = AlertDialog.Builder(this)
            build2.setTitle("The Andromeda Galaxy is which of the following types of galaxies?")
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


        binding.txt8.setOnClickListener {
            val choices = arrayOf("Between Two rings of Saturn", "Near Orth's cloud", "Between Earth and Mars")
            val build2 = AlertDialog.Builder(this)
            build2.setTitle("Where is space Cassini's division?")
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


        binding.txt9.setOnClickListener {
            val choices = arrayOf("is strongly blue-shifted", "is strongly red-shifted", "its color suddenly becomes black")
            val build2 = AlertDialog.Builder(this)
            build2.setTitle("If you were watching a star collapsing to form a black hole, the light would disappear because it:")
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


        binding.txt10.setOnClickListener {
            val choices = arrayOf("50%", "1%", "0.001%")
            val build2 = AlertDialog.Builder(this)
            build2.setTitle("What percentage of the Sun's mass has been converted to energy?")
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