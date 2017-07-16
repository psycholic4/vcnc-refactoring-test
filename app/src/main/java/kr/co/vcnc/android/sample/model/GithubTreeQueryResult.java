package kr.co.vcnc.android.sample.model;

import java.util.List;

public class GithubTreeQueryResult {

    private String sha;

    private String url;

    private List<GithubTree> tree;

    private boolean truncated;

    public String getSha() {
        return sha;
    }

    public GithubTreeQueryResult setSha(String sha) {
        this.sha = sha;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public GithubTreeQueryResult setUrl(String url) {
        this.url = url;
        return this;
    }

    public List<GithubTree> getTree() {
        return tree;
    }

    public GithubTreeQueryResult setTree(List<GithubTree> tree) {
        this.tree = tree;
        return this;
    }

    public boolean isTruncated() {
        return truncated;
    }

    public GithubTreeQueryResult setTruncated(boolean truncated) {
        this.truncated = truncated;
        return this;
    }
}
