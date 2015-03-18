package cn.kcn.archiver.vo;

/**
 * Created by kcn on 15/3/17.
 */

import java.util.List;

import cn.kcn.archiver.model.Article;
import cn.kcn.archiver.model.Attachment;
import cn.kcn.archiver.service.ArticleService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("UnusedDeclaration")
public class ArticleVo extends Article {
    private static final Logger LOG = LoggerFactory.getLogger(ArticleVo.class);

    protected String body = null;

    protected List<Attachment> attachments = null;

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public String getBody() {
        if (getArticleid() <= 0) {
            LOG.error("读取正文：错误的文章id {}", getArticleid());
            return "";
        }
        if (body == null) {
            body = ArticleService.getInstance().getBodyById(getArticleid());
            if (body == null) {
                LOG.warn("文章{}没有正文", getArticleid());
                body = "";
            }
        }
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
