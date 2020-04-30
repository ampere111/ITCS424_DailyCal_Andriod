package com.example.dailycarl.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.dailycarl.R

class AddChoiceActivity : Fragment() {

    companion object {
        fun newInstance(): Fragment {
            return AddChoiceActivity()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_addchoice, container, false)
        val intent = Intent(activity, EatAndExActivity::class.java)
        val addEatBtn = view.findViewById<TextView>(R.id.add_eat_act_btn)
        val addExBtn = view.findViewById<TextView>(R.id.add_not_food_act)
        addEatBtn.setOnClickListener {
            intent.putExtra("activityType", "eat")
            activity?.startActivity(intent);
        }
        addExBtn.setOnClickListener {
            intent.putExtra("activityType", "ex")
            activity?.startActivity(intent);
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}