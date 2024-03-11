package org.levi.apicdc.apicdc.newinstance;

import jakarta.validation.Valid;
import org.levi.apicdc.apicdc.newbook.BookService;
import org.levi.apicdc.apicdc.newbook.Books;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping
public class NewBookInstanceController {

    private final BookService bookService;
    private final InstanceRepository instanceRepository;

    public NewBookInstanceController(BookService bookService, InstanceRepository instanceRepository) {
        this.bookService = bookService;
        this.instanceRepository = instanceRepository;
    }

    @PostMapping("/book/{isbn}/instance")
    public ResponseEntity<?> crateInstance(@PathVariable String isbn, @Valid @RequestBody NewInstanceRequest request) {
        Optional<Books> optionalBooks = this.bookService.isISBNAlreadyInUse(isbn);
        if (optionalBooks.isEmpty())
            return ResponseEntity.notFound().build();

        BookInstance instance = request.toModel(optionalBooks.get());
        this.instanceRepository.save(instance);

        return ResponseEntity.ok(instance);
    }
}
