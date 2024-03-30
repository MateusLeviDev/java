package org.levi.apicdc.apicdc.newinstance;

import org.levi.apicdc.apicdc.newbook.BookRepository;
import org.levi.apicdc.apicdc.newbook.Books;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InstanceServiceImpl implements InstanceService{

    private final BookRepository bookRepository;
    private final BooksInstanceRepository instanceRepository;

    public InstanceServiceImpl(BookRepository bookRepository, BooksInstanceRepository instanceRepository) {
        this.bookRepository = bookRepository;
        this.instanceRepository = instanceRepository;
    }

    @Override
    public BookInstance createInstance(String isbn, NewInstanceRequest request) {
        Optional<Books> optionalBooks = this.bookRepository.findByIsbn(isbn);
        if (optionalBooks.isEmpty()) {
            throw new RuntimeException("Not found");
        }

        BookInstance instance = new BookInstance(request.type(), optionalBooks.get());
        return this.instanceRepository.save(instance);
    }
}
