package org.example.javaspring.homework_23.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
@Entity
public class Laptop {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private Producer producer;
    private Processor processor;
    private BigDecimal price;

    public Laptop() {
    }

    public Laptop(long id, Producer producer, Processor processor, BigDecimal price) {
        this.id = id;
        this.producer = producer;
        this.processor = processor;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
