/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2017-11-26 08:05:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pfHeader_jspf extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/home/kevin/YAN/Cloud_Workflow_YAWL/tomcat/apache-tomcat-8.5.23/webapps/resourceService/WEB-INF/lib/jsf-impl.jar!/META-INF/jsf_core.tld", Long.valueOf(1145248466000L));
    _jspx_dependants.put("jar:file:/home/kevin/YAN/Cloud_Workflow_YAWL/tomcat/apache-tomcat-8.5.23/webapps/resourceService/WEB-INF/lib/webui.jar!/META-INF/webui.tld", Long.valueOf(1145248732000L));
    _jspx_dependants.put("/WEB-INF/lib/webui.jar", Long.valueOf(1462871070000L));
    _jspx_dependants.put("/WEB-INF/lib/jsf-impl.jar", Long.valueOf(1462871070000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ff_005fsubview_0026_005frendered_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ff_005fverbatim;

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
    _005fjspx_005ftagPool_005ff_005fsubview_0026_005frendered_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ff_005fverbatim = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ff_005fsubview_0026_005frendered_005fid.release();
    _005fjspx_005ftagPool_005ff_005fverbatim.release();
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
      response.setContentType("text/xml;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
      out.write("<div>");
      if (_jspx_meth_f_005fsubview_005f0(_jspx_page_context))
        return;
      out.write("</div>");
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

  private boolean _jspx_meth_f_005fsubview_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  f:subview
    com.sun.faces.taglib.jsf_core.SubviewTag _jspx_th_f_005fsubview_005f0 = (com.sun.faces.taglib.jsf_core.SubviewTag) _005fjspx_005ftagPool_005ff_005fsubview_0026_005frendered_005fid.get(com.sun.faces.taglib.jsf_core.SubviewTag.class);
    boolean _jspx_th_f_005fsubview_005f0_reused = false;
    try {
      _jspx_th_f_005fsubview_005f0.setPageContext(_jspx_page_context);
      _jspx_th_f_005fsubview_005f0.setParent(null);
      // /pfHeader.jspf(24,71) name = rendered type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_f_005fsubview_005f0.setRendered("#{SessionBean.showYAWLBanner}");
      // /pfHeader.jspf(24,71) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_f_005fsubview_005f0.setId("pfHeader");
      int _jspx_eval_f_005fsubview_005f0 = _jspx_th_f_005fsubview_005f0.doStartTag();
      if (_jspx_eval_f_005fsubview_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_meth_f_005fverbatim_005f0(_jspx_th_f_005fsubview_005f0, _jspx_page_context))
          return true;
      }
      if (_jspx_th_f_005fsubview_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ff_005fsubview_0026_005frendered_005fid.reuse(_jspx_th_f_005fsubview_005f0);
      _jspx_th_f_005fsubview_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_f_005fsubview_005f0, _jsp_getInstanceManager(), _jspx_th_f_005fsubview_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_f_005fverbatim_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_005fsubview_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  f:verbatim
    com.sun.faces.taglib.jsf_core.VerbatimTag _jspx_th_f_005fverbatim_005f0 = (com.sun.faces.taglib.jsf_core.VerbatimTag) _005fjspx_005ftagPool_005ff_005fverbatim.get(com.sun.faces.taglib.jsf_core.VerbatimTag.class);
    boolean _jspx_th_f_005fverbatim_005f0_reused = false;
    try {
      _jspx_th_f_005fverbatim_005f0.setPageContext(_jspx_page_context);
      _jspx_th_f_005fverbatim_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_005fsubview_005f0);
      int _jspx_eval_f_005fverbatim_005f0 = _jspx_th_f_005fverbatim_005f0.doStartTag();
      if (_jspx_eval_f_005fverbatim_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_f_005fverbatim_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_f_005fverbatim_005f0);
        }
        do {
          out.write("<table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"height: 69px\" id=\"form1:headtable1\">");
          out.write("<tbody>");
          out.write("<tr>");
          out.write("<td background=\"./resources/headbgleft.jpg\" height=\"69px\" width=\"40%\" valign=\"bottom\" align=\"left\">");
          out.write("<p>");
          out.write(" \n");
          out.write("                                ");
          out.write("<a style=\"font-family:verdana; color: #3277ba\" target=\"_blank\" href=\"http://www.yawlfoundation.org/\">");
          out.write("\n");
          out.write("                                    www.yawlfoundation.org\n");
          out.write("                                ");
          out.write("</a>");
          out.write("</p>");
          out.write("</td>");
          out.write("<td width=\"409px\" height=\"69px\" align=\"center\">");
          out.write("<img src=\"./resources/newYAWL.jpg\" border=\"0\" alt=\"YAWL 2.3\" width=\"409px\" height=\"69px\" id=\"form1:headImage1\"/>");
          out.write("</td>");
          out.write("<td background=\"./resources/headbgright.jpg\" height=\"69px\" valign=\"bottom\" align=\"right\" width=\"40%\">");
          out.write("<p style=\"font-family:verdana; color: #97cbfd\">");
          out.write("<i>");
          out.write("Leading the World in Process Innovation");
          out.write("</i>");
          out.write("\n");
          out.write("                                   \n");
          out.write("                            ");
          out.write("</p>");
          out.write("</td>");
          out.write("</tr>");
          out.write("</tbody>");
          out.write("</table>");
          int evalDoAfterBody = _jspx_th_f_005fverbatim_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_f_005fverbatim_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_f_005fverbatim_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ff_005fverbatim.reuse(_jspx_th_f_005fverbatim_005f0);
      _jspx_th_f_005fverbatim_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_f_005fverbatim_005f0, _jsp_getInstanceManager(), _jspx_th_f_005fverbatim_005f0_reused);
    }
    return false;
  }
}
