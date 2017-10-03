package com.niortreactnative.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.SimpleAdapter


import com.niortreactnative.R
import com.niortreactnative.adapters.LineAdapter
import kotlinx.android.synthetic.main.fragment_line_list.*


/**
 * A simple [Fragment] subclass.
 */
class LineListFragment : Fragment() {

    private val TAG = "LineListFragment"

    private var _view:View? = null

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
        var lineAdapter = LineAdapter(context)

        line_list.adapter = lineAdapter
    }


    private fun addListeners() {
        /*
        this.line_1.setOnClickListener ({view ->
            Log.d(TAG, ": click :-)")
        })
         */
    }



}// Required empty public constructor
