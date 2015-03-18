package cn.kcn.archiver.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by kcn on 14-6-17.
 */
// @Document
// @CompoundIndexes({
// @CompoundIndex(name = "board_idx", def = "{'boardid':1,'lastposttime':-1}")
// })
public class Thread {
    // @DBRef(lazy = true)
    List<Article> articles = new ArrayList<>();

    // @Id
    private long threadid;

    private long boardid;

    private String subject;

    private Date posttime;

    private String author;

    private String lastreply;

    private Date lastposttime;

    private String encodingurl;

    private boolean isvisible = true;

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public void addArticle(Article articleid) {
        this.articles.add(articleid);
    }

    public void removeArticle(Article articleid) {
        this.articles.remove(articleid);
    }

    public long getBoardid() {
        return boardid;
    }

    public void setBoardid(long boardid) {
        this.boardid = boardid;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getPosttime() {
        return posttime;
    }

    public void setPosttime(Date posttime) {
        this.posttime = posttime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLastreply() {
        return lastreply;
    }

    public void setLastreply(String lastreply) {
        this.lastreply = lastreply;
    }

    public Date getLastposttime() {
        return lastposttime;
    }

    public void setLastposttime(Date lastposttime) {
        this.lastposttime = lastposttime;
    }

    public long getThreadid() {
        return threadid;
    }

    public void setThreadid(long threadid) {
        this.threadid = threadid;
    }

    public String getEncodingurl() {
        return encodingurl;
    }

    public void setEncodingurl(String encodingurl) {
        this.encodingurl = encodingurl;
    }

    public boolean isIsvisible() {
        return isvisible;
    }

    public void setIsvisible(boolean isvisible) {
        this.isvisible = isvisible;
    }

}
