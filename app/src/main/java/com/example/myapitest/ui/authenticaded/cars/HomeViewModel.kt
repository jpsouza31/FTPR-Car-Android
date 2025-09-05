package com.example.myapitest.ui.authenticaded.cars

import androidx.lifecycle.ViewModel
import com.example.myapitest.network.FirebaseService

class HomeViewModel : ViewModel() {
    fun logout() {
        try {
            FirebaseService.signOut()
        } catch (e: Exception) {

        }
    }
}