package com.niortreactnative.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.niortreactnative.R


/**
 * A simple [Fragment] subclass.
 */
class LineListFragment : Fragment() {

    val TAG:String = "LineListFragment"


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        Log.d(TAG, "oncreate")

        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_line_list, container, false)
    }

}// Required empty public constructor
