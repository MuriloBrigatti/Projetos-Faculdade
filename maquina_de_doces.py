import os
import time


class MaquinaDeDoces:
    def __init__(self, usuario):
        self.usuario = usuario
        self.doces = {
            "bombom": (1, 6),
            "kitkat": (2, 7),
            "snickers" : (3, 8)
        }
        self.valores_aceitos = (1, 2, 5)
        self.entrada = None


    def _exibir_menu_dinheiro(self):
        os.system("cls")
        if self.usuario.saldo >= 6:
            valor_inserido = int(input(f"""Quanto de dinheiro você vai querer adicionar\n R$1,00 \n R$2,00 \n R$5,00 \n O seu saldo é de R${self.usuario.saldo},00\n0 - Comprar Doce\n""" ))
            podeComprar = True
        else:
            podeComprar = False
            valor_inserido = int(input(f"""Quanto de dinheiro você vai querer adicionar\n R$1,00 \n R$2,00 \n R$5,00 \n O seu saldo é de R${self.usuario.saldo},00\n""" ))
        if valor_inserido in self.valores_aceitos:
            self.usuario.saldo += valor_inserido
        elif valor_inserido != 0:
            print("\nO VALOR INSERIDO NÃO É ACEITO\n")
            time.sleep(1)

        if self.usuario.saldo >= 8 or (valor_inserido == 0 and podeComprar):
            self._exibir_menu_doce()
        else:
            self._exibir_menu_dinheiro()


    def _exibir_menu_doce(self):
        os.system("cls")
        doces_compraveis = []
        for doce in self.doces:
            if self.usuario.saldo >= self.doces[doce][1]:
                print(f"{self.doces[doce][0]} -- {doce}: R${self.doces[doce][1]:.2f}")
                doces_compraveis.append(self.doces[doce][0])
        if self.usuario.saldo < 8:
            doce_escolhido = int(input(f"\nO seu saldo é de R${self.usuario.saldo}\nEscolha seu doce sabiamente(0 - Voltar): "))
            podeVoltar = True
        else:
            doce_escolhido = int(input(f"\nO seu saldo é de R${self.usuario.saldo}\nEscolha seu doce sabiamente: "))
            podeVoltar = False
        for doce in self.doces:
            if doce_escolhido == self.doces[doce][0] and self.usuario.saldo >= self.doces[doce][1]:
                print(f"{doce} liberado")
                self.usuario.saldo -= self.doces[doce][1]
        if doce_escolhido == 0 and podeVoltar:
            self._exibir_menu_dinheiro()
        elif doce_escolhido not in doces_compraveis:
            print("Insira um valor válido")
            time.sleep(1)
            self._exibir_menu_doce()
        else:
            self._exibir_saida()


    def _exibir_saida(self):
        print(f"Seu troco é de: {self.usuario.saldo}")


    def iniciar(self):
        self._exibir_menu_dinheiro()


