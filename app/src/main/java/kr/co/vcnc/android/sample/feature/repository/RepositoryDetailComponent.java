package kr.co.vcnc.android.sample.feature.repository;

import dagger.Subcomponent;

@Subcomponent(modules = {
        RepositoryDetailModule.class
})
public interface RepositoryDetailComponent {
    void inject(RepositoryDetailActivity activity);
}
