package com.ivoyant.SpringApplication.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "clubs")
public class Club {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String title;

    private String photoURL;

    private String content;

    private String category;


    @CreationTimestamp
    private LocalDateTime createdOn;

    @UpdateTimestamp
    private LocalDateTime updatedOn;

    public String getTitle() {
        return title;
    }

    public String getPhotoURL(){
        return photoURL;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setId(Long id){
        this.Id = id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setPhotoURL(String photoURL){
        this.photoURL = photoURL;
    }

    public Long getId(){
        return Id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
