package cn.kcn.archiver.dao;

import java.util.List;

import cn.kcn.archiver.model.Article;
import cn.kcn.archiver.vo.ArticleVo;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.springframework.stereotype.Repository;

/**
 * Created by kcn on 15/3/9.
 */

@SuppressWarnings("UnusedDeclaration")
@Repository
public interface ArticleDao {
    @Select("select * from article where articleid=#{articleId}")
    ArticleVo get(long articleId);

    @Select("select * from article")
    List<ArticleVo> getAll();

    @Select("select body from articlebody where articleid=#{articleid}")
    String getBody(long articleid);

    @Insert("insert into article(threadid,boardid,subject,posttime,author,attachment,isvisible,"
            + "encodingurl) values" + "(#{threadid},#{boardid},#{subject},#{posttime},#{author},#{attachment},"
            + "#{isvisible},#{encodingurl})")
    // + "ON DUPLICATE KEY"
    // + "UPDATE"
    // + "threadid=#{threadid},boardid=#{boardid},subject=#{subject},posttime=#{posttime},"
    // + "author=#{author},attachment=#{attachment},filename=#{filename},isvisible=#{isvisible},replyid=#{replyid},"
    // + "originid=#{originid},encodingurl=#{encodingurl}")
    @SelectKey(keyProperty = "articleid", resultType = Long.class, statement = "select LAST_INSERT_ID() as articleid",
            before = false)
    long add(Article article);

    @Delete("delete from article where articleid=#{articleid}")
    void delete(long articleId);

    @Delete("delete from articlebody where articleid=#{articleid}")
    void deleteBody(long articleId);

    @Insert("insert into articlebody(articleid,body) values" + "(#{articleid},#{body})")
    void addBody(long articleid, String body);
}
