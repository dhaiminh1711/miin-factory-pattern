package miin.learning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import miin.learning.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val hardCandy = CandyFactory.getCandy(CandyType.HARD) as HardCandy
        val mintCandy = CandyFactory.getCandy(CandyType.MINT) as MintCandy

        Toast.makeText(this, "Hard candy: ${hardCandy.getCandyName()}\nMint candy: ${mintCandy.getCandyName()}", Toast.LENGTH_SHORT).show()
    }
}
