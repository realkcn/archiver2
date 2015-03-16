package cn.kcn.archiver.service;

import cn.kcn.archiver.TestConfig;
import cn.kcn.archiver.model.Article;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ArticleService Tester.
 *
 * @author kcn
 * @version 1.0
 * @since <pre>三月 16, 2015</pre>
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
public class ArticleServiceTest {
    @Autowired
    private ArticleService articleService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getArticleById(long articleId)
     */
    @Test
    public void testGetArticle() throws Exception {
        Article article = articleService.getArticleById(5579989);
        System.out.println(article.getArticleid() + ":" + article.getBoardid() + ":" + article.getSubject());
    }


} 
