package org.example.javaspring.homework_24.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class House {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private HouseType houseType;
    private Integer floor;
    private Integer entrance;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;
    @OneToMany(mappedBy = "house", cascade = CascadeType.ALL)
    private List<Elevator> elevators;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "resident_house",
    joinColumns = @JoinColumn(name = "house_id"),
    inverseJoinColumns = @JoinColumn(name = "resident_id"))
    private List<Resident> residents;

    public List<Resident> getResidents() {
        return residents;
    }

    public void setResidents(List<Resident> residents) {
        this.residents = residents;
    }

    public List<Elevator> getElevators() {
        return elevators;
    }

    public void setElevators(List<Elevator> elevators) {
        this.elevators = elevators;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

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
        return houseType;
    }

    public void setHouseType(org.example.javaspring.homework_24.entity.HouseType houseType) {
        this.houseType = houseType;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }
}
