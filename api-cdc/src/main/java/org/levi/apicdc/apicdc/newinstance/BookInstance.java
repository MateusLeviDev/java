package org.levi.apicdc.apicdc.newinstance;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.levi.apicdc.apicdc.newbook.Books;

@Entity(name = "tbl_instances")
public class BookInstance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private InstanceType type;
    @ManyToOne
    @Valid
    private Books book;

    public BookInstance() {}

    public BookInstance(InstanceType type, Books book) {
        this.type = type;
        this.book = book;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public InstanceType getType() {
        return type;
    }

    public void setType(InstanceType type) {
        this.type = type;
    }

    public Books getBook() {
        return book;
    }

    public void setBook(Books book) {
        this.book = book;
    }
}
