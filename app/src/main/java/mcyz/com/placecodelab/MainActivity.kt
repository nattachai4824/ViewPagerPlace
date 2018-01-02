package mcyz.com.placecodelab

import android.os.Bundle
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        appTab.addTab(appTab.newTab().setText("PLACE"))
        appTab.addTab(appTab.newTab().setText("LIST"))

        vpContainer.adapter = object : FragmentStatePagerAdapter(supportFragmentManager){
            override fun getItem(position: Int) = when(position){
                0 -> PlaceFragment()
                else -> PlaceFragment()
            }

            override fun getCount() = 2

            override fun getPageTitle(position: Int) = when(position){
                0 -> "PLACE"
                else -> "LIST"
            }
        }

        appTab.setupWithViewPager(vpContainer)
    }
}
