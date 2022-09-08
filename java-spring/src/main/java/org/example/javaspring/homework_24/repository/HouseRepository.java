package org.example.javaspring.homework_24.repository;

import org.example.javaspring.homework_24.entity.House;
import org.example.javaspring.homework_24.entity.HouseType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//Можно использовать CrudRepository, так как не используются методы с пагинацией
@Repository
public interface HouseRepository extends PagingAndSortingRepository<House, Long> {
    List<House> findAllByHouseType(HouseType houseType);
    List<House> findAllById(List<Long> id);
    List<House> findAllByFloorGreaterThenEqualOrderByIdDesc(int floor);
}
