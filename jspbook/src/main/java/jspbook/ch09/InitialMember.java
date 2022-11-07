package jspbook.ch09;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class InitialMember
 *
 */
@WebListener
public class InitialMember implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public InitialMember() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub

    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	ServletContext context = sce.getServletContext();
    	ArrayList<Member> datas = new ArrayList<Member>();
    	
    	for(int i=0; i<8; i++) {
    		Member data = new Member("강호동" + i, "test" + i + "@tukorea.ac.kr");
    		datas.add(data);
    	}
    	
    	datas.add(new Member("홍길동", null));
    	datas.add(new Member("김길동", null));
    	
    	context.setAttribute("members", datas);
    	context.setAttribute("member", new Member());
    }
	
}
