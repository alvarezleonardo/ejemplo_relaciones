package composicion;

public class WebServer {
	  private HttpListener listener;
	  private RequestProcessor processor;
	  public WebServer() {
	    this.listener = new HttpListener(80);
	    this.processor = new RequestProcessor("/www/root");
	  }
}
