package org.levi.apicdc.apicdc.author;

import org.springframework.stereotype.Service;

@Service
public interface AuthorService {

    Author authorRegistration(AuthorFormDTO authorFormDTO);

}
