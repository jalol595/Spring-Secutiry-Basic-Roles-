package uz.pdp.apppcmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private String maker;

    @Column(nullable = false)
    private String type;

    @ManyToOne
    private Category category;
}
