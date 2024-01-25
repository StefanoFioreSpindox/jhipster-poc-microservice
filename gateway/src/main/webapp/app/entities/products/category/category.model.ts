import { IProduct } from 'app/entities/products/product/product.model';

export interface ICategory {
  id: number;
  name?: string | null;
  description?: string | null;
  products?: Pick<IProduct, 'id' | 'name'>[] | null;
}

export type NewCategory = Omit<ICategory, 'id'> & { id: null };
