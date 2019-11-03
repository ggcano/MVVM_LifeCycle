package com.example.mvvm_kotlin_bien.domain

import com.example.mvvm_kotlin_bien.repo.FrutasRepoLocal
import com.example.mvvm_kotlin_bien.ui.model.Frutas

class FrutasUseCase {
   private val frutasDataset = FrutasRepoLocal ()


    fun obtenerListaDeFrutas (): List<Frutas>{
    return  frutasDataset.crearListaDeFrutas()
    }

}