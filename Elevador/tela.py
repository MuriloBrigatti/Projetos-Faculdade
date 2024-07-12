import pygame
import sys
from elevador import Elevador
from chamador import Chamador
from painel import Painel

# Inicialize o Pygame
pygame.init()

# Defina as dimensões da janela
largura = 400
altura = 800

# Defina as cores
PRETO = (0, 0, 0)
BRANCO = (255, 255, 255)

# Crie a janela
tela = pygame.display.set_mode((largura, altura))
pygame.display.set_caption("Janela Pygame")

# Crie o elevador
e = Elevador(tela)

# Crie o chamador
c0 = Chamador(tela, e, 0)
c1 = Chamador(tela, e, 1)
c2 = Chamador(tela, e, 2)
c3 = Chamador(tela, e, 3)

# p = Painel(tela, e, 4)


# Loop principal do jogo
while True:
    # Lida com eventos
    for evento in pygame.event.get():
        ultimo_evento = evento
        if evento.type == pygame.QUIT:
            pygame.quit()
            sys.exit()

    # Atualize a tela
    tela.fill((80, 80, 255))
    # Desenhe outros elementos na tela aqui
    tela.blit(e.image, e.rect.topleft)
    tela.blit(c0.image, c0.rect.topleft)
    tela.blit(c1.image, c1.rect.topleft)
    tela.blit(c2.image, c2.rect.topleft)
    tela.blit(c3.image, c3.rect.topleft)
    # tela.blit(p.image, p.rect.topleft)

    # updates
    c0.update(ultimo_evento)
    c1.update(ultimo_evento)
    c2.update(ultimo_evento)
    c3.update(ultimo_evento)
    # p.update(ultimo_evento)
    e.update()

    # Atualize a tela
    pygame.display.flip()

    # Limita a taxa de atualização da tela
    pygame.time.Clock().tick(60)
