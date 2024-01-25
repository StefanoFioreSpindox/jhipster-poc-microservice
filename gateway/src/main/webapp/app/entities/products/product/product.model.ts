import { ICategory } from 'app/entities/products/category/category.model';

export interface IProduct {
  id: number;
  name?: string | null;
  description?: string | null;
  quantity?: number | null;
  category?: Pick<ICategory, 'id'> | null;
}

export type NewProduct = Omit<IProduct, 'id'> & { id: null };
