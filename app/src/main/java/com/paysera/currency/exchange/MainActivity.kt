package com.paysera.currency.exchange

import android.os.Bundle
import com.paysera.currency.exchange.common.util.navigate
import com.paysera.currency.exchange.ui.CurrencyFragment
import com.paysera.currency.exchange.ui.ProgressDialogFragment
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity(), CurrencyFragment.OnCurrencyFragmentListener {

    private var progressDialog: ProgressDialogFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CurrencyFragment.newInstance().navigate(supportFragmentManager, R.id.layout_container, false)
    }

    override fun showProgressBar() {
        progressDialog = ProgressDialogFragment.newInstance()
        progressDialog?.show(supportFragmentManager, "progress")
    }

    override fun hideProgressBar() {
        progressDialog?.dismiss()
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        progressDialog?.dismiss()
    }
}
