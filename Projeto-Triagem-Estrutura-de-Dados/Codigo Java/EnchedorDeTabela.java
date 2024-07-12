package com.mycompany.triagem;

import java.util.ArrayList;

public class EnchedorDeTabela {
    public static void main(String[] args) {
        String[] nomes = {
            "Ana Silva", "Pedro Oliveira", "Marina Santos", "João Lima", "Juliana Costa", "Marcos Oliveira",
            "Fernanda Santos", "André Almeida", "Camila Lima", "Lucas Silva", "Mariana Oliveira", "Ricardo Alves",
            "Patrícia Santos", "Gustavo Lima", "Vanessa Silva", "Daniel Oliveira", "Amanda Santos", "Carlos Almeida",
            "Renata Lima", "Felipe Silva", "Isabela Souza", "Thiago Fernandes", "Larissa Pereira", "Lucas Oliveira",
            "Carolina Santos", "Gabriel Pereira", "Bruna Oliveira", "Rodrigo Costa", "Tatiane Almeida"
        };
        
        String[] telefones = {
            "(11) 1234-5678", "(21) 9876-5432", "(81) 2345-6789", "(31) 8765-4321", "(51) 3456-7890", "(11) 5555-5555",
            "(21) 2222-2222", "(81) 3333-3333", "(31) 4444-4444", "(51) 6666-6666", "(11) 7777-7777", "(21) 8888-8888",
            "(81) 9999-9999", "(31) 0000-0000", "(51) 1111-1111", "(11) 9999-9999", "(21) 0000-0000", "(81) 1111-1111",
            "(31) 2222-2222", "(51) 3333-3333", "(11) 8888-8888", "(21) 7777-7777", "(81) 6666-6666", "(31) 5555-5555",
            "(51) 4444-4444", "(11) 3333-3333", "(21) 6666-6666", "(81) 7777-7777", "(31) 9999-9999"
        };
        String[] cpfs = {
            "123.456.789-00", "987.654.321-01", "456.789.123-02", "654.321.987-03", "789.123.456-04", "111.222.333-05",
            "222.333.444-06", "333.444.555-07", "444.555.666-08", "555.666.777-09", "666.777.888-10", "777.888.999-11",
            "888.999.000-12", "999.000.111-13", "000.111.222-14", "111.222.333-15", "222.333.444-16", "333.444.555-17",
            "444.555.666-18", "555.666.777-19", "666.777.888-20", "777.888.999-21", "888.999.000-22", "999.000.111-23",
            "000.111.222-24", "111.222.333-25", "222.333.444-26", "333.444.555-27", "444.555.666-28" 
        };
        String[] sexos = {
            "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", 
            "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino",
            "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino",
            "Feminino", "Masculino", "Feminino", "Masculino", "Feminino", "Masculino"
        };
        String[] enderecos = {
            "Rua das Flores, 123, São Paulo - SP", "Avenida Principal, 456, Rio de Janeiro - RJ", 
            "Travessa das Palmeiras, 789, Recife - PE", "Rua da Paz, 321, Belo Horizonte - MG",
            "Praça Central, 987, Porto Alegre - RS", "Rua da Amizade, 10, São Paulo - SP",
            "Avenida Central, 20, Rio de Janeiro - RJ", "Rua das Pedras, 30, Recife - PE",
            "Avenida dos Sonhos, 40, Belo Horizonte - MG", "Rua das Estrelas, 50, Porto Alegre - RS",
            "Rua dos Desejos, 60, São Paulo - SP", "Avenida dos Sonhos, 70, Rio de Janeiro - RJ",
            "Travessa da Esperança, 80, Recife - PE", "Rua das Oportunidades, 90, Belo Horizonte - MG",
            "Avenida das Flores, 100, Porto Alegre - RS", "Rua das Amoras, 110, São Paulo - SP",
            "Avenida da Liberdade, 120, Rio de Janeiro - RJ", "Rua das Maravilhas, 130, Recife - PE",
            "Avenida dos Anjos, 140, Belo Horizonte - MG", "Rua da Alegria, 150, Porto Alegre - RS",
            "Rua das Maravilhas, 130, Recife - PE", "Avenida dos Anjos, 140, Belo Horizonte - MG",
            "Rua da Alegria, 150, Porto Alegre - RS", "Rua das Flores, 123, São Paulo - SP",
            "Avenida Principal, 456, Rio de Janeiro - RJ", "Travessa das Palmeiras, 789, Recife - PE",
            "Rua da Paz, 321, Belo Horizonte - MG", "Praça Central, 987, Porto Alegre - RS",
            "Rua da Amizade, 10, São Paulo - SP", "Avenida Central, 20, Rio de Janeiro - RJ"
        };
        String[] emails = {
            "ana.silva@email.com", "pedro.oliveira@email.com", "marina.santos@email.com", "joao.lima@email.com",
            "juliana.costa@email.com", "marcos.oliveira@email.com", "fernanda.santos@email.com", 
            "andre.almeida@email.com", "camila.lima@email.com", "lucas.silva@email.com", "mariana.oliveira@email.com",
            "ricardo.alves@email.com", "patricia.santos@email.com", "gustavo.lima@email.com", "vanessa.silva@email.com",
            "daniel.oliveira@email.com", "amanda.santos@email.com", "carlos.almeida@email.com", "renata.lima@email.com",
            "felipe.silva@email.com", "isabela.souza@email.com", "thiago.fernandes@email.com", "larissa.pereira@email.com",
            "lucas.oliveira@email.com", "carolina.santos@email.com", "gabriel.pereira@email.com", "bruna.oliveira@email.com",
            "rodrigo.costa@email.com", "tatiane.almeida@email.com"
        };
        String[] idades = {
            "35", "28", "42", "25", "31", "40", "23", "38", "29", "33", "27", "45", "36", "32", "39", "26", "34", "41", "30",
            "33", "28", "37", "29", "36", "31", "38", "24", "32", "25", "30" 
        };
        
        
        
        ArrayList<Paciente> pacientes = new ArrayList<>();
        int quantidadePacientes = 20;
        for(int i = 0; i < quantidadePacientes; i++) {
            
            Paciente p = new Paciente(nomes[i], telefones[i], cpfs[i], sexos[i], enderecos[i], emails[i], idades[i], 0);
            p.cadastrar();
            p.fecharConexao();
        }
    }
}
