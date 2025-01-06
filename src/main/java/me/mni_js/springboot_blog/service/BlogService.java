package me.mni_js.springboot_blog.service;

import lombok.RequiredArgsConstructor;
import me.mni_js.springboot_blog.domain.Article;
import me.mni_js.springboot_blog.dto.AddArticleRequest;
import me.mni_js.springboot_blog.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }

    public Article findById(Integer id) {
        return blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id));
    }

    public void delete(Integer id) {
        blogRepository.deleteById(id);
    }
}
