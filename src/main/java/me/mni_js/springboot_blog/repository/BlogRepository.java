package me.mni_js.springboot_blog.repository;

import me.mni_js.springboot_blog.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
