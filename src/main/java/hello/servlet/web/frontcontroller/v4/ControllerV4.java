package hello.servlet.web.frontcontroller.v4;

import hello.servlet.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV4 {

    /*
    V3는 서블릿 종속성을 제거하고, 뷰 경로 중복을 제거한 설계가 잘 되어있는 컨트롤러이다.
    그러나 개발자가 매번 ModelView를 반환하는 부분이 번거롭기에
    V4에서는 이를 단순하고 편리하게 사용할 수 있도록 개선한다.
        - 컨트롤러가 ModelView를 반환하지 않고 viewName만 반환하도록 한다
            How? FrontController에서 Model을 생성해서 사용
     */

    /**
     * @param paramMap
     * @param model
     * @return viewName
     */
    String process(Map<String, String> paramMap,Map<String, Object> model);
}
