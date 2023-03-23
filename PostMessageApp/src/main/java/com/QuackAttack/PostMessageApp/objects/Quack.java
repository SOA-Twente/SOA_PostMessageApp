package com.QuackAttack.PostMessageApp.objects;

public class Quack {
    private int id;
    private int userId;
    private String message;
    private boolean isReply;
    private int repliedQuackId;
    private boolean isRetweet;
    private int retweetedQuackId;
    private String createdAt;

    public Quack(int id, String message, int userId, boolean isReply, int repliedQuackId, boolean isRetweet, int retweetedQuackId, String createdAt) {
        this.id = id;
        this.message = message;
        this.userId = userId;
        this.isReply = isReply;
        this.repliedQuackId = repliedQuackId;
        this.isRetweet = isRetweet;
        this.retweetedQuackId = retweetedQuackId;
        this.createdAt = createdAt;
    }
}
