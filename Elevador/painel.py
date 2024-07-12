import pygame
from debug import debug


class Painel(pygame.sprite.Sprite):
    def __init__(self, tela, elevador, andares):        
        self.tela = tela
        self.elevador = elevador
        self.andares = andares

        self.largura = 160
        self.altura = 70

        self.image = pygame.surface.Surface((self.largura, self.altura), pygame.SRCALPHA)
        self.rect = self.image.get_rect()
        self.rect.topright = (self.tela.get_width() - 30, 80)

        self.botoes_rects = {}


    def desenhar(self):
        gap = 8
        largura_botao = self.largura/4 - gap
        topo_botao = 20

        self.image.fill((255, 60, 60))
        for i in range(self.andares):
            botao_image = pygame.surface.Surface((largura_botao, largura_botao), pygame.SRCALPHA)
            botao_rect = botao_image.get_rect()
            botao_rect.topleft = (i*(largura_botao + gap) + gap/2, topo_botao)
            
            botao_image.fill((0, 0, 0))
            self.image.blit(botao_image, botao_rect.topleft)

            self.botoes_rects[i] = botao_rect

    def enviar_chamado(self, andar):
        self.elevador.adicionar_chamado_interno(andar)

    def checar_click(self):
        if self.evento.type == pygame.MOUSEBUTTONDOWN:
            pos_relativa = (self.evento.pos[0] - self.rect.left, self.evento.pos[1] - self.rect.top)
            for key, rect in self.botoes_rects.items():     
                if rect.collidepoint(pos_relativa):
                    self.enviar_chamado(key)

    def update(self, evento):
        self.evento = evento
        self.desenhar()
        self.checar_click()