import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class PR extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        //throws ServletException, IOException {
        //PrintWriter out = response.getWriter();
        String n1String = request.getParameter("n1");
		String n2String = request.getParameter("n2");
		String n3String = request.getParameter("n3");
		String n4String = request.getParameter("n4");
        int n1 = Integer.parseInt(n1String);
        int n2 = Integer.parseInt(n2String);
		int n3 = Integer.parseInt(n3String);
		int n4 = Integer.parseInt(n4String);
        int n = n1 + n2 + n3 + n4;
		int N = 1;
		int N1 = 1;
		int N2 = 1;
		int N3 = 1;
		int N4 = 1;
        for (int i=1; i<=n1; i++){
            N1 = N1*i;
        }
        for (int i=1; i<=n2; i++){
            N2 = N2*i;
        }
        for (int i=1; i<=n3; i++){
            N3 = N3*i;
        }
        for (int i=1; i<=n4; i++){
            N4 = N4*i;
        }
        for (int i=1; i<=n; i++){
            N = N*i;
        }
		int PR=N/(N1*N2*N3*N4);
		
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
        out.println("<P><font size=+1><B>PR = </B>" + PR + "</font>");
        out.println("</body>");
        out.println("</html>");
        out.flush();
        out.close();
        }
    }