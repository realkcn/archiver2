package cn.kcn.archiver.model;

import java.util.Date;

/**
 * Created by kcn on 14-6-17.
 */
// @Document
public class Article {
    // @Id
    protected long articleid;

    protected long boardid;

    protected long threadid;

    protected String author;

    protected Date posttime;

    protected String subject;

    protected boolean isvisible;

    protected int attachment;

    protected String encodingurl;

    public String getEncodingurl() {
        return encodingurl;
    }

    public void setEncodingurl(final String encodingurl) {
        this.encodingurl = encodingurl;
    }

    public int getAttachment() {
        return attachment;
    }

    public void setAttachment(int attachment) {
        this.attachment = attachment;
    }

    public long getBoardid() {
        return boardid;
    }

    public void setBoardid(long boardid) {
        this.boardid = boardid;
    }

    public long getThreadid() {
        return threadid;
    }

    public void setThreadid(long threadid) {
        this.threadid = threadid;
    }

    public long getArticleid() {
        return articleid;
    }

    public void setArticleid(long articleid) {
        this.articleid = articleid;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }

    public Date getPosttime() {
        return posttime;
    }

    public void setPosttime(Date posttime) {
        this.posttime = posttime;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(final String subject) {
        this.subject = subject;
    }

    public boolean isIsvisible() {
        return isvisible;
    }

    public void setIsvisible(boolean isvisible) {
        this.isvisible = isvisible;
    }

}
