import pygame


class Chamador(pygame.sprite.Sprite):
    def __init__(self, tela, elevador, andar):
        self.tela = tela
        self.elevador = elevador
        self.andar = andar
        
        self.largura = 25      
        self.image = pygame.surface.Surface((self.largura, self.largura), pygame.SRCALPHA)
        self.rect = self.image.get_rect()
    
        self.rect.topleft =  (100, tela.get_height() - self.elevador.altura * andar - 90)
        

    def enviar_chamado(self):
        self.elevador.adicionar_chamado(self.andar)

    def desenhar(self):
        self.image.fill("white")
        font = pygame.font.SysFont(None, 36)
        text_render = font.render(str(self.andar), True, (0, 0, 0))
        text_rect = text_render.get_rect()
        text_rect.center = (self.largura // 2, self.largura // 2)
        self.image.blit(text_render, text_rect)

    def checar_click(self):
        if self.evento.type == pygame.MOUSEBUTTONDOWN:
            if self.rect.collidepoint(self.evento.pos):
                self.enviar_chamado()

    def update(self, evento):
        self.evento = evento
        self.desenhar()
        self.checar_click()
        
