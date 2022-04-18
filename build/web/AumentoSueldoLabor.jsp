<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>      
        <script src="https://kit.fontawesome.com/85601d370d.js" crossorigin="anonymous"></script>
        <link href="CSS/estilos.css" rel="stylesheet">
        <!-- Favicon -->
        <link rel="icon" href="IMG/bus.svg">
        <title>TRANSPORTES RAPI</title>
    </head>
    <body>
        <!-- Barra de Navegacion -->
        <nav class="navbar navbar-expand-lg navbar-dark bg-secondary">
            <a class="navbar-brand"> <i class="fas fa-bus"></i>&nbsp;&nbsp;TRANSPORTES RAPI</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a class="nav-link">Aumento de Sueldo <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="ConductorIndex.jsp">Conductores<span class="sr-only">(current)</span></a>
                    </li>
                </ul>
            </div>
        </nav>


        <div class="container md mt-2 col-lg-5">
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <center><h2 class="mt-2 mb-2"> AUMENTO DE SUELDO (AÑOS DE LABOR) </h2> </center>
                </div>
                <div class="card-body">
                    <form action="ControladorConductor" method="POST">
                        <div>
                            <b><label for="ingresoAnio" class="mt-2">CANTIDAD DE AÑOS EQUIVALENTE O MAYOR A:</label></b>
                            <input type="number" name="ingresoAnio" class="form-control" autocomplete="off"  min="1" pattern="^[0-9]+" placeholder="En números" required>
                        </div>
                         <div>
                            <b><label for="ingresoCantidadAumentoUno" class="mt-2">CANTIDAD DE AUMENTO:</label></b>
                            <input type="number" name="ingresoCantidadAumentoUno" class="form-control" autocomplete="off"  step="0.01" min="1" placeholder="En números" required>
                        </div>
                        <button type="submit" class="btn btn-primary my-3" id="btnGuardar" name="accion" value="AumentoSueldoLabor">Guardar &nbsp;&nbsp;<i class="fas fa-save"></i></button> 
                        <a href="ConductorIndex.jsp"> <input type="button" value="Cancelar" class="btn btn-danger" id="btnCancelar"></a> 
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>