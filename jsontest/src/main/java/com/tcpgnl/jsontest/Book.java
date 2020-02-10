package com.tcpgnl.jsontest;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

public class Book {
    private String name;
    private String author;
    @JsonIgnore
    private Float price;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date publicationDate;

    public void setAuthor(String author)
    {
        this.author=author;
    }
       public String setAuthor()
    {
        return author;
    }
    public void setName(String name)
    {
        this.name=name;
    }   public String setName()
    {
        return this.name;
    }
    public void setPrice(Float price)
    {
        this.price=price;
    }
    public Float setPrice()
    {
        return this.price;
    }
    public  void setPublicationDate(Date publicationDate)
    {
        this.publicationDate=publicationDate;
    }
    public  Date getPublicationDate()
    {
        return this.publicationDate;
    }

}
