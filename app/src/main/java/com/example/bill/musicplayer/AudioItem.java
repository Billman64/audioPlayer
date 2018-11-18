package com.example.bill.musicplayer;

public class AudioItem {
    String title;
    String creator;
    String link;

    AudioItem(String inputTitle, String inputCreator, String inputLink){
        title = inputTitle;
        creator = inputCreator;
        link = inputLink;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
