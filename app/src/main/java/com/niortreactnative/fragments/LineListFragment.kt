package com.niortreactnative.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.SimpleAdapter


import com.niortreactnative.R
import com.niortreactnative.adapters.LineAdapter
import com.niortreactnative.adapters.LineListAdapter
import kotlinx.android.synthetic.main.fragment_line_list.*


/**
 * A simple [Fragment] subclass.
 */
class LineListFragment : Fragment() {

    private val TAG = "LineListFragment"

    private var _view:View? = null

    lateinit private var lineAdapter:LineAdapter


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        _view = inflater!!.inflate(R.layout.fragment_line_list, container, false)

        return _view
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG, "on resume")

        populateLineList()

        addListeners()
    }


    private fun populateLineList (){
        /*
        lineAdapter = LineAdapter(context)

        line_list.adapter = lineAdapter
         */
        line_list.layoutManager = LinearLayoutManager(context)
        line_list.adapter = LineListAdapter()
    }


    private fun addListeners() {

    }



}// Required empty public constructor
