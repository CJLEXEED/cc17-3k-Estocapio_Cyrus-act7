package com.example.mycityapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mycityapp.R
import com.example.mycityapp.model.Recommendation

class RecommendationViewModel : ViewModel() {
    private val _recommendations = MutableLiveData<List<Recommendation>>()
    val recommendations: LiveData<List<Recommendation>> get() = _recommendations

    init {
        loadRecommendations()
    }

    private fun loadRecommendations() {
        _recommendations.value = listOf(
            Recommendation(1, "Park Visit", "A relaxing park with beautiful scenery", R.drawable.park),
            Recommendation(2, "Museum", "Explore the history of the city", R.drawable.museum),
            Recommendation(3, "Restaurant", "Enjoy fine dining and local cuisine", R.drawable.restaurant)
        )
    }
}
