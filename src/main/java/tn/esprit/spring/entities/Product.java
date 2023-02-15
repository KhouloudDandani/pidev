package tn.esprit.spring.entities;

import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

    @Getter
    @Setter
    @Entity
    @Table(name = "products")
    public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
        private List<OrderLine> orderLines = new ArrayList<>();

        // getters and setters
    }





