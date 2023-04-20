import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class VR extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        //throws ServletException, IOException {
        //PrintWriter out = response.getWriter();
        String mString = request.getParameter("m");
        String nString = request.getParameter("n");
        int m = Integer.parseInt(mString);
        int n = Integer.parseInt(nString);
        int VR = m;
        for (int i=1; i<n; i++){
            VR = VR*m;
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
        out.println("<P><font size=+1><B>VR = </B>" + VR + "</font>");
        out.println("<P><font size=+1><B>Combinaciones posibles: </B></font>");
        if (n==1){
            for (int i=0; i<m; i++){
                int a = i+1;
                out.print("<P><font size=+1>" + a + "</font>");
                }
        } else if (n==2){
            for (int i=0; i<m; i++){
                for (int j=0; j<m; j++){
                    int a = i+1;
                    int b = j+1;
                    out.print("<P><font size=+1>" + a + "<B> </B>"+ b + "</font>");
                }
            }
        } else if (n==3) {
            for (int i=0; i<m; i++){
                for (int j=0; j<m; j++){
                    for (int k=0; k<m; k++){
                        int a = i+1;
                        int b = j+1;
                        int c = k+1;
                        out.print("<P><font size=+1>" + a + "<B> </B>"+ b + "<B> </B>" + c + "</font>");
                    }
                }
            }
        } else if (n==4){
            for (int i=0; i<m; i++){
                for (int j=0; j<m; j++){
                    for (int k=0; k<m; k++){
                        for (int h=0; h<m; h++){
                            int a = i+1;
                            int b = j+1;
                            int c = k+1;
                            int d = h+1;
                            out.print("<P><font size=+1>" + a + "<B> </B>"+ b + "<B> </B>" + c + "<B> </B>" + d + "</font>");
                        }
                    }
                }
            }
        }else{
            out.print("<P><font size=+1>El valor n tiene que ser un número entre 1 y 4...</font>");
        }
        out.println("</body>");
        out.println("</html>");
        out.flush();
        out.close();
        }
    }