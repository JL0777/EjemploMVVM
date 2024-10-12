package com.jose.examplemvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jose.examplemvvm.model.QuoteModel
import com.jose.examplemvvm.model.QuoteProvider

class QuoteViewModel : ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote:QuoteModel = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}