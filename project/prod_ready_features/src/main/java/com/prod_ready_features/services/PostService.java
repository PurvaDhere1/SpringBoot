package com.prod_ready_features.services;

import com.prod_ready_features.dto.PostDTO;

import java.util.List;

public interface PostService {

    List<PostDTO> getAllPosts();

    PostDTO createNewPost(PostDTO inpPostDTO);
}
