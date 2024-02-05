package it.spindox.jhipsterpoc.products.service.mapper;

import it.spindox.jhipsterpoc.products.domain.*;
import it.spindox.jhipsterpoc.products.service.dto.ProductDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Product} and its DTO {@link ProductDTO}.
 */
@Mapper(componentModel = "spring", uses = { CategoryMapper.class })
public interface ProductMapper extends EntityMapper<ProductDTO, Product> {
    @Mapping(target = "category", source = "category", qualifiedByName = "id")
    ProductDTO toDto(Product s);
}
