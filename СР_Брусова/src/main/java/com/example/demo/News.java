package com.example.demo;


import javax.persistence.*;

@Entity
@Table(name = "News")
public class News{
    @Id
    @GeneratedValue(generator = "NewsId_generator")
    @SequenceGenerator(
            name = "NewsId_generator",
            sequenceName = "NewsID_sequence",
            initialValue = 1000
    )
    private Long id;

    @Column(name = "Header", nullable = false)
    private String header;

    @Column(name = "AUthorFullName", nullable = false)
    private String fullName;

    @Column(name = "CreatedAt", nullable = false)
    private String createdAt;

    @Column(name = "UpdatedAt", nullable = false)
    private String updatesAt;

    @Column(name = "Text", nullable = false)
    private String text;

    @Column(name = "Cathegory", nullable = false)
    private String cathegory;

    public News(String header, String fullName, String createdAt, String updatesAt, String text, String cathegory) {
        this.header=header;
        this.fullName=fullName;
        this.createdAt=createdAt;
        this.updatesAt = updatesAt;
        this.text=text;
        this.cathegory=cathegory;
    }
    public News(){}

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getCathegory() {
        return cathegory;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getHeader() {
        return header;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUpdatesAt() {
        return updatesAt;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCathegory(String cathegory) {
        this.cathegory = cathegory;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setUpdatesAt(String updatesAt) {
        this.updatesAt = updatesAt;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", header='" + header + '\'' +
                ", fullName='" + fullName + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatesAt='" + updatesAt + '\'' +
                ", text='" + text + '\'' +
                ", cathegory='" + cathegory + '\'' +
                '}';
    }
}
