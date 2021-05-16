package com.leonelmperalta.jokes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class JokeController {
    
    @GetMapping("/newJoke")
    public String joke(Model model){
        RestTemplate restTemplate = new RestTemplate();
        Joke joke = restTemplate.getForObject("https://v2.jokeapi.dev/joke/Any?type=twopart", Joke.class);
        model.addAttribute("setup", joke.getSetup());
        model.addAttribute("delivery", joke.getDelivery());
        return "index";
    }
}
