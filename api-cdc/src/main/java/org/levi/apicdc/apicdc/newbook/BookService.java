package org.levi.apicdc.apicdc.newbook;

import jakarta.validation.Valid;

import java.util.Optional;

public interface BookService {
    Books registerBook(@Valid NewBookRequest request);
    Optional<Books> isISBNAlreadyInUse(String isbn);
}
