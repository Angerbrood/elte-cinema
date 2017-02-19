package hu.elte.cinema.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class RootController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getIndex() {
        return new ModelAndView("index");
    }
    @RequestMapping(value = "/newmovie", method = RequestMethod.GET)
    public ModelAndView getNewMovie() {
        return new ModelAndView("newmovie");
    }
    @RequestMapping(value = "/newscreening", method = RequestMethod.GET)
    public ModelAndView getNewScreeing() {
        return new ModelAndView("newscreening");
    }
    @RequestMapping(value = "/newreservation", method = RequestMethod.GET)
    public ModelAndView getNewReservation() {
        return new ModelAndView("newreservation");
    }
    @RequestMapping(value = "/modifymovie", method = RequestMethod.GET)
    public ModelAndView getModifyMovie() {
        return new ModelAndView("modifymovie");
    }
    @RequestMapping(value = "/modifyscreening", method = RequestMethod.GET)
    public ModelAndView getModifyScreening() {
        return new ModelAndView("modifyscreening");
    }
    @RequestMapping(value = "/modifyreservation", method = RequestMethod.GET)
    public ModelAndView getModifyReservation() {
        return new ModelAndView("modifyreservation");
    }
}
