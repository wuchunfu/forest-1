package com.rymcu.vertical.service;

import com.rymcu.vertical.core.service.Service;
import com.rymcu.vertical.dto.ArticleDTO;
import com.rymcu.vertical.entity.Article;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public interface ArticleService extends Service<Article> {
    List<ArticleDTO> articles(String searchText, String tag);

    Map postArticle(Integer idArticle, String articleTitle, String articleContent, String articleContentHtml, String articleTags, HttpServletRequest request);

    ArticleDTO findArticleDTOById(Integer id);
}