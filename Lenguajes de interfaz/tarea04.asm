.MODEL small
.STACK 100h
.DATA
DATA1 DB "ROBERTO ESQUIVEL TRONCOSO","$"
DATA2 DB "19130519","$"
DATA3 DB "LENGUAJES DE INTERFAZ","$"
.CODE
inicio: 
mov ax, @data 
mov ds, ax ;pondremos DS para apuntar al segmeno de datos

mov ah,0Fh ;Llamamos un servicio de video
int 10h ;Obtenemos el modo de video
mov ah,0 ;Llamamos el servicio 0 para limpiar pantalla
int 10h ;Funcion de video 

mov AH,02H ;Llamamos el servicio de 80x25
mov BH,00 ;Indicamos el numero de pagina, en este caso 0
mov DH,10 ;Indicamos renglon de puntero
mov DL,25 ;Indicamos columna
int 10H ;Llamamos la funcion de video

mov ah, 9 ;DOS imprimir la funcion de cadena
mov dx, OFFSET DATA1 ;Muestra la cadena
int 21h ;se muestra en pantalla

;REPETIMOS LO MISMO PARA CADA CADENA EN PANTALLA
mov AH,02H
mov BH,00
mov DH,12
mov DL,35
int 10H

mov ah, 9 
mov dx, OFFSET DATA2 
int 21h 

mov AH,02H
mov BH,00
mov DH,14
mov DL,28
int 10H

mov ah, 9 
mov dx, OFFSET DATA3
int 21h 

mov ah, 4ch ;Termina el programa
int 21h;Llama funcion
END inicio

    