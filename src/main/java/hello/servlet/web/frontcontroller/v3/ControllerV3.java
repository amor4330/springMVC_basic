package hello.servlet.web.frontcontroller.v3;

import hello.servlet.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {

    /*
    서블릿(request, response)에 대한 종속성을 제거
     */
    ModelView process(Map<String, String> paramMap);
}
