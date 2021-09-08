/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ao.it.keadcode.dsvendas.dto;

import ao.it.keadcode.dsvendas.entities.Seller;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Edvander Borges
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SellerDTO implements Serializable {

    private long id;
    private String name;
    
    public SellerDTO(Seller entity){
        id = entity.getId();
        name = entity.getName();
    }
}
