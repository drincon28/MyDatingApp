package com.uan.mydatingapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.uan.mydatingapp.R
import androidx.lifecycle.ViewModelProvider

class ProfileOverviewFragment : Fragment() {

    private lateinit var loginViewModel: ProfileOverViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vmp = ViewModelProvider(this)
        loginViewModel = vmp.get(ProfileOverViewModel::class.java)
        val root = inflater.inflate(R.layout.activity_profile_rating, container, false)
        /*
        val textView: TextView = root.findViewById(R.id.text_login)

        loginViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        */
        return root
    }
}