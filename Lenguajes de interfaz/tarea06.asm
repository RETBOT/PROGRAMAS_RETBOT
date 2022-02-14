.model small    
.stack 128       

.data 
menuPrincipal db "MENU",10,13,"A) CREDITOS",10,13,"B) CALCULAR EL CUADRADO DE UN NUMERO",10,13,"C) SALIR",10,13,"SELECCIONE OPCION: ","$"
opcioncalc db "CALCULAR EL CUADRADO DE UN NUMERO", 13, 10, 13, 10, '$'
mensaje db 13,"INGRESE UN NUMERO: $" 
salida db 10,13,"EL RESULTADO ES: $" 
other db 10,13,"OTRO? Y/N: $"
exit db 10,13,"ADIOS$"

credito db "Nombre: Roberto Esquivel Troncoso",10,13,"No. Control: 19130519 $";
salidaconf db 10,13,"VOLVER AL MENU(Y/N)?:  $"

pot db 1 
base db 0
bh1 db 0
bl1 db 0

.code

menu:

    mov ax, @data 
    mov ds,ax 
    
    ; limpia la pantalla
    mov ah, 00
    mov al, 03h
    int 10h
    
    mov ah, 09h
    lea dx, menuPrincipal
    int 21h

    mov ah, 01h
    int 21h

    cmp al, 'A' ; compara el dato entrado con A 
    je credit 

    cmp al, 'a' ; 
    je credit 
    
    cmp al, 'B' 
    je operacion

    cmp al, 'b' 
    je operacion


    cmp al, 'C'
    cmp al, 'c'
    mov ah, 09h
    lea dx, exit
    int 21h
    mov ax, 4C00H
    int 21h
     

credit:

    mov ah, 00
    mov al, 03h
    int 10h
    
    mov ah, 09h
    lea dx, credito
    int 21h
    
    mov ah, 09h
    lea dx, salidaconf
    int 21h
    mov ah, 01h
    int 21h
    
    cmp al, 'Y' 
    je menu

    cmp al, 'y'
    je menu
    
    mov ah, 09h
    lea dx, exit
    int 21h
    mov ax, 4C00H
    int 21h
    
operacion:
    mov ax, @data 
    mov ds,ax 

    mov ah, 00
    mov al, 03h
    int 10h

    mov ah, 02h
    mov bh, 00
    mov dh, 00
    mov dl, 00
    int 10h

    mov ah, 09h
    lea dx, mensaje ;
    int 21h
   
   mov ah, 01h; Funcion(character read) Guarda el numero ingresado
   int 21h 
   sub al, 30h ;Transform(0dec = 30hex)
   mov base, al ;
   int 21h

    mov al, base ; Se mueve el valor de la base al registro al
    mov bl, base ; 
    mul bl ; Se multiplica a bl
    mov pot, al ; Se pone el resultado en la variable pot
    
    mov ah, 09h
    lea dx, salida
    int 21h
    
    mov al, pot
    aam
    mov bl1, al
    mov bh1, ah
   
    mov ah, 02h
   
    mov dl, bh1
    add dl, 30h
    int 21h
   
    mov dl, bl1
    add dl, 30h
    int 21h
      
    mov ah, 09h
    lea dx, other
    int 21h
    mov ah, 01h
    int 21h
    
    cmp al,'Y' 
    je operacion

    cmp al,'y' 
    je operacion
    
    mov ah, 09h
    lea dx, exit
    int 21h
    mov ax, 4C00H
    int 21h
    
end menu
