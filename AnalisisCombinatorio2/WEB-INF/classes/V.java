import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class V extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        //throws ServletException, IOException {
        //PrintWriter out = response.getWriter();
        String mString = request.getParameter("m");
        String nString = request.getParameter("n");
        int m = Integer.parseInt(mString);
        int n = Integer.parseInt(nString);
        int fact_m=1;
        int fact_n=1;
        int denominador=m-n;
        for (int i=1; i<=m; i++){
            fact_m=fact_m*i;
        }
        for (int j=1; j<=denominador; j++){
            fact_n=fact_n*j;
        }
        int vari=fact_m/fact_n;
        System.out.println("V="+vari);
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
        out.println("<P><font size=+1><B>V = </B>" + vari + "</font>");
        if (n==1){
            for (int u=1;u<=m;u++){
                out.print("<P><font size=+1>" + u + "</font>");
            }
        } if (n==2){
            for (int i=0; i<m; i++){
                for (int j=0; j<m; j++){
                    int a=i+1;
                    int b =j+1;
                    if ( a !=  b){
                        out.print("<P><font size=+1>" + a + "<B> </B>"+ b + "</font>");
                    }
                }
            }
        } if (n==3){
            for (int q=1; q<=m;q++){
                int c=q;
                for (int k=1; k<=m;k++){
                    int d=k;
                    for (int p=1; p<=m;p++){
                        int e=p;
                        if (c!=d && c!=e && d!=e){
                            out.print("<P><font size=+1>" + c + "<B> </B>"+ d + "<B> </B>" + e + "</font>");
                        }
                    }
                }
            }
        } if (n==4){
            for (int w=1; w<=m;w++){
                int f=w;
                for (int z=1; z<=m;z++){
                    int g=z;
                    for (int t=1; t<=m;t++){
                        int h=t;
                        for (int y=1; y<=m;y++){
                            int s=y;
                            if (f!=g && f!=h && f!=s && g!=h && g!=s && h!=s){
                                out.print("<P><font size=+1>" + f + "<B> </B>"+ g + "<B> </B>" + h + "<B> </B>" + s + "</font>");
                                
                            }
                            
                        }
                    }
                }
            }
        }else{
            out.print("<P><font size=+1>El valor de n es mayor que 4...</font>");
        }
        out.println("</body>");
        out.println("</html>");
        out.flush();
        out.close();
        }
    }