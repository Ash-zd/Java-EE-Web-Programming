package Servlet;

import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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
        Cookie cookie1 = new Cookie("login_name", "zhangsan");
        Cookie cookie2 = new Cookie("login_password", "123");
        Cookie cookie3 = new Cookie("login_sex", "male");
        cookie1.setMaxAge(60*60);
        cookie2.setMaxAge(60*60);
        cookie3.setMaxAge(60*60);

        response.addCookie(cookie1);
        response.addCookie(cookie2);
        response.addCookie(cookie3);

        Cookie[] cookies = request.getCookies();
        PrintWriter servletOut = response.getWriter();

        if (cookies == null) {
            servletOut.println("none any Cookie");
        } else {
            for (int i = 0; i < cookies.length; i++) {
                servletOut.println(cookies[i].getName() + "=" + cookies[i].getValue() + "</br>");
            }
        }
    }
}
