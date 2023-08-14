package com.springboot.blog.payload;

import lombok.Data;

import java.util.Set;

@Data
public class PostDto {
    private long id;
    private String title;
    private String Description;
    private String content;
    private Set<CommentDto> comments;
}
