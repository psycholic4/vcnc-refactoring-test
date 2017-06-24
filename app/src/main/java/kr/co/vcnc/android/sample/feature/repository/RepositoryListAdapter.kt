package kr.co.vcnc.android.sample.feature.repository

import android.databinding.DataBindingUtil
import android.support.v4.content.res.ResourcesCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import kr.co.vcnc.android.sample.R
import kr.co.vcnc.android.sample.databinding.ListItemRepositoryBinding
import kr.co.vcnc.android.sample.extentions.widget.setDownloadableFonts
import kr.co.vcnc.android.sample.model.GithubRepository

class RepositoryListAdapter : RecyclerView.Adapter<RepositoryListAdapter.RepositoryViewHolder>() {
    var repositories: ArrayList<GithubRepository> = arrayListOf()
        set(value) {
            repositories.clear()
            repositories.addAll(value)
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepositoryViewHolder {
        val binding = DataBindingUtil.inflate<ListItemRepositoryBinding>(LayoutInflater.from(parent.context), R.layout.list_item_repository, parent, false)
        binding.name.typeface = ResourcesCompat.getFont(parent.context, R.font.audiowide)
        binding.description.setDownloadableFonts("Noto Sans")
        return RepositoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RepositoryViewHolder, position: Int) {
        holder.bind(repositories[position])
    }

    override fun getItemCount(): Int {
        return repositories.size
    }

    class RepositoryViewHolder(val binding: ListItemRepositoryBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(repository: GithubRepository) {
            val viewModel = RepositoryListItemViewModel(repository)
            binding.viewModel = viewModel
        }
    }
}
