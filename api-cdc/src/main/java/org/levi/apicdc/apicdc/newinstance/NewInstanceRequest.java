package org.levi.apicdc.apicdc.newinstance;

import org.levi.apicdc.apicdc.newbook.Books;

public record NewInstanceRequest(
        InstanceType type
) {
    public BookInstance toModel(Books book) {
        return new BookInstance(type, book);
    }
}
