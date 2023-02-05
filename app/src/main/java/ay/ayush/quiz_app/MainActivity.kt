package ay.ayush.quiz_app

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import ay.ayush.quiz_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var currentpostition:Int?=null
    private var ancient:Button?=null
    private var medieval:Button?=null
    private var CA:Button?=null
    private var Polity:Button?=null

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarMain.toolbar)

        binding.appBarMain.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        ancient =findViewById(R.id.Ancient_button)
        medieval=findViewById(R.id.Medieval_Button)
        CA=findViewById(R.id.CA_Button)
        Polity=findViewById(R.id.Polity_Button)


        ancient!!.setOnClickListener{
            startActivity(Intent(this,ancient_swipe_screen_activity::class.java))
        }
        medieval!!.setOnClickListener{

            startActivity(Intent(this,ancient_swipe_screen_activity::class.java))
        }
        CA!!.setOnClickListener{

            startActivity(Intent(this,ancient_swipe_screen_activity::class.java))
        }
        Polity!!.setOnClickListener{

            startActivity(Intent(this,ancient_swipe_screen_activity::class.java))
        }


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }



}