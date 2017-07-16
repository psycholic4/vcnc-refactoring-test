package kr.co.vcnc.android.sample.model;

public class GithubTree {

    private String path;

    private String mode;

    @GithubTreeType private String type;

    private String sha;

    private String url;

    public String getPath() {
        return path;
    }

    public GithubTree setPath(String path) {
        this.path = path;
        return this;
    }

    public String getMode() {
        return mode;
    }

    public GithubTree setMode(String mode) {
        this.mode = mode;
        return this;
    }

    public String getType() {
        return type;
    }

    public GithubTree setType(String type) {
        this.type = type;
        return this;
    }

    public String getSha() {
        return sha;
    }

    public GithubTree setSha(String sha) {
        this.sha = sha;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public GithubTree setUrl(String url) {
        this.url = url;
        return this;
    }
}
