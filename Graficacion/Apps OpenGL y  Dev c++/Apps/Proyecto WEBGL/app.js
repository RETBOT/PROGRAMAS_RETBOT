var vertexShaderText =
[
'precision mediump float;',
'',
'attribute vec3 vertPosition;',
'attribute vec3 vertColor;',
'varying vec3 fragColor;',
'uniform mat4 mWorld;',
'uniform mat4 mView;',
'uniform mat4 mProj;',
'',
'void main()',
'{',
'  fragColor = vertColor;',
'  gl_Position = mProj * mView * mWorld * vec4(vertPosition, 1.0);',
'}'
].join('\n');

var fragmentShaderText =
[
'precision mediump float;',
'',
'varying vec3 fragColor;',
'void main()',
'{',
'  gl_FragColor = vec4(fragColor, 1.0);',
'}'
].join('\n');

var InitDemo = function () { // inicio
	console.log('This is working'); // si la aplicacion funciona correctamente
	// se desplega un mensaje en consola

	var canvas = document.getElementById('game-surface'); // manda la superficio de la figura
	var gl = canvas.getContext('webgl'); // Para los Scripts puede tambien comprobarse su
																			// soporte desde la programacion por un simple test
																			// para la presencia del metodo getContext().

	if (!gl) { // en caso de no ser soportado se usa experimental-webgl
		console.log('WebGL not supported, falling back on experimental-webgl');
		gl = canvas.getContext('experimental-webgl');
	}

	if (!gl) { // en caso de no soportar WebGl se notifica
		alert('Your browser does not support WebGL');
	}

  gl.clearColor(0.75, 0.1, 0.8, 1.0); // seleccion de color  (red, green, blue, alpha);
	gl.clear(gl.COLOR_BUFFER_BIT | gl.DEPTH_BUFFER_BIT);
	gl.enable(gl.DEPTH_TEST);
	gl.enable(gl.CULL_FACE);
	gl.frontFace(gl.CCW);
	gl.cullFace(gl.BACK);

	//
	// Create shaders
	/*
		método  createShader() de la API de WebGL crea un WebGLShaderque
		luego se puede configurar con WebGLRenderingContext.shaderSource() y
		WebGLRenderingContext.compileShader().
		gl.VERTEX_SHADER o gl.FRAGMENT_SHADER
	*/
	var vertexShader = gl.createShader(gl.VERTEX_SHADER);
	var fragmentShader = gl.createShader(gl.FRAGMENT_SHADER);

  // establece el código fuente de un WebGLShader.
	gl.shaderSource(vertexShader, vertexShaderText);
	gl.shaderSource(fragmentShader, fragmentShaderText);

//compila un sombreador GLSL en datos binarios para que pueda ser utilizado por un WebGLProgram.
	gl.compileShader(vertexShader);
	if (!gl.getShaderParameter(vertexShader, gl.COMPILE_STATUS)) {
		console.error('ERROR compiling vertex shader!', gl.getShaderInfoLog(vertexShader));
		return;
	}
// compila un sombreador GLSL en datos binarios para que pueda ser utilizado por un WebGLProgram.
	gl.compileShader(fragmentShader);
	if (!gl.getShaderParameter(fragmentShader, gl.COMPILE_STATUS)) {
		console.error('ERROR compiling fragment shader!', gl.getShaderInfoLog(fragmentShader));
		return;
	}

// crea e inicializa un WebGLProgramobjeto.
	var program = gl.createProgram();
	gl.attachShader(program, vertexShader); //adjunta un fragmento o un vértice WebGLShadera un WebGLProgram.
	gl.attachShader(program, fragmentShader);
	gl.linkProgram(program); //enlaza un dato WebGLProgram, completando el proceso de preparación del código GPU para los sombreadores de vértices y fragmentos del programa.
	if (!gl.getProgramParameter(program, gl.LINK_STATUS)) { // método de la API de WebGL devuelve información sobre el programa dado.
		console.error('ERROR linking program!', gl.getProgramInfoLog(program));
		return;
	}
	gl.validateProgram(program); // Comprueba si está vinculado correctamente y si se puede utilizar en el estado actual de WebGL.
	if (!gl.getProgramParameter(program, gl.VALIDATE_STATUS)) {
		console.error('ERROR validating program!', gl.getProgramInfoLog(program));
		return;
	}

	//
	// Cubo
	//

	var triangleVertices =
	[ // X, Y,       R, G, B
		0.0, 0.5,    1.0, 1.0, 1.0,
		-0.5, -0.5,  0.7, 1.0, 1.0,
		0.5, -0.5,   0.1, 1.0, 0.6
	];

	 var boxVertices =
	[ // posicion del cubo y colores
		//X, Y, Z           R, G, B
		// Arriba
		-1.0, 1.0, -1.0,   1.0, 0.5, 0.5,
		-1.0, 1.0, 1.0,    0.5, 1.0, 0.5,
		1.0, 1.0, 1.0,     1.0, 0.5, 1.0,
		1.0, 1.0, -1.0,    0.5, 1.0, 0.5,

		// Izquierda
		-1.0, 1.0, 1.0,    0.75, 1.0, 0.5,
		-1.0, -1.0, 1.0,   0.75, 0.25, 1.0,
		-1.0, -1.0, -1.0,  1.0, 1.0, 0.5,
		-1.0, 1.0, -1.0,   1.0, 0.25, 0.5,

		// Derecha
		1.0, 1.0, 1.0,    1.0, 0.25, 0.75,
		1.0, -1.0, 1.0,   0.25, 1.0, 0.75,
		1.0, -1.0, -1.0,  0.25, 1.0, 1.0,
		1.0, 1.0, -1.0,   0.25, 1.0, 0.75,

		// frente
		1.0, 1.0, 1.0,    1.0, 0.0, 0.15,
		1.0, -1.0, 1.0,    1.0, 1.0, 0.15,
		-1.0, -1.0, 1.0,    1.0, 0.0, 1.0,
		-1.0, 1.0, 1.0,    1.0, 1.0, 0.15,

		// atrás
		1.0, 1.0, -1.0,    0.0, 1.0, 0.15,
		1.0, -1.0, -1.0,    1.0, 1.0, 0.15,
		-1.0, -1.0, -1.0,    0.0, 1.0, 0.15,
		-1.0, 1.0, -1.0,    0.0, 1.0, 1.0,

		// abajo
		-1.0, -1.0, -1.0,   1.0, 0.5, 1.0,
		-1.0, -1.0, 1.0,    0.5, 1.0, 1.0,
		1.0, -1.0, 1.0,     0.5, 0.5, 1.0,
		1.0, -1.0, -1.0,    0.5, 1.0, 1.0,
	];

	//vertices del cubo
	var boxIndices =
	[
		// Arriba
		0, 1, 2,
		0, 2, 3,

		// Izquierda
		5, 4, 6,
		6, 4, 7,

		// Derecha
		8, 9, 10,
		8, 10, 11,

	 // frente
		13, 12, 14,
		15, 14, 12,

		// atrás
		16, 17, 18,
		16, 18, 19,

		// abajo
		21, 20, 22,
		22, 20, 23
	];

 /*createBuffer: método de la BaseAudioContext interfaz se utiliza para crear un nuevo AudioBufferobjeto vacío,
 que luego se puede completar con datos y reproducir a través de unAudioBufferSourceNode
bindBuffer: método de la API de WebGL vincula un determinado WebGLBuffera un objetivo.
bufferData: método de la API de WebGL se inicializa y crea el almacén de datos del objeto de búfer.
getAttribLocation: método de la API WebGL devuelve la ubicación de una variable de atributo en un archivo WebGLProgram.*/
	var boxVertexBufferObject = gl.createBuffer();
	gl.bindBuffer(gl.ARRAY_BUFFER, boxVertexBufferObject);
	gl.bufferData(gl.ARRAY_BUFFER, new Float32Array(boxVertices), gl.STATIC_DRAW);

	var boxIndexBufferObject = gl.createBuffer();
	gl.bindBuffer(gl.ELEMENT_ARRAY_BUFFER, boxIndexBufferObject);
	gl.bufferData(gl.ELEMENT_ARRAY_BUFFER, new Uint16Array(boxIndices), gl.STATIC_DRAW);

	var positionAttribLocation = gl.getAttribLocation(program, 'vertPosition');
	var colorAttribLocation = gl.getAttribLocation(program, 'vertColor');

	/*vertexAttribPointer: método de la API de WebGL vincula el búfer actualmente vinculado a gl.ARRAY_BUFFERun
	atributo de vértice genérico del objeto de búfer de vértice actual y especifica su diseño. */
	gl.vertexAttribPointer(
		positionAttribLocation, // Ubicación del atributo
		3, // Número de elementos por atributo
		gl.FLOAT, // Tipo de elementos
		gl.FALSE,
		6 * Float32Array.BYTES_PER_ELEMENT, // Tamaño de un vértice individual
		0 // Desplazamiento desde el comienzo de un solo vértice a este atributo
	);
	gl.vertexAttribPointer(
		colorAttribLocation, //  Ubicación del atributo
		3, // Número de elementos por atributo
		gl.FLOAT, // Tipo de elementos
		gl.FALSE,
		6 * Float32Array.BYTES_PER_ELEMENT, // Tamaño de un vértice individual
		3 * Float32Array.BYTES_PER_ELEMENT // Desplazamiento desde el comienzo de un solo vértice a este atributo
	);
// enableVertexAttribArray: activa la matriz de atributos de vértice genérico en el
// índice especificado en la lista de matrices de atributos.
	gl.enableVertexAttribArray(positionAttribLocation);
	gl.enableVertexAttribArray(colorAttribLocation);

	// la máquina de estado OpenGL qué programa debe estar activo.
	gl.useProgram(program);
  // getUniformLocation: La variable uniforme se devuelve como un WebGLUniformLocationobjeto,
	// que es un identificador opaco que se utiliza para especificar en qué parte de la memoria de la GPU se encuentra esa variable uniforme.
	var matWorldUniformLocation = gl.getUniformLocation(program, 'mWorld');
	var matViewUniformLocation = gl.getUniformLocation(program, 'mView');
	var matProjUniformLocation = gl.getUniformLocation(program, 'mProj');
 // rotacion del cubo
	var worldMatrix = new Float32Array(16);
	var viewMatrix = new Float32Array(16);
	var projMatrix = new Float32Array(16);
	mat4.identity(worldMatrix); // matriz
	mat4.lookAt(viewMatrix, [-1, -5, -8], [0, 0, 0], [0, 1, 0]); // Genera una matriz de observación con la posición del ojo, el punto focal y el eje hacia arriba dados.
 //perspective: Genera una matriz de proyección en perspectiva con los límites dados. Pasar un valor nulo / indefinido / sin valor para far generará una matriz de proyección infinita.
	mat4.perspective(projMatrix, glMatrix.toRadian(45), canvas.clientWidth / canvas.clientHeight, 0.1, 1000.0);
 // uniformMatrix4fv: métodos de la API de WebGL especifican valores de matriz para variables uniformes.
	gl.uniformMatrix4fv(matWorldUniformLocation, gl.FALSE, worldMatrix);
	gl.uniformMatrix4fv(matViewUniformLocation, gl.FALSE, viewMatrix);
	gl.uniformMatrix4fv(matProjUniformLocation, gl.FALSE, projMatrix);

 // rotar matriz
	var xRotationMatrix = new Float32Array(16);
	var yRotationMatrix = new Float32Array(16);

	//
	// Main render loop
	//
	var identityMatrix = new Float32Array(16);
	mat4.identity(identityMatrix); // matriz identidad
	var angle = 30;//0; // angulo de rotacion
	var loop = function () { // ciclo
		angle = performance.now() / 1000 / 6 * 2 * Math.PI; // rotacion del cubo
		// rotate: Gira un mat4 por el ángulo dado alrededor del eje dado

		mat4.rotate(yRotationMatrix, identityMatrix, angle, [0, 1, 0]);
		mat4.rotate(xRotationMatrix, identityMatrix, angle / 4, [1, 0, 0]);

		mat4.mul(worldMatrix, yRotationMatrix, xRotationMatrix);
		gl.uniformMatrix4fv(matWorldUniformLocation, gl.FALSE, worldMatrix);

		gl.clearColor(0.75, 0.85, 0.1, 1.0); // color de fondo
		gl.clear(gl.DEPTH_BUFFER_BIT | gl.COLOR_BUFFER_BIT);
		gl.drawElements(gl.TRIANGLES, boxIndices.length, gl.UNSIGNED_SHORT, 0);

		requestAnimationFrame(loop);
	};
	requestAnimationFrame(loop);
};
