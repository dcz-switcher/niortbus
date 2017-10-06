package com.niortreactnative.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.niortreactnative.R
import com.niortreactnative.adapters.Stop
import com.niortreactnative.adapters.StopListAdapter
import kotlinx.android.synthetic.main.fragment_line_detail.*


/**
 * A simple [Fragment] subclass.
 */
class LineDetailFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_line_detail, container, false)
    }

    override fun onResume() {
        super.onResume()

        var stops = arrayListOf<Stop>()
        stops.add(Stop("Pôle Universitaire", arrayOf("06:00", "07:00", "08:00")))
        stops.add(Stop("Pôle Atlantique", arrayOf("06:00", "07:00", "08:00")))
        stops.add(Stop("Brêche quai B", arrayOf("06:00", "07:00", "08:00")))

        stop_list.layoutManager = LinearLayoutManager(context)
        stop_list.adapter = StopListAdapter(stops)
    }


}// Required empty public constructor
