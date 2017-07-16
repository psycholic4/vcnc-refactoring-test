package kr.co.vcnc.android.sample.feature.repository;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.content.res.AppCompatResources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import kr.co.vcnc.android.sample.MyApplication;
import kr.co.vcnc.android.sample.R;
import kr.co.vcnc.android.sample.model.GithubRepository;
import kr.co.vcnc.android.sample.model.GithubTree;
import kr.co.vcnc.android.sample.model.GithubTreeType;

public class RepositoryDetailActivity extends RxAppCompatActivity implements RepositoryDetailContract.View {

    private static final String EXTRA_REPOSITORY = "extra:repository";

    @Inject Gson gson;
    @Inject RepositoryDetailContract.Presenter presenter;

    @BindView(R.id.name) TextView nameView;
    @BindView(R.id.description) TextView descriptionView;
    @BindView(R.id.tree) LinearLayout treeLayout;

    public static Intent intents(Context context, GithubRepository repository) {
        Intent intent = new Intent(context, RepositoryDetailActivity.class);
        Gson gson = MyApplication.getApplicationComponent().gson();
        intent.putExtra(EXTRA_REPOSITORY, gson.toJson(repository));
        return intent;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        MyApplication.getApplicationComponent()
                .plus(new RepositoryDetailModule(this, lifecycle()))
                .inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repository_detail);
        ButterKnife.bind(this);

        presenter.init(gson.fromJson(getIntent().getStringExtra(EXTRA_REPOSITORY), GithubRepository.class));
    }

    @Override
    public void setName(CharSequence nameSpan) {
        nameView.setText(nameSpan);
    }

    @Override
    public void setDescription(String description) {
        descriptionView.setText(description);
    }

    @Override
    public void setTree(List<GithubTree> tree) {
        treeLayout.removeAllViews();
        for (GithubTree gt : tree) {
            View view = LayoutInflater.from(this).inflate(R.layout.list_item_tree, treeLayout, false);
            Drawable iconDrawable = AppCompatResources.getDrawable(this, GithubTreeType.TREE.equals(gt.getType()) ? R.drawable.ic_folder_24dp : R.drawable.ic_insert_drive_file_24dp);
            ButterKnife.<ImageView>findById(view, R.id.icon).setImageDrawable(iconDrawable);
            ButterKnife.<TextView>findById(view, R.id.path).setText(gt.getPath());
            treeLayout.addView(view);
        }
    }
}
