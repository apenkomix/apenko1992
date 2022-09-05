package org.example.javaspring.homework_24.entity;

import javax.persistence.*;

@Entity
public class House {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private HouseType HouseType;
    private Integer floor;
    private Integer entrance;

    public Integer getEntrance() {
        return entrance;
    }

    public void setEntrance(Integer entrance) {
        this.entrance = entrance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public org.example.javaspring.homework_24.entity.HouseType getHouseType() {
        return HouseType;
    }

    public void setHouseType(org.example.javaspring.homework_24.entity.HouseType houseType) {
        HouseType = houseType;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }
}
