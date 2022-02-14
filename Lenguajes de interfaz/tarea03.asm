STACK SEGMENT PARA STACK 'STACK' ;Inicio del segmento de pila.
DB 64 DUP (?) ;Se reservan 64 bytes
STACK ENDS ;Fin de la pila.

DATA SEGMENT PARA PUBLIC 'DATA' ;Inicia segmento de datos.
    DATO1 DB 10,13,"	ROBERTO ESQUIVEL TRONCOSO ",10,13,"$"; Nombre
    DATO2 DB 10,13,"	19130519 ",10,13,"$"; No. Control 
    DATO3 DB 10,13,"	LENGUAJES DE INTERFAZ ",10,13,"$"; Nombre materia 
DATA ENDS ;Fin del segmento de datos.

CODE SEGMENT PARA PUBLIC 'CODE' ;Inicia segmento de código.
ASSUME CS:CODE, DS:DATA, ES:DATA, SS:STACK
Inicio: 
mov ax, DATA ;Asigna la dirección del segmento
mov ds, ax ;de datos al registro DS

mov dx, OFFSET DATO1;Coloca el offset del mensaje en DX
mov ah, 9h ;Pone en AX función 09 de interrupción 21h.
INT 21h
mov dx, OFFSET DATO2;Coloca el offset del mensaje en DX
mov ah, 9h ;Pone en AX función 09 de interrupción 21h.
INT 21h
mov dx, OFFSET DATO3;Coloca el offset del mensaje en DX
mov ah, 9h ;Pone en AX función 09 de interrupción 21h.
INT 21h
mov ax, 4c00h ;Usa la función 4Ch para salir al
INT 21h ;DOS, regresa 00.
CODE ENDS ;Fin del segmento de código.
END inicio
