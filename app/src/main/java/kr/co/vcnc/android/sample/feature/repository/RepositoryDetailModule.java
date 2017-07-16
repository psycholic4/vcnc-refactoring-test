package kr.co.vcnc.android.sample.feature.repository;

import com.trello.rxlifecycle2.android.ActivityEvent;

import dagger.Module;
import dagger.Provides;
import io.reactivex.Observable;

@Module
public class RepositoryDetailModule {

    private final RepositoryDetailContract.View view;

    private final Observable<ActivityEvent> lifecycle;

    public RepositoryDetailModule(RepositoryDetailContract.View view, Observable<ActivityEvent> lifecycle) {
        this.view = view;
        this.lifecycle = lifecycle;
    }

    @Provides
    public RepositoryDetailContract.View provideView() {
        return view;
    }

    @Provides
    public Observable<ActivityEvent> provideLifecycle() {
        return lifecycle;
    }

    @Provides
    public RepositoryDetailContract.Presenter providePresenter(RepositoryDetailPresenter presenter) {
        return presenter;
    }
}
