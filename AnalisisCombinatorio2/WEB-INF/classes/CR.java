import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class CR extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        //throws ServletException, IOException {
        //PrintWriter out = response.getWriter();
        String mString = request.getParameter("m");
        String nString = request.getParameter("n");
        int m = Integer.parseInt(mString);
        int n = Integer.parseInt(nString);
        int fact_n=1;
        int fact_m=1;
        int denominador=1;
        for (int i=1; i<=n; i++){
            fact_n=fact_n*i;
        }
        for (int i=1; i<=m-1; i++){
            fact_m=fact_m*i;
        }
        for (int i=1; i<=m+n-1; i++){
            denominador=denominador*i;
        }
        int CR = denominador/(fact_n*fact_m);
        response.setContentType("text/html");
        PrintWriter out = null;
        try {
            out=response.getWriter();
        } catch (IOException io) {
            System.out.println("Se ha producido una excepcion");
        }
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Resultado</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<B><font size=+2>Resultado: </font></B>");
        out.println("<P><font size=+1><B>CR = </B>" + CR + "</font>");

        out.println("</body>");
        out.println("</html>");
        out.flush();
        out.close();
        }
    }