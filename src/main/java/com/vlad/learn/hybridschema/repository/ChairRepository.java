package com.vlad.learn.hybridschema.repository;

import com.vlad.learn.hybridschema.entity.Chair;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChairRepository extends JpaRepository<Chair, Long> {
}
