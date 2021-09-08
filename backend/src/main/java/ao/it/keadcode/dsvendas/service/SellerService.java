/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ao.it.keadcode.dsvendas.service;

import ao.it.keadcode.dsvendas.dto.SellerDTO;
import ao.it.keadcode.dsvendas.entities.Seller;
import ao.it.keadcode.dsvendas.repositories.SellerRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Edvander Borges
 */
@Service
public class SellerService {
    
    @Autowired
    private SellerRepository repository;
    
    public List<SellerDTO> findAll(){
        List<Seller> result = repository.findAll();
        return result.stream().map(x-> new SellerDTO(x)).collect(Collectors.toList());
    }
    
}
