package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // 스프링 Bean으로 자동 등록 애노테이션 기반 컨트롤러로 인식
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form")   //요청 정보를 매핑, 애너테이션 기반이기에 메서드 이름은 임의로 짓는다.
    public ModelAndView process() {
        return new ModelAndView("new-form");    //application.properties에서 viewResolver에 대한 설정 필요
    }
}
