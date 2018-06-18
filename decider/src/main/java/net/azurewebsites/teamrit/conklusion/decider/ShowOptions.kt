package net.azurewebsites.teamrit.conklusion.decider;

import android.app.Activity
import android.arch.lifecycle.ViewModel;
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView
import net.azurewebsites.teamrit.conklusion.decider.R.id.optionsButton

import java.util.List;

class ShowOptions : AppCompactActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.show_options)
        optionsButton.setOnClickListener { view ->
            Snackbar.make(view, "You are cute", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }
}
