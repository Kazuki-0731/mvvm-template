package com.example.mvvm_template.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm_template.R
import com.example.mvvm_template.databinding.ActivityMvvmTemplateBinding
import com.example.mvvm_template.databinding.FragmentMvvmTemplateBinding
import com.example.mvvm_template.viewmodel.MVVMTemplateViewModel
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject


class MVVMTemplateActivity : AppCompatActivity(), HasAndroidInjector {
    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    private lateinit var binding: ActivityMvvmTemplateBinding

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var viewModel: MVVMTemplateViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_mvvm_template)

        viewModel = ViewModelProvider(
            this,
            viewModelFactory
        ).get(MVVMTemplateViewModel::class.java)

        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        setFragment(MVVMTemplateFragment(), R.id.content_view)
    }

    private fun setFragment(fragment: Fragment, layoutResId: Int) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(layoutResId, fragment)
        transaction.commit()
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return dispatchingAndroidInjector
    }
}