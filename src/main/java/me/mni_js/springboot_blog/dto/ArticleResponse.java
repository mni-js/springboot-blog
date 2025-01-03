package me.mni_js.springboot_blog.dto;

import lombok.Getter;
import me.mni_js.springboot_blog.domain.Article;

@Getter
public class ArticleResponse {
    private final String title;
    private final String content;

    public ArticleResponse(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
