import { endereco } from "./endereco";

export interface Pessoa {
    codigoPessoa?: String,
    nome: String,
    dataNascimento: String,
    cidadeNatal: String,
    endereco: endereco,
    numeroEndereco: String,
    complementoEndereco: String,
    sexo: String,
    cpf: String,
    dataCadastro: String,
    telefoneResidencial: String,
    telefoneCelular: String,
    documento: String,
    tipoDocumento: String,
    senhaAcesso: String,
    email: String
}