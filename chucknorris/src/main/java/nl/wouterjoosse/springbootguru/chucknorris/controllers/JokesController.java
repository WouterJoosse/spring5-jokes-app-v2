package nl.wouterjoosse.springbootguru.chucknorris.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import nl.wouterjoosse.springbootguru.chucknorris.services.JokeService;


@Controller
public class JokesController {

    private JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping(value={"/", ""})
    public ModelAndView getIndex() {
        ModelAndView mav = new ModelAndView("index");
        mav.getModel().put("joke", jokeService.getJoke());
        return mav;
    }
}
