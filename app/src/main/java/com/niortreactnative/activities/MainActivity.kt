package com.niortreactnative.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.niortreactnative.R
import com.niortreactnative.adapters.Line
import com.niortreactnative.fragments.LineDetailFragment
import com.niortreactnative.fragments.LineListFragment

class MainActivity : AppCompatActivity(), LineListFragment.OnLineSelectedListener {

    private val TAG:String = "MainActivity"

    private val TAG_LINELIST_FRAGMENT = "tag_linelist_fragment"
    private val TAG_LINEDETAIL_FRAGMENT = "tag_linedetail_fragment"

    private var lineListFragment:LineListFragment? = null


    override fun onLineSelected(line: Line){
        Log.d(TAG, "hey ! it works dude")
        Log.d(TAG, "line departure is " + line.departure)

        supportFragmentManager.beginTransaction()
                .add(R.id.fragment_stack, LineDetailFragment(), TAG_LINEDETAIL_FRAGMENT)
                .addToBackStack(TAG_LINEDETAIL_FRAGMENT)
                .commit()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "on create")
        setContentView(R.layout.activity_main)

        lineListFragment = supportFragmentManager.findFragmentByTag(TAG_LINELIST_FRAGMENT) as? LineListFragment

        if (lineListFragment == null) {
            lineListFragment = LineListFragment()

            supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_stack, lineListFragment, TAG_LINELIST_FRAGMENT)
                    .commit()
        }

        //todo manager navigation between views
        /*
        supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_stack, LineDetailFragment(), TAG_LINEDETAIL_FRAGMENT)
                .commit()
        */
    }


}
