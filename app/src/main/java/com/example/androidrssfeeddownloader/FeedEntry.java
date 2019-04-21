package com.example.androidrssfeeddownloader;

public class FeedEntry {

    private String name;
    private String artist;
    private String releasedDate;
    private String summary;
    private String imageURL;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getReleasedDate() {
        return releasedDate;
    }

    public void setReleasedDate(String releasedDate) {
        this.releasedDate = releasedDate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    //The built in toString method gives you the hashcode value for an object
    //Overriding the built-in method with this String method so it gives
    //me a little more information. It's not pretty, but it at least means something

    @Override
    public String toString() {
        return
                "name=" + name + '\n' +
                ", artist=" + artist + '\n' +
                ", releasedDate=" + releasedDate + '\n' +
                ", imageURL=" + imageURL + '\n';
    }
}
