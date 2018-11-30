package com.luteh.rxjavapractice.model;

/**
 * Created by Luthfan Maftuh on 30/11/2018.
 * Email luthfanmaftuh@gmail.com
 */
public class Note {
    private int id;
    private String note;

    public Note(int id, String note) {
        this.id = id;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
