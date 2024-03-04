package org.levi.apicdc.apicdc.bookdetail.author;

import org.springframework.stereotype.Service;

@Service
public interface AuthorService {

    Author authorRegistration(AuthorFormDTO authorFormDTO);

}
