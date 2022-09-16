package org.example.javaspring.homework_24.service;

import org.example.javaspring.homework_24.converter.HouseConverter;
import org.example.javaspring.homework_24.dto.HouseDto;
import org.example.javaspring.homework_24.entity.House;
import org.example.javaspring.homework_24.entity.HouseType;
import org.example.javaspring.homework_24.repository.HouseRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HouseService {
    private final HouseRepository houseRepository;
    private final HouseConverter houseConverter;
    private final HouseServiceHelper houseServiceHelper;

    public HouseService(HouseRepository houseRepository, HouseConverter houseConverter, HouseServiceHelper houseServiceHelper) {
        this.houseRepository = houseRepository;
        this.houseConverter = houseConverter;
        this.houseServiceHelper = houseServiceHelper;
    }
    @Transactional(rollbackFor = Exception.class)
    public long save(HouseDto houseDto) {
        return houseRepository.save(houseConverter.toLocal(houseDto)).getId();
    }
    @Transactional
    public Long update(HouseDto houseDto){
        House house = houseConverter.toLocal(houseDto);
        House entity = houseRepository.findById(houseDto.id()).orElse(null);
        String[] nullPropertyNames = houseServiceHelper.getNullPropertyNames(house);
        BeanUtils.copyProperties(house, entity,nullPropertyNames);
        return entity.getId();
    }

    public List<HouseDto> findAllByType(HouseType houseType) {
        return houseRepository.findAllByHouseType(houseType).stream().map(houseConverter::toFront).toList();
    }
    public HouseDto getById(Long id){
        return houseRepository.findById(id).map(houseConverter::toFront).orElse(null);
    }
    public List<HouseDto> findAllById(List<Long> id) {
        return houseRepository.findAllByIdIn(id).stream().map(houseConverter::toFront).toList();
    }
    public List<HouseDto> findAllByFloorGreaterThenEqualOrderByIdDesc(int floor) {
        return houseRepository.findAllByFloorGreaterThanEqualOrderByIdDesc(floor).stream().map(houseConverter::toFront).toList();
    }
}
