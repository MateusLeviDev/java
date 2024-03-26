package org.levi.apicdc.apicdc.newbook;

import org.modelmapper.ModelMapper;
import org.modelmapper.record.RecordModule;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final ModelMapper modelMapper;

    public BookServiceImpl(BookRepository bookRepository, ModelMapper modelMapper) {
        this.bookRepository = bookRepository;
        this.modelMapper = new ModelMapper().registerModule(new RecordModule());
    }

    @Override
    public Books registerBook(NewBookRequest request) {
        return bookRepository.save(modelMapper.map(request, Books.class));
    }

    @Override
    public Optional<Books> isISBNAlreadyInUse(String isbn) {
        return Optional.ofNullable(this.bookRepository.findByIsbn(isbn)
                .orElseThrow(() -> new RuntimeException("Not found")));
    }

}
