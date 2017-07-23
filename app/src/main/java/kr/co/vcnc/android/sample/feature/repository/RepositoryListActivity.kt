package kr.co.vcnc.android.sample.feature.repository

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity
import kr.co.vcnc.android.sample.MyApplication
import kr.co.vcnc.android.sample.R
import kr.co.vcnc.android.sample.databinding.ActivityRepositoryListBinding
import javax.inject.Inject

class RepositoryListActivity : RxAppCompatActivity() {
    @Inject lateinit var viewModel: RepositoryListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        MyApplication.applicationComponent
                .plus(RepositoryModule(this, lifecycle()))
                .inject(this)
        super.onCreate(savedInstanceState)

        val binding: ActivityRepositoryListBinding = DataBindingUtil.setContentView(this, R.layout.activity_repository_list)
        binding.viewModel = viewModel
        setSupportActionBar(binding.toolbar)
        binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.recyclerView.adapter = viewModel.adapter

        viewModel.subscribeDatabase()
        viewModel.loadRepositories()
    }
}