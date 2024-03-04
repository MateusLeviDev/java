package org.levi.apicdc.apicdc.bookdetail.category;

import org.springframework.stereotype.Repository;

@Repository
public interface CategoryService {

    Category categoryRegistration(NewCategoryFormDTO form);
}
