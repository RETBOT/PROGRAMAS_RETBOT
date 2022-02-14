.model small
.stack 100h
.data
titulo db "PROYECTO U3 LENGUAJES DE INTERFAZ","$"
nombre db  "19130514 Isaias Gerardo Cordova Palomares","$"
nombre2 db "19130519 Roberto Esquivel Troncoso","$"
deco db"*******************************************************","$"
ast db "*                                                     *","$"
menCont db "Presiona cualquier tecla para continuar.$"
menReg db "Presiona cualquier tecla para regresar al menu.$"
menAdios db "Good Bye.",10,13,10,13,"$"
opc1 db 10,13,"Menu",10,13,"1) Contar el numero de caracteres de una cadena",10,13,"2) Cadena al reves",10,13,"3) Comparar cadenas",10,13,"4) Salir del programa",10,13,"Opcion: ","$"
;-----------------VARIABLES DE LA PRIMER FUNCION--------------;
mens db "Inserta cadena",10,13,"$"

.code
EXTRN COMPARAB:NEAR,CONTARB:NEAR,REVESB:NEAR
;-----------Imprimir cadena 
;imprimir cadena
imp_cad MACRO d, x, y
mov ah,02h;
mov bh,00;
mov dh,x; indicamos renglon
mov dl,y; indicamos columna
int 10h;

mov ah,09;
mov dx,OFFSET d;
int 21h
ENDM
;----------------------------
;-----------Limpiar pantalla 
limpiar_pantalla proc near
mov ax, 0600h
mov bh, 2FH ; color de fondo
mov cx, 0000h
mov dx, 184fh;
int 10h
ret
limpiar_pantalla endp;
;----------------------------
;-----------Bye
adios proc near
imp_cad deco,05,09;
imp_cad ast,06,09;
imp_cad ast,07,09;
imp_cad ast,08,09;
imp_cad ast,09,09;
imp_cad menAdios,07,33;
imp_cad deco,10,09;
ret
adios endp;
;----------------------------

; inicializacion de variables

main proc ; utilizamos procedimiento
imp_cad MACRO d, x, y
mov ah,02h;
mov bh,00;
mov dh,x; indicamos renglon
mov dl,y; indicamos columna
int 10h;

mov ah,09;
mov dx,OFFSET d;
int 21h
ENDM

; inicializacion de variables
; APUNTAMOS AL SEGMENTO DE DATOS
mov ax,DGROUP
mov ds,ax

;INSERTAMOS LA CADENA DEL TITULO
call limpiar_pantalla; 
imp_cad titulo,02,20;
imp_cad deco,05,09;
imp_cad ast,06,09;
imp_cad ast,07,09;
imp_cad ast,08,09;
imp_cad ast,09,09;
imp_cad nombre,06,17;
imp_cad nombre2,08,17;
imp_cad deco,10,09;

imp_cad menCont,20,16;
mov ah, 01; pausa y captura 
int 21h

menu: 
call limpiar_pantalla; 
imp_cad opc1,01,09;
call opcion

;--Contar caracteres 
op1: 
call limpiar_pantalla; 
call CONTARB 
imp_cad menReg,20,16;
mov ah, 01; pausa y captura 
int 21h
jmp menu

;--Cadena al reves  
op2:
call limpiar_pantalla; 
call REVESB
imp_cad menReg,20,16;
mov ah, 01; pausa y captura 
int 21h
jmp menu
;--Comparar cadenas  
op3:
call limpiar_pantalla; 
call COMPARAB
imp_cad menReg,20,16;
mov ah, 01; pausa y captura 
int 21h
jmp menu

;--Salir 
op4:
call limpiar_pantalla; 
call adios;
mov ax, 4c00h
int 21h

opcion proc near
mov ah, 01
int 21h
cmp al, 49
je op1
cmp al, 50
je op2
cmp al, 51
je op3
cmp al, 52
je op4
jmp menu
ret 
opcion endp

main endp;
END main