<?php include '../templates/cabeceraCarrito.php' 

// agregar usuarios INSERT INTO `tblusuarios` (`IDCliente`, `usuario`, `clave`) VALUES (NULL, 'roberto@correo.com', '123');
?>

<h1>Crear cuenta</h1>
        <div class="grid"> 
        <center></center><table style="border-collapse: collapse;  border-spacing: 10px 5px;"  border="5"  bordercolor="#1FC52E">
            <form method="post" action="registro.php">
                <tr>
                <td style="width: 50%;"><h3>Corrreo electronico: </h3></td>
                    <td style="width: 50%;"><input type="text" placeholder="Correo electronico" name="usuario" required></td>
                </tr>
                <tr>
                <td style="width: 50%;"><h3>Contraseña: </h3></td>  
                    <td style="width: 50%;"><input type="password" placeholder="Contraseña" name="clave" required></td> 
                </tr>
                <tr>
                    <td style="width: 50%;"><h3>Nombre: </h3></td>
                    <td style="width: 50%;"><input type="text" placeholder="Nombre de usuario" autofocus="1" name="nombre" required></td> 
                </tr>
                <tr>
                <td colspan="2"><center><button style="width: 60%; border-radius: 1rem;" class="formulario__submit" type="submit" >Crear cuenta</button></center></td>
                </tr>
            </form>
        </table>
        </div>
<?Php 
include '../templates/pie.php';
?>