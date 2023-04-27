package com.medeiros.SPRINGProject.Models;

import jakarta.persistence.*;

@Entity
@Table(name="MusicModel")
public class MusicModel {
    @Id
    private int id;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int MusicId;

    private String MusicName;

    private String Music;

    private String MusicDescription;

    public MusicModel(int id , String MusicName , String Music , String MusicDescription){
        this.id = id;
        this.Music = Music;
        this.MusicDescription = MusicDescription;
        this.MusicName = MusicName;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMusicName() {
        return MusicName;
    }

    public void setMusicName(String musicName) {
        MusicName = musicName;
    }

    public String getMusic() {
        return Music;
    }

    public void setMusic(String music) {
        Music = music;
    }

    public String getMusicDescription() {
        return MusicDescription;
    }

    public MusicModel(){

    }

    public void setMusicDescription(String musicDescription) {
        MusicDescription = musicDescription;
    }
}