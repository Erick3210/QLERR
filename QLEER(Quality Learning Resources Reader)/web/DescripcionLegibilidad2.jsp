<%-- 
    Document   : DescripcionLegibilidad2
    Created on : 26-may-2023, 12:36:15
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
            <center><h1>¡Bienvenido al evaluador de la legibilidad de los recursos de aprendizaje!</h1></center>
        </div>  

        <div class="content">

            <div class="margen">

                <h2>Introducción </h2>

                <font size="5px"><p style="text-align: justify;">    
                    Este sistema se presenta como una herramienta de apoyo dirigida a aquellos individuos que se 
                    dedican a la creación de recursos de aprendizaje en formatos ".pdf". Su funcionamiento se basa 
                    en la utilización de un modelo de calidad que permite identificar defectos específicos en 
                    sub-atributos clave que conforman el atributo de Legibilidad. Cada uno de estos sub-atributos 
                    tiene asignada una ponderación, y al sumar dichas ponderaciones se obtiene el valor correspondiente 
                    a la legibilidad del recurso de aprendizaje.
                </p> </font>
                
                <br>

                <h2 style="text-align: left;">Descripción general de la evaluación de la legibilidad: </h2>


                <font size="5px"><p style="text-align: justify;"> 
                    Legibilidad: La legibilidad es la facilidad con que se puede leer y comprender un texto. 
                    En un sentido más amplio es la aptitud de un texto de ser leído fácil y cómodamente, y esta 
                    aptitud hace referencia a elementos tipo-gráficos, de presentación del escrito en la página, 
                    y también al estilo. 

                </p></font>

                <font size="5px"><p style="text-align: justify;"> 
                    El atributo de legibilidad se define en función de cinco criterios: 

                </p></font>

                <div>
                    <a href="PopUpLOT.html"><font size="5px"><p> 1.-Orientación del texto. </p></font></a>
                    <a href="PopUpLTL.html"><font size="5px"><p> 2.-Tipo de Letra. </p></font></a>
                    <a href="PopUpLCF.html"><font size="5px"><p> 3.-Color de la fuente. </p></font></a>
                    <a href="PopUpLTF.html"><font size="5px"><p> 4.-Tamaño de la fuente. </p></font></a>
                    <a href="PopUpLCFO.html"><font size="5px"><p> 5.-Color del fondo. </p></font></a>
                </div>

                <font size="5px"><p style="text-align: justify;"> 
                    Nota: Si se quiere saber mas sobre las ponderaciones y calculos de los criterios antes mencionados y sus
                    sub-atributos, se puede dar click en los nombres de cada uno de los criterios antes mencionados.
                </p> </font> 

                <br>

                <font size="5px"><p style="text-align: justify;">                
                    Como se muestra en la Figura 1, para obtener la legibilidad de un recurso de aprendizaje este modelo de 
                    calidad se toma en cuenta seis sub-atributos: Tipo de letra, Orientación de texto, Color de la fuente, 
                    Tamaño de fuente, Color del fondo e Idioma, cada uno con un valor del 16.6666%. 
                </p> </font> 


                <div class="modeloCR">
                    <img src="ModeloLF.PNG"  class="img-fluid"  align="center" width="940" height="640">

                </div>

                <br>



                <font size="5px"><p style="text-align: justify;">Para obtener el valor de la legibilidad se utilizó la siguiente formula:</p></font>

                <center><img src="FormulaL.PNG" class="img-fluid" align="center" width="690" height="330"></center>

                <br>


                <font size="5px"><p style="text-align: justify;"> 
                    ∑ Ci: Es la sumatoria de los valores de los criterios para L.
                </p></font>

                <font size="5px"><p style="text-align: justify;"> 
                    C: Es el valor de cada criterio dentro de L.
                </p></font>

                <font size="5px"><p style="text-align: justify;"> 
                    N: Es la sumatoria de todos los criterios tomados en cuenta.
                </p></font>


                <br>

                <h2 style="text-align: left;">Forma de uso: </h2>

                <font size="5px"><p style="text-align: left;">     
                    El medidor de legibilidad ofrece tres secciones de medicion:


                </p></font>


                <font size="5px"><p style="text-align: justify;">
                    Sección 1: En la primera sección se encuentra un formulario con un campo de texto y un boton, para 
                    así poder cargar el archivo (recurso de aprendizaje), mediante la direccion local de alojamiento del archivo en
                    formato pdf.

                </p></font>

                <font size="5px"><p style="text-align: justify;">
                    Sección 2: En la segunda sección se encuentran dos recuadros en los cuales se pueden observar el valor del atributo de
                    legibilidad, así como los valores de los sub-atributos (Orientación del texto, Tipo de Letra, Color de la fuente, Tamaño de la fuente, Color del fondo) 
                    que integran dicho atributo. 
                </p></font>

                <font size="5px"><p style="text-align: justify;">
                    Sección 3: En la tercera sección se encuentran cinco recuadros en los cuales se pueden observar los resultados de evaluacion referentes
                    a los cinco sub-atributos(Orientación del texto, Tipo de Letra, Color de la fuente, Tamaño de la fuente, Color del fondo) 
                    que integran el atributo de legibilidad.
                </p></font>

                <div class="modeloCR1">
                    <img src="evaluadorLegibilidad.PNG" class="img-fluid" align="center" width="1180" height="650">

                </div>

                <br>
                <br>

                <h2 style="text-align: left;">Sección 1:</h2>

                <font size="5px"><p style="text-align: justify;">     
                    En esta sección se encuentra un formulario con un campo de texto y un botón. 
                    Estos elementos permiten la carga de un archivo en formato PDF. Para cargar un archivo, 
                    el usuario debe ingresar la dirección local de alojamiento en el campo de texto correspondiente. 
                    Una vez ingresada la dirección, se debe presionar el botón "Evaluar" para realizar la evaluación 
                    de la legibilidad del archivo.
                </p></font>
                <br>
                <div class="modeloCR2">
                    <img src="FormularioSeccionL1.PNG" class="img-fluid" align="center" width="600" height="395">

                </div>



                <br>
                <br>


                <h2 style="text-align: left;">Sección 2:</h2>

                <font size="5px"><p style="text-align: justify;">     
                    La segunda sección del evaluador de legibilidad ofrece al usuario tablas, para mostrar los resultados referentes
                    al atributo de Legibilidad del recurso evaluado, así como los sub-atributos que integran dicho atributo (Orientación del texto, Tipo de Letra, Color de la fuente, Tamaño de la fuente, Color de Fondo e Idioma).
                </p></font>

                <font size="5px"><p style="text-align: justify;">       
                    Nota: Si se quiere saber mas sobre el calculo del atributo de calidad legibilidad y los sub-atributos que lo integran, se puede dar click sobre los 
                    titulos de los mismos.
                </p></font>

                <div class="modeloCR6">
                    <img src="FormularioSeccionL2.PNG" class="img-fluid" align="center" width="900" height="625" >

                </div>

                <br>
                <br>

                <h2 style="text-align: left;">Sección 3:</h2>

                <font size="5px"><p style="text-align: justify;"> 
                    En esta sección se encuentran cinco tablas en las cuales se pueden observar los cinco sub-atributos 
                    (Orientación del texto, Tipo de Letra, Color de la fuente, Tamaño de la fuente, Color del fondo) que 
                    integran el atributo de legibilidad, así como de los criterios que integra cada uno de los cinco sub-atributos,
                    a continuación dos ejemplos de estas tablas:
                </p></font>

                <font size="5px"><p style="text-align: justify;"> 
                    3.1.- En la primera tabla se puede observar los valores de los criterios (Parrafos adentro, Parrafos afuera y Total de parrafos) 
                    del sub-atributo orientación del texto.
                </p></font>

                <font size="5px"><p style="text-align: justify;"> 
                    3.2.-En la segunda tabla se puede observar los valores de los criterios (Arial, Times Roman, otras fuentes y Total de palabras) 
                    del sub-atributo tipo de letra.
                </p></font>

                <font size="5px"><p style="text-align: justify;">       
                    Nota: Si se quiere saber mas sobre el calculo de los criterios y sus sub-atributos, se puede dar click sobre los 
                    titulos de los criterios.
                </p></font>

                <div class="modeloCR6">
                    <img src="FormularioSeccionL3.PNG" class="img-fluid" align="center" width="800" height="500" >

                </div>


                <br>
                <br>
                <br><!-- comment -->
                <div class="boton">

                    <font color="white" ><a href="M_Legibilidad.jsp" class="btn btn-primary"><h5>  Continuar  </h5></a></font>

                </div>

            </div>

        </div>

        <div class="footer">
            <p>Última actualización: 26.05.2023</p>
        </div>


    </body>
</html>
