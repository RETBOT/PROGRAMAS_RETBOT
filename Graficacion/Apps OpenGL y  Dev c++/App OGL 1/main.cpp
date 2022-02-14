#include <GL/glut.h>
void dibuja() {
	glClear(GL_COLOR_BUFFER_BIT);
//	glBegin(GL_POINTS);//LYGON);
	glBegin(GL_LINE_LOOP);
	//Triangulo
	   /*glVertex2f(0.0, 1.0);
	   glVertex2f(0.5, -0.5);
	   glVertex2f(-0.5, -0.5);
	   */
	   //Estrella 
	   glVertex2f(0.0, 1.0);
	   glVertex2f(1.0, -1.0);
	   glVertex2f(-1.0, 0.25);
	   glVertex2f(1.0, 0.25);
	   glVertex2f(-1.0, -1.0);
	   
	glEnd();
	glFlush();
}

int main(int argc, char** argv) {
	glutInit(&argc, argv);//AGREGAR ESTA FUNCION
	glutCreateWindow("Primer Ejemplo de OpenGL");
	glutDisplayFunc(dibuja);
	glutMainLoop();
	return 0;
}
