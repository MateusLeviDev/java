package org.levi.apicdc.apicdc.bookdetail.category;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity(name = "TBL_CATEGORIES")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(unique = true)
    @CategoryNameConstraint
    private String name;

    public Category() {
    }

    public Category(@NotBlank String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
