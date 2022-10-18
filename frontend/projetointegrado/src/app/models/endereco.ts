import { cidade } from "./cidade";

export interface endereco {
    codigoEndereco?: String,
    logradouro: String,
    bairro: String,
    cep: String,
    cidade: cidade
}
