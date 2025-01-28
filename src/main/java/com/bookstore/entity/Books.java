package com.bookstore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Books {
    @Id
    private int bookid;
    private  String bookname;
    private  int yearofpublication;
    @Column(name = "description")
    private  String desc;
    private  String booktype;

    public Books() {
    }

    public Books(int bookid, String bookname, int yearofpublication, String desc, String booktype) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.yearofpublication = yearofpublication;
        this.desc = desc;
        this.booktype = booktype;
    }

    public String gettype() {
        return booktype;
    }

    public void setAuthor(String author) {
        this.booktype = author;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getYearofpublication() {
        return yearofpublication;
    }

    public void setYearofpublication(int yearofpublication) {
        this.yearofpublication = yearofpublication;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }
}
