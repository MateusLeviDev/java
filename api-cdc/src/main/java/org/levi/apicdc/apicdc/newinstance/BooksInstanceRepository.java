package org.levi.apicdc.apicdc.newinstance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksInstanceRepository extends JpaRepository<BookInstance, Long> {
}
