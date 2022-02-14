// This application shows balls bouncing on a checkerboard, with no respect
// for the laws of Newtonian Mechanics.  There's a little spotlight to make
// the animation interesting, and arrow keys move the camera for even more
// fun.
//Fuente: https://cs.lmu.edu/~ray/notes/openglexamples/

#ifdef __APPLE_CC__
#include <GLUT/glut.h>
#else
#include <GL/glut.h>
#endif
#include <cmath>

// Colores constantes
GLfloat WHITE[] = {1, 1, 1};
GLfloat RED[] = {1, 0, 0};
GLfloat GREEN[] = {0, 1, 0};
GLfloat MAGENTA[] = {1, 0, 1};
GLfloat BLACK[] = {0, 0, 0};
GLfloat BLUEISH[] = {0.75, 0.80, 0.5};
GLfloat YEA[] = {0.5, 0.20, 0.70};
GLfloat AIGHT[] = {0.2, 0.85, 0.57};

//Clase camara que se mueve horizontalmente en un circulo, centrado al origen con un radio de 10. 
//Movimiento vertical de arriba para abajo

class Camera {
  double theta;      // Posiciones de x y z simultaneamente
  double y;          // Posición Y
  double dTheta;     // Incremento de Theta
  double dy;         // Incremento de Y
  
public:
	
  Camera(): theta(0), y(3), dTheta(0.04), dy(0.8) {}
  double getX() {return 10 * cos(theta);} //Formulas para obtener los valores de XYZ
  double getY() {return y;}
  double getZ() {return 10 * sin(theta);}
  void moveRight() {theta += dTheta;} //Movimientos para la derecha, izq, arriba y abajo. Incluye disminuir los valores si se llega al limite
  void moveLeft() {theta -= dTheta;}
  void moveUp() {y += dy;}
  void moveDown() {if (y > dy) y -= dy;} 
};

//Clase Bola. Sus atributos son radio, color. Rebotan de arriba para abajo, con una altura maxima, además de en el plano xz, por lo que son constantes. 
//Se mueven de arriba para abajo 0.05 por frame.
class Ball {
	
  double radius;
  GLfloat* color;
  double maximumHeight;
  double x;
  double y;
  double z;
  int direction;
  
public:
  Ball(double r, GLfloat* c, double h, double x, double z): //Constructor del objeto bola
      radius(r), color(c), maximumHeight(h), direction(-1),
      y(h), x(x), z(z) {
  }
  
  void update() { 
    y += direction * 0.05; //Subida o bajada de la pelota en el plano Y
    
    if (y > maximumHeight) { //Si la pelota llega al punto maximo, rebota y se va hacia abajo
      y = maximumHeight; direction = -1;
    } else if (y < radius) { //Si la pelota llega al punto minimo, rebota y se va hacia arriba
      y = radius; direction = 1;
    }
    
    glPushMatrix(); //Actualización de la matriz para actualizar la figura. 
    glMaterialfv(GL_FRONT, GL_AMBIENT_AND_DIFFUSE, color);
    glTranslated(x, y, z); 
    glutSolidSphere(radius, 30, 30);
    glPopMatrix();
  }
};

//Clase Checkerboard (tablero de damas chinas). Tiene colores alternantes por cuadro. El número de cuadros se define en el constructor.
//Cada cuadro es de 1x1. Empieza en la esquina 0,0 y se estira hacia los planos positivos de x y z. Luz en 4,3,7 (Esquina superior derecha).

class Checkerboard {
	  int displayListId;
	  int width; 
	  int depth; 
	  
	public:
	  Checkerboard(int width, int depth): width(width), depth(depth) {}
	  double centerx() {return width / 2;}
	  double centerz() {return depth / 2;}
	  void create() { 								//Creacion del tablero
	    displayListId = glGenLists(1); 
	    glNewList(displayListId, GL_COMPILE);
	    GLfloat lightPosition[] = {-5, 3, -7, 1}; 	//Posicion  de la luz en el tablero
	    glLightfv(GL_LIGHT0, GL_POSITION, lightPosition); 
	    glBegin(GL_QUADS); 							//Definir las figuras que formaran el tablero, en este caso cuadrados. 
	    glNormal3d(0, 1, 0); 						//Valores del 3d 
	    for (int x = 0; x < width - 1; x++) {
	      for (int z = 0; z < depth - 1; z++) {
	        glMaterialfv(GL_FRONT, GL_AMBIENT_AND_DIFFUSE, //Definir el material y atributos del tablero
	                     (x + z) % 2 == 0 ? BLACK : BLUEISH);
	                     
	        glVertex3d(x, 0, z); 					//Se definen las esquinas de cada cuadro en el tablero
	        glVertex3d(x+1, 0, z);
	        glVertex3d(x+1, 0, z+1);
	        glVertex3d(x, 0, z+1);
	      }
	    }
	    glEnd(); 
	    glEndList();
	  }
	  void draw() {
	    glCallList(displayListId);
	  }
};

// Valores globales para el tablero y las pelotas, además de crear el objeto camara. 
Checkerboard checkerboard(8, 8); // ( X, Z)
Camera camera;
Ball balls[] = {
	  //radio, color, altura maxima, x, z. 
  Ball(1, GREEN, 7, 6, 1), 
  Ball(1.5, YEA, 6, 3, 4),
  Ball(0.4, WHITE, 5, 1, 7),
  Ball(1, WHITE, 1, 7, 7), 
  Ball(1.5, AIGHT, 2, 2, 5)
};


// Parametros globales para las luces de la aplicación
void init() {
  glEnable(GL_DEPTH_TEST); //Se activa el fondo de la app. 
  glLightfv(GL_LIGHT0, GL_DIFFUSE, WHITE); //Se activa la luz difusa. GL_LIGHT0 = (1,1,1,1)
  glLightfv(GL_LIGHT0, GL_SPECULAR, WHITE); //Se activa la luz especular
  glMaterialfv(GL_FRONT, GL_SPECULAR, WHITE); //Se define el material de la luz especular
  glMaterialf(GL_FRONT, GL_SHININESS, 30); //Se define el brillo de la luz. 
  glEnable(GL_LIGHTING); //Se actiban las luces en la aplicación
  glEnable(GL_LIGHT0);
  checkerboard.create(); //Se reflejan los cambios en el tablero. 
}

// Loop principal del GLUT. 
void display() {
  glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT); //Se limpia el frame
  glLoadIdentity(); //Carga la escena
  gluLookAt(camera.getX(), camera.getY(), camera.getZ(),
            checkerboard.centerx(), 0.0, checkerboard.centerz(),
            0.0, 1.0, 0.0); //Valores de la camara
  checkerboard.draw(); //Dibujar el tablero de damas
  for (int i = 0; i < sizeof balls / sizeof(Ball); i++) {
    balls[i].update(); //Actualizar los valores y atributos de las pelotas
  }
  glFlush(); //Se ejecutan los cambios hechos en el buffer seleccionado. 
  glutSwapBuffers(); //Se intercambian los buffers en el programa
}

// Define la camara en caso de modificar el tamaño de la ventana
void reshape(GLint w, GLint h) {
  glViewport(0, 0, w, h); 			//X, Y, ancho,  alto
  glMatrixMode(GL_PROJECTION); 		//Se define la matriz para proyeccion
  glLoadIdentity(); 				//Se carga la matriz identidad
  gluPerspective(40.0, GLfloat(w) / GLfloat(h), 1.0, 150.0); //Matriz de la perspectiva(Angulo en Y, ancho/alto, distancia hacia el plano más cercano en z, distancia hacia el mas lejano en z)
  glMatrixMode(GL_MODELVIEW);		//Se define la matriz para la vista del modelo
}

// Llamada para actualizar el frame de la ventana.
void timer(int v) {
  glutPostRedisplay();
  glutTimerFunc(1000/60, timer, v);
}

// Uso del teclado para mover la camara. 
void special(int key, int, int) {
  switch (key) {
    case GLUT_KEY_LEFT: camera.moveLeft(); break; //
    case GLUT_KEY_RIGHT: camera.moveRight(); break;
    case GLUT_KEY_UP: camera.moveUp(); break;
    case GLUT_KEY_DOWN: camera.moveDown(); break; 
  }
  glutPostRedisplay(); //Método para actualizar. 
}

// Se inicializa GLUT 
int main(int argc, char** argv) {
  glutInit(&argc, argv);
  glutInitDisplayMode(GLUT_DOUBLE | GLUT_RGB | GLUT_DEPTH);
  glutInitWindowPosition(80, 80); 		//Posicion de la ventana
  glutInitWindowSize(800, 600); 		//Se define el tamaño de la ventana
  glutCreateWindow("Bouncing Balls"); 	//Titulo de la ventana
  glutDisplayFunc(display); 			//Conectar el display al GLUT
  glutReshapeFunc(reshape);				//
  glutSpecialFunc(special); 			//Activar el uso del teclado con el método special
  glutTimerFunc(100, timer, 0); 		//Timer para activar la animación
  init(); //Inicializar 
  glutMainLoop(); //Loop del glut
}
