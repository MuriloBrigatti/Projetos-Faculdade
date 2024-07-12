import tkinter as tk
from tkinter import messagebox
import subprocess

def abrir_projeto_maquina_de_doces():
    subprocess.Popen(['python', 'C:/Users/muril/OneDrive/Área de Trabalho/usjt/atividades/atividades-calvetti/Murilo F Corso - 823129492 - TeorComp/elevador/maquina-de-doces/main.py'])

def abrir_projeto_elevador():
    subprocess.Popen(['python', 'C:/Users/muril/OneDrive/Área de Trabalho/usjt/atividades/atividades-calvetti/Murilo F Corso - 823129492 - TeorComp/elevador/elevador/tela.py'])

def criar_interface():
    root = tk.Tk()
    root.title("Escolha o projeto")

    # Função para abrir o projeto da máquina de doces ao clicar no botão
    botao_maquina_de_doces = tk.Button(root, text="Máquina de Doces", command=abrir_projeto_maquina_de_doces)
    botao_maquina_de_doces.pack()

    # Função para abrir o projeto do elevador ao clicar no botão
    botao_elevador = tk.Button(root, text="Elevador", command=abrir_projeto_elevador)
    botao_elevador.pack()

    root.mainloop()

if __name__ == "__main__":
    criar_interface()