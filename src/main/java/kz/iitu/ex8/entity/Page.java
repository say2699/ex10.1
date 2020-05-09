package kz.iitu.ex8.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Page {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer pageNo;
    private String chapterNo;

    @Column(name = "book_id")
    private Long bookId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id", insertable = false, updatable = false)
    private Book book;


    @Override
    public String toString() {
        return "Page{" +
                "id=" + id +
                ", pageNo=" + pageNo +
                ", chapterNo='" + chapterNo + '\'' +
                '}';
    }
}
