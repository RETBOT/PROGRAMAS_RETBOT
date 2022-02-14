.model small
.stack 100h
.data
dato1 DB "ROBERTO ESQUIVEL TRONCOSO","$"
dato2 DB "19130519","$"
dato3 DB "LENGUAJES DE INTERFAZ","$"
.code

inicio: 
mov ax, @data
mov ds, ax ;pondremos DS para apuntar al segmeno de datos

mov ah,0Fh ;Llamamos un servicio de video
int 10h ;Obtenemos el modo de video
mov ah,00h ;Llamamos el servicio 0 para limpiar pantalla
int 10h ;Funcion de video 

mov AH,02H ;Llamamos el servicio de 80x25
mov BH,00h ;Indicamos el numero de pagina, en este caso 0
mov DH,08h ;Indicamos renglon
mov DL,19h ;Indicamos columna
int 10H ;Llamamos la funcion de video

mov AH, 09h ;DOS imprimir la funcion de cadena
mov DX, OFFSET dato1 ;Muestra la cadena
mov BL, 1h; Color del texto
mov cx, 19h; Cantidad de repeticiones del color 
int 10h; inserta el color 
int 21h ;se muestra en pantalla

;REPETIMOS LO MISMO PARA CADA CADENA EN PANTALLA
mov AH,02H
mov BH,00
mov DH,12
mov DL,35
int 10H

mov AH, 09h ;
mov DX, OFFSET dato2;
mov BL, 2h; 
mov cx, 8h; 
int 10h; 
int 21h ;

mov AH,02H
mov BH,00
mov DH,16
mov DL,28
int 10H

mov AH, 09h ;
mov DX, OFFSET dato3 ;
mov BL, 3h; 
mov cx, 15h; 
int 10h;  
int 21h ;

mov ah, 4ch ;Termina el programa
int 21h;Llama funcion
END inicio
