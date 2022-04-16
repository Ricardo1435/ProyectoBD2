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
        <title>Conductores Eliminados</title>
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
                            <a class="nav-link">Conductores Eliminados<span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="ConductorIndex.jsp">Clientes <span class="sr-only">(current)</span></a>
                        </li>
                    </ul>
                </div>
        </nav>
        
        <div class="container mt-4">
        <div class="card border-info">
            <div class="card-header bg-info text-white">
            <div class="navbar">
               <a class="btn btn-light" id="new" name="accion" value="Volver" href="ConductorIndex.jsp"><i class="fa fa-arrow-left " aria-hidden="true"></i></a>
               <form class="form-inline" action="ControladorConductorEliminado" method="POST">
                   <input type="search" class="form-control" autocomplete="off" name="ingresoBuscar">
                   <input type="submit" name="accion" value="Buscar" class="btn btn-light">
               </form>
              </div>
        </div>
        <div class="card-body">
        <!-- Tabla-->
        <div class="p-4">
            <table class="table table-striped table-bordered m-auto">
                <thead class="thead-dark" >
                <tr>
                    <th colspan="8"><h5><center>CONDUCTORES ELIMINADOS</center></h5></th>
                </tr>
                <tr>
                    <th colspan="5"><h5><center>DETALLES DEL CONDUCTOR</center></h5></th>
                    <th colspan="2"><h5><center>DETALLES DE ELIMINACION</center></h5></th>
                    <th rowspan="2"><h5><center>OPCIONES</center></h5></th>
                </tr>
                <tr>
                 <th scope="col"><center>ID</center></th>
                 <th scope="col"><center>DPI</center></th>
                 <th scope="col"><center>NOMBRES</center></th>
                 <th scope="col"><center>APELLIDOS</center></th>
                 <th scope="col"><center>EDAD</center></th>
                 <th scope="col"><center>FECHA</center></th>
                 <th scope="col"><center>USUARIO</center></th>
                </tr>
              </thead>
                <tbody id="tabla">
                    <c:forEach var="dato" items="${datos}">
                        <tr>
                            <td><center>${dato.getIdConductorEliminado()}</center></td>
                            <td><center>${dato.getDpiConductorEliminado()}</center></td>
                            <td><center>${dato.getNombresConductorEliminado()}</center></td>
                            <td><center>${dato.getApellidosConductorEliminado()}</center></td>
                            <td><center>${dato.getEdadConductorliminado()}</center></td>
                            <td><center>${dato.getFecha()}</center></td>
                            <td><center>${dato.getCorreo()}</center></td>
                            <td>
                            <center> 
                                <form action="ControladorConductorEliminado" method="POST">
                                <input type="hidden" id="idClienteEliminado" name="idConductorEliminado" value="${dato.getIdConductorEliminado()}">
                                <button class="btn btn-secondary" type="submit" name="accion" value="Restaurar"> Restaurar</button>
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
           <form action="ControladorConductorEliminado" method="POST">
             <button type="submit" id="btnListar" class="btn btn-outline-info my-3" name="accion" value="Listar" title="Mostrar Clientes Eliminados"><i class="fas fa-clipboard-list fa-3x"></i></button>
           </form>
        </div>
    </body>
</html>