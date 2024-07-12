package com.mycompany.triagem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Paciente {
    Connection con;
    
    String nome;
    String telefone;
    String cpf;
    String sexo;
    String endereco;
    String email;
    String idade;
    int pontuacao;
    
    public Paciente(String nome, String telefone, String cpf, String sexo, 
            String endereco, String email, String idade, int pontuacao) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.sexo = sexo;
        this.endereco = endereco;
        this.email = email;
        this.idade = idade;
        this.pontuacao = pontuacao;
        
        this.abrirConexao();
    }
    
    public void exibePaciente() {
        System.out.printf("nome: %s\ntelefone: %s\ncpf: %s\nsexo: %s\nendereço: %s\ne-mail: %s\nidade: %s\npontuação: %s", nome, telefone, cpf, sexo, endereco, email, idade, pontuacao);
    }
    
    public void abrirConexao() {
        ConnectionFactory factory = new ConnectionFactory();
        con = factory.getConnection();
    }
    
    public void cadastrar() {
        try {
            ConnectionFactory factory = new ConnectionFactory();
            ResultSet rs = con.prepareStatement("SELECT * FROM pacientes ORDER BY id").executeQuery();
            boolean pacienteJaCadastrado = false;
            int idPaciente = 1;
            while(rs.next()) {
                String cpfPaciente = rs.getString("cpf");
                if(cpfPaciente.contains(cpf)) {
                    pacienteJaCadastrado = true;
                    idPaciente = rs.getInt("id");
                    break;
                }
                idPaciente = rs.getInt("id")+1;
            }
            // verificar se o paciente não está cadastrado
            if(!pacienteJaCadastrado) {
                // cadastrar paciente no banco de dados
                String statement = String.format("INSERT INTO pacientes (nome, idade, sexo, endereco, email, cpf, telefone) "
                        + "VALUES (\"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\")", 
                        nome, idade, sexo, endereco, email, cpf, telefone);      
                con.prepareStatement(statement).execute();             
            }
            // colocar na fila de espera
            String statement = String.format("INSERT INTO fila_de_espera (id_paciente, pontuacao) VALUES (\"%s\", \"%s\")", idPaciente, pontuacao);
            con.prepareStatement(statement).execute();                                   
        } catch(SQLException ex) {
            Logger.getLogger(FichaPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void fecharConexao() {
        ConnectionFactory factory = new ConnectionFactory();
        factory.closeConnection(con);
    }
}
