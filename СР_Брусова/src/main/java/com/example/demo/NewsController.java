package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/NewsDB")
public class NewsController {

    private final NewsRepository newsRepository;


    public NewsController(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @PostMapping("/news")
    public News createNew(@RequestParam String header, @RequestParam String fullname, @RequestParam String cathegory,
                  @RequestParam String createdAt, @RequestParam String updatesAt, @RequestParam String text) {
        News news = new News(header, fullname, createdAt, updatesAt, text, cathegory);
        return this.newsRepository.save(news);
    }

    @GetMapping("/news/{id}")
    public News getNews(@PathVariable Long id) {
        return this.newsRepository.findNewsById(id);
    }

    @DeleteMapping("/news/{id}")
    public void deletePost(@PathVariable Long id) {
        this.newsRepository.deleteById(id);
    }

    @PutMapping("/news/{id}")
    News replaceHeader(@RequestBody News news, @PathVariable Long id) {
        News news1 = newsRepository.findNewsById(id);
        news1.setHeader(news.getHeader());
        final News updatedNews = newsRepository.save(news1);
        return updatedNews;
    }


}
