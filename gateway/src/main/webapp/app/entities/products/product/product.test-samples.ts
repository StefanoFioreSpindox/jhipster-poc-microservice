import { IProduct, NewProduct } from './product.model';

export const sampleWithRequiredData: IProduct = {
  id: 23388,
};

export const sampleWithPartialData: IProduct = {
  id: 7917,
  quantity: 31190,
};

export const sampleWithFullData: IProduct = {
  id: 32395,
  name: 'smite furthermore oh',
  description: 'gah officially',
  quantity: 31640,
};

export const sampleWithNewData: NewProduct = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
