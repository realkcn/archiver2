package cn.kcn.archiver.service;/**
 * Created by kcn on 15/3/13.
 */

import cn.kcn.archiver.model.Article;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
    private static final Logger LOG = LoggerFactory
            .getLogger(ArticleService.class);

    public Article getArticle(long articleId) {

        return null;
    }
}