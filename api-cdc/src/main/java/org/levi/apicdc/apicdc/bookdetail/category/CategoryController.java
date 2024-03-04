package org.levi.apicdc.apicdc.bookdetail.category;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public ResponseEntity<?> categoryRegistration(@RequestBody @Valid NewCategoryFormDTO form) {
        return new ResponseEntity<>(this.categoryService.categoryRegistration(form), HttpStatus.CREATED);
    }
}
