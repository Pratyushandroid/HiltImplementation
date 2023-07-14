package com.example.hiltimplementation

import android.util.Log
import androidx.fragment.app.Fragment
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Singleton

const val TAG = "Pratyush Pandey"

interface UserRepository {
    fun saveUser(email:String ,password:String)
}
class SQLRepositopry @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d("PP", "saveUser: Save in SQL ")
    }

}

class FireBaseRepository :UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d("PP", "saveUser:  Save In FireBase")
    }

}