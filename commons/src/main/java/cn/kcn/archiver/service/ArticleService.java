package cn.kcn.archiver.service;

/**
 * Created by kcn on 15/3/13.
 */

import cn.kcn.archiver.OperationLogger;
import cn.kcn.archiver.dao.ArticleDao;
import cn.kcn.archiver.vo.ArticleVo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
    private static final Logger LOG = LoggerFactory.getLogger(ArticleService.class);

    private static ArticleService instance;

    @Autowired
    private ArticleDao articleDao;

    public ArticleService() {
        instance = this;
    }

    public static ArticleService getInstance() {
        return instance;
    }

    public ArticleVo getArticleById(long articleId) {
        return articleDao.get(articleId);
    }

    public String getBodyById(long articleId) {
        return articleDao.getBody(articleId);
    }

    public void addArticle(ArticleVo articleVo) {
        if (articleDao.add(articleVo) != 1) {
            LOG.error("加入文章出错");
        }
        articleDao.addBody(articleVo.getArticleid(), articleVo.getBody());
        OperationLogger.info("新增文章：id:{} boardid:{} threadid:{}", articleVo.getArticleid(), articleVo.getBoardid(),
                articleVo.getThreadid());
    }

    public void deleteArticle(long articleId) {
        articleDao.delete(articleId);
        articleDao.deleteBody(articleId);
    }
}
