import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class CompararP extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        //throws ServletException, IOException {
            String permutacion = request.getParameter("permutacion");
            //devolverPaginaHTML(response);
        //}
        //public void devolverPaginaHTML(HttpServletResponse response){
            response.setContentType("text/html");
            PrintWriter out = null;
            try {
                out=response.getWriter();
            } catch (IOException io) {
                System.out.println("Se ha producido una excepcion");
            }
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Datos</title>");
            out.println("</head>");
            out.println("<body bgcolor='#FFFFFF' text='#631818'>");
            out.println("<p align='center'><font size='6'><b>Datos:</b></font></p>");
            out.println("<p align='center'><font size='2'><b>Tipo de Permutaci&oacute;n: " +permutacion+"</b></font></p>");
            if (permutacion.equals("P")==true){
                out.println("<form method='GET' action='P'>");
                out.println("<BR>");
                out.println("<p align='center'>");
                out.println("<TABLE BORDER=0>");
                out.println("<TR>");
                out.println("<TD><font size='3'>m</font></TD>");
                out.println("<TD><input type='text' name='m' size='3'></TD>");
                out.println("</TR>");
            } else {
                out.println("<form method='GET' action='PR'>");
                out.println("<BR>");
                out.println("<p align='center'>");
                out.println("<TABLE BORDER=0>");
                out.println("<TR>");
                out.println("<TD><font size='3'>n1:</font></TD>");
                out.println("<TD><input type='text' name='n1' size='3'></TD>");
                out.println("</TR>");
				out.println("<TR>");
				out.println("<TD><font size='3'>n2:</font></TD>");
				out.println("<TD><input type='text' name='n2' size='3'></TD>");
				out.println("</TR>");
				out.println("<TR>");
				out.println("<TD><font size='3'>n3:</font></TD>");
				out.println("<TD><input type='text' name='n3' size='3'></TD>");
				out.println("</TR>");
				out.println("<TR>");
				out.println("<TD><font size='3'>n4:</font></TD>");
				out.println("<TD><input type='text' name='n4' size='3'></TD>");
				out.println("</TR>");
			}
            out.println("</TABLE>");
            out.println("<p align='center'>");
            out.println("<input type='submit' value='Enviar'>&nbsp;&nbsp;&nbsp;");
            out.println("<input type='reset' value='Borrar'></p>");
            out.println("</p>");
            out.println("</form>");
            out.println("<p align='center'>&nbsp;</p>");
            out.println("<p align='center'>");
            out.println("<a href='index.html'>Ir al menu</a>");
            out.println("</p>");
            out.println("</body>");
            out.println("</html>");
            out.flush();
            out.close();
            }
}