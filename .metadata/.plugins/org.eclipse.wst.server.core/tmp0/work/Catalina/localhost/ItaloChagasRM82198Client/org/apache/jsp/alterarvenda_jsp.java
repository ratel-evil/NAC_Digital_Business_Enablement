/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.24
 * Generated at: 2020-05-31 23:20:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class alterarvenda_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/bootstrap.jsp", Long.valueOf(1590802173786L));
    _jspx_dependants.put("/navlink.jsp", Long.valueOf(1590918154774L));
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<!-- Required meta tags -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap-grid.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap-reboot.css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("<title>Alterar Produtos</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\tdata-target=\"#navbarNavAltMarkup\" aria-controls=\"navbarNavAltMarkup\"\r\n");
      out.write("\t\t\taria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"navbarNavAltMarkup\">\r\n");
      out.write("\t\t\t<div class=\"navbar-nav\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t    <a class=\"nav-item nav-link\" href=\"index.jsp\">Realizar vendas</a> \r\n");
      out.write("\t\t\t\t<a class=\"nav-item nav-link\" href=\"alterarvenda.jsp\">Alterar Vendas</a> \r\n");
      out.write("\t\t\t\t<a class=\"nav-item nav-link\" href=\"./listar\">Visualizar Vendas</a>\r\n");
      out.write("\t\t\t\t<a class=\"nav-item nav-link\" href=\"excluirvenda.jsp\">Excluir Vendas</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<h2>Alterar venda</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- FORM DE CADASTRO  -->\r\n");
      out.write("\t\t\t\t<form name=\"form\" action=\"atualizar\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-row\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label>Código</label> \r\n");
      out.write("\t\t\t\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\t\t\t\t class=\"form-control\" \r\n");
      out.write("\t\t\t\t\t\t\t\t placeholder=\"Insira o código do produto\" \r\n");
      out.write("\t\t\t\t\t\t\t\t type=\"number\" \r\n");
      out.write("\t\t\t\t\t\t\t\t name=\"id\"\r\n");
      out.write("\t\t\t\t\t\t\t\t id=\"form_name\" \r\n");
      out.write("\t\t\t\t\t\t\t\t required \r\n");
      out.write("\t\t\t\t\t\t\t\t onblur=\"valida('id');\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label>Nome do cliente</label> \r\n");
      out.write("\t\t\t\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\t\t\t\t  class=\"form-control\" \r\n");
      out.write("\t\t\t\t\t\t\t\t  placeholder=\"Insira o nome do cliente\" \r\n");
      out.write("\t\t\t\t\t\t\t\t  name=\"nome\"\r\n");
      out.write("\t\t\t\t\t\t\t\t  id=\"form_name\" \r\n");
      out.write("\t\t\t\t\t\t\t\t  required \r\n");
      out.write("\t\t\t\t\t\t\t\t  autofocus\r\n");
      out.write("\t\t\t\t\t\t\t\t  onblur=\"valida('nome');\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label>Preço</label> \r\n");
      out.write("\t\t\t\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\t\t\t\t class=\"form-control\" \r\n");
      out.write("\t\t\t\t\t\t\t\t placeholder=\"Insira o preço do produto\" \r\n");
      out.write("\t\t\t\t\t\t\t\t type=\"number\" \r\n");
      out.write("\t\t\t\t\t\t\t\t name=\"preco\"\r\n");
      out.write("\t\t\t\t\t\t\t\t id=\"form_name\" \r\n");
      out.write("\t\t\t\t\t\t\t\t required \r\n");
      out.write("\t\t\t\t\t\t\t\t onblur=\"valida('preco');\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label>Descrição</label> \r\n");
      out.write("\t\t\t\t\t\t\t<input \r\n");
      out.write("\t\t\t\t\t\t\t       id=\"desc\" \r\n");
      out.write("\t\t\t\t\t\t\t       required\r\n");
      out.write("\t\t\t\t\t\t\t\t   name=\"desc\" \r\n");
      out.write("\t\t\t\t\t\t\t\t   type=\"text\" \r\n");
      out.write("\t\t\t\t\t\t\t\t   onblur=\"valida('desc');\" \r\n");
      out.write("\t\t\t\t\t\t\t\t   placeholder=\"Insira a descrição do produto\" \r\n");
      out.write("\t\t\t\t\t\t\t\t   class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t   >\r\n");
      out.write("\t\t\t\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label>Data</label> \r\n");
      out.write("\t\t\t\t\t\t\t<input \r\n");
      out.write("\t\t\t\t\t\t\t       type=\"date\" \r\n");
      out.write("\t\t\t\t\t\t\t       class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t   placeholder=\"Insira data de entrada\" \r\n");
      out.write("\t\t\t\t\t\t\t\t   name=\"dataEntrada\" \r\n");
      out.write("\t\t\t\t\t\t\t\t   id=\"dtEntrada\" \r\n");
      out.write("\t\t\t\t\t\t\t\t   required\r\n");
      out.write("\t\t\t\t\t\t\t\t   onblur=\"valida('date');\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"custom-control custom-checkbox\">\r\n");
      out.write("\t  \t\t\t\t\t\t\t<input \r\n");
      out.write("\t  \t\t\t\t\t\t\t     id=\"customCheck1\"\r\n");
      out.write("\t  \t\t\t\t\t\t\t     type=\"checkbox\" \r\n");
      out.write("\r\n");
      out.write("\t  \t\t\t\t\t\t\t     class=\"custom-control-input\"\r\n");
      out.write("\t  \t\t\t\t\t\t\t     name=\"status\"\r\n");
      out.write("\t  \t\t\t\t\t\t\t     >\r\n");
      out.write("\t  \t\t\t\t\t\t\t<label \r\n");
      out.write("\t  \t\t\t\t\t\t\t     class=\"custom-control-label\" \r\n");
      out.write("\t  \t\t\t\t\t\t\t     for=\"customCheck1\">\r\n");
      out.write("\t  \t\t\t\t\t\t\t     Venda finalizada?\r\n");
      out.write("\t  \t\t\t\t\t\t\t </label>\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<button \r\n");
      out.write("\t\t\t\t\t\t\t      id=\"btn\" \r\n");
      out.write("\t\t\t\t\t\t\t      class=\"btn btn-primary\" \r\n");
      out.write("\t\t\t\t\t\t\t      name=\"tarefa\"\r\n");
      out.write("\t\t\t\t\t\t\t\t  value=\"Cadastrar\">Salvar Alteração\r\n");
      out.write("\t\t\t\t\t\t   </button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!------------------------------------------------------------------------------------------------------------------------------------------------------->\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/validaCampo.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("<footer><p>Alterar vendas</p></footer>\r\n");
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
