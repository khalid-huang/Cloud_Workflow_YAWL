/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2017-11-25 14:10:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.yawlfoundation.yawl.worklet.admin.AdministrationTask;
import org.yawlfoundation.yawl.worklet.exception.ExceptionService;
import org.yawlfoundation.yawl.worklet.WorkletService;
import org.yawlfoundation.yawl.worklet.admin.AdminTasksManager;
import org.yawlfoundation.yawl.worklet.WorkletService;

public final class wsAdminTaskDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {


    WorkletService _workletService = null;
    AdminTasksManager _adminTasksManager = null;
    String _worklistURL;
    String _adminlistURL;
    String _caseMgtURL;

    public void jspInit() {
        ServletContext context = getServletContext();
        _workletService = (WorkletService) context.getAttribute(
                "org.yawlfoundation.yawl.worklet.WorkletService");
        if (_workletService == null) {
            _workletService = WorkletService.getInstance();
            context.setAttribute("org.yawlfoundation.yawl.worklet.WorkletService",
                    _workletService);
        }
        _adminTasksManager = (AdminTasksManager) context.getAttribute(
                "org.yawlfoundation.yawl.worklet.admin.AdminTasksManager");
        if (_adminTasksManager == null) {
            _adminTasksManager = new AdminTasksManager();
            context.setAttribute("org.yawlfoundation.yawl.worklet.admin.AdminTasksManager",
                    _adminTasksManager);
        }

        // set resource service admin page urls
        String resourceServiceURL = _workletService.getResourceServiceURL();
        if (resourceServiceURL == null) {
            resourceServiceURL = "http://localhost:8080/resourceService";   // a default
        }
        if (!resourceServiceURL.endsWith("/")) {
            resourceServiceURL += "/";
        }
        _worklistURL = resourceServiceURL + "faces/userWorkQueues.jsp";
        _adminlistURL = resourceServiceURL + "faces/adminQueues.jsp";
        _caseMgtURL = resourceServiceURL + "faces/caseMgt.jsp";
    }

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/jsp/wsHead.jsp", Long.valueOf(1462853304000L));
    _jspx_dependants.put("/jsp/wsBanner.jsp", Long.valueOf(1462853304000L));
    _jspx_dependants.put("/jsp/wsFooter.jsp", Long.valueOf(1462853304000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.yawlfoundation.yawl.worklet.exception.ExceptionService");
    _jspx_imports_classes.add("org.yawlfoundation.yawl.worklet.WorkletService");
    _jspx_imports_classes.add("org.yawlfoundation.yawl.worklet.admin.AdminTasksManager");
    _jspx_imports_classes.add("org.yawlfoundation.yawl.worklet.admin.AdministrationTask");
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
      out.write("\r\n");
      out.write("<!-- *  author Michael Adams\r\n");
      out.write("     *  version 0.8, 04-09/2006  -->\r\n");
      out.write("\r\n");

    String wsTaskID = request.getParameter("id");
    String buttonText = request.getParameter("submit");
    AdministrationTask wsTask = _adminTasksManager.getTask(Integer.parseInt(wsTaskID));

    if (buttonText != null) {
        response.sendRedirect(response.encodeURL("/workletService/wsAdminTasks"));
        return;
    }    

    String taskTypeStr = null;
    int taskType = wsTask.getTaskType();

    if (taskType == AdministrationTask.TASKTYPE_CASE_EXTERNAL_EXCEPTION)
       taskTypeStr = "New Case-Level External Exception";
    else if (taskType == AdministrationTask.TASKTYPE_ITEM_EXTERNAL_EXCEPTION)
       taskTypeStr = "New Item-Level External Exception";
    else if (taskType == AdministrationTask.TASKTYPE_REJECTED_SELECTION)
       taskTypeStr = "Rejected Worklet Selection";   

      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Worklet Service : Administration Task Detail</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Include file to load init method -->\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta name=\"Pragma\" content=\"no-cache\"/>\r\n");
      out.write("<meta name=\"Cache-Control\" content=\"no-cache\"/>\r\n");
      out.write("<meta name=\"Expires\" content=\"0\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./graphics/common.css\"/>\r\n");
      out.write("<link rel=\"shortcut icon\" id=\"lnkFavIcon\" type=\"image/x-icon\"\r\n");
      out.write("      href=\"./graphics/favicon.ico\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script language=\"JavaScript\">\r\n");
      out.write("\r\n");
      out.write("    function isCompletedForm(formNme, radioGroupName) {\r\n");
      out.write("        var oneChecked = false;\r\n");
      out.write("        var i = 0;\r\n");
      out.write("        //javascript or dom problem means one must access the properties of\r\n");
      out.write("        //a radio button different ways depending on whether one or more radios are in the group\r\n");
      out.write("        if (window.document[formNme].elements[radioGroupName].checked) {\r\n");
      out.write("            oneChecked = true;\r\n");
      out.write("        }\r\n");
      out.write("        else {\r\n");
      out.write("            while (i < window.document[formNme].elements[radioGroupName].length) {\r\n");
      out.write("                if (window.document[formNme].elements[radioGroupName][i].checked == true) {\r\n");
      out.write("                    oneChecked = true;\r\n");
      out.write("                }\r\n");
      out.write("                i++;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        if (!oneChecked) {\r\n");
      out.write("            alert(\"You need to select one item.\");\r\n");
      out.write("        }\r\n");
      out.write("        return oneChecked;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"TEXT/CSS\"><!--\r\n");
      out.write(".leftArea {\r\n");
      out.write("    color: DarkGrey;\r\n");
      out.write("    background: #E8E8E8;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("    scrollbar-arrow-color: WHITE;\r\n");
      out.write("    scrollbar-track-color: #D6D6D6;\r\n");
      out.write("    scrollbar-shadow-color: #D6D6D6;\r\n");
      out.write("    scrollbar-face-color: #135184;\r\n");
      out.write("    scrollbar-highlight-color: #D6D6D6;\r\n");
      out.write("    scrollbar-darkshadow-color: #135184;\r\n");
      out.write("    scrollbar-3dlight-color: #135184;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("--></style>");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!-- Include YAWL Banner Information -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- *  author Michael Adams\r\n");
      out.write("     *  version 2.0, 06/2009  -->\r\n");
      out.write("\r\n");
      out.write("<!-- header -->\r\n");
      out.write("<table id=\"form1:headtable1\" style=\"height: 69px\" width=\"100%\"\r\n");
      out.write("       cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("    <tbody>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td align=\"left\" valign=\"bottom\" width=\"40%\" height=\"69px\"\r\n");
      out.write("                background=\"./graphics/headbgleft.jpg\">\r\n");
      out.write("                <p>&#160;\r\n");
      out.write("                    <a href=\"http://www.yawlfoundation.org/\" target=\"_blank\"\r\n");
      out.write("                       style=\"font-family:verdana; color: #3277ba; font-size:small\">\r\n");
      out.write("                        www.yawlfoundation.org\r\n");
      out.write("                    </a>\r\n");
      out.write("                </p>\r\n");
      out.write("            </td>\r\n");
      out.write("\r\n");
      out.write("            <td align=\"center\" height=\"69px\" width=\"409px\">\r\n");
      out.write("                <img id=\"form1:headImage1\" height=\"69px\" width=\"409px\" alt=\"YAWL 2.0\"\r\n");
      out.write("                     border=\"0\"\r\n");
      out.write("                     src=\"./graphics/newYAWL.jpg\"/>\r\n");
      out.write("            </td>\r\n");
      out.write("\r\n");
      out.write("            <td width=\"40%\" align=\"right\" valign=\"bottom\" height=\"69px\"\r\n");
      out.write("                background=\"./graphics/headbgright.jpg\">\r\n");
      out.write("                <p style=\"font-family:verdana; color: #97cbfd; font-size:small\">\r\n");
      out.write("                    <i>Leading the World in Process Innovation</i>\r\n");
      out.write("                    &#160;&#160;&#160;\r\n");
      out.write("                </p>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </tbody>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");

    String contextPath = request.getContextPath();
    String sHandle = (String) session.getAttribute("sessionHandle");

    if(sHandle == null){
    	sHandle = (String) request.getParameter("sH");
    	session.setAttribute("sessionHandle", sHandle); // restore session handle
    }

    boolean isAdmin = (sHandle != null) &&
                      (WorkletService.getInstance().isAdminSession(sHandle)) ;


      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h3 align=\"center\">Worklet Administration Task Detail</h3>\r\n");
      out.write("\r\n");
      out.write("<form method=\"post\" action=\"\" name=\"wsAdminTaskDetail\">\r\n");
      out.write("\r\n");
      out.write("    <table border=\"0\" cellspacing=\"2\" cellpadding=\"5\">\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td valign=\"top\" width=\"150\"><b>Task Type:</b></td>\r\n");
      out.write("            <td>");
      out.print( taskTypeStr );
      out.write("</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td valign=\"top\"><b>Title:</b></td>\r\n");
      out.write("            <td> ");
      out.print( wsTask.getTitle() );
      out.write("</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td valign=\"top\"><b>Scenario:</b></td>\r\n");
      out.write("            <td>  ");
      out.print( wsTask.getScenario() );
      out.write("</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td valign=\"top\"><b>Process Description:</b></td>\r\n");
      out.write("            <td>");
      out.print( wsTask.getProcess() );
      out.write("</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("\r\n");
      out.write("    <table border=\"0\" cellspacing=\"20\">\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td><input value=\"Back\" name=\"submit\" type=\"submit\" /></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("</form>\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<hr/>\r\n");
      out.write("<h6 align=\"center\">\r\n");
      out.write("    YAWL is distributed under the\r\n");
      out.write("    <a href=\"http://www.gnu.org/copyleft/lesser.html\">LGPL</a>\r\n");
      out.write("</h6>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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