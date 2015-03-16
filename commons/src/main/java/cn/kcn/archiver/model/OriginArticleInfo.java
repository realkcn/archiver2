package cn.kcn.archiver.model;

/**
 * Created by kcn on 14-8-12.
 */

import java.util.Date;

@SuppressWarnings("UnusedDeclaration")
// @Document
// @CompoundIndexes({
// // @CompoundIndex(name = "origin_idx", def = "{'boardid':1,'originid':1}"),
// @CompoundIndex(name = "origin_idx", def = "{'boardid':1,'posttime':1}"),
// @CompoundIndex(name = "originfile_idx", def = "{'boardid':1,'filename':1}")
// })
public class OriginArticleInfo<IDClass> {
    // @Id
    private IDClass articleid;

    private IDClass boardid;

    private IDClass threadid;

    private long originid;

    private String filename;

    private Date posttime;

    private long replyid;

    public long getOriginid() {
        return originid;
    }

    public void setOriginid(long originid) {
        this.originid = originid;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public long getReplyid() {
        return replyid;
    }

    public void setReplyid(long replyid) {
        this.replyid = replyid;
    }

    public IDClass getArticleid() {
        return articleid;
    }

    public void setArticleid(IDClass articleid) {
        this.articleid = articleid;
    }

    public IDClass getBoardid() {
        return boardid;
    }

    public void setBoardid(IDClass boardid) {
        this.boardid = boardid;
    }

    public IDClass getThreadid() {
        return threadid;
    }

    public void setThreadid(IDClass threadid) {
        this.threadid = threadid;
    }

}
