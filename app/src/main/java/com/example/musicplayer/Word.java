package com.example.musicplayer;

public class Word {
    private String miwok ;
    private String normal;

    private int mid =-1;
    //for the music
    private int mmusic ;
    public Word(String mi , String nor, int musicid){
        miwok =mi;
        normal = nor;
        mmusic = musicid;
    }
    public Word(String mi , String nor , int xx,int music){
        miwok =mi;
        normal = nor;
        mid = xx;
        mmusic = music;
    }
    public String getMiwok(){
        return miwok;
    }
    public String getNormal(){
        return normal;
    }
    public int getMid(){
        return mid;
    }

    //isimage tell that image is there or not in the input
    public boolean isImage(){
        if(mid==-1){
            return false;
        }
        return true;
    }
    public int getmusic(){
        return mmusic;
    }


}
