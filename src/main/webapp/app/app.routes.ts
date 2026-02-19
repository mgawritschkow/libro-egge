import { Routes } from '@angular/router';

import { errorRoute } from './layouts/error/error.route';

const routes: Routes = [
  {
    path: '',
    loadComponent: () => import('./home/home'),
    title: 'home.title',
  },
  {
    path: '',
    loadComponent: () => import('./layouts/navbar/navbar'),
    outlet: 'navbar',
  },
  {
    path: 'login',
    loadComponent: () => import('./login/login'),
    title: 'login.title',
  },
  {
    path: 'libroegge',
    loadChildren: () => import(`./entities/entity.routes`),
  },
  ...errorRoute,
];

export default routes;
