package mcyz.com.placecodelab

import android.os.Bundle
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Setup two new tabs
        appTab.addTab(appTab.newTab().setText("PLACE"))
        appTab.addTab(appTab.newTab().setText("LIST"))


        // Setup the adapter for the view pager
        vpContainer.adapter = object : FragmentStatePagerAdapter(supportFragmentManager) {
            override fun getItem(position: Int) = when (position) {
            // Return the fragment corresponding to the page position
                0 -> PlaceFragment()
                else -> PlaceFragment()
            }

            // Return the number of existing pages
            override fun getCount() = 2

            // Return the title of the tab corresponding to the page position
            override fun getPageTitle(position: Int) = when (position) {
                0 -> "PLACE"
                else -> "LIST"
            }
        }

        // Bind the tab with view pager
        appTab.setupWithViewPager(vpContainer)
    }
}
