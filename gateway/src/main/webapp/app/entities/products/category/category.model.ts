import { IProduct } from 'app/entities/products/product/product.model';

export interface ICategory {
  id?: number;
  name?: string | null;
  description?: string | null;
  products?: IProduct[] | null;
}

export class Category implements ICategory {
  constructor(public id?: number, public name?: string | null, public description?: string | null, public products?: IProduct[] | null) {}
}

export function getCategoryIdentifier(category: ICategory): number | undefined {
  return category.id;
}
