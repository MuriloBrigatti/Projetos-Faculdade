import pygame
from debug import debug

class Elevador(pygame.sprite.Sprite):
    def __init__(self, tela):
        super().__init__()
        self.tela = tela
        self.largura = 70
        self.altura = 130
        self.image = pygame.surface.Surface((self.largura, self.altura), pygame.SRCALPHA)
        self.rect = self.image.get_rect()

        self.status = "parado"
        self.andares = {
            self.tela.get_height() - (0 * self.altura): 0,
            self.tela.get_height() - (1 * self.altura): 1,
            self.tela.get_height() - (2 * self.altura): 2,
            self.tela.get_height() - (3 * self.altura): 3 
        }
        self.andar_atual = 0
        self.rect.bottomleft = (self.tela.get_width()/2 - self.largura/2, self.tela.get_height() - (self.andar_atual * self.altura))
        self.chamados = []
        self.chamados_internos = []

        self.fechamento_tick = 0
        self.fechou = False
        self.abriu = False


    def mover(self, destino):
        if self.status == "parado":
            if destino > self.andar_atual:
                self.status = "subindo"
            elif destino < self.andar_atual:
                self.status = "descendo"

        if self.status in ("subindo", "descendo", "parado"):
            if self.rect.bottom > self.tela.get_height() - (destino * self.altura):
                self.rect.y -= 2
            elif self.rect.bottom < self.tela.get_height() - (destino * self.altura):
                self.rect.y += 2
            else:
                self.status = "parado"
                if (len(self.chamados) > 0) or (len(self.chamados_internos) > 0):
                    self.abrir_porta()

        if self.rect.bottom in self.andares.keys():
            self.andar_atual = self.andares[self.rect.bottom]
                
            
    def abrir_porta(self):
        if self.status == "parado":
            self.status = "porta_abrindo"


    def desenhar(self):
        self.image.fill("black")
        if self.status in ("parado", "movendo"):
            self.largura_porta = self.largura/2
            self.pos_porta_direita = self.largura_porta
        else:
            if self.status == "porta_abrindo":
                self.largura_porta -= 1
                self.pos_porta_direita += 1
                if self.largura_porta < -1:
                    self.status = "porta_aberta"
                    self.abriu = True
                    self.abertura_tick = pygame.time.get_ticks()
                    self.fechar_porta()
            elif self.status == "porta_fechando":
                self.largura_porta += 1
                self.pos_porta_direita -= 1
                if self.largura_porta >= self.largura/2:
                    self.status = "porta_fechada"
                    self.fechou = True
                    self.fechamento_tick = pygame.time.get_ticks()
                    if self.andar_atual in self.chamados: self.chamados.remove(self.andar_atual)
                    if self.andar_atual in self.chamados_internos: self.chamados_internos.remove(self.andar_atual)

        pygame.draw.rect(self.image, (255, 255, 255), (0, 0, self.largura_porta, self.altura))
        pygame.draw.rect(self.image, (255, 255, 255), (self.pos_porta_direita, 0, self.largura_porta, self.altura))


    def fechar_porta(self):
        if self.status == "porta_abrindo":
            self.status = "porta_fechando"


    def cooldowns(self):
        self.tick_atual = pygame.time.get_ticks()
        # cooldown porta aberta
        if self.abriu:
            if self.tick_atual - self.abertura_tick > 1200:
                self.abriu = False
                self.status = "porta_fechando"
        # cooldown porta fechada
        if self.fechou:
            if self.tick_atual - self.fechamento_tick > 1200:
                self.status = "parado"
                self.fechou = False
                

    def adicionar_chamado(self, andar):
        if andar not in self.chamados:
            self.chamados.append(andar)
        self.chamados.sort(reverse=True)

    def adicionar_chamado_interno(self, andar):
        if andar not in self.chamados_internos:
            self.chamados_internos.append(andar)
        self.chamados_internos.sort(reverse=True)

    
    def retornar_proximo_chamado(self):
        if len(self.chamados_internos) > 0:
            if self.andar_atual in self.chamados:
                return self.andar_atual
            elif self.andar_atual != self.chamados_internos[0]:
                return self.chamados_internos[0]
            else:
                return self.andar_atual
        elif len(self.chamados) > 0:
            if self.andar_atual != self.chamados[0]:
                return self.chamados[0]
            else:
                return self.andar_atual
        else:
            if self.andar_atual != 0:
                self.adicionar_chamado(0)
            return self.andar_atual


    def update(self):
        self.cooldowns()
        self.desenhar()
        self.mover(self.retornar_proximo_chamado())
        debug(f"Status do elevador: {self.status}")
        debug(f"Lista de chamados: {self.chamados}", y=30)
        # debug(f"Lista de chamados internos: {self.chamados_internos}", y=50)


            
