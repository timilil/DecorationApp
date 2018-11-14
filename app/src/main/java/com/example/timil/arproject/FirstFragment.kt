package com.example.timil.arproject

//import android.app.ListFragment
import android.support.v4.app.ListFragment
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class FirstFragment: ListFragment() {

    private var activityCallBack: FragmentOneListener? = null

    interface FragmentOneListener {
        fun onButtonClick(position: String)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        activityCallBack = context as FragmentOneListener
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val adapter = FurnitureListAdapter(activity, GlobalModel.furnitures)
        listAdapter = adapter

        return inflater?.inflate(R.layout.first_fragment, container, false)
    }

    private inner class FurnitureListAdapter(context: Context?, private val furnitures: MutableList<Furniture>) : BaseAdapter(){

        private val inflater: LayoutInflater = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

            val rowView = inflater.inflate(R.layout.furniture_item, p2, false)
            val thisFurniture = furnitures[p0]

            var iv = rowView.findViewById(R.id.image) as ImageView
            iv.setImageDrawable(getResources().getDrawable(thisFurniture.image));

            var tv = rowView.findViewById(R.id.text1) as TextView
            tv.text = thisFurniture.name
            tv = rowView.findViewById(R.id.text2) as TextView
            tv.text = thisFurniture.desription

            rowView.setOnClickListener(View.OnClickListener { activityCallBack!!.onButtonClick(thisFurniture.sfbName) })

            return rowView;
        }

        override fun getItem(p0: Int): Any {
            return furnitures[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getCount(): Int {
            return furnitures.size
        }
    }

}