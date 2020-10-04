package com.szymanski.module.blog;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
@Scope("singleton")
public class PostMemoryStorageService {
    private static final List<PostDto>STORAGE=new ArrayList<>();
    static {
        STORAGE.add(new PostDto("1","Lorem ipsum","elo1"));
        STORAGE.add(new PostDto("2","Lorem ipsum aaaa","elo2"));
        STORAGE.add(new PostDto("3","Lorem ipsum dddd","elo3"));
    }

    public Optional<PostDto>getPost(String uuid){
        return STORAGE.stream().filter(post->post.getUuid().equalsIgnoreCase(uuid)).findFirst();}

    public List <PostDto> getPosts(){return STORAGE;}

    public PostDto create(String tittle, String text){
    PostDto post=new PostDto(tittle,text);
    STORAGE.add(post);
    return post;
}}
