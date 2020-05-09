package kz.iitu.ex8.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String authpr;

    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY)
    private List<Page> pages;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authpr='" + authpr + '\'' +
                ", pages=" + pages +
                '}';
    }
}
