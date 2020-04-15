package com.example.assignmentt6;

public class ContactModel {
    String topic;
    String content;
    String time;
    Boolean chose;

    public ContactModel(String topic, String content, String time, Boolean chose) {
        this.topic = topic;
        this.content = content;
        this.time = time;
        this.chose = chose;
    }

    public String getTopic() {
        return topic;
    }

    public String getContent() {
        return content;
    }

    public String getTime() {
        return time;
    }

    public Boolean getChose() {
        return chose;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setChose(Boolean chose) {
        this.chose = chose;
    }
}
