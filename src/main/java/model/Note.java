package model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table
public class Note {

    @Id
    @Column
    private int id;
    @Column
    private String description;
    @Column
    private String link;
    @Column
    private Date creationDate;
    @Column
    private int noteCategoryID;

    public Note() {}

    public Note(int id, String description, String link, Date creationDate, int noteCategoryID) {
        this.id = id;
        this.description = description;
        this.link = link;
        this.creationDate = creationDate;
        this.noteCategoryID = noteCategoryID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public int getNoteCategoryID() {
        return noteCategoryID;
    }

    public void setNoteCategoryID(int noteCategoryID) {
        this.noteCategoryID = noteCategoryID;
    }
}
