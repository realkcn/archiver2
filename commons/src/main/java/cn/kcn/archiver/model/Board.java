package cn.kcn.archiver.model;

/**
 * Created by kcn on 14-6-17.
 */

// @Document
public class Board {

    // @Id
    protected long boardid;

    // @Indexed(unique = true)
    protected String name;

    protected int threads;

    protected int articles;

    protected boolean ishidden;

    protected long lastarticleid;

    protected String cname;

    protected String groupid;

    protected String section;

    protected boolean ignored;

    protected long lastdeleteid;

    public Board() {

    }

    public Board(Board template) {
        clone(template);
    }

    public void clone(Board template) {
        boardid = template.boardid;
        name = template.name;
        threads = template.threads;
        articles = template.articles;
        ishidden = template.ishidden;
        lastarticleid = template.lastarticleid;
        cname = template.cname;
        groupid = template.groupid;
        section = template.section;
        ignored = template.ignored;
        lastdeleteid = template.lastdeleteid;
    }

    public long getBoardid() {
        return boardid;
    }

    public void setBoardid(long boardid) {
        this.boardid = boardid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    public int getArticles() {
        return articles;
    }

    public void setArticles(int articles) {
        this.articles = articles;
    }

    public boolean isIshidden() {
        return ishidden;
    }

    public void setIshidden(boolean ishidden) {
        this.ishidden = ishidden;
    }

    public long getLastarticleid() {
        return lastarticleid;
    }

    public void setLastarticleid(long lastarticleid) {
        this.lastarticleid = lastarticleid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public boolean isIgnored() {
        return ignored;
    }

    public void setIgnored(boolean ignored) {
        this.ignored = ignored;
    }

    public long getLastdeleteid() {
        return lastdeleteid;
    }

    public void setLastdeleteid(long lastdeleteid) {
        this.lastdeleteid = lastdeleteid;
    }
}
