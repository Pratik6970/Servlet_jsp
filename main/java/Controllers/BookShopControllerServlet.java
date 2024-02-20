package Controllers;

import java.io.IOException;
//import java.io.ObjectInputFilter.Config;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



//xml based configuration!!!!!


public class BookShopControllerServlet extends HttpServlet{
	private Map<String, String>mappings;
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		mappings=new HashMap<String, String>();
		 Enumeration<String> initparam = config.getInitParameterNames();
		 while (initparam.hasMoreElements()) {
			String initparamName = (String) initparam.nextElement();
			String page=config.getInitParameter(initparamName);
			mappings.put(initparamName, page);
			
		}
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(req, resp);
	}
	protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String page=req.getParameter("page");
		ServletContext ctx=this.getServletContext();
		String url = mappings.getOrDefault(page, "/login.jsp");
		RequestDispatcher rd=ctx.getRequestDispatcher(url);
		rd.forward(req, resp);
	}
	
}

/*
 @annotation based configuration going request to controller
 @WebServlet("/ctl")
public class BookShopControllerServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req,resp);
	}
	protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String page=req.getParameter("page");
		ServletContext ctx=this.getServletContext();
		RequestDispatcher rd=null;
		
		if("books".equals(page))
		{
			rd=ctx.getRequestDispatcher("/books.jsp");
		}
		else if("showcart".equals(page))
		{
			rd=ctx.getRequestDispatcher("/showcart.jsp");
		}
		else if("addcart".equals(page))
		{
			rd=ctx.getRequestDispatcher("/addcart.jsp");
		}
		else if("subjectsd".equals(page))
		{
			rd=ctx.getRequestDispatcher("/subjectsd2.jsp");
		}
		else if("logout".equals(page))
		{
			rd=ctx.getRequestDispatcher("/logout.jsp");
		}
		else if("authsd".equals(page))
		{
			rd=ctx.getRequestDispatcher("/authsd.jsp");
		}
		else if("register".equals(page))
		{
			rd=ctx.getRequestDispatcher("/register.jsp");
		}
		else
		{
			rd=ctx.getRequestDispatcher("/login.jsp");	
		}
		
		rd.forward(req, resp);
	}

}

 */


