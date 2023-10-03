/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlesDBLegibilidad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.SQLException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author efcas
 */
@WebServlet(name = "guardarLServlet2", urlPatterns = {"/guardarLServlet2"})
public class guardarLServlet2 extends HttpServlet {

    JSONObject obj = new JSONObject();

    JSONArray arr = new JSONArray();
    JSONArray arrFuentes = new JSONArray();
    JSONArray arrPuntuacion = new JSONArray();
    JSONArray arrColorFuente = new JSONArray();
    JSONArray arrTamañoFuente = new JSONArray();
    JSONArray arrLongitudProm = new JSONArray();

    JSONArray arrColorFondo = new JSONArray();
    JSONArray arrIdioma = new JSONArray();

    private int noLetras;
    private int noPalabras;

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
            throws ServletException, IOException, ClassNotFoundException, SQLException, InterruptedException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {

            guardarArchivosPDF pdf = new guardarArchivosPDF();

            guardarAlineacion gAL = new guardarAlineacion();
            guardarFuentes gF = new guardarFuentes();
            guardarColorDeFuente gcf = new guardarColorDeFuente();
            guardarTamFuente gT = new guardarTamFuente();
            guardarFondo gCF = new guardarFondo();
            guardarIdioma gI = new guardarIdioma();
            guardarLegibilidad gL = new guardarLegibilidad();

            String direccion = request.getParameter("variableRA1");

            String formato = direccion.substring(direccion.lastIndexOf(".") + 1).toLowerCase();

            String servicio = "http://localhost:8080/RestMetricas/services/Analisis/uploadPDF";

            File pdfFile = new File(direccion);
            FileInputStream fileInputStreamReader = new FileInputStream(pdfFile);
            byte[] bytes = new byte[(int) pdfFile.length()];
            fileInputStreamReader.read(bytes);

            String encodedPDF = Base64.getEncoder().encodeToString(bytes);

            byte[] decodedBytes = Base64.getDecoder().decode(encodedPDF);

            int version = 1;
            String filename = "archivodecodificado";
            String path = "C://Users//efcas//OneDrive//ESCRITORIO 2//NetBeansProjects//Login1//QLEER(Quality Learning Resources Reader)//web//recursosPDFLegibilidad//";
            String extension = ".pdf";

// verificar si ya existe un archivo con el mismo nombre y versión
            while (new File(path + filename + "_v" + version + extension).exists()) {
                version++;

            }

            pdf.guardarD(filename + "_v" + version + extension);

            File outputFile1 = new File("C://Users//efcas//OneDrive//ESCRITORIO 2//NetBeansProjects//Login1//QLEER(Quality Learning Resources Reader)//web//recursosPDFLegibilidad//archivoVersionActual.pdf");
            try ( FileOutputStream outputStream1 = new FileOutputStream(outputFile1)) {
                outputStream1.write(decodedBytes);
            }

            
            
            
            int contador = 0;
            long tiempoInicio = System.currentTimeMillis();

            while (System.currentTimeMillis() - tiempoInicio < 30000) { // Repetir durante 30 segundos
                System.out.println("Buscando versiones existentes del recurso...");
                Thread.sleep(1000); // Esperar 1 segundo en cada iteración
                contador++;
            }

            if (contador >= 30) { // Si el contador es mayor o igual a 30, se han superado los 30 segundos
                System.out.println("Tiempo de espera agotado. No se encontraron versiones existentes del recurso.");
            } else {
                System.out.println("Se encontraron versiones existentes del recurso.");
            }

            
            
            
// escribir el archivo decodificado en la segunda ubicación de salida
            File outputFile2 = new File(path + filename + "_v" + version + extension);
            try ( FileOutputStream outputStream2 = new FileOutputStream(outputFile2)) {
                outputStream2.write(decodedBytes);
            }
            System.out.println("LLEGUE HASTA AQUI!!!!!!");
            System.out.println("LLEGUE HASTA AQUI!!!!!!");
//             gD.guardarD(direccion);
            int posA1 = getAlineacion(servicio).getInt(getAlineacion(servicio).length() - 1);
            int posA2 = getAlineacion(servicio).getInt(getAlineacion(servicio).length() - 2);
            int posA3 = getAlineacion(servicio).getInt(getAlineacion(servicio).length() - 3);

            double posT = (double) posA2 / (double) posA1;
            posT = 16.66666 * posT;
            System.out.println(posT);

            gAL.guardarA(posA3, posA2, posA1, posT);

            int posF1 = getFuentes(servicio).getInt(getFuentes(servicio).length() - 1);
            int posF2 = getFuentes(servicio).getInt(getFuentes(servicio).length() - 2);
            int posF3 = getFuentes(servicio).getInt(getFuentes(servicio).length() - 3);
            int posF4 = getFuentes(servicio).getInt(getFuentes(servicio).length() - 4);

            double posFt = (double) (posF2 + posF3) / (double) posF1;
            posFt = 16.66666 * posFt;
            System.out.println("LLEGUE HASTA AQUI22222!!!!!!");
            System.out.println("LLEGUE HASTA AQUI22222!!!!!!");
            gF.guardarF(posF4, posF3, posF2, posF1, posFt);

            int posT1 = getCTamanoFuente(servicio).getInt(getCTamanoFuente(servicio).length() - 1);

            int posT2 = getCTamanoFuente(servicio).getInt(getCTamanoFuente(servicio).length() - 2);

            int posT3 = getCTamanoFuente(servicio).getInt(getCTamanoFuente(servicio).length() - 3);
            int posT4 = getCTamanoFuente(servicio).getInt(getCTamanoFuente(servicio).length() - 4);
            int posT5 = getCTamanoFuente(servicio).getInt(getCTamanoFuente(servicio).length() - 5);
            int posT6 = getCTamanoFuente(servicio).getInt(getCTamanoFuente(servicio).length() - 6);

            int posT7 = getCTamanoFuente(servicio).getInt(getCTamanoFuente(servicio).length() - 7);
            int posT8 = getCTamanoFuente(servicio).getInt(getCTamanoFuente(servicio).length() - 8);
            int posT9 = getCTamanoFuente(servicio).getInt(getCTamanoFuente(servicio).length() - 9);
            int posT10 = getCTamanoFuente(servicio).getInt(getCTamanoFuente(servicio).length() - 10);

            int posT11 = getCTamanoFuente(servicio).getInt(getCTamanoFuente(servicio).length() - 11);
            int posT12 = getCTamanoFuente(servicio).getInt(getCTamanoFuente(servicio).length() - 12);
            int posT13 = getCTamanoFuente(servicio).getInt(getCTamanoFuente(servicio).length() - 13);

            int posT14 = getCTamanoFuente(servicio).getInt(getCTamanoFuente(servicio).length() - 14);

            //Total de palabras
            int RT1 = posT1;

            //Rango mayor o igual a 18
            int RT2 = posT2;

            //Rango de 14 a 17
            int RT3 = posT3 + posT4 + posT5 + posT6;

            //Rango de 10 a 13
            int RT4 = posT7 + posT8 + posT9 + posT10;

            //Rango de 6 a 9
            int RT5 = posT11 + posT12 + posT13;

            //Rango menor a 6
            int RT6 = posT14;

            double posRTt = (double) (RT4 + RT3) / (double) RT1;
            posRTt = 16.66666 * posRTt;

            gT.guardarCF(RT6, RT5, RT4, RT3, RT2, RT1, posRTt);

            int posCF1 = getColorFuente(servicio).getInt(getColorFuente(servicio).length() - 1);
            int posCF2 = getColorFuente(servicio).getInt(getColorFuente(servicio).length() - 2);
            int posCF3 = getColorFuente(servicio).getInt(getColorFuente(servicio).length() - 3);
            int posCF4 = getColorFuente(servicio).getInt(getColorFuente(servicio).length() - 4);
            int posCF5 = getColorFuente(servicio).getInt(getColorFuente(servicio).length() - 5);
            int posCF6 = getColorFuente(servicio).getInt(getColorFuente(servicio).length() - 6);

            double posCFt = (double) (posCF6 + posCF5 + posCF4 + posCF3) / (double) RT1;
            posCFt = 16.66666 * posCFt;

            gcf.guardarCF(posCF6, posCF5, posCF4, posCF3, posCF2, posCF1, posCFt);

            int posCfon1 = getCFondo(servicio).getInt(getCFondo(servicio).length() - 1);
            int posCfon2 = getCFondo(servicio).getInt(getCFondo(servicio).length() - 2);
            int posCfon3 = getCFondo(servicio).getInt(getCFondo(servicio).length() - 3);

            double posCfont = (double) posCfon3 / (double) posCfon1;
            posCfont = 16.66666 * posCfont;

            gCF.guardarColorFondo(posCfon3, posCfon2, posCfon1, posCfont);

            int i1 = getIdioma(servicio).getInt(getIdioma(servicio).length() - 1);
            int i2 = getIdioma(servicio).getInt(getIdioma(servicio).length() - 2);
            int i3 = getIdioma(servicio).getInt(getIdioma(servicio).length() - 3);

//            int i4 = i1 + i2 + i3;
            double posIt = (double) (i3 + i2) / (double) RT1;
            posIt = 16.66666 * posIt;
            gI.guardarIdioma(i1, i3, i2, RT1, posIt);

            double Leg = posT + posFt + posCFt + posRTt + posIt + posCfont;

            gL.guardar(Leg, formato);

            response.sendRedirect("M_Legibilidad.jsp");

        }
    }

    String salida = "";

    public JSONArray getAlineacion(String URL) {

        try {
            URL url = new URL(URL);
            HttpURLConnection c_api = (HttpURLConnection) url.openConnection();
            c_api.setRequestMethod("POST");
            c_api.setRequestProperty("Accept", "application/json");
            if (c_api.getResponseCode() == 200) {
                InputStreamReader entrada = new InputStreamReader(c_api.getInputStream());
                BufferedReader lectura = new BufferedReader(entrada);
                salida = lectura.readLine();
                String jsonString = salida;
                obj = new JSONObject(jsonString);

                arr = obj.getJSONArray("Alineacion");

            } else {
                salida = "";
                System.out.println("No se puede conectar a la aplicacion" + c_api.getResponseCode());
            }

            c_api.disconnect();

        } catch (IOException ex) {
            System.out.println("Error api" + ex.getMessage());
        }

        return arr;
    }

    String salida2 = "";

    public JSONArray getFuentes(String URL) {

        try {
            URL url = new URL(URL);
            HttpURLConnection c_api = (HttpURLConnection) url.openConnection();
            c_api.setRequestMethod("POST");
            c_api.setRequestProperty("Accept", "application/json");
            if (c_api.getResponseCode() == 200) {
                InputStreamReader entrada = new InputStreamReader(c_api.getInputStream());
                BufferedReader lectura = new BufferedReader(entrada);
                salida2 = lectura.readLine();
                String jsonString = salida2;
                obj = new JSONObject(jsonString);

                arrFuentes = obj.getJSONArray("Fuentes");

            } else {
                salida2 = "";
                System.out.println("No se puede conectar a la aplicacion" + c_api.getResponseCode());
            }

            c_api.disconnect();

        } catch (IOException ex) {
            System.out.println("Error api" + ex.getMessage());
        }

        return arrFuentes;
    }

    String salida4 = "";

    public JSONArray getColorFuente(String URL) {

        try {
            URL url = new URL(URL);
            HttpURLConnection c_api = (HttpURLConnection) url.openConnection();
            c_api.setRequestMethod("POST");
            c_api.setRequestProperty("Accept", "application/json");
            if (c_api.getResponseCode() == 200) {
                InputStreamReader entrada = new InputStreamReader(c_api.getInputStream());
                BufferedReader lectura = new BufferedReader(entrada);
                salida4 = lectura.readLine();
                String jsonString = salida4;
                obj = new JSONObject(jsonString);

                arrColorFuente = obj.getJSONArray("ColorFuente");

            } else {
                salida4 = "";
                System.out.println("No se puede conectar a la aplicacion" + c_api.getResponseCode());
            }

            c_api.disconnect();

        } catch (IOException ex) {
            System.out.println("Error api" + ex.getMessage());
        }

        return arrColorFuente;
    }

    String salida5 = "";

    public JSONArray getIdioma(String URL) {

        try {
            URL url = new URL(URL);
            HttpURLConnection c_api = (HttpURLConnection) url.openConnection();
            c_api.setRequestMethod("POST");
            c_api.setRequestProperty("Accept", "application/json");
            if (c_api.getResponseCode() == 200) {
                InputStreamReader entrada = new InputStreamReader(c_api.getInputStream());
                BufferedReader lectura = new BufferedReader(entrada);
                salida5 = lectura.readLine();
                String jsonString = salida5;
                obj = new JSONObject(jsonString);

                arrIdioma = obj.getJSONArray("Idioma");

            } else {
                salida5 = "";
                System.out.println("No se puede conectar a la aplicacion" + c_api.getResponseCode());
            }

            c_api.disconnect();

        } catch (IOException ex) {
            System.out.println("Error api" + ex.getMessage());
        }

        return arrIdioma;
    }

    String salida6 = "";

    public JSONArray getlongitudPO(String URL) {

        try {
            URL url = new URL(URL);
            HttpURLConnection c_api = (HttpURLConnection) url.openConnection();
            c_api.setRequestMethod("POST");
            c_api.setRequestProperty("Accept", "application/json");
            if (c_api.getResponseCode() == 200) {
                InputStreamReader entrada = new InputStreamReader(c_api.getInputStream());
                BufferedReader lectura = new BufferedReader(entrada);
                salida6 = lectura.readLine();
                String jsonString = salida6;
                obj = new JSONObject(jsonString);

                arrLongitudProm = obj.getJSONArray("longitud_Promedio_Oracion");

            } else {
                salida6 = "";
                System.out.println("No se puede conectar a la aplicacion" + c_api.getResponseCode());
            }

            c_api.disconnect();

        } catch (IOException ex) {
            System.out.println("Error api" + ex.getMessage());
        }

        return arrLongitudProm;
    }

    String salida7 = "";

    public int getNLetras(String URL) {
        int nL = 0;
        try {
            URL url = new URL(URL);
            HttpURLConnection c_api = (HttpURLConnection) url.openConnection();
            c_api.setRequestMethod("POST");
            c_api.setRequestProperty("Accept", "application/json");
            if (c_api.getResponseCode() == 200) {
                InputStreamReader entrada = new InputStreamReader(c_api.getInputStream());
                BufferedReader lectura = new BufferedReader(entrada);
                salida7 = lectura.readLine();
                String jsonString = salida7;
                obj = new JSONObject(jsonString);

                nL = obj.getInt("Num_Letras");

            } else {
                salida7 = "";
                System.out.println("No se puede conectar a la aplicacion" + c_api.getResponseCode());
            }

            c_api.disconnect();

        } catch (IOException ex) {
            System.out.println("Error api" + ex.getMessage());
        }

        return nL;
    }

    String salida8 = "";

    public int getNPalabras(String URL) {
        int nP = 0;
        try {
            URL url = new URL(URL);
            HttpURLConnection c_api = (HttpURLConnection) url.openConnection();
            c_api.setRequestMethod("POST");
            c_api.setRequestProperty("Accept", "application/json");
            if (c_api.getResponseCode() == 200) {
                InputStreamReader entrada = new InputStreamReader(c_api.getInputStream());
                BufferedReader lectura = new BufferedReader(entrada);
                salida8 = lectura.readLine();
                String jsonString = salida8;
                obj = new JSONObject(jsonString);

                nP = obj.getInt("Num_palabras");

            } else {
                salida8 = "";
                System.out.println("No se puede conectar a la aplicacion" + c_api.getResponseCode());
            }

            c_api.disconnect();

        } catch (IOException ex) {
            System.out.println("Error api" + ex.getMessage());
        }

        return nP;
    }

    String salida9 = "";

    public JSONArray getCFondo(String URL) {

        try {
            URL url = new URL(URL);
            HttpURLConnection c_api = (HttpURLConnection) url.openConnection();
            c_api.setRequestMethod("POST");
            c_api.setRequestProperty("Accept", "application/json");
            if (c_api.getResponseCode() == 200) {
                InputStreamReader entrada = new InputStreamReader(c_api.getInputStream());
                BufferedReader lectura = new BufferedReader(entrada);
                salida9 = lectura.readLine();
                String jsonString = salida9;
                obj = new JSONObject(jsonString);

                arrColorFondo = obj.getJSONArray("ColorFondo");

            } else {
                salida9 = "";
                System.out.println("No se puede conectar a la aplicacion" + c_api.getResponseCode());
            }

            c_api.disconnect();

        } catch (IOException ex) {
            System.out.println("Error api" + ex.getMessage());
        }

        return arrColorFondo;
    }

    String salida10 = "";

    public JSONArray getCTamanoFuente(String URL) {

        try {
            URL url = new URL(URL);
            HttpURLConnection c_api = (HttpURLConnection) url.openConnection();
            c_api.setRequestMethod("POST");
            c_api.setRequestProperty("Accept", "application/json");
            if (c_api.getResponseCode() == 200) {
                InputStreamReader entrada = new InputStreamReader(c_api.getInputStream());
                BufferedReader lectura = new BufferedReader(entrada);
                salida10 = lectura.readLine();
                String jsonString = salida10;
                obj = new JSONObject(jsonString);

                arrTamañoFuente = obj.getJSONArray("TamaÃ±oFuente");

            } else {
                salida10 = "";
                System.out.println("No se puede conectar a la aplicacion" + c_api.getResponseCode());
            }

            c_api.disconnect();

        } catch (IOException ex) {
            System.out.println("Error api" + ex.getMessage());
        }

        return arrTamañoFuente;
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
            Logger.getLogger(guardarLServlet2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(guardarLServlet2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(guardarLServlet2.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(guardarLServlet2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(guardarLServlet2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(guardarLServlet2.class.getName()).log(Level.SEVERE, null, ex);
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
