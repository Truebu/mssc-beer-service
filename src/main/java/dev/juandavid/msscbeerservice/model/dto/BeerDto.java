package dev.juandavid.msscbeerservice.model.dto;

import dev.juandavid.msscbeerservice.model.constants.EBeerStyle;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    private UUID id;
    private Integer version;
    private OffsetDateTime createDate;
    private OffsetDateTime lastModifiedDate;
    private String name;
    private EBeerStyle style;
    private Long upc;
    private BigDecimal price;
    private Integer quantityOnHand;
}
