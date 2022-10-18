import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-criarpessoa',
  templateUrl: './criarpessoa.component.html',
  styleUrls: ['./criarpessoa.component.css']
})
export class CriarpessoaComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  voltar(): void {
    this.router.navigate(['']);
  }

}
