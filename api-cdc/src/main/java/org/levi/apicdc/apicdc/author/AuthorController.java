package org.levi.apicdc.apicdc.author;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping()
    public ResponseEntity<?> authorsRegistration(@RequestBody @Valid AuthorFormDTO authorDTO) {
        return new ResponseEntity<>(this.authorService.authorRegistration(authorDTO), HttpStatus.CREATED);
    }
}
