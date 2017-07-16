package kr.co.vcnc.android.sample.feature.repository;

import java.util.List;

import kr.co.vcnc.android.sample.model.GithubRepository;
import kr.co.vcnc.android.sample.model.GithubTree;

public interface RepositoryDetailContract {
    interface View {
        void setName(CharSequence nameSpan);

        void setDescription(String description);

        void setTree(List<GithubTree> tree);
    }

    interface Presenter {
        void init(GithubRepository repository);
    }
}
