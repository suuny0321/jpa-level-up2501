package com.ll.jpa2501.global.initData;

import com.ll.jpa2501.domain.post.Post;
import com.ll.jpa2501.domain.post.PostService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitData {
    @Bean
    public ApplicationRunner applicationRunner(PostService chatRoomService) {
        return args -> {
           Post post = chatRoomService.create("제목", "내용", "작성자");
        };
    }
}
