package com.fullcycle.admin.catalogo.domain.category;

import com.fullcycle.admin.catalogo.domain.pagination.Pagination;

import java.util.Optional;

public interface CategoryGateway {

    Category create(Category category);

    Category deleteById(CategoryID anID);

    Optional<Category> findById(CategoryID anID);

    Category update(Category category);

    Pagination<Category> findAll(CategorySearchQuery aQuery);

}
