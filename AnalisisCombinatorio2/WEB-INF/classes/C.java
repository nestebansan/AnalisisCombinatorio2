import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class C extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        //throws ServletException, IOException {
        //PrintWriter out = response.getWriter();
        String mString = request.getParameter("m");
        String nString = request.getParameter("n");
        int m = Integer.parseInt(mString);
        int n = Integer.parseInt(nString);
        int fact_m=1;
        int fact_n=1;
        int fact_mn=1;
        int denominador=m-n;
        for (int i=1; i<=m; i++){
             fact_m=fact_m*i;
        }
        for (int j=1; j<=n; j++){
             fact_n=fact_n*j;
        }
        for (int k=1; k<=denominador; k++){
             fact_mn=fact_mn*k;
        }
        int C=fact_m/(fact_n*fact_mn);
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
        out.println("<P><font size=+1><B>C = </B>" + C + "</font>");

        out.println("</body>");
        out.println("</html>");
        out.flush();
        out.close();
        }
    }