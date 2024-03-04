package org.levi.apicdc.apicdc.bookdetail.category;

import org.modelmapper.ModelMapper;
import org.modelmapper.record.RecordModule;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    private final ModelMapper modelMapper;

    public CategoryServiceImpl(CategoryRepository categoryRepository, ModelMapper modelMapper) {
        this.categoryRepository = categoryRepository;
        this.modelMapper = new ModelMapper().registerModule(new RecordModule());
    }

    @Override
    public Category categoryRegistration(NewCategoryFormDTO newCategoryFormDTO) {
        return categoryRepository.save(modelMapper.map(newCategoryFormDTO, Category.class));
    }
}
