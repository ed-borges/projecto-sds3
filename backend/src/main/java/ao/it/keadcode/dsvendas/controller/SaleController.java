package ao.it.keadcode.dsvendas.controller;

import ao.it.keadcode.dsvendas.dto.SaleDTO;
import ao.it.keadcode.dsvendas.dto.SellerDTO;
import ao.it.keadcode.dsvendas.service.SaleService;
import ao.it.keadcode.dsvendas.service.SellerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Edvander Borges
 */
@RestController
@RequestMapping("/sales")
public class SaleController {
    
    @Autowired
    private SaleService service;
    
    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable page){
        Page<SaleDTO> list = service.findAll(page);
        return ResponseEntity.ok(list);
    }
    
}
