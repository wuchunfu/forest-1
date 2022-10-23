package com.rymcu.forest.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author ronger
 */
@Data
@Table(name="forest_article_thumbs_up")
public class ArticleThumbsUp implements Serializable, Cloneable {
    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long idArticleThumbsUp;
    /**
     * 文章表主键
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long idArticle;
    /**
     * 用户表主键
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long idUser;
    /**
     * 点赞时间
     */
    private Date thumbsUpTime;
}
