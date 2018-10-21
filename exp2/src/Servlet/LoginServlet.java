package Servlet;

import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletConfig config = this.getServletConfig();
        String username = request.getParameter("username");
        String password = request.getParameter("pass");
        String encoding = config.getInitParameter("encoding");
        response.setContentType("text/html;charset=" + encoding);
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>登录结果</title></head>");
        out.println("<body> 您输入的用户名是：" + username + "<br>");
        out.println("----------------------------------------------<br>");
        out.println("您输入的密码是：" + password + "</body></html>");
        out.close();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
