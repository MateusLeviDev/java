package org.levi.apicdc.apicdc.newinstance;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InstanceRepository extends JpaRepository<BookInstance, Long> {
}
