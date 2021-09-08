package ao.it.keadcode.dsvendas.dto;

import ao.it.keadcode.dsvendas.entities.Sale;
import java.time.LocalDate;
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
public class SaleDTO {

    private long id;
    private int visited;
    private int deals;
    private double amount;
    private LocalDate date;
    
    private SellerDTO seller;

    public SaleDTO(Sale entity) {
        this.id = entity.getId();
        this.visited = entity.getVisited();
        this.deals = entity.getDeals();
        this.amount = entity.getAmount();
        this.date = entity.getDate();
        this.seller = new SellerDTO(entity.getSeller());
    }
    
}
