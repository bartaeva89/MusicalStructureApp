package com.example.android.musicalstructureapp;

public class Song {
    private String mSongName;
    private String mArtistName;

    public Song(String songName, String artistName) {
        this.mSongName = songName;
        this.mArtistName = artistName;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getArtistName() {
        return mArtistName;
    }
}
