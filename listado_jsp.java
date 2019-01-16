package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class listado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 align=\"center\">Listado de Usuarios</h1>\n");
      out.write("        \n");
      out.write("        <table align=\"center\" border=\"1\" width=\"600\">\n");
      out.write("            <tr bgcolor=\"yellow\">\n");
      out.write("                <th colspan=\"6\">Mantenimiento de usuarios</th>\n");
      out.write("                <th><a href=\"nuevo.jsp\">\n");
      out.write("                        <th><img src=\"iconos/nuevo.jpg\" width=\"50\" height=\"50\"></a></th>\n");
      out.write("            </tr>\n");
      out.write("            <tr bgcolor=\"yellow\">\n");
      out.write("                <th>id</th>\n");
      out.write("                <th>nombre</th>\n");
      out.write("                <th>contraseña</th>\n");
      out.write("                <th>email</th>\n");
      out.write("                <th>fecha_creacion</th>\n");
      out.write("                <th>telefono</th>\n");
      out.write("                <th>accion</th>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            ");

                Connection con=null;
                Statement stat=null;
                ResultSet res=null;
                
                try{
                   Class.forName("com.mysql.jdbc.Driver");
                   con=DriverManager.getConnection
                    ("jdbc:mysql://localhost/juego_pokemon?user=root&password=");
                   stat=con.createStatement();
                   res=stat.executeQuery("select * from usuarios");
                   while(res.next()){
                       
      out.write("\n");
      out.write("                       <tr>\n");
      out.write("                           <th>");
      out.print(res.getString(1));
      out.write("</th>\n");
      out.write("                           <th>");
      out.print(res.getString(2));
      out.write("</th>\n");
      out.write("                           <th>");
      out.print(res.getString(3));
      out.write("</th>\n");
      out.write("                           <th>");
      out.print(res.getString(4));
      out.write("</th>\n");
      out.write("                           <th>");
      out.print(res.getString(5));
      out.write("</th>\n");
      out.write("                           <th>");
      out.print(res.getString(6));
      out.write("</th>\n");
      out.write("                           <th><img src=\"iconos/ingresar.jpg\" width=\"50\" height=\"50\"> ||\n");
      out.write("                               <img src=\"iconos/nuevo.jpg\" width=\"50\" height=\"50\">\n");
      out.write("                           </th>\n");
      out.write("                           \n");
      out.write("                       </tr>                  \n");
      out.write("                       ");

                      
                   }
                }catch(Exception e){}
                stat.close();
                           res.close();
                           con.close();
                
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
