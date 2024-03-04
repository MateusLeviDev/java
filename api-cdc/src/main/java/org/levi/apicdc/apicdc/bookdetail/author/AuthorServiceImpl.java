package org.levi.apicdc.apicdc.bookdetail.author;

import org.modelmapper.ModelMapper;
import org.modelmapper.record.RecordModule;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;
    private final ModelMapper modelMapper;


    public AuthorServiceImpl(AuthorRepository authorRepository, ModelMapper modelMapper) {
        this.authorRepository = authorRepository;
        this.modelMapper = new ModelMapper().registerModule(new RecordModule());
    }

    @Override
    public Author authorRegistration(AuthorFormDTO authorFormDTO) {
        return authorRepository.save(modelMapper.map(authorFormDTO, Author.class));
    }
}
