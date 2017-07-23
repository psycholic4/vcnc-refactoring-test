package kr.co.vcnc.android.sample.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.NotNull;

@Entity
public class GithubRepositoryTable {

    @Id
    private long id;
    private String name;
    private String fullName;
    private long userId;
    @ToOne(joinProperty = "userId")
    private GithubUserTable owner;
    private Boolean private2;
    private String htmlUrl;
    private String description;
    private Boolean fork;
    private String url;
    private String forksUrl;
    private String keysUrl;
    private String collaboratorsUrl;
    private String teamsUrl;
    private String hooksUrl;
    private String issueEventsUrl;
    private String eventsUrl;
    private String assigneesUrl;
    private String branchesUrl;
    private String tagsUrl;
    private String blobsUrl;
    private String gitTagsUrl;
    private String gitRefsUrl;
    private String treesUrl;
    private String statusesUrl;
    private String languagesUrl;
    private String stargazersUrl;
    private String contributorsUrl;
    private String subscribersUrl;
    private String subscriptionUrl;
    private String commitsUrl;
    private String gitCommitsUrl;
    private String commentsUrl;
    private String issueCommentUrl;
    private String contentsUrl;
    private String compareUrl;
    private String mergesUrl;
    private String archiveUrl;
    private String downloadsUrl;
    private String issuesUrl;
    private String pullsUrl;
    private String milestonesUrl;
    private String notificationsUrl;
    private String labelsUrl;
    private String releasesUrl;
    private String deploymentsUrl;
    private String createdAt;
    private String updatedAt;
    private String pushedAt;
    private String gitUrl;
    private String sshUrl;
    private String cloneUrl;
    private String svnUrl;
    private String homepage;
    private Long size;
    private Long stargazersCount;
    private Long watchersCount;
    private String language;
    private Boolean hasIssues;
    private Boolean hasProjects;
    private Boolean hasDownloads;
    private Boolean hasWiki;
    private Boolean hasPages;
    private Long forksCount;
    private Boolean mirrorUrl;
    private Long openIssuesCount;
    private Long forks;
    private Long openIssues;
    private Long watchers;
    private String defaultBranch;
    private Double score;
    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    /** Used for active entity operations. */
    @Generated(hash = 924895952)
    private transient GithubRepositoryTableDao myDao;

    @Generated(hash = 1571999006)
    public GithubRepositoryTable(long id, String name, String fullName, long userId,
            Boolean private2, String htmlUrl, String description, Boolean fork,
            String url, String forksUrl, String keysUrl, String collaboratorsUrl,
            String teamsUrl, String hooksUrl, String issueEventsUrl,
            String eventsUrl, String assigneesUrl, String branchesUrl,
            String tagsUrl, String blobsUrl, String gitTagsUrl, String gitRefsUrl,
            String treesUrl, String statusesUrl, String languagesUrl,
            String stargazersUrl, String contributorsUrl, String subscribersUrl,
            String subscriptionUrl, String commitsUrl, String gitCommitsUrl,
            String commentsUrl, String issueCommentUrl, String contentsUrl,
            String compareUrl, String mergesUrl, String archiveUrl,
            String downloadsUrl, String issuesUrl, String pullsUrl,
            String milestonesUrl, String notificationsUrl, String labelsUrl,
            String releasesUrl, String deploymentsUrl, String createdAt,
            String updatedAt, String pushedAt, String gitUrl, String sshUrl,
            String cloneUrl, String svnUrl, String homepage, Long size,
            Long stargazersCount, Long watchersCount, String language,
            Boolean hasIssues, Boolean hasProjects, Boolean hasDownloads,
            Boolean hasWiki, Boolean hasPages, Long forksCount, Boolean mirrorUrl,
            Long openIssuesCount, Long forks, Long openIssues, Long watchers,
            String defaultBranch, Double score) {
        this.id = id;
        this.name = name;
        this.fullName = fullName;
        this.userId = userId;
        this.private2 = private2;
        this.htmlUrl = htmlUrl;
        this.description = description;
        this.fork = fork;
        this.url = url;
        this.forksUrl = forksUrl;
        this.keysUrl = keysUrl;
        this.collaboratorsUrl = collaboratorsUrl;
        this.teamsUrl = teamsUrl;
        this.hooksUrl = hooksUrl;
        this.issueEventsUrl = issueEventsUrl;
        this.eventsUrl = eventsUrl;
        this.assigneesUrl = assigneesUrl;
        this.branchesUrl = branchesUrl;
        this.tagsUrl = tagsUrl;
        this.blobsUrl = blobsUrl;
        this.gitTagsUrl = gitTagsUrl;
        this.gitRefsUrl = gitRefsUrl;
        this.treesUrl = treesUrl;
        this.statusesUrl = statusesUrl;
        this.languagesUrl = languagesUrl;
        this.stargazersUrl = stargazersUrl;
        this.contributorsUrl = contributorsUrl;
        this.subscribersUrl = subscribersUrl;
        this.subscriptionUrl = subscriptionUrl;
        this.commitsUrl = commitsUrl;
        this.gitCommitsUrl = gitCommitsUrl;
        this.commentsUrl = commentsUrl;
        this.issueCommentUrl = issueCommentUrl;
        this.contentsUrl = contentsUrl;
        this.compareUrl = compareUrl;
        this.mergesUrl = mergesUrl;
        this.archiveUrl = archiveUrl;
        this.downloadsUrl = downloadsUrl;
        this.issuesUrl = issuesUrl;
        this.pullsUrl = pullsUrl;
        this.milestonesUrl = milestonesUrl;
        this.notificationsUrl = notificationsUrl;
        this.labelsUrl = labelsUrl;
        this.releasesUrl = releasesUrl;
        this.deploymentsUrl = deploymentsUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.pushedAt = pushedAt;
        this.gitUrl = gitUrl;
        this.sshUrl = sshUrl;
        this.cloneUrl = cloneUrl;
        this.svnUrl = svnUrl;
        this.homepage = homepage;
        this.size = size;
        this.stargazersCount = stargazersCount;
        this.watchersCount = watchersCount;
        this.language = language;
        this.hasIssues = hasIssues;
        this.hasProjects = hasProjects;
        this.hasDownloads = hasDownloads;
        this.hasWiki = hasWiki;
        this.hasPages = hasPages;
        this.forksCount = forksCount;
        this.mirrorUrl = mirrorUrl;
        this.openIssuesCount = openIssuesCount;
        this.forks = forks;
        this.openIssues = openIssues;
        this.watchers = watchers;
        this.defaultBranch = defaultBranch;
        this.score = score;
    }

    @Generated(hash = 944026747)
    public GithubRepositoryTable() {
    }

    @Generated(hash = 1847295403)
    private transient Long owner__resolvedKey;

    public long getId() {
        return id;
    }

    public GithubRepositoryTable setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GithubRepositoryTable setName(String name) {
        this.name = name;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public GithubRepositoryTable setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public long getUserId() {
        return userId;
    }

    public GithubRepositoryTable setUserId(long userId) {
        this.userId = userId;
        return this;
    }

    public Boolean getPrivate2() {
        return private2;
    }

    public GithubRepositoryTable setPrivate2(Boolean private2) {
        this.private2 = private2;
        return this;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public GithubRepositoryTable setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GithubRepositoryTable setDescription(String description) {
        this.description = description;
        return this;
    }

    public Boolean getFork() {
        return fork;
    }

    public GithubRepositoryTable setFork(Boolean fork) {
        this.fork = fork;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public GithubRepositoryTable setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getForksUrl() {
        return forksUrl;
    }

    public GithubRepositoryTable setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
        return this;
    }

    public String getKeysUrl() {
        return keysUrl;
    }

    public GithubRepositoryTable setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
        return this;
    }

    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    public GithubRepositoryTable setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
        return this;
    }

    public String getTeamsUrl() {
        return teamsUrl;
    }

    public GithubRepositoryTable setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
        return this;
    }

    public String getHooksUrl() {
        return hooksUrl;
    }

    public GithubRepositoryTable setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
        return this;
    }

    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    public GithubRepositoryTable setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
        return this;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public GithubRepositoryTable setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    public GithubRepositoryTable setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
        return this;
    }

    public String getBranchesUrl() {
        return branchesUrl;
    }

    public GithubRepositoryTable setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
        return this;
    }

    public String getTagsUrl() {
        return tagsUrl;
    }

    public GithubRepositoryTable setTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
        return this;
    }

    public String getBlobsUrl() {
        return blobsUrl;
    }

    public GithubRepositoryTable setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
        return this;
    }

    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    public GithubRepositoryTable setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
        return this;
    }

    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    public GithubRepositoryTable setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
        return this;
    }

    public String getTreesUrl() {
        return treesUrl;
    }

    public GithubRepositoryTable setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
        return this;
    }

    public String getStatusesUrl() {
        return statusesUrl;
    }

    public GithubRepositoryTable setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
        return this;
    }

    public String getLanguagesUrl() {
        return languagesUrl;
    }

    public GithubRepositoryTable setLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
        return this;
    }

    public String getStargazersUrl() {
        return stargazersUrl;
    }

    public GithubRepositoryTable setStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
        return this;
    }

    public String getContributorsUrl() {
        return contributorsUrl;
    }

    public GithubRepositoryTable setContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
        return this;
    }

    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    public GithubRepositoryTable setSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
        return this;
    }

    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public GithubRepositoryTable setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
        return this;
    }

    public String getCommitsUrl() {
        return commitsUrl;
    }

    public GithubRepositoryTable setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
        return this;
    }

    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    public GithubRepositoryTable setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
        return this;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public GithubRepositoryTable setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
        return this;
    }

    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    public GithubRepositoryTable setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
        return this;
    }

    public String getContentsUrl() {
        return contentsUrl;
    }

    public GithubRepositoryTable setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
        return this;
    }

    public String getCompareUrl() {
        return compareUrl;
    }

    public GithubRepositoryTable setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
        return this;
    }

    public String getMergesUrl() {
        return mergesUrl;
    }

    public GithubRepositoryTable setMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
        return this;
    }

    public String getArchiveUrl() {
        return archiveUrl;
    }

    public GithubRepositoryTable setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
        return this;
    }

    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    public GithubRepositoryTable setDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
        return this;
    }

    public String getIssuesUrl() {
        return issuesUrl;
    }

    public GithubRepositoryTable setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
        return this;
    }

    public String getPullsUrl() {
        return pullsUrl;
    }

    public GithubRepositoryTable setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
        return this;
    }

    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    public GithubRepositoryTable setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
        return this;
    }

    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    public GithubRepositoryTable setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
        return this;
    }

    public String getLabelsUrl() {
        return labelsUrl;
    }

    public GithubRepositoryTable setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
        return this;
    }

    public String getReleasesUrl() {
        return releasesUrl;
    }

    public GithubRepositoryTable setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
        return this;
    }

    public String getDeploymentsUrl() {
        return deploymentsUrl;
    }

    public GithubRepositoryTable setDeploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public GithubRepositoryTable setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public GithubRepositoryTable setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getPushedAt() {
        return pushedAt;
    }

    public GithubRepositoryTable setPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
        return this;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public GithubRepositoryTable setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    public String getSshUrl() {
        return sshUrl;
    }

    public GithubRepositoryTable setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
        return this;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public GithubRepositoryTable setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
        return this;
    }

    public String getSvnUrl() {
        return svnUrl;
    }

    public GithubRepositoryTable setSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
        return this;
    }

    public String getHomepage() {
        return homepage;
    }

    public GithubRepositoryTable setHomepage(String homepage) {
        this.homepage = homepage;
        return this;
    }

    public Long getSize() {
        return size;
    }

    public GithubRepositoryTable setSize(Long size) {
        this.size = size;
        return this;
    }

    public Long getStargazersCount() {
        return stargazersCount;
    }

    public GithubRepositoryTable setStargazersCount(Long stargazersCount) {
        this.stargazersCount = stargazersCount;
        return this;
    }

    public Long getWatchersCount() {
        return watchersCount;
    }

    public GithubRepositoryTable setWatchersCount(Long watchersCount) {
        this.watchersCount = watchersCount;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public GithubRepositoryTable setLanguage(String language) {
        this.language = language;
        return this;
    }

    public Boolean getHasIssues() {
        return hasIssues;
    }

    public GithubRepositoryTable setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
        return this;
    }

    public Boolean getHasProjects() {
        return hasProjects;
    }

    public GithubRepositoryTable setHasProjects(Boolean hasProjects) {
        this.hasProjects = hasProjects;
        return this;
    }

    public Boolean getHasDownloads() {
        return hasDownloads;
    }

    public GithubRepositoryTable setHasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
        return this;
    }

    public Boolean getHasWiki() {
        return hasWiki;
    }

    public GithubRepositoryTable setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
        return this;
    }

    public Boolean getHasPages() {
        return hasPages;
    }

    public GithubRepositoryTable setHasPages(Boolean hasPages) {
        this.hasPages = hasPages;
        return this;
    }

    public Long getForksCount() {
        return forksCount;
    }

    public GithubRepositoryTable setForksCount(Long forksCount) {
        this.forksCount = forksCount;
        return this;
    }

    public Boolean getMirrorUrl() {
        return mirrorUrl;
    }

    public GithubRepositoryTable setMirrorUrl(Boolean mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
        return this;
    }

    public Long getOpenIssuesCount() {
        return openIssuesCount;
    }

    public GithubRepositoryTable setOpenIssuesCount(Long openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
        return this;
    }

    public Long getForks() {
        return forks;
    }

    public GithubRepositoryTable setForks(Long forks) {
        this.forks = forks;
        return this;
    }

    public Long getOpenIssues() {
        return openIssues;
    }

    public GithubRepositoryTable setOpenIssues(Long openIssues) {
        this.openIssues = openIssues;
        return this;
    }

    public Long getWatchers() {
        return watchers;
    }

    public GithubRepositoryTable setWatchers(Long watchers) {
        this.watchers = watchers;
        return this;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public GithubRepositoryTable setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
        return this;
    }

    public Double getScore() {
        return score;
    }

    public GithubRepositoryTable setScore(Double score) {
        this.score = score;
        return this;
    }

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 1517347968)
    public GithubUserTable getOwner() {
        long __key = this.userId;
        if (owner__resolvedKey == null || !owner__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            GithubUserTableDao targetDao = daoSession.getGithubUserTableDao();
            GithubUserTable ownerNew = targetDao.load(__key);
            synchronized (this) {
                owner = ownerNew;
                owner__resolvedKey = __key;
            }
        }
        return owner;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1966150065)
    public void setOwner(@NotNull GithubUserTable owner) {
        if (owner == null) {
            throw new DaoException(
                    "To-one property 'userId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.owner = owner;
            userId = owner.getId();
            owner__resolvedKey = userId;
        }
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    public static GithubRepositoryTable create(GithubRepository repository) {
        return new GithubRepositoryTable(
                repository.getId(),
                repository.getName(),
                repository.getFullName(),
                repository.getOwner().getId(),
                repository.getPrivate(),
                repository.getHtmlUrl(),
                repository.getDescription(),
                repository.getFork(),
                repository.getUrl(),
                repository.getForksUrl(),
                repository.getKeysUrl(),
                repository.getCollaboratorsUrl(),
                repository.getTeamsUrl(),
                repository.getHooksUrl(),
                repository.getIssueEventsUrl(),
                repository.getEventsUrl(),
                repository.getAssigneesUrl(),
                repository.getBranchesUrl(),
                repository.getTagsUrl(),
                repository.getBlobsUrl(),
                repository.getGitTagsUrl(),
                repository.getGitRefsUrl(),
                repository.getTreesUrl(),
                repository.getStatusesUrl(),
                repository.getLanguagesUrl(),
                repository.getStargazersUrl(),
                repository.getContributorsUrl(),
                repository.getSubscribersUrl(),
                repository.getSubscriptionUrl(),
                repository.getCommitsUrl(),
                repository.getGitCommitsUrl(),
                repository.getCommentsUrl(),
                repository.getIssueCommentUrl(),
                repository.getContentsUrl(),
                repository.getCompareUrl(),
                repository.getMergesUrl(),
                repository.getArchiveUrl(),
                repository.getDownloadsUrl(),
                repository.getIssuesUrl(),
                repository.getPullsUrl(),
                repository.getMilestonesUrl(),
                repository.getNotificationsUrl(),
                repository.getLabelsUrl(),
                repository.getReleasesUrl(),
                repository.getDeploymentsUrl(),
                repository.getCreatedAt(),
                repository.getUpdatedAt(),
                repository.getPushedAt(),
                repository.getGitUrl(),
                repository.getSshUrl(),
                repository.getCloneUrl(),
                repository.getSvnUrl(),
                repository.getHomepage(),
                repository.getSize(),
                repository.getStargazersCount(),
                repository.getWatchersCount(),
                repository.getLanguage(),
                repository.getHasIssues(),
                repository.getHasProjects(),
                repository.getHasDownloads(),
                repository.getHasWiki(),
                repository.getHasPages(),
                repository.getForksCount(),
                repository.getMirrorUrl(),
                repository.getOpenIssuesCount(),
                repository.getForks(),
                repository.getOpenIssues(),
                repository.getWatchers(),
                repository.getDefaultBranch(),
                repository.getScore()
        );
    }

    public GithubRepository toModel() {
        return new GithubRepository(
                getId(),
                getName(),
                getFullName(),
                getOwner().toModel(),
                getPrivate2(),
                getHtmlUrl(),
                getDescription(),
                getFork(),
                getUrl(),
                getForksUrl(),
                getKeysUrl(),
                getCollaboratorsUrl(),
                getTeamsUrl(),
                getHooksUrl(),
                getIssueEventsUrl(),
                getEventsUrl(),
                getAssigneesUrl(),
                getBranchesUrl(),
                getTagsUrl(),
                getBlobsUrl(),
                getGitTagsUrl(),
                getGitRefsUrl(),
                getTreesUrl(),
                getStatusesUrl(),
                getLanguagesUrl(),
                getStargazersUrl(),
                getContributorsUrl(),
                getSubscribersUrl(),
                getSubscriptionUrl(),
                getCommitsUrl(),
                getGitCommitsUrl(),
                getCommentsUrl(),
                getIssueCommentUrl(),
                getContentsUrl(),
                getCompareUrl(),
                getMergesUrl(),
                getArchiveUrl(),
                getDownloadsUrl(),
                getIssuesUrl(),
                getPullsUrl(),
                getMilestonesUrl(),
                getNotificationsUrl(),
                getLabelsUrl(),
                getReleasesUrl(),
                getDeploymentsUrl(),
                getCreatedAt(),
                getUpdatedAt(),
                getPushedAt(),
                getGitUrl(),
                getSshUrl(),
                getCloneUrl(),
                getSvnUrl(),
                getHomepage(),
                getSize(),
                getStargazersCount(),
                getWatchersCount(),
                getLanguage(),
                getHasIssues(),
                getHasProjects(),
                getHasDownloads(),
                getHasWiki(),
                getHasPages(),
                getForksCount(),
                getMirrorUrl(),
                getOpenIssuesCount(),
                getForks(),
                getOpenIssues(),
                getWatchers(),
                getDefaultBranch(),
                getScore()
        );
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 703249142)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getGithubRepositoryTableDao() : null;
    }
}
