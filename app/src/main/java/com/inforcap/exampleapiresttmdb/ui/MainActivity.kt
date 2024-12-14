package com.inforcap.exampleapiresttmdb.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.GridLayoutManager
import com.inforcap.exampleapiresttmdb.R
import com.inforcap.exampleapiresttmdb.core.Constants
import com.inforcap.exampleapiresttmdb.databinding.ActivityMainBinding
import com.inforcap.exampleapiresttmdb.model.FigureDetailEntity
import com.inforcap.exampleapiresttmdb.viewmodel.MovieViewModel
class MainActivity : AppCompatActivity() {
//
//    private lateinit var binding: ActivityMainBinding
//    private lateinit var viewModel: MovieViewModel
//    private lateinit var adapterMovie: AdapterMovie
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        binding = ActivityMainBinding.inflate(layoutInflater)
//
//        setContentView(binding.root)
//
//        viewModel = ViewModelProvider(this)[MovieViewModel::class.java]
//
//        initRecyclerView()
//
////        binding.tvCategory.text = Constants.CATEGORY_ALLMOVIES
////        viewModel.getAllMovies()
////
////        viewModel.movieList.observe(this) {
////            adapterMovie.movieList = it
////            adapterMovie.notifyDataSetChanged()
////        }
////
////        binding.btnAllMovies.setOnClickListener {
////            binding.tvCategory.text = Constants.CATEGORY_ALLMOVIES
////            viewModel.getAllMovies()
////        }
////
////        binding.btnPopular.setOnClickListener {
////            binding.tvCategory.text = Constants.CATEGORY_POPULAR
////            viewModel.getPopular()
////        }
////
////        binding.btnTopRated.setOnClickListener {
////            binding.tvCategory.text = Constants.CATEGORY_TOPRATED
////            viewModel.getTopRated()
////        }
////
////        binding.btnUpcoming.setOnClickListener {
////            binding.tvCategory.text = Constants.CATEGORY_UPCOMING
////            viewModel.getUpcoming()
////        }
//
//
//    }
//
//    private fun initRecyclerView() {
//        val layoutManager = GridLayoutManager(this, 3)
//        binding.rvFigures.layoutManager = layoutManager
//        adapterMovie = AdapterMovie(this, arrayListOf())
//        binding.rvFigures.adapter = adapterMovie
//    }
}