package cn.kcn.archiver.dao;

import cn.kcn.archiver.model.Article;
import org.apache.ibatis.annotations.Select;

/**
 * Created by kcn on 15/3/9.
 */

@SuppressWarnings("UnusedDeclaration")
//@Repository
public interface ArticleDao {
    // public
    @Select("select * from article where articleid=#{articleId}")
    public Article get(long articleId);
}
