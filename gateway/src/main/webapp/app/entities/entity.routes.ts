import { Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'product',
    data: { pageTitle: 'gatewayApp.productsProduct.home.title' },
    loadChildren: () => import('./products/product/product.routes'),
  },
  {
    path: 'category',
    data: { pageTitle: 'gatewayApp.productsCategory.home.title' },
    loadChildren: () => import('./products/category/category.routes'),
  },
  /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
];

export default routes;
