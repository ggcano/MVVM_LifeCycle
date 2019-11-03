package com.example.mvvm_kotlin_bien.repo

import com.example.mvvm_kotlin_bien.ui.model.Frutas

class FrutasRepoLocal {

    fun crearListaDeFrutas ():List<Frutas> {
        return listOf(
            Frutas("Manzana","Rojo",5.6f,6.4f),
            Frutas("uvas","Verde",2.6f,1.0f),
            Frutas("Peras","Marrones",1.6f,2.0f))
    }
}