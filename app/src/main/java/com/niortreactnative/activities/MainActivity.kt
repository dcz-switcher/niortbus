package com.niortreactnative.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.niortreactnative.R
import com.niortreactnative.fragments.LineDetailFragment
import com.niortreactnative.fragments.LineListFragment

class MainActivity : AppCompatActivity() {

    private val TAG_LINELIST_FRAGMENT = "tag_linelist_fragment"
    private val TAG_LINEDETAIL_FRAGMENT = "tag_linedetail_fragment"

    private var lineListFragment:LineListFragment? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lineListFragment = supportFragmentManager.findFragmentByTag(TAG_LINELIST_FRAGMENT) as? LineListFragment

        if (lineListFragment == null) {
            lineListFragment = LineListFragment()

            supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_stack, lineListFragment, TAG_LINELIST_FRAGMENT)
                    .commit()
        }

        //todo manager navigation between views
        supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_stack, LineDetailFragment(), TAG_LINEDETAIL_FRAGMENT)
                .commit()
    }
}
