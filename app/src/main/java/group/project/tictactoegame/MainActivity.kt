package group.project.tictactoegame

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import group.project.tictactoegame.ui.theme.TicTacToeGameTheme

class MainActivity : ComponentActivity() {
    var flag = 0
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun check(view: View){
        val btnCurrent = view as Button
        if(btnCurrent.text == ""){
            count++
            if(flag == 0){
                btnCurrent.text = "X"
                flag = 1
                findViewById<TextView>(R.id.tvTurn).text = "Turn O"
            }else{
                btnCurrent.text = "o"
                flag = 0
                findViewById<TextView>(R.id.tvTurn).text = "Turn X"
            }

            // GET THE VALUE OF ALL BUTTONS
            val b1 = findViewById<Button>(R.id.btn1).text.toString()
            val b2 = findViewById<Button>(R.id.btn2).text.toString()
            val b3 = findViewById<Button>(R.id.btn3).text.toString()
            val b4 = findViewById<Button>(R.id.btn4).text.toString()
            val b5 = findViewById<Button>(R.id.btn5).text.toString()
            val b6 = findViewById<Button>(R.id.btn6).text.toString()
            val b7 = findViewById<Button>(R.id.btn7).text.toString()
            val b8 = findViewById<Button>(R.id.btn8).text.toString()
            val b9 = findViewById<Button>(R.id.btn9).text.toString()

            if(b1 == b2 && b2==b3 && b3 !==""){
                Toast.makeText(this@MainActivity, "Winner is: $b1", Toast.LENGTH_LONG).show()
                newGame()
            }else if(b4 == b5 && b5==b6 && b6 !==""){
                Toast.makeText(this@MainActivity, "Winner is: $b4", Toast.LENGTH_LONG).show()
                newGame()
            }else if(b7 == b8 && b8==b9 && b9 !==""){
                Toast.makeText(this@MainActivity, "Winner is: $b7", Toast.LENGTH_LONG).show()
                newGame()
            }else if(b1 == b4 && b4==b7 && b7 !==""){
                Toast.makeText(this@MainActivity, "Winner is: $b1", Toast.LENGTH_LONG).show()
                newGame()
            }else if(b2 == b5 && b5==b8 && b8 !==""){
                Toast.makeText(this@MainActivity, "Winner is: $b2", Toast.LENGTH_LONG).show()
                newGame()
            }else if(b3 == b6 && b6==b9 && b9 !==""){
                Toast.makeText(this@MainActivity, "Winner is: $b3", Toast.LENGTH_LONG).show()
                newGame()
            }else if(b1 == b5 && b5==b9 && b9 !==""){
                Toast.makeText(this@MainActivity, "Winner is: $b1", Toast.LENGTH_LONG).show()
                newGame()
            }else if(b3 == b5 && b5==b7 && b7 !==""){
                Toast.makeText(this@MainActivity, "Winner is: $b3", Toast.LENGTH_LONG).show()
                newGame()
            }else if(count==9){
                Toast.makeText(this@MainActivity, "Match is Draw", Toast.LENGTH_LONG).show()
                newGame()
            }
        }else{
            Toast.makeText(this@MainActivity, "Please Select a Empty box", Toast.LENGTH_LONG).show()
        }
    }

    fun newGame(){
        findViewById<Button>(R.id.btn1).text = ""
        findViewById<Button>(R.id.btn2).text = ""
        findViewById<Button>(R.id.btn3).text = ""
        findViewById<Button>(R.id.btn4).text = ""
        findViewById<Button>(R.id.btn5).text = ""
        findViewById<Button>(R.id.btn6).text = ""
        findViewById<Button>(R.id.btn7).text = ""
        findViewById<Button>(R.id.btn8).text = ""
        findViewById<Button>(R.id.btn9).text = ""
        flag = 0
        count = 0
    }
}
