#include <GL/glut.h>
#define ancho 320
#define alto 240
#define profundidad 300

void dibuja();

int main(int argc, char** argv) {
	glutInit(&argc, argv);
glutInitDisplayMode(GLUT_RGBA | GLUT_SINGLE);
glutInitWindowPosition(100, 0);
glutInitWindowSize(ancho, alto);
glutCreateWindow("Sistema de Coordenadas");
glOrtho(-(ancho/2), (ancho/2), -(alto/2), (alto/2), -profundidad, profundidad);
glClearColor(1, 1, 1, 0);
glutDisplayFunc(dibuja);
glutMainLoop();
return 0;
}

void dibuja() {
glClear(GL_COLOR_BUFFER_BIT);
glColor3f(0, 0, 0);
glBegin(GL_LINES);
   glVertex3f(-ancho/2, 0, 0);
   glVertex3f(ancho/2, 0, 0);
   glVertex3f(0, alto/2, 0);
   glVertex3f(0, -alto/2, 0);
glEnd();
//glColor3f(0.345, 0.750, 0);
glBegin(GL_POLYGON);
glColor3f(1, 0, 0);
	glVertex3f(0, 100, 0);
	glColor3f(0, 1, 0);
	glVertex3f(100, -100, 0);
	glColor3f(0, 0, 1);
	glVertex3f(-100, 0, 0);
	glColor3f(1, 0, 0);
	glVertex3f(100, 0 , 0);
	glColor3f(0, 1, 0);
	glVertex3f(-100, -100, 0);
	glColor3f(0, 0, 1);

   	//glVertex3f(0, 100, 0);
   	//glVertex3f(50, -50, 0);
   	//glVertex3f(-50, -50, 0);
glEnd();
glFlush();
}
