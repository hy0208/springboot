package main.java.com.ccnu;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: huangyong
 * @Date: 2019/3/14 17:16
 * @Description: TODO
 */

@Controller
public class Hello  {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
        String hello = request.getParameter("hello");
        System.out.println("HelloController: " + hello);
        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("hello", hello);
        return mav;
    }
}