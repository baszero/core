package org.jboss.webbeans.servlet;

import javax.context.RequestScoped;
import javax.inject.Produces;
import javax.servlet.http.HttpSession;

import org.jboss.webbeans.WebBeans;

@RequestScoped
@WebBeans
public class HttpSessionManager
{
   private HttpSession session;

   public void setSession(HttpSession session)
   {
      this.session = session;
   }

   @Produces
   @RequestScoped
   @WebBeans
   HttpSession produceSession()
   {
      return session;
   }

}