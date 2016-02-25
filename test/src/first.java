

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class first
 */
@WebServlet("/first")
public class first extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public first() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter Obj=response.getWriter();
		
		Obj.println("SERVER DATA FROM HTTP SERVLET");
		Obj.println("\nPrinwriter to print data response.getwriter()");
		Obj.println("Buffer Size :"+response.getBufferSize());
		Obj.println("Character Encoding :"+response.getCharacterEncoding());
		Obj.println("Content Type :"+response.getContentType());
		Obj.println("Header"+response.getHeader("127.0.0.1"));
		Obj.println("Retun HTTP  Status :"+response.getStatus());
		Obj.println("Servlet Name :"+response.getClass());
		Obj.println("Header Name :"+response.getHeaderNames());
		Obj.println("Get Local :"+response.getLocale());
		//Obj.println("\nOutput Stream :"+response.getOutputStream());
		Obj.println("Gatway Time Out :"+response.SC_GATEWAY_TIMEOUT);
		
		Obj.println("\nCLIENT DATA FROM HTTP SERVLET");
		Obj.println("AuthType :"+request.getAuthType());
		Obj.println("Client Character Encoding :"+request.getCharacterEncoding());
		Obj.println("Content Length :"+request.getContentLength());
		Obj.println("Content Type :"+request.getContentType());
		Obj.println("Context Path :"+request.getContextPath());
		Obj.println("User Cookies :"+request.getCookies());
		Obj.println("Client IP :"+request.getLocalAddr());
		Obj.println("Client Name :"+request.getLocalName());
		Obj.println("Client Port :"+request.getLocalPort());
		Obj.println("Method Invoked :"+request.getMethod());
		Obj.println("Path :"+request.getPathInfo());
		Obj.println("Dispatcher Type :"+request.getDispatcherType());
		Obj.println("Translated Path :"+request.getPathTranslated());
		Obj.println("Protocol :"+request.getProtocol());
		Obj.println("Query String :"+request.getQueryString());
		Obj.println("Client IP:"+request.getRemoteAddr());
		Obj.println("Client Name :"+request.getRemoteHost());
		Obj.println("Client Port :"+request.getRemotePort());
		Obj.println("Client Name :"+request.getRemoteUser());
		Obj.println("Client Session ID :"+request.getRequestedSessionId());
		Obj.println("URI :"+request.getRequestURI());
		Obj.println("URL :"+request.getRequestURL());
		Obj.println("Reader :"+request.getReader());
		Obj.println("Scheme Protocol :"+request.getScheme());
		Obj.println("Server Name :"+request.getServerName());
		Obj.println("Server Port :"+request.getServerPort());
		Obj.println("Server Ip :"+request.getServletPath());
		Obj.println("Server Context :"+request.getServletContext());
		Obj.println("Digest Auth :"+request.DIGEST_AUTH);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
