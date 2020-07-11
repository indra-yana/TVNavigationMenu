package com.androijo.sample.fragments

import android.os.Bundle
import android.view.View
import androidx.leanback.app.RowsSupportFragment
import com.androijo.sample.interfaces.NavigationMenuCallback

class MusicFragment : RowsSupportFragment() {


    private lateinit var navigationMenuCallback: NavigationMenuCallback

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadRows()
    }

    private fun loadRows() {


    }

    fun setNavigationMenuCallback(callback: NavigationMenuCallback) {
        this.navigationMenuCallback = callback
    }


}