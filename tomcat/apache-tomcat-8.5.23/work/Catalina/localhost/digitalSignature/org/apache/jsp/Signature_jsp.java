/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2017-11-25 14:10:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.yawlfoundation.yawl.engine.interfce.Marshaller;
import org.yawlfoundation.yawl.engine.interfce.WorkItemRecord;
import org.yawlfoundation.yawl.resourcing.rsInterface.WorkQueueGatewayClient;

public final class Signature_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.yawlfoundation.yawl.engine.interfce.Marshaller");
    _jspx_imports_classes.add("org.yawlfoundation.yawl.engine.interfce.WorkItemRecord");
    _jspx_imports_classes.add("org.yawlfoundation.yawl.resourcing.rsInterface.WorkQueueGatewayClient");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("<?xml version=\"1.0\"?>\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\r\n");
      out.write("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta content=\"no-cache\" http-equiv=\"Pragma\"/>\r\n");
      out.write("    <meta content=\"no-cache\" http-equiv=\"Cache-Control\"/>\r\n");
      out.write("    <meta content=\"no-store\" http-equiv=\"Cache-Control\"/>\r\n");
      out.write("    <meta content=\"max-age=0\" http-equiv=\"Cache-Control\"/>\r\n");
      out.write("    <meta content=\"1\" http-equiv=\"Expires\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <title>Welcome to the Digital Signature Service</title>\r\n");
      out.write("    <script type=\"text/javascript\"\r\n");
      out.write("            src=\"/resourceService/theme/com/sun/rave/web/ui/defaulttheme-gray/javascript/formElements.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("          href=\"/resourceService/theme/com/sun/rave/web/ui/defaulttheme-gray/css/css_master.css\"/>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        var sjwuic_ScrollCookie = new sjwuic_ScrollCookie('/dynForm.jsp', '/resourceService/faces/dynForm.jsp');\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    <link id=\"link1\" rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("          href=\"/resourceService/resources/stylesheet.css\"/>\r\n");
      out.write("    <link id=\"lnkFavIcon\" rel=\"shortcut icon\" type=\"image/x-icon\"\r\n");
      out.write("          href=\"/resourceService/resources/favicon.ico\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"body1\" style=\"-rave-layout: grid\"\r\n");
      out.write("      onload=\"return body1_jsObject.setInitialFocus();\"\r\n");
      out.write("      onunload=\"return body1_jsObject.setScrollPosition();\">\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("    <div>\r\n");
      out.write("        <table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"height: 69px\"\r\n");
      out.write("               id=\"form1:headtable1\">\r\n");
      out.write("            <tbody>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td background=\"./resources/headbgleft.jpg\" height=\"69px\" width=\"40%\"\r\n");
      out.write("                    valign=\"bottom\" align=\"left\"><p>\r\n");
      out.write("                    <a style=\"font-family:verdana; color: #3277ba\" target=\"_blank\"\r\n");
      out.write("                       href=\"http://www.yawlfoundation.org/\">\r\n");
      out.write("                        www.yawlfoundation.org\r\n");
      out.write("                    </a></p></td>\r\n");
      out.write("                <td width=\"409px\" height=\"69px\" align=\"center\"><img\r\n");
      out.write("                        src=\"./resources/newYAWL.jpg\" border=\"0\" alt=\"YAWL 2.0\"\r\n");
      out.write("                        width=\"409px\" height=\"69px\" id=\"form1:headImage1\"/></td>\r\n");
      out.write("                <td background=\"./resources/headbgright.jpg\" height=\"69px\" valign=\"bottom\"\r\n");
      out.write("                    align=\"right\" width=\"40%\"><p\r\n");
      out.write("                        style=\"font-family:verdana; color: #97cbfd\"><i>Leading the World\r\n");
      out.write("                    in Process Innovation</i>\r\n");
      out.write("\r\n");
      out.write("                </p></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");

    String itemXML = (String) session.getAttribute("itemXML");
    if (itemXML == null) {

        // The workitem id and user's session handle are passed as parameters. Use them
        // to get an xml record of the workitem.
        String itemid = request.getParameter("workitem");
        String handle = request.getParameter("handle");
        String redirectURL = request.getParameter("source");

        String wqURL = "http://localhost:8080/resourceService/workqueuegateway";
        WorkQueueGatewayClient wqClient = new WorkQueueGatewayClient(wqURL);
        itemXML = wqClient.getWorkItem(itemid, handle);
        
        session.setAttribute("itemXML", itemXML);
        session.setAttribute("workitem", itemid);
        session.setAttribute("handle", handle);
        session.setAttribute("redirectURL", redirectURL);
    }


      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("      <center>\r\n");
      out.write("\t\t<div id=\"form1:pnlContainer\" style=\"position: relative; height: 10px; top: 0; width: 290px\" style=\"position: relative;-rave-layout: grid; position: relative; height: 10px; top: 0; width: 290px\">\r\n");
      out.write("\t\t<span id=\"form1:txtHeader\" class=\"pageHeading\">Digital Signature</span>\r\n");
      out.write("\t\t<div id=\"form1:compPanel\" class=\"dynformOuterPanel\" style=\"position: absolute; height: 150px; width: 350px\" style=\"position: relative;-rave-layout: grid; position: absolute; height: 170px; width: 390px\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<form method=\"POST\" enctype=\"multipart/form-data\" onsubmit=\"return checkForm(this)\" action=\"upload.jsp\">\r\n");
      out.write("          <label id=\"form1:lblDocument1\" for=\"form1:txtDocument1\" class=\"dynformLabel LblLev2Txt\" style=\"top: 15px\">P12 Certificate : </label>\r\n");
      out.write("          <input type=\"file\" name=\"P12\" class=\"dynformInput TxtFld\" size=\"20\" title=\" Please load a valid certificate\"  style=\"top: 10px; left:125px; width:115px\" value=\"\" maxlength=\"20\"/>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("          <label id=\"form1:lblDocument1\" for=\"form1:txtDocument1\" class=\"dynformLabel LblLev2Txt\" style=\"top: 45px\">Password : </label>\r\n");
      out.write("          <input type=\"password\" name=\"password\" class=\"dynformInput TxtFld\" size=\"20\" title=\" Please enter your password\"  style=\"top: 40px; left:125px; width:115px\" value=\"\" maxlength=\"20\"/>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("          <label id=\"form1:lblDocument1\" for=\"form1:txtDocument1\" class=\"dynformLabel LblLev2Txt\" style=\"top: 70px\">x509 Certificate : </label>\r\n");
      out.write("          <input type=\"file\" name=\"x509\" class=\"dynformInput TxtFld\" size=\"20\" title=\" Please load a valid certificate\"  style=\"top: 65px; left:125px; width:115px\" value=\"\" maxlength=\"20\"/>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<input style=\"left: 105px ;top: 110px\" class=\"dynformButton Btn2\" type=\"reset\" value=\"Clear\" />\r\n");
      out.write("\t\t\t\t\t<INPUT style=\"left: 205px; top: 110px\" class=\"dynformButton Btn2\" TYPE=\"submit\" Value=\"SIGN\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function checkForm(form){\r\n");
      out.write("msg = \"\";\r\n");
      out.write("   if(!form.password.value){\r\n");
      out.write("      msg += \"- password is required\\n\";\r\n");
      out.write("   }\r\n");
      out.write("   if(!form.P12.value){\r\n");
      out.write("      msg += \"- Certificate is required\\n\";\r\n");
      out.write("   }\r\n");
      out.write("   if(!form.x509.value){\r\n");
      out.write("      msg += \"- Certificate is required\\n\";\r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("   if(msg != \"\"){\r\n");
      out.write("      alert(msg);\r\n");
      out.write("      return false;\r\n");
      out.write("   }\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
