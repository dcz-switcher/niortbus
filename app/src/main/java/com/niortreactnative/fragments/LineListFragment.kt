package com.niortreactnative.fragments


import android.app.Activity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout

import com.niortreactnative.R
import kotlinx.android.synthetic.main.fragment_line_list.*


/**
 * A simple [Fragment] subclass.
 */
class LineListFragment : Fragment() {

    val TAG:String = "LineListFragment"

    var _view:View? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        _view = inflater!!.inflate(R.layout.fragment_line_list, container, false)

        return _view
    }

    override fun onResume() {
        super.onResume()

        addListeners()
    }


    fun addListeners() {
        this.line_1.setOnClickListener ({view ->
            Log.d(TAG, ": click :-)")
        })
    }



}// Required empty public constructor
