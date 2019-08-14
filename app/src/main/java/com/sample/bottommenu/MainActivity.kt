package com.sample.bottommenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_base.recyclerview
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
        val myDataset = arrayListOf<String>("test1","test2","test3","test4","test5","test6","test7","test8","test9","test10","test11","test12","test13","test14","test1","test2","test3","test4","test5","test6","test7","test8","test9","test10","test11","test12","test13","test14")
        val listAdapter = MyAdapter(myDataset)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.setHasFixedSize(true)
        recyclerview.adapter = listAdapter
    }


    class MyAdapter(private val myDataset: ArrayList<String>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

        class MyViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

        override fun onCreateViewHolder(parent: ViewGroup,
                                        viewType: Int): MyViewHolder {
            val textView = LayoutInflater.from(parent.context)
                .inflate(R.layout.my_text_view, parent, false) as TextView
            return MyViewHolder(textView)
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            holder.textView.text = myDataset[position]
        }

        override fun getItemCount() = myDataset.size
    }
}
