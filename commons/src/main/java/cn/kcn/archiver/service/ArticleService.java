package cn.kcn.archiver.service;

/**
 * Created by kcn on 15/3/13.
 */

import cn.kcn.archiver.dao.ArticleDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kcn.archiver.model.Article;

@Service
public class ArticleService {
    private static final Logger LOG = LoggerFactory.getLogger(ArticleService.class);

    @Autowired
    private ArticleDao articleDao;

    public Article getArticleById(long articleId) {
        return articleDao.get(articleId);
    }
}
