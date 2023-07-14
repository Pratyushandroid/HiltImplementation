package com.example.hiltimplementation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class BlankFragment : Fragment() {
    @Inject
   @FragmentAnnonation
    lateinit var  userRepository: UserRepository
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        userRepository.saveUser("AS@gmail.com","4125634")
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }
}