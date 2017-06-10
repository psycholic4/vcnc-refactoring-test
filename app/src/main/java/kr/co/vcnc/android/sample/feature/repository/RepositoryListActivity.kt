package kr.co.vcnc.android.sample.feature.repository

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kr.co.vcnc.android.sample.R
import kr.co.vcnc.android.sample.databinding.ActivityRepositoryListBinding


class RepositoryListActivity : AppCompatActivity() {
    lateinit var viewModel: RepositoryListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityRepositoryListBinding = DataBindingUtil.setContentView(this, R.layout.activity_repository_list)
        viewModel = RepositoryListViewModel(this)
        binding.viewModel = viewModel

        setSupportActionBar(binding.toolbar)
        binding.recyclerView.adapter = viewModel.adapter

        viewModel.loadRepositories()
    }
}