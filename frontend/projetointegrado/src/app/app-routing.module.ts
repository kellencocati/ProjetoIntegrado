import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CriarpessoaComponent } from './components/criarpessoa/criarpessoa.component';
import { ReadAllComponent } from './components/read-all/read-all.component';

const routes: Routes = [
  {
    path: '',
    component: ReadAllComponent
  },
  {
    path: 'create',
    component: CriarpessoaComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
