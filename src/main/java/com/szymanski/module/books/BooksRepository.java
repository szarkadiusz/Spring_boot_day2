package com.szymanski.module.books;

import com.szymanski.module.entity.BooksEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BooksRepository extends JpaRepository <BooksEntity, Long>, JpaSpecificationExecutor<BooksEntity> {
}
