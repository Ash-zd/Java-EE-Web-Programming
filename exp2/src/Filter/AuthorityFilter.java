package Filter;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "AuthorityFilter")
public class AuthorityFilter implements Filter {
    private FilterConfig config;

    public void init(FilterConfig config) throws ServletException {
        this.config = config;
    }

    public void destroy() {
        this.config = null;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws ServletException, IOException {
        String encoding = config.getInitParameter("encoding");
        request.setCharacterEncoding(encoding);
        HttpServletRequest requ = (HttpServletRequest)request;
        HttpSession session = requ.getSession(true);

        String requestPath = requ.getServletPath();

        if (session.getAttribute("user") == null &&
            !requestPath.endsWith("login.jsp") &&
            !requestPath.endsWith("LoginServlet")) {
            ((HttpServletResponse) response).sendRedirect("login.jsp");
            return;
        } else {
            chain.doFilter(request, response);
        }
    }
}
