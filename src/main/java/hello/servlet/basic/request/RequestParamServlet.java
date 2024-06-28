package hello.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

/**
 * 1. 파라미터 전송 기능
 * http://localhost:8080/request-param?username=kim&age=20
 */
@WebServlet(name = "RequestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //전체 파라미터 key값 가져오기
        System.out.println("[전체 파라미터 조회] - start");

        request.getParameterNames().asIterator()
                .forEachRemaining(
                        paramNames -> System.out.println(paramNames + ": " + request.getParameter(paramNames))
                );
        
        System.out.println("[전체 파라미터 조회] - end");
        System.out.println();

        System.out.println("[단일 파라미터 조회] - start");
        String username = request.getParameter("username");
        String age = request.getParameter("age");

        System.out.println("username = " + username);
        System.out.println("age = " + age);
        System.out.println("[단일 파라미터 조회] - end");

        System.out.println("이름이 같은(key값이 같은) 복수 파라미터 조회할 경우");
        //ex) http://localhost:8080/request-param?username=kim&age=20&username=kim22
        String[] usernames = request.getParameterValues("username");

        for (String name : usernames) {
            System.out.println("name = " + name);
        }

        response.setCharacterEncoding("utf-8");
        response.setContentType("text/plain");
        response.getWriter().write("200 OK");
    }
}
