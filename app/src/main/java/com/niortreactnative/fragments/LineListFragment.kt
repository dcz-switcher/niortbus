package com.niortreactnative.fragments


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


import com.niortreactnative.R
import com.niortreactnative.adapters.Line
import com.niortreactnative.adapters.LineListAdapter
import com.niortreactnative.interfaces.AdapterCallback
import kotlinx.android.synthetic.main.fragment_line_list.*




/**
 * A simple [Fragment] subclass.
 */
class LineListFragment : Fragment(), AdapterCallback{

    private val TAG = "LineListFragment"

    private lateinit var _view:View

    lateinit var mCallback:OnLineSelectedListener


    interface OnLineSelectedListener {
        fun onLineSelected(line:Line)
    }


    override fun onAttach(context: Context?) {
        super.onAttach(context)

        if (context !is OnLineSelectedListener) {
            Log.e(TAG, "Failed cast :-(")
            throw ClassCastException(context.toString() + " must implement OnLineSelecteeListener")
        } else {
            mCallback = context
        }
    }

    override fun onAdapterCallback(line:Line) {
        mCallback.onLineSelected(line)
    }

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
        line_list.layoutManager = LinearLayoutManager(context)
        line_list.adapter = LineListAdapter(this)
    }


    private fun addListeners() {

    }



}// Required empty public constructor
