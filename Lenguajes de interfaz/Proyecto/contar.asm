PUBLIC contarB
.MODEL small
.stack 100h
.data

mens db 10,13,"Metodo contar cadenas,(acepta como maximo 50 caracteres introducidos)",10,13,10,13,"Inserta cadena: ",10,13,"$"
mens2 db 10,13,"Cantidad de caracteres: ",10,13,"$"
salto db 10,13,"$"
cadena label byte ;este programa acepta como máximo 50 caracteres introducidos
chare db 50
max db 50
campo db ?
.code 

contarB proc near
mov ax,@data
mov ds,ax
mov ah,09
lea dx,mens
int 21h
mov ah,0ah
lea dx, cadena
int 21h
mov ah,09
lea dx,salto
int 21h
lea si,campo
mov cx,00

loop0:
mov al,[si]
cmp al,0dh ;si detecta un enter
je salimos ;deja de contar los caracteres
inc cx
inc si
jmp loop0

salimos:
mov ah,09
lea dx,mens2
int 21h

mov bl,10
mov ax,cx
div bl
mov dx,ax
or dx,3030h
mov ah,02h
int 21h
xchg dl,dh
mov ah,02h
int 21h

ret
contarB endp
end
