package com.example.recruitment_examination.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.recruitment_examination.R
import com.example.recruitment_examination.databinding.FragmentCalcBinding
import com.example.recruitment_examination.di.Injectable
import timber.log.Timber

class CalcFragment : Fragment(), Injectable {
//    @Inject
//    lateinit var viewModelFactory: ViewModelProvider.Factory
//    private val viewModel :CalcViewModel by lazy {
//        ViewModelProvider.NewInstanceFactory().create(CalcViewModel::class.java)
//    }

    private lateinit var binding: FragmentCalcBinding
//    private lateinit var viewModel: CalcViewModel
//    private val viewModel: CalcViewModel by viewModels {
//        viewModelFactory
//    }

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

//        viewModel = ViewModelProvider(
//            requireActivity(),
//            viewModelFactory
//        ).get(CalcViewModel::class.java)
//        viewModel.navigator = this
//        binding.viewModel = viewModel

//        viewModel.test()

        Log.d("debug", "CalcFragment onCreateView")
        Timber.d("CalcFragment onCreateView")

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("debug", "CalcFragment onViewCreated")
        Timber.d("CalcFragment onViewCreated")
    }

    companion object {
        @JvmStatic
        fun newInstance() = CalcFragment()
    }
}