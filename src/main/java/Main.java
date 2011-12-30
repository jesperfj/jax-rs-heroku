
import java.io.IOException;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import com.sun.jersey.spi.container.servlet.ServletContainer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        Server server = new Server(Integer.valueOf(System.getenv("PORT")));
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);
        ServletHolder h = new ServletHolder(new ServletContainer());
        h.setInitParameter("com.sun.jersey.config.property.packages", "resources");
        context.addServlet(h, "/*");
        try {
            server.start();
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
}
}
