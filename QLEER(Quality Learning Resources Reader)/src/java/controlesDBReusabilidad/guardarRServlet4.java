/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlesDBReusabilidad;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Base64;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author efcas
 */
@WebServlet(name = "guardarRServlet4", urlPatterns = {"/guardarRServlet4"})
public class guardarRServlet4 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException, InterruptedException, InvocationTargetException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            guardarArchivos gPDF = new guardarArchivos();
            guardarReusabilidad gr = new guardarReusabilidad();

            obtenerAccesibilidad oA = new obtenerAccesibilidad();
            obtenerLegibilidad oL = new obtenerLegibilidad();
            obtenerCompletitud oC = new obtenerCompletitud();
            obtenerDisponibilidad oD = new obtenerDisponibilidad();
            obtenerUsabilidad oU = new obtenerUsabilidad();

            guardarUsabilidad gu = new guardarUsabilidad();
            guardarLegibilidad gl = new guardarLegibilidad();
            guardarAccesibilidad gA = new guardarAccesibilidad();

            guardarAlineacionReusabilidad a = new guardarAlineacionReusabilidad();
            guardarTiposDeLetraReusabilidad t = new guardarTiposDeLetraReusabilidad();
            guardarTamañoDeLetraReusabilidad ta = new guardarTamañoDeLetraReusabilidad();
            guardarColorFondoReusabilidad Cfont = new guardarColorFondoReusabilidad();
            guardarColorFuenteReusabilidad Cfuente = new guardarColorFuenteReusabilidad();

            guardarCompletitud gc = new guardarCompletitud();
            guardarDisponibilidad gd = new guardarDisponibilidad();
            guardarCaracteristicasC gDC = new guardarCaracteristicasC();

            String wsdlUrl = (String) request.getSession().getAttribute("miValor");
            String ServicioRecortado = wsdlUrl.replaceAll("^.*/|\\?.*$|.xml", "");
            String formato = wsdlUrl.replaceAll("^.*/|\\?.*$|.xml|SWA|\\d", "");
            //http://localhost:8080/ServiciosWebDeAprendizaje/SWA1DOCX?wsdl
            //http://localhost/LWSEvaluate/lwsdocWSDL2.xml

            String reusabilidad = ObtenerValorReusabilidadFinal(wsdlUrl);
            double valor = Double.parseDouble(reusabilidad);
            double completitud = ObtenerValorCompletitud(wsdlUrl);
            double disponibilidad = ObtenerValorDisponibilidad(wsdlUrl);

            double escolaridad = ObtenerNivelDeEscolaridad(wsdlUrl);
            double dominio = ObtenerNivelDeDominio(wsdlUrl);
            double tema = ObtenerTema(wsdlUrl);
            double tipodecontenido = ObtenerTipoDeContenido(wsdlUrl);
            double service = ObtenerEficienciaDelServicio(wsdlUrl);
            double comT = (escolaridad + dominio + tema + tipodecontenido + service) / 5;

            gDC.guardar(escolaridad, dominio, tema, tipodecontenido, service);

            // Definir la ruta del comando "wsimport"
            String wsimportPath = "C:\\Program Files\\Java\\jdk1.8.0_202\\bin\\wsimport";

            // Definir la ruta donde se generarán las clases de proxy
            String outputDir = "C:\\Users\\efcas\\OneDrive\\ESCRITORIO 2\\NetBeansProjects\\Login1\\QLEER(Quality Learning Resources Reader)\\build\\generated-sources\\jax-ws\\";

            // Crear el proceso que ejecutará el comando "wsimport"
//             ProcessBuilder processBuilder = new ProcessBuilder(wsimportPath, "-s", outputDir, "-verbose", "-d", outputDir, wsdlUrl);
            ProcessBuilder processBuilder = new ProcessBuilder(wsimportPath, "-keep", "-verbose", "-d", outputDir, wsdlUrl);

            // Redirigir la salida del proceso a un buffer de lectura
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            // Leer la salida del proceso línea por línea y mostrarla en la consola
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Esperar a que el proceso termine
            int exitCode = process.waitFor();

            // Mostrar el código de salida del proceso
            System.out.println("Código de salida: " + exitCode);

            int contador = 0;
            while (true) {
                try {
                    Class.forName("generated_sources.jax_ws.swapdf." + ServicioRecortado + "_Service");
                    break;
                } catch (ClassNotFoundException e) {
                    System.out.println("Cargando...");
                    Thread.sleep(1000); // esperar un segundo antes de intentar cargar la clase nuevamente
                    contador++;
                    if (contador >= 80) { // 180 segundos = 3 minutos
                        System.out.println("Tiempo de espera agotado. No se pudieron reconocer las clases de proxy.");
                        break;
                    }
                }
            }
            if (contador < 180) { // las clases de proxy fueron reconocidas antes de que se agotara el tiempo de espera
                System.out.println("Las clases de proxy han sido generadas y reconocidas por la aplicación.");
            }

//            request.setAttribute("wsdlUrl", wsdlUrl);
//            request.setAttribute("ServicioRecortado", ServicioRecortado);
//            request.setAttribute("formato", formato);
//
//            RequestDispatcher rd = request.getRequestDispatcher("/guardarRServlet4_1");
//
//            // Redirigir la solicitud al servlet especificado
//            rd.forward(request, response);
            // Crea un objeto URL que represente la ubicación del archivo WSDL
            URL url = new URL(wsdlUrl);

            // Abre una conexión a la URL y obtiene el contenido del WSDL
            URLConnection conn = url.openConnection();
            InputStream in = conn.getInputStream();
            Scanner scanner = new Scanner(in);
            scanner.useDelimiter("\\Z"); // Usa la secuencia de fin de entrada como delimitador
            String content = scanner.next();
            in.close();

            // Busca la parte del WSDL que contiene el nombre de la operación
            String operationRegex = "name=";
            int startIndex = content.indexOf(operationRegex);
            if (startIndex == -1) {
                System.out.println("La operación no se encontró en el archivo WSDL.");
                return;
            }

            // Encuentra el índice del final de la etiqueta </operation>
            int endIndex = content.indexOf("</operation>", startIndex);
            if (endIndex == -1) {
                System.out.println("La etiqueta de cierre </operation> no se encontró en el archivo WSDL.");
                return;
            }

            // Extrae la parte del WSDL que contiene el nombre de la operación
            String operationPart = content.substring(startIndex, endIndex + "</operation>".length());
            Pattern pattern = Pattern.compile("<operation name=\"(.*?)\"");
            Matcher matcher = pattern.matcher(operationPart);
            String operationName = null;
            if (matcher.find()) {
                operationName = matcher.group(1);

            }

            try {

                // Obtener el objeto Class correspondiente a la clase SWA3DOCX_Service
                Class<?> claseServicio = Class.forName("swapdf." + ServicioRecortado + "_Service");

                // Crear una instancia de la clase SWA3DOCX_Service utilizando newInstance()
                Object instanciaServicio = claseServicio.newInstance();

                // Obtener el objeto Method correspondiente al método getSWA3DOCXPort()
                Method metodoGetPort = claseServicio.getMethod("get" + ServicioRecortado + "Port");

                // Invocar el método getSWA3DOCXPort() en la instancia de SWA3DOCX_Service utilizando invoke()
                Object instanciaPort = metodoGetPort.invoke(instanciaServicio);

                // Obtener el objeto Method correspondiente al método convertirDOCXaBase64()
                Class<?> clasePort = instanciaPort.getClass();
                Method metodoConvertir = clasePort.getMethod(operationName);

                // Invocar el método convertirDOCXaBase64() en la instancia de SWA3DOCX utilizando invoke()
                String resultado = (String) metodoConvertir.invoke(instanciaPort);

                // 2. Decodificar la cadena en un arreglo de bytes
                byte[] decoded = Base64.getDecoder().decode(resultado);

//                // 3. Escribir los bytes decodificados en un archivo de salida
//                File file2 = new File("C:\\Users\\efcas\\OneDrive\\ESCRITORIO 2\\NetBeansProjects\\Login1\\QLEER(Quality Learning Resources Reader)\\web\\recursosPDF\\archivodecodificado.pdf");
                int version = 1;
                String filename = "archivodecodificado";
                String path = "C:\\Users\\efcas\\OneDrive\\ESCRITORIO 2\\NetBeansProjects\\Login1\\QLEER(Quality Learning Resources Reader)\\web\\recursosPDF\\";
                String extension = ".pdf";

// verificar si ya existe un archivo con el mismo nombre y versión
                while (new File(path + filename + "_v" + version + extension).exists()) {
                    version++;
                    
                }

                gPDF.guardarPDF(filename + "_v" + version + extension);
// crear un nuevo archivo con el nombre y versión adecuados
                File file2 = new File(path + filename + "_v" + version + extension);
                FileOutputStream output = new FileOutputStream(file2);
                output.write(decoded);
                output.close();

                String direccionPDF5 = path + filename + "_v" + version + extension;

                List<String> lista = ObtenerAlineacionPDF(direccionPDF5);

                int TotalDeParrafos = lista.size();
                int elementosInRange = 0;
                int elementosOutOfRange = 0;

                for (String elemento : lista) {

                    if (elemento.equals("inrange")) {
                        elementosInRange++;
                    } else {
                        elementosOutOfRange++;
                    }
                }

                double porcentajeAlien = (double) elementosInRange / (double) TotalDeParrafos;
                a.guardar(TotalDeParrafos, elementosInRange, elementosOutOfRange, porcentajeAlien);

                List<String> lista2 = TipoDeLetraPDF(direccionPDF5);

                int totalElementos2 = lista2.size();
                int Arial = 0;
                int Times_Roman = 0;
                int Calibri = 0;
                int OtrasFuentes = 0;

                for (String elemento : lista2) {

                    if (elemento.equals("Arial")) {
                        Arial++;
                    }
                    if (elemento.equals("Times_New_Roman")) {
                        Times_Roman++;

                    }
                    if (elemento.equals("Calibri")) {
                        Calibri++;
                    } else {
                        OtrasFuentes++;
                    }

                }

                double porcentajeTLetra = ((double) Arial + (double) Times_Roman + (double) Calibri) / (double) totalElementos2;
                t.guardar(totalElementos2, Arial, Times_Roman, OtrasFuentes, Calibri, porcentajeTLetra);

                List<String> lista3 = ColorDeLaFuentePDF(direccionPDF5);

                int totalElementos3 = lista3.size();
                int Negro = 0;
                int OtroColor = 0;

                for (String elemento : lista3) {

                    if (elemento.equals("(0,0,0)")) {
                        Negro++;
                    } else {
                        OtroColor++;
                    }
                }

                double porcentajeColorLetra = (double) Negro / (double) totalElementos3;
                Cfuente.guardar(totalElementos3, Negro, OtroColor, porcentajeColorLetra);

                List<String> lista4 = TamañoDeLaFuentePDF(direccionPDF5);

                int totalElementos4 = lista4.size();
                int Rango1 = 0;
                int Rango2 = 0;
                int Rango3 = 0;
                for (String elemento : lista4) {

                    if (elemento.equals("11.0") || elemento.equals("12.0") || elemento.equals("13.0")) {
                        Rango1++;
                    }
                    if (elemento.equals("14.0") || elemento.equals("15.0") || elemento.equals("16.0")) {
                        Rango2++;
                    } else {

                        Rango3++;
                    }
                }

                double porcentajeTmaño1 = ((double) Rango1 + (double) Rango2) / (double) totalElementos4;
                ta.guardar(totalElementos4, Rango1, Rango2, Rango3, porcentajeTmaño1);

                double porcentajeCfondo1 = 1.0;
//
//                    String CF = ColorDeFondoPDF(direccionPDF5).get(0);

//                    if (CF.equals("(255,255,255)")) {
//                        porcentajeCfondo1 = 1.0;
//                    } else {
//
//                        porcentajeCfondo1 = 0.0;
//                    }
                Cfont.guardar("(255,255,255)", porcentajeCfondo1);

                Cfont.guardar("(255,255,255)", porcentajeCfondo1);

                double tCL = 5.5555 * porcentajeColorLetra;
                double tT = 5.5555 * porcentajeTmaño1;
                double tCf = 5.5555 * porcentajeCfondo1;

                double accesibilidad1 = tCL + tT + tCf;

                double tA = 3.33332 * porcentajeAlien;
                double tTL = 3.33332 * porcentajeTLetra;
                double tCL2 = 3.33332 * porcentajeColorLetra;
                double tT2 = 3.33332 * porcentajeTmaño1;
                double tCf2 = 3.33332 * porcentajeCfondo1;

                double legibilidad1 = tA + tTL + tCL2 + tT2 + tCf2;

//                double accesibilidad1 = (porcentajeColorLetra + porcentajeTmaño1 + porcentajeCfondo1) / 3;
//                double legibilidad1 = (porcentajeAlien + porcentajeTLetra + porcentajeColorLetra + porcentajeTmaño1 + porcentajeCfondo1) / 5;
                gl.guardar(legibilidad1);
                gA.guardar(accesibilidad1);
//
                double acce = oA.ObtenerDatosAccesibilidad1();
                double legi = oL.ObtenerDatosLegibilidad1();

                double usabilidad11 = acce + legi;

                gu.guardar(usabilidad11);

                double dis = disponibilidad;
                double usa = oU.ObtenerDatosUsabilidad1();

                double porDis = 33.3333 * dis;
                gd.guardar(porDis);

                double porcomT = 33.3333 * comT;
                gc.guardar(porcomT);

                double suma = porDis + usa + porcomT;

//              Suma final de las ponderaciones para obtener el valor 
//              del atributo de reusabilidad
                gr.guardar(suma, formato);

                response.sendRedirect("M_Reusabilidad.jsp");

            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | SecurityException | IllegalArgumentException e) {
//                     Manejar las excepciones apropiadamente

            }
        }
    }

    public String ObtenerValorReusabilidadFinal(String m1) {
        webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
        webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
        return port.lwsProcess(m1);
    }

    public double ObtenerValorUsabilidad(String m1, String m2) {
        webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
        webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
        return port.usability(m1, m2);
    }

    public double ObtenerValorLegibilidad(String m1, String m2) {
        webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
        webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
        return port.redeability(m1, m2);
    }

    public double ObtenerValorAccesibilidad(String m1, String m2) {
        webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
        webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
        return port.accesibility(m1, m2);
    }

    public List<String> ObtenerAlineacionDocX(String m1) {
        webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
        webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
        return port.alineacionDocX(m1);
    }

    public List<String> TipoDeLetraDocX(String m1) {
        webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
        webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
        return port.tipoDeLetraDocX(m1);
    }

    public List<String> ColorDeLaFuenteDocX(String m1) {
        webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
        webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
        return port.colorDeLaFuenteDocX(m1);
    }

    public List<String> TamañoDeLaFuenteDocX(String m1) {
        webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
        webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
        return port.tamañoDeLaFuenteDocX(m1);
    }

    public List<String> ColorDeFondoDocX(String m1) {
        webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
        webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
        return port.colorDeFondoDocX(m1);
    }

    public List<String> ObtenerAlineacionPDF(String m1) {
        webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
        webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
        return port.alineacionPDF(m1);
    }

    public List<String> TipoDeLetraPDF(String m1) {
        webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
        webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
        return port.tipoDeLetraPDF(m1);
    }

    public List<String> ColorDeLaFuentePDF(String m1) {
        webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
        webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
        return port.colorDeLaFuentePDF(m1);
    }

    public List<String> TamañoDeLaFuentePDF(String m1) {
        webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
        webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
        return port.tamañoDeLaFuentePDF(m1);
    }

    public List<String> ColorDeFondoPDF(String m1) {
        webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
        webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
        return port.colorDeFondoPDF(m1);
    }

    public double ObtenerValorCompletitud(String m1) {
        webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
        webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
        return port.completitud(m1);
    }

    public double ObtenerValorDisponibilidad(String m1) {
        webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
        webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
        return port.aviabilidad(m1);
    }

    public double ObtenerNivelDeEscolaridad(String m1) {
        webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
        webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
        return port.defecto1(m1);
    }

    public double ObtenerNivelDeDominio(String m1) {
        webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
        webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
        return port.defecto2(m1);
    }

    public double ObtenerTema(String m1) {
        webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
        webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
        return port.defecto3(m1);
    }

    public double ObtenerTipoDeContenido(String m1) {
        webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
        webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
        return port.defecto4(m1);
    }

    public double ObtenerEficienciaDelServicio(String m1) {
        webservice.WebServiceSOAP_Service service = new webservice.WebServiceSOAP_Service();
        webservice.WebServiceSOAP port = service.getWebServiceSOAPPort();
        return port.defecto5(m1);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(guardarRServlet4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(guardarRServlet4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(guardarRServlet4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(guardarRServlet4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(guardarRServlet4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(guardarRServlet4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(guardarRServlet4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(guardarRServlet4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
