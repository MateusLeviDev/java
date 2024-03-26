package org.levi.apicdc.apicdc.newbook;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class NewBookController {

    private final BookService bookService;

    public NewBookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<?> registerBook(@Valid @RequestBody NewBookRequest request) {
        return new ResponseEntity<>(this.bookService.registerBook(request), HttpStatus.CREATED);
    }
}
