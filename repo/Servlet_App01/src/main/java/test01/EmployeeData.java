package test01;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/dis")
public class EmployeeData implements Servlet 
{

	@Override
	public void destroy() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest res, ServletResponse respo) throws ServletException, IOException 
	{
	  String empid=res.getParameter("eid");
	  String name = res.getParameter("ename");
	  String sal = res.getParameter("esalary");
	  res.getParameter("submit");
	  respo.setContentType("text/html");
	  PrintWriter p=  respo.getWriter();
	   p.println("<h1 color:red>Emp id :</h1>"+empid+"<br>");
	   p.println("<h1 color:red>Emp id :</h1>"+name+"<br>");
	   p.println("<h1 color:red>Emp id :</h1>"+sal);
	   
	}
	

}
