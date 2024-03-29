<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <script src="JS/funciones.js" type="text/javascript"></script>
        <link href="Sweetalert/sweetalert.css" rel="stylesheet" type="text/css"/>
        <script src="Sweetalert/sweetalert.js" type="text/javascript"></script>
        <!-- Favicon -->
        <link rel="icon" href="IMG/bus.svg">
        <title>Devoluciones</title>
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
                            <a class="nav-link">Devoluciones <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="ViajeroIndex.jsp">Viajeros <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                              Más
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                              <a class="dropdown-item" href="DestinoIndex.jsp">Destinos <i class="fas fa-map-marked-alt"></i></i></a>
                              <a class="dropdown-item" href="VehiculoIndex.jsp">Vehiculos <i class="fas fa-bus"></i></i></a>
                              <a class="dropdown-item" href="ConductorIndex.jsp">Conductores  <i class="fas fa-user-tie"></i></a>
                              <a class="dropdown-item" href="ClienteIndex.jsp">Clientes  <i class="fas fa-users"></i> </a>
                            </div>
                        </li>
                    </ul>
                </div>
        </nav>
        
        <div class="container mt-4">
        <div class="card border-info">
         <div class="card-header bg-info text-white">
       
            <div class="navbar">
                <form action="ControladorDevolucion" method="POST">
                <button class="btn btn-light" id="new" type="submit" name="accion" value="Volver"><i class="fa fa-arrow-left " aria-hidden="true"></i></button>
                </form>
               <form class="form-inline" action="ControladorDevolucion" method="POST">
                   <input type="search" class="form-control" autocomplete="off" name="ingresoBuscar" placeholder="Nombre del Cliente">
                   <input type="submit" name="accion" value="Buscar" class="btn btn-light">
               </form>
        </div>
              </div>
        <div class="card-body">
        <!-- Tabla-->
        <div class="p-4">
            <table class="table table-bordered table-striped m-auto">
                <thead class="thead-dark" >
                <tr>
                    <th colspan="2"><h5><center>CLIENTE</center></h5> </th>
                    <th colspan="1"><h5><center>DESTINO</center></h5> </th>
                    <th colspan="3"><h5><center>DETALLES</center></h5> </th>
                  
                </tr>
                <tr>
                 
                 <th scope="col"><center>NOMBRES</center></th>
                 <th scope="col"><center>APELLIDOS</center></th>

                 
                 <th scope="col"><center>LUGAR</center></th>
                 
                 <th scope="col"><center>CANTIDAD DE DEVOLUCION</center></th>
                 <th scope="col"><center>CANTIDAD DE PENALIZACION</center></th>
                 <th scope="col"><center>FECHA</center></th>
                
                 
                </tr>
              </thead>
                <tbody id="tabla">
                    <c:forEach var="dato" items="${datos}">
                        <tr>
                            <td><center>${dato.getNombresCliente()}</center></td>
                            <td><center>${dato.getApellidosCliente()}</center></td>
                            <td><center>${dato.getNombreDestino()}</center></td>
                            <td><center>Q. ${dato.getCantidadDevolucion()}</center></td>
                            <td><center>Q. ${dato.getCantidadPenalizacion()}</center></td>
                            <td><center>${dato.getFecha()}</center></td>
                        </tr>
                    </c:forEach>
                </tbody>
                
            </table>
            </div>
            <form action="ControladorDevolucion" method="POST">
             <button type="submit" id="btnListar" class="btn btn-outline-info my-3" name="accion" value="Listar" title="Mostrar Viajeros"><i class="fas fa-clipboard-list fa-3x"></i></button>
            </form>
        
         </div>
        </div>
    </div>
        
    </body>
</html>