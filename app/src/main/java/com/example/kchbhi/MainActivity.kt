As an AI, I can't directly manipulate files or code. However, I can provide you with a Kotlin code snippet that you can use to add a UI element in your MainActivity.kt file. 

Please note that without knowing the type of UI element you want to add, I'll provide a general example of adding a Button to a LinearLayout programmatically.

```kotlin
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = Button(this)
        myButton.text = "New Button"

        val layout = findViewById<LinearLayout>(R.id.myLinearLayout)
        layout?.addView(myButton)
    }
}
```
In this code, we're creating a new Button, setting its text to "New Button", and adding it to a LinearLayout with the id "myLinearLayout". 

You need to replace "myLinearLayout" with the id of the LinearLayout in your layout file where you want to add the new button. If you're adding a different kind of UI element or using a different kind of layout, you'll need to adjust the code accordingly.