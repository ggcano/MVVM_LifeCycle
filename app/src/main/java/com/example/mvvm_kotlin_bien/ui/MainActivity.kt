package com.example.mvvm_kotlin_bien.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.mvvm_kotlin_bien.ui.model.Frutas
import com.example.mvvm_kotlin_bien.viewmodel.MyViewModel
import kotlinx.android.synthetic.main.activity_main.*
import com.example.mvvm_kotlin_bien.R
class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpViewModel()

        loadLista.setOnClickListener() {
        viewModel.getListaFrutas()

        }

    }
    fun setUpViewModel () {
        viewModel = ViewModelProviders.of(this).get(MyViewModel::class.java)
        val frutasObserver = Observer<List<Frutas>> {
            for (fruta: Frutas in it) {
                Log.d("esta son las frutas",fruta.nombreFrutas)
            }
        }
        viewModel.getListaFrutaLiveData().observe(this,frutasObserver)
    }

}
