package ao.it.keadcode.dsvendas.service;

import ao.it.keadcode.dsvendas.dto.SaleDTO;
import ao.it.keadcode.dsvendas.entities.Sale;
import ao.it.keadcode.dsvendas.repositories.SaleRepository;
import ao.it.keadcode.dsvendas.repositories.SellerRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Edvander Borges
 */
@Service
public class SaleService {
    
    @Autowired
    private SaleRepository repository;
    
    @Autowired
    private SellerRepository sellerRepository;
    
    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable page){
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(page);
        return result.map(x-> new SaleDTO(x));
    }
    
}
