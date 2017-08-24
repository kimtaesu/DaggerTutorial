package com.hucet.dagger

import android.util.Log
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import dagger.Reusable


/**
 * Created by tyler on 2017. 8. 24..
 */
@Reusable // 스쿠퍼를 많이 사용해도 상관은 없지만 낭비하지는 않겠다.
class CoffeeScooper @Inject constructor() {
    fun printScooper() {
        Log.e("!!!!!!!!!", "Use CoffeeScooper ${this.toString()}")
    }
}

@Module
class CashRegisterModule {
    @Provides
    @Reusable // DON'T DO THIS! 당신은 당신의 현금을 넣을 금전 등록기에 관심을 가진다.
    fun badIdeaCashRegister(): CashRegister {
        return CashRegister()
    }// 대신 특정한 scope를 사용하라.
}

@Reusable // DON'T DO THIS! 당신은 매번 새로운 필터를 원하므로 scope되지 않아야 한다.
class CoffeeFilter @Inject constructor()


class CashRegister {
    init {
        Log.e("!!!!!!!!!", "CashRegister ${this}")
    }
}