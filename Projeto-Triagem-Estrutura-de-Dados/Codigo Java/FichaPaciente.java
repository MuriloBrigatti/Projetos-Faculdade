package com.mycompany.triagem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;

public class FichaPaciente extends javax.swing.JFrame {
    
    public FichaPaciente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        idadeTextField = new javax.swing.JTextField();
        sexoMasculinoCheckBox = new javax.swing.JCheckBox();
        sexoFemininoCheckBox = new javax.swing.JCheckBox();
        telefoneTextField = new javax.swing.JTextField();
        enderecoTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cirurgiasTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        alergiasTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        medicamentosTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        predisposicoesTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cpfTextField = new javax.swing.JTextField();
        sintomasLabel = new javax.swing.JLabel();
        febreCheckBox = new javax.swing.JCheckBox();
        tosseCheckBox = new javax.swing.JCheckBox();
        fraquezaCheckBox = new javax.swing.JCheckBox();
        corizaCheckBox = new javax.swing.JCheckBox();
        dorGargantaCheckBox = new javax.swing.JCheckBox();
        dificuldadeRespirarCheckBox = new javax.swing.JCheckBox();
        perdaPaladarCheckBox = new javax.swing.JCheckBox();
        calafrioCheckBox = new javax.swing.JCheckBox();
        cefaleiaCheckBox = new javax.swing.JCheckBox();
        dorMuscularCheckBox = new javax.swing.JCheckBox();
        perdaOlfatoCheckBox = new javax.swing.JCheckBox();
        diarreiaCheckBox = new javax.swing.JCheckBox();
        dificuldadeEngolirCheckBox = new javax.swing.JCheckBox();
        congestaoCheckBox = new javax.swing.JCheckBox();
        nauseaCheckBox = new javax.swing.JCheckBox();
        fumanteCheckBox = new javax.swing.JCheckBox();
        alcoolCheckBox = new javax.swing.JCheckBox();
        atividadeFisicaCheckBox = new javax.swing.JCheckBox();
        enviarButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();
        prioridadeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("FICHA DO PACIENTE");

        jLabel2.setText("Nome:");

        jLabel3.setText("Idade:");

        jLabel4.setText("Sexo:");

        jLabel5.setText("Telefone:");

        jLabel6.setText("Endereço:");

        jLabel7.setText("E-mail:");

        sexoMasculinoCheckBox.setText("Masculino");
        sexoMasculinoCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoMasculinoCheckBoxActionPerformed(evt);
            }
        });

        sexoFemininoCheckBox.setText("Feminino");
        sexoFemininoCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoFemininoCheckBoxActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Informaçôes pessoais:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Informações médicas:");

        jLabel10.setText("Já realizou alguma cirurgia? Se sim, quais?");

        jLabel11.setText("Tem alguma alergia? Se sim, quais?");

        jLabel12.setText("Utiliza algum medicamento regularmente? Se sim, quais?");

        jLabel13.setText("Possui familiares com diabetes, doenças cardíacas ou cancêr?");

        jLabel17.setText("CPF:");

        sintomasLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sintomasLabel.setText("Sentiu algum dos sintomas a baixo? Se sim, quais?");

        febreCheckBox.setText("Febre");

        tosseCheckBox.setText("Tosse");

        fraquezaCheckBox.setText("Fraqueza");

        corizaCheckBox.setText("Coriza");

        dorGargantaCheckBox.setText("Dor de garganta");

        dificuldadeRespirarCheckBox.setText("Dificuldade para respirar");

        perdaPaladarCheckBox.setText("Perda de paladar");

        calafrioCheckBox.setText("Calafrio");

        cefaleiaCheckBox.setText("Cefaleia");

        dorMuscularCheckBox.setText("Dor muscular");

        perdaOlfatoCheckBox.setText("Perda de olfato");

        diarreiaCheckBox.setText("Diarreia");

        dificuldadeEngolirCheckBox.setText("Dificuldade de engolir");

        congestaoCheckBox.setText("Congestão Nasal");

        nauseaCheckBox.setText("Náusea/Vômito");

        fumanteCheckBox.setText("Fumante");

        alcoolCheckBox.setText("Consome álcool");

        atividadeFisicaCheckBox.setText("Realiza atividade física regularmente");

        enviarButton.setText("Enviar");
        enviarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarButtonActionPerformed(evt);
            }
        });

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enviarButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sintomasLabel)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(corizaCheckBox)
                                                            .addComponent(tosseCheckBox)
                                                            .addComponent(febreCheckBox)
                                                            .addComponent(fraquezaCheckBox)
                                                            .addComponent(dorGargantaCheckBox))
                                                        .addGap(50, 50, 50)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(dificuldadeRespirarCheckBox)
                                                            .addComponent(perdaPaladarCheckBox)
                                                            .addComponent(calafrioCheckBox)
                                                            .addComponent(cefaleiaCheckBox)
                                                            .addComponent(dorMuscularCheckBox))
                                                        .addGap(50, 50, 50)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(perdaOlfatoCheckBox)
                                                            .addComponent(diarreiaCheckBox)
                                                            .addComponent(dificuldadeEngolirCheckBox)
                                                            .addComponent(congestaoCheckBox)
                                                            .addComponent(nauseaCheckBox)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(voltarButton)
                                                        .addGap(124, 124, 124)
                                                        .addComponent(prioridadeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel13)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel11)
                                                .addComponent(jLabel12)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(enderecoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel7)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(emailTextField)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(idadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(telefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel17)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(cpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel4)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(sexoMasculinoCheckBox)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(sexoFemininoCheckBox))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(nomeTextField))))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cirurgiasTextField)
                                            .addComponent(alergiasTextField)
                                            .addComponent(medicamentosTextField)
                                            .addComponent(predisposicoesTextField)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(fumanteCheckBox)
                                                .addGap(18, 18, 18)
                                                .addComponent(alcoolCheckBox)
                                                .addGap(18, 18, 18)
                                                .addComponent(atividadeFisicaCheckBox)
                                                .addGap(0, 0, Short.MAX_VALUE)))))))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(telefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(cpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(sexoMasculinoCheckBox)
                    .addComponent(sexoFemininoCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(enderecoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(idadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cirurgiasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alergiasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medicamentosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(predisposicoesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fumanteCheckBox)
                    .addComponent(alcoolCheckBox)
                    .addComponent(atividadeFisicaCheckBox))
                .addGap(40, 40, 40)
                .addComponent(sintomasLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(febreCheckBox)
                    .addComponent(dificuldadeRespirarCheckBox)
                    .addComponent(perdaOlfatoCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tosseCheckBox)
                    .addComponent(perdaPaladarCheckBox)
                    .addComponent(diarreiaCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calafrioCheckBox)
                    .addComponent(dificuldadeEngolirCheckBox)
                    .addComponent(fraquezaCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corizaCheckBox)
                    .addComponent(cefaleiaCheckBox)
                    .addComponent(congestaoCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dorGargantaCheckBox)
                    .addComponent(dorMuscularCheckBox)
                    .addComponent(nauseaCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enviarButton)
                    .addComponent(voltarButton)
                    .addComponent(prioridadeLabel))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarButtonActionPerformed
        String nomePaciente = "";
        String telefone = "";
        String cpf = "";
        String sexo = "";
        String endereco = "";
        String email = "";
        String idade = "";
        int pontuacao = 0;
        
        String[] nomeDasVariaveis = {
            "alcoolCheckBox", "alergiasTextField", "atividadeFisicaCheckBox",
            "calafrioCheckBox", "cefaleiaCheckBox", "cirurgiasTextField",
            "congestaoCheckBox", "corizaCheckBox", "cpfTextField", 
            "diarreiaCheckBox", "dificuldadeEngolirCheckBox", 
            "dificuldadeRespirarCheckBox", "dorGargantaCheckBox",
            "dorMuscularCheckBox", "emailTextField", 
            "enderecoTextField", "enviarButton", "febreCheckBox", 
            "fraquezaCheckBox", "fumanteCheckBox", "idadeTextField",
            "medicamentosTextField", "nauseaCheckBox", "nomeTextField",
            "perdaOlfatoCheckBox", "perdaPaladarCheckBox", 
            "predisposicoesTextField", "sexoFemininoCheckBox",
            "sexoMasculinoCheckBox", "sintomasLabel", "telefoneTextField",
            "tosseCheckBox"
        };
        
        String informacoesMedicas[] = {
            "cirurgias", "alergias", "medicamentos", "predisposicoes"
        };
        
        String sintomas[] = {
            "febre", "dificuldadeRespirar", "dificuldadeEngolir", "perdaOlfato", 
            "perdaPaladar", "dorGarganta", "tosse", "cefaleia", "coriza", 
            "congestao", "diarreia", "nausea", "calafrio", "dorMuscular", 
            "fraqueza"
        };
        
        if(!(sexoMasculinoCheckBox.isSelected() | sexoFemininoCheckBox.isSelected())) {
            JOptionPane.showMessageDialog(rootPane, "PREENCHA TODOS OS CAMPOS");
            return;
        }
        
        // Iterar sobre as variáveis
        for (String nome : nomeDasVariaveis) {
            // Verificar se a variável é um TextField
            if (nome.contains("TextField")) {
                try {
                    // Obter o campo usando reflexão
                    Field field = getClass().getDeclaredField(nome);
                    // Definir o acesso ao campo, pois é privado
                    field.setAccessible(true);
                    // Obter o valor do campo
                    Object fieldValue = field.get(this);
                    // Verificar se o valor é do tipo JTextField
                    if (fieldValue instanceof JTextField) {
                        JTextField textField = (JTextField) fieldValue;
                        // Obter o texto do campo
                        String texto = textField.getText();
                        textField.setText(null);
                        // Verificar se o campo está preenchido
                        if(texto.isEmpty()) {
                            JOptionPane.showMessageDialog(rootPane, "PREENCHA TODOS OS CAMPOS");
                            break;
                        } else {
                            texto = texto.toLowerCase();
                            // Iterar pelas informações médicas
                            for(int i = 0; i < informacoesMedicas.length; i++) {
                                // Verificar se o item é uma informação médica
                                if(nome.contains(informacoesMedicas[i])) {
                                    // Verificar se o campo foi preenchido com "não"
                                    if(!(texto.contains("nao") | texto.contains("não"))) {
                                        pontuacao += 2;
                                    }
                                }
                            }
                            if(nome.contains("nome")) {
                                nomePaciente = texto;
                            }
                            else if(nome.contains("telefone")) {
                                telefone = texto;
                            }
                            else if(nome.contains("cpf")) {
                                cpf = texto;
                            } 
                            else if(nome.contains("endereco")) {
                                endereco = texto;
                            }
                            else if(nome.contains("email")) {
                                email = texto;
                            }
                            else if(nome.contains("idade")) {
                                idade = texto;
                                try {
                                    Integer.valueOf(idade);
                                } catch (NumberFormatException e) {
                                    System.out.println("Insira um valor numerico na sua idade");
                                    return;
                                }
                                int idadeInt = Integer.parseInt(idade);
                                
                                if(idadeInt >= 80) {
                                    pontuacao += 4;
                                }
                                else if((idadeInt >= 60) & (idadeInt < 80)) {
                                    pontuacao += 3;
                                }
                                else if((idadeInt >= 40) & (idadeInt < 60)) {
                                    pontuacao += 2;
                                }
                                else if((idadeInt >= 20) & (idadeInt < 40)) {
                                    pontuacao += 1;
                                }
                            }
                        }
                    }
                } catch (NoSuchFieldException | IllegalAccessException ex) {
                    ex.printStackTrace();
                }
            }
            // Verificar se a variavel é um CheckBox
            else if (nome.contains("CheckBox")) {
                try {
                    // Obter o campo usando reflexão
                    Field field = getClass().getDeclaredField(nome);
                    // Definir o acesso ao campo, pois é privado
                    field.setAccessible(true);
                    // Obter o valor do campo
                    Object fieldValue = field.get(this);
                    // Verificar se o valor é do tipo JCheckBox
                    if (fieldValue instanceof JCheckBox) {
                        JCheckBox checkBox = (JCheckBox) fieldValue;
                        // Verificar se é fumante ou se bebe álcool
                        if((nome.contains("fumante") | nome.contains("alcool")) & checkBox.isSelected()) {
                            pontuacao += 3;
                        }
                        // Verificar se pratica atividade física regular
                        else if(nome.contains("atividadeFisica") & checkBox.isSelected()) {
                            pontuacao -= 3;
                        }
                        else if(nome.contains("sexo")) {
                            if(checkBox.isSelected()) {
                                if(nome.contains("Feminino")) {
                                    sexo = "feminino";
                                }
                                else if(nome.contains("Masculino")) {
                                    sexo = "masculino";
                                }
                            }
                        }
                        // Iterar pelos sintomas
                        for(int i = 0; i < sintomas.length; i++) {
                            // Verificar se o CheckBox é de um sintoma
                            if(nome.contains(sintomas[i])) {                          
                                // Verificar se o CheckBox está preenchido
                                if(checkBox.isSelected()) {
                                    // Risco muito alto
                                    if(i < 3) {
                                        pontuacao += 4;
                                    }
                                    // Risco alto
                                    else if(i >= 3 & i < 9) {
                                        pontuacao += 3;
                                    }
                                    // Risco médio 
                                    else if(i >= 9 & i < 13) {
                                        pontuacao += 2;
                                    }
                                    // Risco baixo
                                    else {
                                        pontuacao += 1;
                                    }
                                }                    
                            }    
                        }
                        checkBox.setSelected(false);
                    }
                } catch (NoSuchFieldException | IllegalAccessException ex) {
                    ex.printStackTrace();
                }
            }
        }
        Paciente p = new Paciente(nomePaciente, telefone, cpf, sexo, endereco, email, idade, pontuacao);
        System.out.println(pontuacao);
        p.cadastrar();
        
        Color cor;
        if((pontuacao >= -10) & (pontuacao < 5)) {
            cor = Color.BLUE;
        }
        else if((pontuacao >= 5) & (pontuacao < 11)) {
            cor = Color.GREEN;
        }
        else if((pontuacao >= 11) & (pontuacao < 18)) {
            cor = Color.YELLOW;
        }
        else if((pontuacao >= 18) & (pontuacao < 24)) {
            cor = Color.ORANGE;
        }
        else{
            cor = Color.RED;
        }
        prioridadeLabel.setForeground(cor);
        prioridadeLabel.setText(nomePaciente);
        prioridadeLabel.setVisible(true);
        
        Timer timer = new Timer(4000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prioridadeLabel.setVisible(false);
            }
        });
        timer.setRepeats(false); // Executa o Timer apenas uma vez
        timer.start(); // Inicia o Timer     
    }//GEN-LAST:event_enviarButtonActionPerformed

    private void sexoMasculinoCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoMasculinoCheckBoxActionPerformed
        if(sexoMasculinoCheckBox.isSelected()) {
            sexoFemininoCheckBox.setSelected(false);  
        }
    }//GEN-LAST:event_sexoMasculinoCheckBoxActionPerformed

    private void sexoFemininoCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoFemininoCheckBoxActionPerformed
        if(sexoFemininoCheckBox.isSelected()) {
            sexoMasculinoCheckBox.setSelected(false);  
        }
    }//GEN-LAST:event_sexoFemininoCheckBoxActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        dispose();
        new PaginaInicial().setVisible(true);
    }//GEN-LAST:event_voltarButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FichaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FichaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FichaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FichaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FichaPaciente().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox alcoolCheckBox;
    private javax.swing.JTextField alergiasTextField;
    private javax.swing.JCheckBox atividadeFisicaCheckBox;
    private javax.swing.JCheckBox calafrioCheckBox;
    private javax.swing.JCheckBox cefaleiaCheckBox;
    private javax.swing.JTextField cirurgiasTextField;
    private javax.swing.JCheckBox congestaoCheckBox;
    private javax.swing.JCheckBox corizaCheckBox;
    private javax.swing.JTextField cpfTextField;
    private javax.swing.JCheckBox diarreiaCheckBox;
    private javax.swing.JCheckBox dificuldadeEngolirCheckBox;
    private javax.swing.JCheckBox dificuldadeRespirarCheckBox;
    private javax.swing.JCheckBox dorGargantaCheckBox;
    private javax.swing.JCheckBox dorMuscularCheckBox;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField enderecoTextField;
    private javax.swing.JButton enviarButton;
    private javax.swing.JCheckBox febreCheckBox;
    private javax.swing.JCheckBox fraquezaCheckBox;
    private javax.swing.JCheckBox fumanteCheckBox;
    private javax.swing.JTextField idadeTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField medicamentosTextField;
    private javax.swing.JCheckBox nauseaCheckBox;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JCheckBox perdaOlfatoCheckBox;
    private javax.swing.JCheckBox perdaPaladarCheckBox;
    private javax.swing.JTextField predisposicoesTextField;
    private javax.swing.JLabel prioridadeLabel;
    private javax.swing.JCheckBox sexoFemininoCheckBox;
    private javax.swing.JCheckBox sexoMasculinoCheckBox;
    private javax.swing.JLabel sintomasLabel;
    private javax.swing.JTextField telefoneTextField;
    private javax.swing.JCheckBox tosseCheckBox;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}

