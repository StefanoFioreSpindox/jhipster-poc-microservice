import { ICategory } from 'app/entities/products/category/category.model';

export interface IProduct {
  id?: number;
  name?: string | null;
  description?: string | null;
  quantity?: number | null;
  category?: ICategory | null;
}

export class Product implements IProduct {
  constructor(
    public id?: number,
    public name?: string | null,
    public description?: string | null,
    public quantity?: number | null,
    public category?: ICategory | null
  ) {}
}

export function getProductIdentifier(product: IProduct): number | undefined {
  return product.id;
}
