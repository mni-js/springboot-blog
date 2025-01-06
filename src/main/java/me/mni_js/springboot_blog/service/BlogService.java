package me.mni_js.springboot_blog.service;

import lombok.RequiredArgsConstructor;
import me.mni_js.springboot_blog.domain.Article;
import me.mni_js.springboot_blog.dto.AddArticleRequest;
import me.mni_js.springboot_blog.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
