package testserver

import groovy.servlet.GroovyServlet
import javax.servlet.ServletConfig
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class TestServlet extends GroovyServlet {
    void init(ServletConfig config) {

    }

    void service(HttpServletRequest request, HttpServletResponse response) {
        Thread.sleep(new Random().nextInt(2000))
        response.getWriter().write('<h1>hello world</h1>')
    }
}