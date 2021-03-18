package org.example.rwitter.service;


import org.example.rwitter.model.Likes;

import java.util.List;

public interface LikesService {

    void createLike(Likes likes);
    void deleteLike(Likes likes);
    void updateLike(Likes likes);
    List<Likes> getAllLikes();
}
