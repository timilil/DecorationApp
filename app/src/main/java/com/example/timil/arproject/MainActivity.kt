package com.example.timil.arproject

import android.app.Activity
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.TextView
import com.example.timil.arproject.R.id.btn
import com.google.ar.sceneform.ux.ArFragment


class MainActivity : FragmentActivity(), FirstFragment.FragmentOneListener {

    private var arFragment: AugmentedFragment? = null
    private var firstFragment: FirstFragment? = null

    override fun onButtonClick(name: String) {

        val bundle = Bundle()
        bundle.putString("name", name)
        arFragment!!.putArguments(bundle)

        supportFragmentManager.beginTransaction().hide(firstFragment!!).commit();
        supportFragmentManager.beginTransaction().show(arFragment!!).commit()

        val btn = findViewById(R.id.btn) as Button
        btn.setVisibility(View.VISIBLE)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        arFragment = AugmentedFragment()
        supportFragmentManager.beginTransaction().add(R.id.fragment_container, arFragment!!, "augmentedFragment").commit()

        firstFragment = FirstFragment()
        supportFragmentManager.beginTransaction().add(R.id.fragment_container, firstFragment!!, "firstFragment").commit()

        supportFragmentManager.beginTransaction().hide(arFragment!!).commit()
        supportFragmentManager.beginTransaction().show(firstFragment!!).commit()

        val btn = findViewById(R.id.btn) as Button
        btn.setOnClickListener{
            view ->
                supportFragmentManager.beginTransaction().hide(arFragment!!).commit()
                supportFragmentManager.beginTransaction().show(firstFragment!!).commit()
                val btn = findViewById(R.id.btn) as Button
                btn.setVisibility(View.GONE)
        }
        btn.setVisibility(View.GONE);
    }

}


