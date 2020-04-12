package com.example.lab9dynamicview.model;

public class PostItem {

    String userName;
    String postImgUrl;
    String postText;

    int postLikeCount;
    boolean isUserLiked;

    public PostItem(String userName, String postImgUrl, String postText, int postLikeCount, boolean isUserLiked) {
        this.userName = userName;
        this.postImgUrl = postImgUrl;
        this.postText = postText;
        this.postLikeCount = postLikeCount;
        this.isUserLiked = isUserLiked;
    }

    public String getUserName() {
        return userName;
    }

    public String getPostImgUrl() {
        return postImgUrl;
    }

    public String getPostText() {
        return postText;
    }

    public int getPostLikeCount() {
        return postLikeCount;
    }

    public boolean isUserLiked() {
        return isUserLiked;
    }
}
