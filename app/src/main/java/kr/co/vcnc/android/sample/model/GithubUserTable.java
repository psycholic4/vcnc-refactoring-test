package kr.co.vcnc.android.sample.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

@Entity
public class GithubUserTable {

    private String login;
    @Id
    private long id;
    private String avatarUrl;
    private String gravatarId;
    private String url;
    private String htmlUrl;
    private String followersUrl;
    private String followingUrl;
    private String gistsUrl;
    private String starredUrl;
    private String subscriptionsUrl;
    private String organizationsUrl;
    private String reposUrl;
    private String eventsUrl;
    private String receivedEventsUrl;
    private String type;
    private Boolean siteAdmin;

    @Generated(hash = 1340296949)
    public GithubUserTable(String login, long id, String avatarUrl,
                           String gravatarId, String url, String htmlUrl, String followersUrl,
                           String followingUrl, String gistsUrl, String starredUrl,
                           String subscriptionsUrl, String organizationsUrl, String reposUrl,
                           String eventsUrl, String receivedEventsUrl, String type,
                           Boolean siteAdmin) {
        this.login = login;
        this.id = id;
        this.avatarUrl = avatarUrl;
        this.gravatarId = gravatarId;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.followersUrl = followersUrl;
        this.followingUrl = followingUrl;
        this.gistsUrl = gistsUrl;
        this.starredUrl = starredUrl;
        this.subscriptionsUrl = subscriptionsUrl;
        this.organizationsUrl = organizationsUrl;
        this.reposUrl = reposUrl;
        this.eventsUrl = eventsUrl;
        this.receivedEventsUrl = receivedEventsUrl;
        this.type = type;
        this.siteAdmin = siteAdmin;
    }

    @Generated(hash = 1526491527)
    public GithubUserTable() {
    }

    public String getLogin() {
        return login;
    }

    public GithubUserTable setLogin(String login) {
        this.login = login;
        return this;
    }

    public long getId() {
        return id;
    }

    public GithubUserTable setId(long id) {
        this.id = id;
        return this;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public GithubUserTable setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    public String getGravatarId() {
        return gravatarId;
    }

    public GithubUserTable setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public GithubUserTable setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public GithubUserTable setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    public String getFollowersUrl() {
        return followersUrl;
    }

    public GithubUserTable setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
        return this;
    }

    public String getFollowingUrl() {
        return followingUrl;
    }

    public GithubUserTable setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
        return this;
    }

    public String getGistsUrl() {
        return gistsUrl;
    }

    public GithubUserTable setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
        return this;
    }

    public String getStarredUrl() {
        return starredUrl;
    }

    public GithubUserTable setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
        return this;
    }

    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    public GithubUserTable setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
        return this;
    }

    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    public GithubUserTable setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
        return this;
    }

    public String getReposUrl() {
        return reposUrl;
    }

    public GithubUserTable setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
        return this;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public GithubUserTable setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    public GithubUserTable setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
        return this;
    }

    public String getType() {
        return type;
    }

    public GithubUserTable setType(String type) {
        this.type = type;
        return this;
    }

    public Boolean getSiteAdmin() {
        return siteAdmin;
    }

    public GithubUserTable setSiteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
        return this;
    }

    public static GithubUserTable create(GithubUser user) {
        return new GithubUserTable(
                user.getLogin(),
                user.getId(),
                user.getAvatarUrl(),
                user.getGravatarId(),
                user.getUrl(),
                user.getHtmlUrl(),
                user.getFollowersUrl(),
                user.getFollowingUrl(),
                user.getGistsUrl(),
                user.getStarredUrl(),
                user.getSubscriptionsUrl(),
                user.getOrganizationsUrl(),
                user.getReposUrl(),
                user.getEventsUrl(),
                user.getReceivedEventsUrl(),
                user.getType(),
                user.getSiteAdmin());
    }

    public GithubUser toModel() {
        return new GithubUser(
                getLogin(),
                getId(),
                getAvatarUrl(),
                getGravatarId(),
                getUrl(),
                getHtmlUrl(),
                getFollowersUrl(),
                getFollowingUrl(),
                getGistsUrl(),
                getStarredUrl(),
                getSubscriptionsUrl(),
                getOrganizationsUrl(),
                getReposUrl(),
                getEventsUrl(),
                getReceivedEventsUrl(),
                getType(),
                getSiteAdmin());
    }
}
