import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class P extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        //throws ServletException, IOException {
        //PrintWriter out = response.getWriter();
        String mString = request.getParameter("m");
        int m = Integer.parseInt(mString);
        int P=1;
        for (int i=1; i<=m; i++){
            P = P*i;
        }
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
        out.println("<P><font size=+1><B>P = </B>" + P + "</font>");
        out.println("<P><font size=+1><B>Combinaciones posibles: </B></font>");
        if (m==1){
            for (int i=0; i<m+1; i++){
                int a = i+1;
                out.print("<P><font size=+1>" + a + "</font>");
            }
        } else if (m==2){
            for (int i=0; i<m; i++){
                for (int j=0; j<m; j++){
                    if (i!=j){
                        int a = i+1;
                        int b = j+1;
                        out.print("<P><font size=+1>" + a + "<B> </B>"+ b + "</font>");
                    }
                }
            }
        } else if (m==3) {
            for (int i=0; i<m; i++){
                for (int j=0; j<m; j++){
                    for (int k=0; k<m; k++){
                        if (i!=j && i!=k && j!=k){
                            int a = i+1;
                            int b = j+1;
                            int c = k+1;
                            out.print("<P><font size=+1>" + a + "<B> </B>"+ b + "<B> </B>" + c + "</font>");
                        }
                    }
                }
            }
        } else if (m==4){
            for (int i=0; i<m+1; i++){
                for (int j=0; j<m; j++){
                    for (int k=0; k<m; k++){
                        for (int h=0; h<m; h++){
                            if (i!=j && i!=k && i!=h && j!=k && j!=h && k!=h){
                                int a = i+1;
                                int b = j+1;
                                int c = k+1;
                                int d = h+1;
                                out.print("<P><font size=+1>" + a + "<B> </B>"+ b + "<B> </B>" + c + "<B> </B>" + d + "</font>");
                            }
                        }
                    }
                }
            }
        }else{
            out.print("<P><font size=+1>El valor de m es mayor que 4...</font>");
        }
        out.println("</body>");
        out.println("</html>");
        out.flush();
        out.close();
        }
    }