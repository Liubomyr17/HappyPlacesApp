package com.happyplaces

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

// TODO(Step 6 : Add an activity for Add Happy Place.)
// START
class AddHappyPlaceActivity : AppCompatActivity() {

    /**
     * This function is auto created by Android when the Activity Class is created.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        //This call the parent constructor
        super.onCreate(savedInstanceState)

        // This is used to align the xml view to this class
        setContentView(R.layout.activity_add_happy_place)
    }
}
// END