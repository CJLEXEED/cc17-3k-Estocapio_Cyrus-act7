package com.example.mycityapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.mycityapp.R
import com.example.mycityapp.viewmodel.RecommendationViewModel
import kotlinx.android.synthetic.main.fragment_recommendation_detail.*

class RecommendationDetailFragment : Fragment() {

    private val viewModel: RecommendationViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_recommendation_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recommendationId = arguments?.getInt("recommendationId")
        val recommendation = viewModel.recommendations.value?.find { it.id == recommendationId }

        recommendation?.let {
            detail_title.text = it.title
            detail_description.text = it.description
            detail_image.setImageResource(it.imageResId)
        }
    }
}
