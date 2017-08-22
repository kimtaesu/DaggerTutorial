package com.hucet.dagger

import android.app.Activity
import android.os.Bundle
import com.hucet.dagger.model.Heater
import com.hucet.dagger.subcomponent.scope.ScopeObject
import javax.inject.Inject

/**
 * Created by tyler on 2017. 8. 16..
 */
class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}