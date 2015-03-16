package cn.kcn.archiver.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by kcn on 14-6-17.
 */
// @Document
public class Article {
    // @Id
    private long articleid;

    private long boardid;

    private long threadid;

    private String author;

    private Date posttime;

    private List<Attachment> attachments = new ArrayList<>();

    private String subject;

    private boolean isvisible;

    private String body;

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

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPosttime() {
        return posttime;
    }

    public void setPosttime(Date posttime) {
        this.posttime = posttime;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public void addAttachment(Attachment attachment) {
        // if (attachments==null)
        // setAttachments(new ArrayList<Attachment>());
        attachments.add(attachment);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public boolean isIsvisible() {
        return isvisible;
    }

    public void setIsvisible(boolean isvisible) {
        this.isvisible = isvisible;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
