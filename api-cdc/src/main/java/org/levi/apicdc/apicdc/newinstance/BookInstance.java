package org.levi.apicdc.apicdc.newinstance;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.levi.apicdc.apicdc.newbook.Books;

@Entity
public class BookInstance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Type type;
    @ManyToOne
    @NotNull
    @Valid
    private Books book;

    public BookInstance(Type type, Books book) {
        this.type = type;
        this.book = book;
    }
}
