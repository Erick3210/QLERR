<%-- 
    Document   : DescripcionReusabilidad2
    Created on : 26-may-2023, 10:25:00
    Author     : efcas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <style>
            * {
                box-sizing: border-box;
            }

            body {
                margin: 0;
                font-family: Arial, sans-serif;
            }

            .header {
                background-color: #FFFFFF;
                padding: 20px;
                color: #fff;
                text-align: center;
            }

            .header img {
                max-width: 100%;
                height: 100%;
            }

            .content {
                padding: 20px;
                text-align: center;
              
                display: flex;
                justify-content: center;
                 border: 5px #333 solid;
                padding: 40px;
                background-color: #FAFAFA;
            }

            
            .margen{
                background-color: #FAFAFA;
           
                
            }

            .footer {
                background-color: #333;
                padding: 20px;
                color: #fff;
                text-align: center;
            }

            @media (min-width: 768px) {
                .header {
                    font-size: 30px;
                }

                .content {
                    font-size: 20px;
                }

                .footer {
                    font-size: 16px;
                }
                .titulo{

                    font-size: 40px;
                }
            }


            #titulo {
                background-color: #ccc;
                height: 100px;
                display: flex;
                max-width: 100%;
                align-items: center;
                justify-content: center;
                border: 5px #333 solid;
            }
        </style>
    </head>
    <body>
        <div class="header">
            <img src="Cabecera2.PNG" alt="Logo" />
        </div>


        <div id="titulo">
            <center><h1>¡Bienvenido al evaluador de la reusabilidad de los recursos de aprendizaje!</h1></center>
        </div>  

        <div class="content">

            <div class="margen">

                <h2 >Introducción </h2>

                <font size="5px"><p style="text-align: justify;">    
                    Este sistema es una herramienta de apoyo para las personas que se dedican a crear recursos de aprendizaje, en formatos ".pdf" y ".docx".
                </p></font>

                <font size="5px"><p style="text-align: justify;">    
                    Los recursos de aprendizaje permitidos a medir con esta herramienta, son aquellos recursos alojados en un Servicio Web de Aprendizaje (SWA) de tipo SOAP,
                    por lo que para medir alguno de estos recursos de aprendizaje, es necesario ingresar el WSDL (Web Services Description Language) del SWA.
                </p></font>

                <h2 style="text-align: left;">Descripción general de la medición de la reusabilidad: </h2>


                <font size="5px"><p style="text-align: justify;"> 
                    Reusabilidad: La reusabilidad es la característica general de los servicios 
                    Web de aprendizaje y define si un Servicio Web de Aprendizaje (SWA) está disponible, 
                    es usable, legible, accesible e informativo para poder integrar servicios Web de 
                    aprendizaje en una o más unidades de aprendizaje sin que se realice ninguna modificación.

                </p> </font>

                <font size="5px"><p style="text-align: justify;"> 
                    El atributo de reusabilidad se define en función de cinco criterios: 

                </p> </font>  
                <div>
                    <a href="PopUpRDD.html"><font size="5px"><p> 1.-Disponibilidad. </p></font></a>
                    <a href="PopUpRC.html"><font size="5px"><p> 2.-Informatividad. </p></font></a>
                    <a href="PopUpRDU.html"><font size="5px"><p> 3.-Usabilidad. </p></font></a>
                    <a href="PopUpRDA.html"><font size="5px"><p> 4.-Accesibilidad. </p></font></a>
                    <a href="PopUpRDL.html"><font size="5px"><p> 5.-Legibilidad. </p></font></a>
                </div>


                <font size="5px"><p style="text-align: justify;">               
                    Como se muestra en la Figura 1, para obtener la reusabilidad de un recurso de aprendizaje este modelo de 
                    calidad se toma en cuenta tres sub-atributos: Usabilidad, Informatividad y Disponibilidad, cada uno con un 
                    valor del 33.3333%.
                </p> </font>

                <center><img src="ModeloRF.PNG" class="img-fluid" alt="Imagen Responsiva"></center>



                <br>



                <font size="5px"><p style="text-align: justify;"> 
                    La métrica para reusabilidad se define en función de 3 criterios: Disponibilidad,
                    Usabilidad e Informatividad, la cual queda definida como se muestra en la 
                    ecuación.

                </p> </font>

                <center><img src="FormulaR.PNG"  class="img-fluid"  align="center" width="690" height="210"></center>


                <br>



                <font size="5px"><p style="text-align: left;"> 
                    Es la sumatoria de los valores o pesos asignados a los criterios de R (Reusabilidad):

                </p> </font>

                <font size="5px"><p style="text-align: left;"> 
                    S: Es criterio de R que puede tomar los valores de disponibilidad, usabilidad e informatividad.


                </p> </font>

                <font size="5px"><p style="text-align: left;"> 
                    n: Es el número total de criterios de R, por lo tanto n = 4, ya que el criterio de usabilidad esta compuesto por otros dos
                    criterios mas, los cuales son accesibilidad y legibilidad.

                </p> </font>



                <br>




                <h2 style="text-align: left;">Forma de uso: </h2>

                <font size="5px"><p style="text-align: justify;">     
                    El evaluador de reusabilidad ofrece tres secciones de medición:


                </p></font>

                <font size="5px"><p style="text-align: justify;">
                    Sección 1: Esta sección permite cargar el recurso de aprendizaje al ingresar el WSDL (Lenguaje de Descripción de Servicios Web) del servicio web que entrega un recurso. Para hacerlo, 
                    simplemente se ingresa el WSDL en el campo de texto de la sección y al hacer clic en el botón "Evaluar" se iniciará la evaluación del recurso.

                </p></font>


                <font size="5px"><p style="text-align: justify;">
                    Sección 2: En esta sección se pueden visualizar los resultados de la evaluación del recurso con respecto al atributo de calidad "Reusabilidad" y los sub-atributos que integran dicho atributo.
                </p></font>

                <font size="5px"><p style="text-align: justify;">
                    Sección 3: En esta sección se pueden visualizar los resultados de la evaluación del recurso con respecto a los sub-atributos que integran Informtavidad, Legibilidad y Accesibilidad.

                </p> </font>

                <div class="modeloCR1">
                    <img src="evaluadorReusabilidad.PNG" class="img-fluid" align="center" width="1180" height="690">

                </div>

                <br>
                <br>

                <h2 style="text-align: left;">Sección 1:</h2>

                <font size="5px"><p style="text-align: justify;">     
                    La primera sección del evaluador de reusabilidad ofrece al usuario un formulario con un boton y un campo de texto donde se ingresa el WSDL (Web Services Description Language) 
                    del servicio web de aprendizaje (SWA), esto con la finalidad de cargar el recurso de aprendizaje que esta asociado al SWA.
                </p> </font>
                <br>
                <div class="modeloCR2">
                    <img src="FormularioSeccion1.PNG" class="img-fluid" align="center" width="580" height="435">

                </div>

                <br>
                <br>

                <h2 style="text-align: left;">Sección 2:</h2>

                <font size="5px"><p style="text-align: justify;">     
                    La segunda sección del evaluador de reusabilidad ofrece al usuario tablas, para mostrar los resultados referentes
                    al atributo Reusabilidad del recurso evaluado, así como los sub-atributos que integran dicho atributo (Disponibilidad, Informatividad y Usabilidad).
                    </font></p>


                <font size="5px"><p style="text-align: justify;">
                    Nota: Si se requiere saber como se obtuvieron estos valores, es posible saberlo dando click sobre 
                    los titulos (Reusabilidad, Disponibilidad, Informatividad, Usabilidad (Accesibilidad y Legibilidad)).

                    </font></p>
                <br>
                <div class="modeloCR3">
                    <img src="FormularioSeccion2.PNG" class="img-fluid" align="center" width="780" height="600" >

                </div>

                <br>
                <br>
                <h2 style="text-align: left;">Sección 3:</h2>

                <font size="5px"><p style="text-align: justify;">     
                    La tercera sección del evaluador de reusabilidad ofrece al usuario tablas, para mostrar los resultados referentes a la Informatividad
                    de un recurso de aprendizaje.
                </p></font>


                <div class="modeloCR2">
                    <img src="FormularioSeccion3.PNG" class="img-fluid" align="center" width="880" height="400" >

                </div>

                <font size="5px"><p style="text-align: justify;">     
                    También esta sección del evaluador de reusabilidad ofrece al usuario tablas, para mostrar los resultados referentes a la Legibilidad y Accesibilidad
                    de un recurso de aprendizaje.
                </p> </font>

                <div class="modeloCR2">
                    <img src="FormularioSeccion3.5.PNG" class="img-fluid" align="center" width="850" height="480">

                </div>

                <br>
                <br>
                <br><!-- comment -->
                <div class="boton">

                    <font color="white" ><a href="M_Reusabilidad.jsp" class="btn btn-primary"><h5>  Continuar  </h5></a></font>

                </div>

            </div>

        </div>

        <div class="footer">
            <p>Última actualización: 26.05.2023</p>
        </div>


    </body>
</html>
