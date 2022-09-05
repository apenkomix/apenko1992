package org.example.javaspring.homework_23.repository;


import org.example.javaspring.homework_23.entity.Laptop;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends PagingAndSortingRepository<Laptop,Long> {
}
