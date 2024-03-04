package org.levi.apicdc.apicdc.bookdetail.category;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Optional;


public class CategoryNameValidator implements ConstraintValidator<CategoryNameConstraint, Category> {


    private final CategoryRepository categoryRepository;

    public CategoryNameValidator(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void initialize(CategoryNameConstraint constraintAnnotation) {
    }

    @Override
    public boolean isValid(Category category, ConstraintValidatorContext constraintValidatorContext) {
        Optional<Category> existingCategory = categoryRepository.findByName(category.getName());

        return existingCategory.isEmpty() || !existingCategory.get().getId().equals(category.getId());
    }

}
