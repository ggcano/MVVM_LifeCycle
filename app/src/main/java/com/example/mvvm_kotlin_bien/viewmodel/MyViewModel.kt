package com.example.mvvm_kotlin_bien.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm_kotlin_bien.domain.FrutasUseCase
import com.example.mvvm_kotlin_bien.repo.FrutasRepoLocal
import com.example.mvvm_kotlin_bien.ui.model.Frutas

class MyViewModel: ViewModel () {
    val listData = MutableLiveData<List<Frutas>>()
    val frutasUseCase = FrutasUseCase ()

    init {
        getListaFrutas()
    }

    fun setListData(listaFrutas:List<Frutas>) {
        listData.value = listaFrutas
    }

    fun getListaFrutas(){
    setListData(frutasUseCase.obtenerListaDeFrutas())
    }

    fun getListaFrutaLiveData():LiveData<List<Frutas>>{
         return listData
     }

}