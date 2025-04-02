package vcmsa.ci.plan_platter
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.AppNametextview)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
            // initialize UI elements
            val timeOfDayEditText: EditText = findViewById(R.id.searchtextview)
            val showMealButton: Button = findViewById(R.id.btnShowMeals)
            val resetButton: Button = findViewById(R.id.btnReset)
            val mealSuggestionsTextView: TextView = findViewById(R.id.showmealtextview)
            // Show meals Suggestions when button is clicked
            showMealButton.setOnClickListener{
                val timeOfDay = timeOfDayEditText.text.toString().trim()
                if (timeOfDay.isEmpty()) {
                    //Show a Toast if no time of day is entered
                    Toast.makeText(this,"Please enter a time of day", Toast.LENGTH_SHORT).show()
                } else {
                    //Display meal suggestions based on the time of day
                    val mealSuggestions = when (timeOfDay.lowercase()) {
                        "morning" -> {
                            "Breakfast: Eggs,bacon and Pancakes\nStrawberry Oatmeal"
                        }
                        "mid-morning" -> {
                            "Snack: Fruit Bowl\nSmoothie"
                        }
                        "afternoon" -> {
                            "Lunch: Greek Tuna Sandwich\nVegetable Salad"
                        }
                        "mid-afternoon" -> {
                            "Snack: Yoghurt\nProtein Shake"
                        }
                        "dinner" -> {
                            "Dinner: Rice and Curry\nMeatballs and Spaghetti"
                        }
                        "after Dinner" -> {
                            "Desert: Ice Cream\nWine"
                        }
                        else->{
                            "invalid time of day.Please enter a valid time of the day"
                        }
                    }
                    //Show the meal suggestions in the TextView
                    mealSuggestionsTextView.text = mealSuggestions
                }
            }
            //Reset the input and suggestions when the reset button is clicked
            resetButton.setOnClickListener {
                timeOfDayEditText.text.clear()
                mealSuggestionsTextView.text =""
            }
        }
    }