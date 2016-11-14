package com.eventbus;

/**
 * Created by Hari Prasad on 11/15/16.
 */
public class MessageEvent {
    private String text;

    public MessageEvent(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
