<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*;"%>

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
        <title>Preparar Devolucion</title>
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
                        <a class="nav-link">Preparar Devolucion <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="ViajeroIndex.jsp">Viajeros<span class="sr-only">(current)</span></a>
                    </li>
                </ul>
            </div>
        </nav>

        <div class="container mt-4 mb-4 col-lg-5">
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <center><h2 class="mt-2 mb-2"> DEVOLUCION DE BOLETO </h2> </center>
                </div>
                <div class="card-body">
                    <form action="ControladorViajero" method="POST">       
                         
                        <div>
                            <input type="hidden" class="form-control" name="ingresoIdCliente" autocomplete="off" value="${viajero.getIdCliente()}" >     
                        </div>
                        <div>
                            <b><label class="mt-2">NOMBRES CLIENTE</label></b>
                            <input type="text" class="form-control" autocomplete="off" value="${viajero.getNombresCliente()}" disabled >     
                        </div>
                        <div>
                            <b><label class="mt-2">APELLIDOS CLIENTE</label></b>
                            <input type="text" class="form-control" autocomplete="off" value="${viajero.getApellidosCliente()}" disabled>     
                        </div>
                        <div>
                            <input type="hidden" class="form-control" name="ingresoIdDestino" autocomplete="off" value="${viajero.getIdDestino()}"> 
                        </div>
                        <div>
                            <b><label class="mt-2">DESTINO</label></b>
                            <input type="text" class="form-control" autocomplete="off" value="${viajero.getNombreDestino()}" disabled>     
                        </div>
                        
                        <div>
                            <b><label for="" class="mt-2">ASIENTO</label></b>
                            <input type="number" class="form-control" autocomplete="off" value="${viajero.getAsiento()}" disabled>
                        </div>
                        <div>
                            <b><label  class="mt-2">FECHA Y HORA</label></b>
                            <input type="text" class="form-control" autocomplete="off"  placeholder="DD/MM/AAAA HH:MM TT" value="${viajero.getFechaViaje()}" disabled>
                        </div>
                        <div>
                            <b><label class="mt-2">GASTO TOTAL</label></b>
                            <input type="text" class="form-control" autocomplete="off" value="Q. ${viajero.getPagoTotal()}" disabled>     
                        </div>
                        <div>
                            <b><label class="mt-2">CANTIDAD DE REEMBOLSO (80%)</label></b>
                            <input type="text" class="form-control" autocomplete="off" value="Q. ${viajero.getCantidadDevolucion()}" disabled>     
                        </div>
                        <div>
                            <b><label class="mt-2">CANTIDAD DE PENALIZACION (20%)</label></b>
                            <input type="text" class="form-control" autocomplete="off" value="Q. ${viajero.getCantidadPenalizacion()}" disabled>     
                        </div>
                        <button type="submit" class="btn btn-secondary my-3" id="btnGuardar" name="accion" value="Devolucion">Devolver &nbsp;&nbsp;</button> 
                        <a href="ViajeroIndex.jsp"> <input type="button" value="Cancelar" class="btn btn-danger" id="btnCancelar"></a> 
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>