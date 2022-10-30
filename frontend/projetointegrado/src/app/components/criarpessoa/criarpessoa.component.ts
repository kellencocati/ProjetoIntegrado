import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Pessoa } from 'src/app/models/pessoa';
import { PessoaService } from 'src/app/services/pessoa.service';

@Component({
  selector: 'app-criarpessoa',
  templateUrl: './criarpessoa.component.html',
  styleUrls: ['./criarpessoa.component.css']
})
export class CriarpessoaComponent implements OnInit {

  constructor(private router: Router, private service: PessoaService) { }

  pessoa: Pessoa = {
    nome: '',
    dataNascimento: new Date(),
    cidadeNatal: '',
    endereco: '',
    numeroEndereco: '',
    complementoEndereco: '',
    sexo: '',
    cpf: '',
    dataCadastro: new Date(),
    telefoneResidencial: '',
    telefoneCelular: '',
    documento: '',
    tipoDocumento: '',
    senhaAcesso: '',
    email: ''
  }

  criar(): void {
    this.formataData();
    this.service.criar(this.pessoa).subscribe((resposta) => {
      this.service.message('Pessoa criada com sucesso.');
      this.router.navigate(['']);
    })
  }

  ngOnInit(): void {
  }

  voltar(): void {
    this.router.navigate(['']);
  }

  formataData(): void {
    let dataNascimento = new Date(this.pessoa.dataNascimento);
    this.pessoa.dataNascimento = `${dataNascimento.getDate()}/${dataNascimento.getMonth() + 1}/${dataNascimento.getFullYear()}`;
    console.log(this.pessoa.dataNascimento);
    let dataCadastro = new Date(this.pessoa.dataCadastro);
    this.pessoa.dataCadastro = `${dataCadastro.getDate()}/${dataCadastro.getMonth() + 1}/${dataCadastro.getFullYear()}`;
    console.log(this.pessoa.dataCadastro);
  }

}
