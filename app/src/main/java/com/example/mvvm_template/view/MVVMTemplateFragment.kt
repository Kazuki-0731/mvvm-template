package com.example.mvvm_template.view

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm_template.R
import com.example.mvvm_template.databinding.FragmentMvvmTemplateBinding
import com.example.mvvm_template.di.Injectable
import com.example.mvvm_template.viewmodel.MVVMTemplateViewModel
import com.google.android.material.snackbar.Snackbar
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class MVVMTemplateFragment : Fragment(), Injectable {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var binding: FragmentMvvmTemplateBinding
    private lateinit var viewModel: MVVMTemplateViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_mvvm_template,
            container,
            false
        )

        viewModel = ViewModelProvider(
            requireActivity(),
            viewModelFactory
        ).get(MVVMTemplateViewModel::class.java)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        AndroidSupportInjection.inject(this)
    }
}