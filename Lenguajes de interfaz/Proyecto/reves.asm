PUBLIC revesB
.MODEL small
.stack 256h
.data

mens db 10,13,"Metodo escribir al reves cadenas (acepta como maximo 50 caracteres introducidos)",10,13,10,13,"Inserta cadena: ","$"
mens2 db 10,13,"Cadena al reves: ",10,13,"$"
salto db 10,13,"$"
cadena label byte 

cant db 50
max db 00
campo db 50 dup(' ')

.code 

revesB proc near

;start:
mov ax,@data
mov ds,ax
push ds
pop es

mov ah, 09h
lea dx, mens
int 21h

mov ah, 0ah
lea dx, cadena
int 21h

mov ah, 09h
lea dx, salto
int 21h

mov cl, cant
mov bx, offset campo
add bl, cant

mov ah,09
lea dx,mens2
int 21h

loopo: 
mov dl, [bx]
mov ah, 02h
int 21h
dec bl
dec cl 
cmp cl, 0
je salir
jmp loopo

salir: 
mov dl,[bx]
mov ah,02h
int 21h
ret

revesB endp
end
