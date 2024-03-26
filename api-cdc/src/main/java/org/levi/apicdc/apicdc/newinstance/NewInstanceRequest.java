package org.levi.apicdc.apicdc.newinstance;

import jakarta.validation.constraints.NotNull;
import org.levi.apicdc.apicdc.newbook.Books;

public class NewInstanceRequest {

    @NotNull
    private Type type;

    public void setType(Type type) {
        this.type = type;
    }

    public BookInstance toModel(Books book) {
        return new BookInstance(type, book);
    }
}
