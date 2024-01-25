import { ICategory, NewCategory } from './category.model';

export const sampleWithRequiredData: ICategory = {
  id: 21424,
};

export const sampleWithPartialData: ICategory = {
  id: 16572,
  name: 'currant',
  description: 'instead swift bah',
};

export const sampleWithFullData: ICategory = {
  id: 24517,
  name: 'for stealthily',
  description: 'bah oil',
};

export const sampleWithNewData: NewCategory = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
