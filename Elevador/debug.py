import pygame

pygame.init()
font = pygame.font.Font(None, 25)


def debug(info, y=10, x=10):
    display_surface = pygame.display.get_surface()
    debug_surf = font.render(str(info), True, "WHITE")
    debug_rect = debug_surf.get_rect(topleft=(x, y))
    pygame.draw.rect(display_surface, "BLACK", debug_rect)
    display_surface.blit(debug_surf, debug_rect)
