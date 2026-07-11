package com.prod_ready_features.services;

import com.prod_ready_features.dto.PostDTO;

import java.util.List;

public class PostServiceImpl implements PostService{

    @Override
    public List<PostDTO> getAllPosts() {
        return List.of();
    }

    @Override
    public PostDTO createNewPost(PostDTO inpPostDTO) {
        return null;
    }
}
