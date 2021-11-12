package com.example.recruitment_examination.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.recruitment_examination.R
import com.example.recruitment_examination.databinding.FragmentCalcBinding
import com.example.recruitment_examination.di.Injectable
import com.example.recruitment_examination.viewmodel.CalcViewModel
import javax.inject.Inject

class CalcFragment : Fragment(), Injectable {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel :CalcViewModel by lazy {
        ViewModelProvider.NewInstanceFactory().create(CalcViewModel::class.java)
    }

    private lateinit var binding: FragmentCalcBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_calc,
            container,
            false
        )

        viewModel.test()

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = CalcFragment()
    }
}