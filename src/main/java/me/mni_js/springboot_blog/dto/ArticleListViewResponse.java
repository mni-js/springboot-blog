package me.mni_js.springboot_blog.dto;

import lombok.Getter;
import me.mni_js.springboot_blog.domain.Article;

@Getter
public class ArticleListViewResponse {

    private final Integer id;
    private final String title;
    private final String content;

    public ArticleListViewResponse(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
