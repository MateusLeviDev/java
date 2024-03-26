package org.levi.apicdc.apicdc.newbook;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.hibernate.validator.constraints.ISBN;

import java.math.BigDecimal;
import java.util.UUID;

@Entity(name = "tbl_books")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @NotBlank(message = "title shouldn't not be null or empty")
    private String title;
    @NotNull(message = "price shouldn't not be null")
    @Positive(message = "invalid price")
    private BigDecimal price;
    @NotBlank
    @ISBN(type = ISBN.Type.ISBN_13)
    private String isbn;

    public Books() {
    }

    public Books(@NotBlank String title, @NotNull @Positive BigDecimal price,
                 @NotBlank @ISBN(type = ISBN.Type.ISBN_13) String isbn) {
        this.title = title;
        this.price = price;
        this.isbn = isbn;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
