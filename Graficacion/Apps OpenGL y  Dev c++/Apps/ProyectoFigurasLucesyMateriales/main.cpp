#include <GL/glut.h>
#define ancho 640
#define alto 480
#define profundidad 500

void dibuja(); // Metodo para dibujar la figura a desplegar 
void ejes(); // Metodo para dibujar los ejes cartecianos 
void tecladoNormal(unsigned char tecla, int x, int y); //metodo para teclado querty
void tecladoEspecial(int tecla, int x, int y); // metodo para teclado ascii
void texto(int x, int y, char *palabra); // metodo para el texto
void desocupado(); // metodo para el movimiento de la figura 
void redimensionado(int width, int height); // metodo para redimensión de la figura 
void luces(); //luces en la figura 

int posx=0, posy=0, posz=0; // posicion de X, Y y Z
float angulo=0; // angulo de la figura 
float esc=1; // escalacion de la figura 
unsigned int figura=1; // figura por default

//investigar las propiedades de los materiales con respeto a las luces y su comportamiento
//usar esta app como opcion como uno de los proyectos finales 
//documentar la app y modificar las posiciones y tipos de luz
//usar creatividad e imaginacion
GLfloat material_ambient[] = { 0.2, 0.2, 0.2, 1.0f };//{ 0.05, 0.05, 0.05, 1.0f }; // reflectancia RGBA ambiental del material
GLfloat material_diffuse[] = { 0.8, 0.8, 0.8, 1.0f }; // { 0.8, 0.0, 0.0, 1.0f }; // color de figura
GLfloat material_specular[] = { 0.0, 0.0, 0.0, 1.0f };//{ 0.9, 0.8, 0.8, 1.0f }; // angulo de la posicion de iluminacion 
GLfloat luz_ambient[] = { 0.0, 0.0, 0.0, 1.0};//{ 0.75, 0.75, 0.75, 0.0 }; // intensidad RGBA ambiental de la luz.
GLfloat luz_diffuse[] = { 1.0, 1.0, 1.0, 1.0 };//{ 1.0, 1.0, 1.0, 0.0 }; // intensidad RGBA difusa de la luz.
GLfloat luz_specular[] = { 1.0, 1.0, 1.0, 1.0 };//{ 1.0, 1.0, 1.0, 0.0 }; // intensidad RGBA especular
GLfloat luz_position[] =  { -1.0, -1.0 , 0.0 , 0.0 };//<-- abajo  { 1.0, 1.0 , 0.0 , 0.0 };//<-- arriba //{ 1.0, 1.0, 1.0, 0.0 }; // posición de la luz en coordenadas homogéneas del objeto
//GLfloat luz_position[] = {1.0, 0.0 , 1.0 , 0.0 }; //<-- derecha // {-1.0, 0.0 , 1.0 , 0.0 };//<-- izquierda  
unsigned int luz=1;
unsigned int movimiento=1;

int main(int argc, char** argv) {
	glutInit(&argc,argv); // se utiliza para inicializar la biblioteca de GLUT
	glutInitDisplayMode(GLUT_STENCIL | GLUT_DOUBLE | GLUT_DEPTH); // establece el modo de visualización inicial 
					 /* GLUT_STENCIL: Mascara de bits para seleccionar una ventana con un bufer de pantalla 
					  * GLUT_DOUBLE: Máscara de bits para seleccionar una ventana con doble búfer. Esto anula GLUT_SINGLE si también se especifica.
					  * GLUT_DEPTH: Máscara de bits para seleccionar una ventana con un búfer de profundidad.
					  */ 
	glutInitWindowPosition(100, 0); // establece la posicion inicial de la ventana
	glutInitWindowSize(ancho, alto); // establece el tamaño inicial de la ventana 
	glutCreateWindow("Modo de Poligonos, Luces y Perspectiva"); //crea una ventana de nivel superior y se pone el titulo de la ventana
	glOrtho(-(ancho/2), (ancho/2), -(alto/2), (alto/2), -profundidad, profundidad); // multiplica la matriz actual por una matriz ortogonal
	glClearColor(1, 1, 1, 0); //especificar valores claros para los búferes de color
	glutDisplayFunc(dibuja); //establece la devolución de llamada de pantalla para la ventana actual, dibuja la figura sobre la pantalla 
	glutKeyboardFunc(tecladoNormal); // establece la devolución de llamada del teclado para la ventana actual .
	glutSpecialFunc(tecladoEspecial); //  establece la devolución de llamada de teclado especial para la ventana actual .
	glutIdleFunc(desocupado); //establece la devolución de llamada inactiva global. rotacion de la figura
	glutReshapeFunc(redimensionado);// eredinmension de la figura sobre la pantalla 
	glutMainLoop(); //ingresa al ciclo de procesamiento de eventos GLUT.
return 0;
}

void dibuja() {
		// documentar que es lo que hace glClear 
	glClear(GL_STENCIL_BUFFER_BIT | GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT); //borrar búferes a valores preestablecidos
			// GL_STENCIL_BUFFER_BIT: Indica el búfer de la plantilla.
			// GL_COLOR_BUFFER_BIT: Indica los búferes actualmente habilitados para la escritura en color.
			// GL_DEPTH_BUFFER_BIT: Indica el búfer de profundidad.
	ejes(); // metodo para los ejes 
	luces(); // metodo para las luces 
	glPushMatrix(); // mete los datos a la matriz actual 
	   glTranslatef(posx, posy, posz); // traslada la sigura en X, Y y Z 
	   glRotatef(angulo, 1, 0, 0); // rota la figura en X 
	   glRotatef(angulo, 0, 1, 0); // rota la figura en Y
	   glRotatef(angulo, 0, 0, 1); // rota la figura en Z 
	   glScalef(esc, esc, esc); // escala la figura 
	   glColor3f(0, 1, 1); // establece el color (red, green, blue)
	   if(luz==1) // selecciona el tipo de luz 
	      glEnable(GL_LIGHTING); // habilita o deshabilita las capacidades GL del lado del servidor
	      // GL_LIGHTING: Si está habilitado y no hay ningún sombreador de vértices activo, 
		  // utiliza los parámetros de iluminación actuales para calcular el color o índice del vértice. 
		  // De lo contrario, simplemente asocie el color o índice actual con cada vértice.
	   switch(figura) { // seleccion de figura 
	      case 1: glutSolidTorus(20, 80, 18, 18);break; // toroide 
	      case 2: glutSolidSphere(100, 18, 18);break; // esfera 
	      case 3: glutSolidCone(50, 200, 18, 18);break; //cono 
	      case 4: glutSolidCube(100);break; // cubo
	      case 5: glutSolidTeapot(50); break; // tetera
	   }
	   glDisable(GL_LIGHTING); //desabilita GL_LIGHTING
	   
	   
	glPopMatrix(); // saca los datos de la matriz  
	// se coloca el texto en pantalla 
	texto(-ancho/2+10,alto/2-20,"[F1: TOROIDE] [F2: ESFERA] [F3: CONO] [F4: CUBO] [F5: TEAPOT]");
	texto(-ancho/2+10,-alto/2+10,"[F9: PUNTOS] [F10: LINEAS] [F11: RELLENO] [F12: LUZ]");
	texto(ancho/2-160,-alto/2+10,"[F6: ALTERNAR MOVIMIENTO]");
	glutSwapBuffers(); //intercambia los búferes de la ventana actual si tiene doble búfer.
}

void ejes() { // metodo para dibujar el plano cartesiano 
	glColor3f(0.9, 0.9, 0.9); // seleccion del color de las lineas 
	glBegin(GL_LINES); // Trata cada par de vértices como un segmento de línea independiente
	   glVertex3f(-ancho/2, 0, 0);
	   glVertex3f(ancho/2, 0, 0);
	   glVertex3f(0, alto/2, 0);
	   glVertex3f(0, -alto/2, 0);
	glEnd();
}

void tecladoNormal(unsigned char tecla, int x, int y) { // teclado qwerty
switch(tecla) {
   case 's':
   case 'S':
   case 27: exit(0);break; // "S" o "s" para terminar el programa 
}
glutPostRedisplay(); // marca la ventana actual que necesita volver a mostrarse. actualiza la pantalla 
}

void tecladoEspecial(int tecla, int x, int y) { // teclado especial 
switch(tecla) {
   case GLUT_KEY_UP : posy++;break; // flecha arriba, aumenta y 
   case GLUT_KEY_DOWN : posy--;break; // flecha abajo, disminuye y 
   case GLUT_KEY_RIGHT : posx++;break; // flecha derecha, aumenta x 
   case GLUT_KEY_LEFT : posx--;break; // flecha izquierda, disminuye x
   case GLUT_KEY_HOME : posz+=2;break; // tecla  inicio, aumenta z
   case GLUT_KEY_END : posz-=2;break;  // tecla Fin, disminuye z 
   case GLUT_KEY_PAGE_UP : esc=esc*1.01;break; // tecla pagina arriba, la escalacion aumenta 
   case GLUT_KEY_PAGE_DOWN : esc=esc*0.99;break; // tecla pagina abajo, la escalacion disminuye
   case GLUT_KEY_F1 : figura=1;break; // Toroide  
   case GLUT_KEY_F2 : figura=2;break; // Esfera
   case GLUT_KEY_F3 : figura=3;break; // Cono 
   case GLUT_KEY_F4 : figura=4;break; // Cubo
   case GLUT_KEY_F5 : figura=5;break; // Tetera de utah
   case GLUT_KEY_F6 : if(movimiento==0) movimiento=1; else movimiento=0;break; // movimiento de la figura 
   //seleccione un modo de rasterización de polígono (cara, modo)
   // GL_FRONT_AND_BACK: para poligonos frontales y posteriores 
   case GLUT_KEY_F9 : luz=0;glPolygonMode(GL_FRONT_AND_BACK,GL_POINT);break;  // se dibuja el poligono con puntos 
   case GLUT_KEY_F10 : luz=0;glPolygonMode(GL_FRONT_AND_BACK,GL_LINE);break;  // se dibuja el poligono con como lineas 
   case GLUT_KEY_F11 : luz=1;glPolygonMode(GL_FRONT_AND_BACK,GL_FILL);break;  // se rellena el poligono 
   case GLUT_KEY_F12 : if(luz==1)luz=0; else luz = 1;break;  // se rellena el poligono

}
glutPostRedisplay();  // marca la ventana actual que necesita volver a mostrarse. actualiza la pantalla  
}

void texto(int x, int y, char *palabra) { 
	int i;
	glColor3f(0,0,0);
	glRasterPos2f(x, y);
	for (i = 0; palabra[i] /* != '\0'*/; i++)
	// investigar y usar otros tipos de letra
	   glutBitmapCharacter(GLUT_BITMAP_TIMES_ROMAN_24, palabra[i]); 
	   // renderiza un carácter de mapa de bits usando OpenGL. 
	   /* Tipos de fuentes 
	   GLUT_BITMAP_8_BY_13: Una fuente de ancho fijo con cada carácter que encaja en un rectángulo de 8 x 13 píxeles.
	   GLUT_BITMAP_9_BY_15: Una fuente de ancho fijo con cada carácter que encaja en un rectángulo de 9 x 15 píxeles.
	   GLUT_BITMAP_TIMES_ROMAN_10: Fuente Times Roman con espaciado proporcional de 10 puntos.
	   GLUT_BITMAP_TIMES_ROMAN_24: Fuente Times Roman de 24 puntos con espaciado proporcional.
	   GLUT_BITMAP_HELVETICA_10: Una fuente Helvetica espaciada proporcional de 10 puntos. 
	   GLUT_BITMAP_HELVETICA_12: Una fuente Helvetica espaciada proporcional de 12 puntos. 
	   GLUT_BITMAP_HELVETICA_18: Una fuente Helvetica espaciada proporcional de 18 puntos.   		
	   */
}

void desocupado() {
	if (movimiento==1) {
	   angulo=angulo+0.3;
	   if (angulo>=360)
	      angulo=0;
	   glutPostRedisplay();
}
}

// documentar los metodos que se utilizan en esta funcion
void redimensionado(int anchop, int altop) {
	glViewport(0,0,anchop,altop); // establecer la ventana gráfica (x,y, ancho, alto)
	glMatrixMode(GL_PROJECTION); // Establece el modo de matriz actual. // GL_PROJECTION: Aplica operaciones de matriz posteriores a la pila de matrices de proyección.
	glLoadIdentity(); // matriz identidad
	gluPerspective(60.0f,(GLfloat)ancho/(GLfloat)alto,0.1,profundidad*2); // configurar una matriz de proyección en perspectiva
	/*
	gluPerspective(Especifica el ángulo del campo de visión, en grados, en la dirección y, 
	Especifica la relación de aspecto que determina el campo de visión en la dirección x. La relación de aspecto es la relación de x (ancho) ay (alto), 
	Especifica la distancia desde el espectador hasta el plano de recorte cercano (siempre positivo), 
	Especifica la distancia desde el espectador hasta el plano de recorte lejano (siempre positivo))
	*/
	gluLookAt(0,0,profundidad/1.2,0,0,0,0,1,0); // definir una transformación de visualización
	//gluLookAt(eyeX,eyeY,eyeZ,centroX,centroY,centroZ,hastaX,hastaY,hastaZ)
	glMatrixMode(GL_MODELVIEW); // especificar qué matriz es la matriz actual
	glLoadIdentity(); // matriz identidad
}

//documentar los metodos que se utilizan en esta funcion 
void luces() { // luces en la figura 
// La cara o caras que se actualizan. Debe ser uno de los siguientes: GL_FRONT, GL_BACK o GL_FRONT y GL_BACK.
	/* GL_AMBIENT: El parámetro params contiene cuatro valores de punto flotante que especifican la reflectancia RGBA ambiental del material. 
	   La reflectancia ambiental predeterminada para los materiales orientados hacia el frente y hacia atrás es (0.2, 0.2, 0.2, 1.0).
	   GL_DIFFUSE: El parámetro params contiene cuatro valores de punto flotante que especifican la reflectancia RGBA difusa del material.
	   La reflectancia difusa predeterminada para los materiales orientados hacia el frente y hacia atrás es (0.8, 0.8, 0.8, 1.0).
	   GL_SPECULAR: El parámetro params contiene cuatro valores de punto flotante que especifican la reflectancia RGBA especular del material.
	   La reflectancia especular predeterminada para los materiales orientados hacia el frente y hacia atrás es (0.0, 0.0, 0.0, 1.0).
	   GL_EMISSION: El parámetro params contiene cuatro valores de punto flotante que especifican la intensidad de luz emitida RGBA del material.
	   No se fijan valores enteros ni de coma flotante. La intensidad de emisión predeterminada para los materiales orientados hacia el frente y hacia atrás es (0.0, 0.0, 0.0, 1.0).
	   GL_SHININESS: El parámetro param es un valor entero único que especifica el exponente especular RGBA del material. 
	   Los valores enteros se asignan directamente. Solo se aceptan valores en el rango [0, 128]. 
	   El exponente especular predeterminado para los materiales orientados hacia el frente y hacia atrás es 0.
	*/
	glMaterialfv(GL_FRONT_AND_BACK, GL_AMBIENT, material_ambient); // especifica los parámetros de material para el modelo de iluminación.
	glMaterialfv(GL_FRONT_AND_BACK, GL_DIFFUSE, material_diffuse);
	glMaterialfv(GL_FRONT_AND_BACK, GL_SPECULAR, material_specular);
	glMaterialf(GL_FRONT_AND_BACK, GL_SHININESS, 50.0f);
	
	/* GL_AMBIENT: El parámetro params contiene cuatro valores de punto flotante que especifican la intensidad RGBA ambiental de la luz. 
	No se fijan valores enteros ni de coma flotante. La intensidad de luz ambiental predeterminada es (0.0, 0.0, 0.0, 1.0).
		GL_DIFFUSE: El parámetro params contiene cuatro valores de punto flotante que especifican la intensidad RGBA difusa de la luz. 
	La intensidad difusa predeterminada es (0.0, 0.0, 0.0, 1.0) para todas las luces excepto la luz cero. 
	La intensidad difusa predeterminada de la luz cero es (1.0, 1.0, 1.0, 1.0).
		GL_SPECULAR: El parámetro params contiene cuatro valores de punto flotante que especifican la intensidad RGBA especular de la luz.
	La intensidad especular predeterminada es (0.0, 0.0, 0.0, 1.0) para todas las luces excepto la luz cero. 
	La intensidad especular predeterminada de la luz cero es (1.0, 1.0, 1.0, 1.0).
		GL_POSITION: El parámetro params contiene cuatro valores de punto flotante que especifican la posición de la luz en coordenadas homogéneas del objeto.
	La posición predeterminada es (0,0,1,0); por lo tanto, la fuente de luz predeterminada es direccional, paralela y en la dirección del eje - z.
	*/
	
	glLightfv(GL_LIGHT0, GL_AMBIENT, luz_ambient); // devuelve valores de parámetros de fuente de luz. 
	glLightfv(GL_LIGHT0, GL_DIFFUSE, luz_diffuse);
	glLightfv(GL_LIGHT0, GL_SPECULAR, luz_specular);
	glLightfv(GL_LIGHT0, GL_POSITION, luz_position);
	glEnable(GL_DEPTH_TEST); //habilitar o deshabilitar las capacidades de GL del lado del servidor 
	// GL_DEPTH_TEST: Si está habilitado, realice comparaciones de profundidad y actualice el búfer de profundidad.
	glEnable(GL_LIGHT0);
	// GL_LIGHTi Si está habilitado, incluya la luz i en la evaluación de la ecuación de iluminación.
}
