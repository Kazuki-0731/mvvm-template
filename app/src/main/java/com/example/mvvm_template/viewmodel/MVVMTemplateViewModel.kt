package com.example.mvvm_template.viewmodel

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.material.snackbar.Snackbar
import timber.log.Timber
import javax.inject.Inject

class MVVMTemplateViewModel @Inject constructor(): ViewModel() {
    val visibility = MutableLiveData(true)

    // onClick処理
    fun onClickFab(view: View) {
        visibility.value?.let {
            visibility.value = !it
        }

        Snackbar.make(
            view,
            "Replace with your own action",
            Snackbar.LENGTH_LONG
        ).setAction("Action", null).show()
    }
}