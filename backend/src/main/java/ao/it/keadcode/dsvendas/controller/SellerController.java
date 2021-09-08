package ao.it.keadcode.dsvendas.controller;

import ao.it.keadcode.dsvendas.dto.SellerDTO;
import ao.it.keadcode.dsvendas.service.SellerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Edvander Borges
 */
@RestController
@RequestMapping("/sellers")
public class SellerController {
    
    @Autowired
    private SellerService service;
    
    @GetMapping
    public ResponseEntity<List<SellerDTO>> findAll(){
        List<SellerDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }
    
}
