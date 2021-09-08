/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ao.it.keadcode.dsvendas.entities;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Edvander Borges
 */
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "tb_sales")
@NoArgsConstructor
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY
    )
    private long id;
    private int visited;
    private int deals;
    private double amount;
    private LocalDate date;
    
    
    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;
    
}
