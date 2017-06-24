package kr.co.vcnc.android.sample.feature.repository

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kr.co.vcnc.android.sample.MyApplication
import kr.co.vcnc.android.sample.R
import kr.co.vcnc.android.sample.databinding.ActivityRepositoryListBinding
import javax.inject.Inject


class RepositoryListActivity : AppCompatActivity() {
    @Inject lateinit var viewModel: RepositoryListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        MyApplication.applicationComponent
                .plus(RepositoryModule(this))
                .inject(this)
        super.onCreate(savedInstanceState)

        val binding: ActivityRepositoryListBinding = DataBindingUtil.setContentView(this, R.layout.activity_repository_list)
        binding.viewModel = viewModel
        setSupportActionBar(binding.toolbar)
        binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.recyclerView.adapter = viewModel.adapter

        viewModel.loadRepositories()
    }
}