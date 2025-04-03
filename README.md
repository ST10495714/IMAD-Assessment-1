1.	The Purpose of The App
The purpose of the app is to be able to indulge yourself by being able to get a proper meal for yourself at different times of the day and at calories and different parts of the world.
Let’s say you’re coming from work, and it is during the afternoon, and you do not know what to eat. You can open our app and choose what meal and what recipes you want to cook or the foods you want to eat so that you can order them on your different restaurants of your own liking.
You can also indulge yourself on dietary meals if you are on a strict diet and when you want loose some calories and eat less of them, whether you are going to the gym or just on a strict diet. You can also enjoy different meals of different places in different cultures .
This app can provide you with meals for six times off the day (Morning, Mid-morning, Afternoon, Mid-afternoon, Dinner and After-Dinner). This can show you when and what to eat whenever you do not know what to eat.
 
2. Design Considerations
SIMPLICITY: This is a core principle that focuses on intuitive navigation, clear visuals and functionality. The key features of simplicity are “User Navigation” this focuses on functionalities like searching for meals, using straight forward languages for menu items, buttons and instructions and most importantly easy-to-understand icons. I used this consideration to design my app by adding a visible search view and used two buttons , one to show the meals after searching a specific time and one to reset everything so that you can search again. I used a text view to implicate instructions for the user to be aware of to do.
CONSISTENCY: This is a paramount in designing this app so that the app can be successful. It fosters trust, usability and reinforces brand identity. Consistency matters because it showcases usability such as that elements behave and that users can predict the outcome and be able to navigate the app. Stronger brand identity meaning that it shows visual elements such as typography. I used this so that everything does not change but stays consistent. I also added a Toast in case of a typography meaning that if the users search an invalid time of day, they will be given a massage telling them they inserted an invalid time of day.
READABILITY: This is a critical factor in the success of any app especially in a meal app. This may mean you will need to consider a key element of typography meaning the following: font choices, font sizes, line height and spacing, colour and contrast. Some may include layout organization and image readability. For this consideration I used an English language that mostly everyone understands and then used big font for the naming of my app, I then used an image to showcase what the app is specifically about. I also increased the font for the search view and for what will be displayed after searching for clear readability.
FEEDBACK: This is essential for designing a meaningful meal app. This will help to understand the user’s needs, identity and iterate on the design to create a more user-friendly experience. User feedback this means direct feedback from users through surveys, interviews and usability testing. Analytics this means data and behaviour, such as app usage. You can get feedback by having user feedback through surveys and questionnaires and in-App Feedback forms.
PLACEMENT:  This is very important because it focuses on how you place elements. Navigation of the bottom and top bar and the floating action bars. It should include recipe display and details, searching like bars and filter options and settings. I used importantly this as I input two buttons right down the layout of the app and then added a search view right at the middle so that I can be easy for one hand users to be able to be comfortable while using the app.

3. App Design 
The name of the app is Plan Platter and basically this is a meal planning that will give you meal suggestions on different times of the day. This will happen when you use the search view and type in the time of the day then click on the “Show Meals” button then your meals will appear, then when you want to search another meal for a different type of day you will click the “Reset” button the everything will clear off and you will repeat the process.  
This will show you what the app is genuinely about.
MORNING: Generally, the first part of the day between dawn and noon, the time when “breakfast” is taken.
Meals : 
•	Eggs, Bacon and Toast (Pancakes) 
•	Oatmeal (Blueberry or Strawberry)


Time anticipated is (2am-5:59am)

MID-MORNING: The period that falls roughly in the middle of the morning, the time when a “Snack” is taken.
Meals : 
•	Fruit Bowl (Grapes and Peaches etc)
•	Smoothie (Flavour of your own choice)
•	Trail Mix 
Time anticipated is (6am-11:59am)

AFTERNOON: Generally considered the time between midday and evening, the time when “Lunch” is taken.
Meals : 
•	Greek Tuna Sandwich
•	Vegan Avocado Sandwich
•	Chicken and Mayo Sandwich
•	Healthy Vegetable Salad 
Time anticipated is (12:30pm-03:59pm)

MID-AFTERNOON: Essentially referred to as the period that roughly falls in the middle of the afternoon hours, also referred to as a “Snack”
Meals : 
•	Yogurt (Flavour of your own choice)
•	Protein Shakes (Flavour of your own choice)
•	Vegetable and Humus
Time anticipated is (4pm-5:59pm)

DINNER: Falls within the evening period. This the time of the day that follows the afternoon and the precedes night.
Meals : 
•	Rice and Curry (Meat of choice)
•	Meatballs and Spaghetti
•	Toasted Stir fry salad
•	Fish and Chips
Time anticipated is (6pm-8:59pm)

AFTER-DINNER: This period transitions from the evening to the night and essentially overlaps midnight.
Meals : 
•	Warm Beverages 
•	Ice Cream desert
•	Fruits 
•	Wine
Time anticipated is (9pm-11:59pm)
 
 
 4 and 5 (Git hub and YouTube links)

Git hub link : https://github.com/ST10495714/IMAD-Assessment-1.git

YouTube : https://youtu.be/LIADXAZ4qG0?si=8bMRZ07V5NU33T2y


 
6. App Code
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

 
7.REFERENCE LIST
 
 MyFoodDiary.com (n.d.) MyFoodDiary.com. Available at: www.myfooddiary.com (Accessed: [08/03/2025]).
 
 Food Network (n.d.) Food Network. Available at: www.foodnetwork.com (Accessed: [[08/03/2025]).

The Peach Kitchen (n.d.) The Peach Kitchen. Available at: www.thepeachkitchen.com (Accessed: [[08/03/2025]).

Pinterest (n.d.) Pinterest. Available at: www.pinterest.com.au (Accessed: [[08/03/2025]).

Wikipedia (n.d.) Wikipedia. Available at: www.wikipedia.com (Accessed: [[08/03/2025]).

Eat What We Eat (n.d.) Eat What We Eat. Available at: www.eatwhatweeat.com (Accessed: [08/03/2025]).

 Harvard Health (n.d.) Harvard Health. Available at: www.health.harvard.edu (Accessed: [[08/03/2025]).
 
 Fit&Well (n.d.) Fit&Well. Available at: www.fitandwell.com (Accessed: [[08/03/2025]).


[IMAD5112 Assigment 1.docx](https://github.com/user-attachments/files/19578145/IMAD5112.Assigment.1.docx)

