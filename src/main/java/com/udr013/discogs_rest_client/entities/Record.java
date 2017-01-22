package com.udr013.discogs_rest_client.entities;


import com.udr013.discogs_rest_client.enums.MediaFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@Entity
public class Record  implements Serializable{

    private static final long serialVersionUID = -3994530320543829365L;

    @ManyToOne
    @JoinColumn(name = "idusers", insertable = false, updatable = false)
    private CdbUser user;

    public CdbUser getCdbUser() {
        return user;
    }

    public void setCdbUser(CdbUser user) {
        this.user = user;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String album;

    @Column(nullable = false)
    private String artist;

    private Date releaseDate;

    private String label;

    @Column(nullable = false)
    private int idusers;

    private MediaFormat format;

    private int disks;

    private double price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getIdusers() {
        return idusers;
    }

    public void setIdusers(int idusers) {
        this.idusers = idusers;
    }

    public MediaFormat getFormat() {
        return format;
    }

    public void setFormat(MediaFormat format) {
        this.format = format;
    }

    public int getDisks() {
        return disks;
    }

    public void setDisks(int disks) {
        this.disks = disks;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}



