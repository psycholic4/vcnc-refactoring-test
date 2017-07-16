package kr.co.vcnc.android.sample.feature.repository;

import com.trello.rxlifecycle2.RxLifecycle;
import com.trello.rxlifecycle2.android.ActivityEvent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import kr.co.vcnc.android.sample.api.GithubService;
import kr.co.vcnc.android.sample.model.GithubRepository;
import kr.co.vcnc.android.sample.model.GithubTree;
import kr.co.vcnc.android.sample.model.GithubTreeType;


public class RepositoryDetailPresenter implements RepositoryDetailContract.Presenter {

    private final RepositoryDetailContract.View view;
    private final Observable<ActivityEvent> lifecycle;
    private final GithubService githubService;
    private GithubRepository repository;

    @Inject
    public RepositoryDetailPresenter(RepositoryDetailContract.View view, Observable<ActivityEvent> lifecycle, GithubService githubService) {
        this.view = view;
        this.lifecycle = lifecycle;
        this.githubService = githubService;
    }

    @Override
    public void init(GithubRepository repository) {
        this.repository = repository;

        view.setName(repository.getNameSpan());
        view.setDescription(repository.getDescription());

        if (repository.getTreesUrl() != null && repository.getDefaultBranch() != null) {
            String treeUrl = repository.getTreesUrl().replace("{/sha}", "/" + repository.getDefaultBranch());
            githubService.listTree(treeUrl)
                    .compose(RxLifecycle.bindUntilEvent(lifecycle, ActivityEvent.DESTROY))
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(queryResult -> {
                        List<GithubTree> tree = new ArrayList<>(queryResult.getTree());
                        Collections.sort(tree, (a, b) -> {
                            if (a.getType() == null) {
                                return 1;
                            }
                            if (a.getType().equals(b.getType())) {
                                return a.getPath().compareTo(b.getPath());
                            }
                            return GithubTreeType.TREE.equals(a.getType()) ? -1 : 1;
                        });
                        view.setTree(tree);
                    }, throwable -> {
                    });
        }
    }
}
