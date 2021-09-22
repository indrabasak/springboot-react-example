package com.basaki.react.data.repository;

import com.basaki.react.data.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeerRepository extends JpaRepository<Beer, Long> {
}
