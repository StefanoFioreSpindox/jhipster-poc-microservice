package it.spindox.jhipsterpoc.products.service.mapper;

import it.spindox.jhipsterpoc.products.domain.Category;
import it.spindox.jhipsterpoc.products.domain.Product;
import it.spindox.jhipsterpoc.products.service.dto.CategoryDTO;
import it.spindox.jhipsterpoc.products.service.dto.ProductDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Product} and its DTO {@link ProductDTO}.
 */
@Mapper(componentModel = "spring")
public interface ProductMapper extends EntityMapper<ProductDTO, Product> {
    @Mapping(target = "category", source = "category", qualifiedByName = "categoryId")
    ProductDTO toDto(Product s);

    @Named("categoryId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    CategoryDTO toDtoCategoryId(Category category);
}
