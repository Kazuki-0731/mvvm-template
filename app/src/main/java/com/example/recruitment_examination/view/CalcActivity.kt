package com.example.recruitment_examination.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.recruitment_examination.R
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import timber.log.Timber
import javax.inject.Inject


class CalcActivity : AppCompatActivity(), HasAndroidInjector {
    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc)
        Timber.d("CalcActivity onNewIntent")
        Log.d("debug", "CalcActivity onNewIntent")

        replaceFragment(CalcFragment.newInstance(), R.id.calc_content_view)
    }

    private fun replaceFragment(fragment: Fragment, layoutResId: Int) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(layoutResId, fragment)
        transaction.addToBackStack(null)
        transaction.commit()

//        supportFragmentManager.beginTransaction()
//            .add(layoutResId, fragment, "none")
//            .commitAllowingStateLoss()

//        supportFragmentManager.beginTransaction()
//            .replace(layoutResId, fragment, fragment.javaClass.name)
//            .commit()
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return dispatchingAndroidInjector
    }
}