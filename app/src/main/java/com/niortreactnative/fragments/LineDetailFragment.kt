package com.niortreactnative.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

import com.niortreactnative.R
import com.niortreactnative.adapters.Stop
import com.niortreactnative.adapters.StopListAdapter
import kotlinx.android.synthetic.main.fragment_line_detail.*
import java.util.*


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
        stops.add(Stop("Pôle Universitaire", arrayOf("06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00")))
        stops.add(Stop("Pôle Atlantique", arrayOf("06:00", "07:00", "08:00")))
        stops.add(Stop("Brêche quai B", arrayOf("06:00", "07:00", "08:00")))

        stop_list.layoutManager = LinearLayoutManager(context)
        stop_list.adapter = StopListAdapter(stops)

        // load period spinner
        var periodArray = arrayOf("lundi > vendredi", "samedi", "dimanche")

        var periodAdapter = ArrayAdapter<String>(this.context, android.R.layout.simple_spinner_item, periodArray)
        periodAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        period_selector.adapter = periodAdapter

    }


}// Required empty public constructor
