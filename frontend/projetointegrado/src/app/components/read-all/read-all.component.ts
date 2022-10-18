import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Pessoa } from 'src/app/models/pessoa';
import { PessoaService } from 'src/app/services/pessoa.service';

@Component({
  selector: 'app-read-all',
  templateUrl: './read-all.component.html',
  styleUrls: ['./read-all.component.css']
})
export class ReadAllComponent implements OnInit {

  list: Pessoa[] = [];

  constructor(private service: PessoaService, private router: Router){}
  
  ngOnInit(): void {
    this.findAll();
  }

  displayedColumns: string[] = ['codigoPessoa','nome','dataNascimento','cidadeNatal','sexo','cpf'];

  findAll(): void{
    this.service.findAll().subscribe((resposta) => {
      this.list = resposta;
      console.log("Valor atribuido na lista" + this.list[0]);
    })
  }

  criar(): void {
    this.router.navigate(['create']);
  }

}
