
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
        <title>Destinos</title>
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
                            <a class="nav-link">Destinos <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="principal.jsp">Inicio <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="ViajeroIndex.jsp">Viajeros <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                              Más
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
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
                <a class="btn btn-light btn-bg my-3 mx-1" id="new" name="accion" value="Nuevo" href="AddDestino.jsp">Nuevo</a>
               <form class="form-inline" action="ControladorDestino" method="POST">
                   <input type="search" class="form-control" autocomplete="off" name="ingresoBuscar" placeholder="Nombre del Destino">
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
                    <th colspan="3"><h5><center>DESTINO</center></h5> </th>
                    <th colspan="3"><h5><center>VEHICULO</center></h5> </th>
                    <th rowspan="2"><center>OPCIONES</center></th>
                </tr>
                <tr>
                 <th scope="col"><center>ID</center></th>
                 <th scope="col"><center>NOMBRE</center></th>
                 <th scope="col"><center>PRECIO DEL BOLETO</center></th>
                 <th scope="col"><center>ID</center></th>
                 <th scope="col"><center>MATRICULA</center></th>
                 <th scope="col"><center>ALIAS</center></th>
                </tr>
              </thead>
                <tbody id="tabla">
                    <c:forEach var="dato" items="${datos}">
                        <tr>
                            <td><center>${dato.getIdDestino()}</center></td>
                            <td><center>${dato.getNombreDestino()}</center></td>
                            <td><center>Q. ${dato.getPrecioBoleto()}</center></td>
                            <td><center>${dato.getIdVehiculo()}</center></td>
                            <td><center>${dato.getMatricula()}</center></td>
                            <td><center>${dato.getAliasVehiculo()}</center></td>
                            <td>
                            <center> 
                                <form action="ControladorDestino" method="POST">
                                <input type="hidden" name="idDestino" id="idDestino" value="${dato.getIdDestino()}">
                                <button class="btn btn-warning" type="submit" name="accion" value="Editar">Editar&nbsp;<i class="fas fa-edit"></i></button>
                                <button class="btn btn-danger" type="submit" name="accion" id="btnEliminarDestino" value="Eliminar">Eliminar&nbsp;<i class="fas fa-trash-alt"></i></button>
                                </form>
                            </center>    
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
           </div>
        </div>
    </div>
            <form action="ControladorDestino" method="POST">
             <button type="submit" id="btnListar" class="btn btn-outline-info my-3" name="accion" value="Listar" title="Mostrar Destinos"><i class="fas fa-clipboard-list fa-3x"></i></button>
           </form>
        </div>
    </body>
</html>