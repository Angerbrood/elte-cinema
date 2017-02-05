package hu.elte.cinema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RootController {
    @RequestMapping(value = "/")
        public ModelAndView getIndex() {
        return new ModelAndView("index");
    }
}
