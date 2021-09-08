/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ao.it.keadcode.dsvendas.repositories;

import ao.it.keadcode.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Edvander Borges
 */
@Repository
public interface SaleRepository extends JpaRepository<Sale, Long>{
    
}
