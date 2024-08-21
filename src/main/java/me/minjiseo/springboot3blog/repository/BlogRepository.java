package me.minjiseo.springboot3blog.repository;

import me.minjiseo.springboot3blog.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository <Article, Long> {
}
