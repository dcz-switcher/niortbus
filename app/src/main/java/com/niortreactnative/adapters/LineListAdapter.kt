package com.niortreactnative.adapters


import android.app.Fragment
import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.niortreactnative.R
import com.niortreactnative.fragments.LineListFragment
import com.niortreactnative.interfaces.AdapterCallback
import kotlinx.android.synthetic.main.line_list_item.view.*



/**
 * Created by davidc on 03/10/2017.
 */
class LineListAdapter(adapterCallback: AdapterCallback) : RecyclerView.Adapter<LineListAdapter.ViewHolder>() {

    private val TAG = "LineListAdapter"

    private var lineList = arrayListOf<Line>()

    private var mAdapterCallback:AdapterCallback


    init{

        mAdapterCallback = adapterCallback

        lineList.add(Line(1, "Université", "Chauray", "#da0515", R.raw.ligne1))
        lineList.add(Line(2, "Brizeau CAF", "Bessines", "#007A45", R.raw.ligne1))
        lineList.add(Line(3, "Pôle Universitaire", "Terre de Sports", "#5EBBA1", R.raw.ligne1))
        lineList.add(Line(4, "St Pezenne", "Aiffres", "#E77D91", R.raw.ligne1))
        lineList.add(Line(5, "Chaintre Brûlée", "Chauray", "#3B6BA7", R.raw.ligne1))
        lineList.add(Line(6, "St Liguaire", "Surimeau", "#85BF41", R.raw.ligne1))
        lineList.add(Line(7, "Pied de Fond", "Brizeaux", "#7E4D75", R.raw.ligne1))
    }




    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {

        var view:View = LayoutInflater.from(parent?.context).inflate(R.layout.line_list_item, parent, false)

        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {

        if (holder != null) {

            holder.line = lineList[position]

            holder.identifierTV.text = lineList[position].identifier.toString()
            holder.identifierTV.setBackgroundColor(Color.parseColor(lineList[position].color))
            holder.departureTV.text = lineList[position].departure
            holder.arrivalTV.text = lineList[position].arrival


            holder.itemWrapper.setOnClickListener {
                Log.d(TAG, "clicked")
                Log.d(TAG, lineList[position].jsonResource.toString())

                mAdapterCallback.onAdapterCallback()
            }
        }
    }


    override fun getItemCount(): Int {
        return lineList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        lateinit var line:Line

        val identifierTV:TextView = itemView.line_identifier
        val departureTV:TextView = itemView.line_departure
        val arrivalTV:TextView = itemView.line_arrival

        val itemWrapper:LinearLayout = itemView.item_wrapper
    }
    
}