package tn.esprit.spring.entities;

import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Table(name = "Transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Enumerated(EnumType.STRING)
    private TransactionMethod Type;
    @Enumerated(EnumType.STRING)
    private TransactionStatus Status;
    private String Description;
    private Date transactionDate;


    @OneToOne(fetch = FetchType.LAZY)
    private Invoice invoice;
}

