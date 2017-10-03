package com.niortreactnative.adapters


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.TextView
import com.niortreactnative.R


/**
 * Created by davidc on 02/10/2017.
 */
class LineAdapter(context:Context) : BaseAdapter() {


    private var list = arrayOf("Niort", "Grenoble", "St Pierre Oléron")
    private var lineList = arrayListOf<Line>()


    private val myInflator:LayoutInflater


    init{
        myInflator = LayoutInflater.from(context)

        lineList.add(Line(1, "Université", "Chauray"))
        lineList.add(Line(2, "Brizeau CAF", "Bessines"))
        lineList.add(Line(3, "Pôle Universitaire", "Terre de Sports"))
        lineList.add(Line(4, "St Pezenne", "Aiffres"))
        lineList.add(Line(5, "Chaintre Brûlée", "Chauray"))
        lineList.add(Line(6, "St Liguaire", "Surimeau"))
        lineList.add(Line(7, "Pied de Fond", "Brizeaux"))
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var view:View

        if (convertView == null) {
            view = myInflator.inflate(R.layout.line_list_item, parent, false)
        } else {
            view = convertView
        }


        var departure = view.findViewById(R.id.line_departure) as TextView
        var arrival = view.findViewById(R.id.line_arrival) as TextView

        var line = lineList[position]


        //departure.text = list[position]
        departure.text = line.departure
        arrival.text = line.arrival


        return view
    }

    override fun getItem(position: Int): Any {
        return lineList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return lineList.size
    }
}