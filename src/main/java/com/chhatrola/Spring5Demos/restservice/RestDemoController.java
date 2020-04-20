package com.chhatrola.Spring5Demos.restservice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.websocket.server.PathParam;

/**
 * Created by niv214 on 19/4/20.
 */
@RestController
@RequestMapping("greet")
public class RestDemoController {

    @GetMapping("/getGreet")
    public String getGreet(){
        return "Hello From Nirav....";
    }

    @GetMapping("/getGreetFrom/{someone}")
    public String getGreetFromSomeone(@PathVariable String someone){
        return "Hello From "+someone+"....";
    }

    @PostMapping("/createGreet")
    @ResponseStatus(HttpStatus.CREATED)
    public String createGreet(@RequestBody Greet greet){
        System.out.println(greet.getGreeting() +" from "+ greet.getGreetor());
        return "Successfully Created Greet Id : "+1L;
    }

    @GetMapping("/badGreet")
    public String badGreet(){
        throw new BadRequestException();
    }

    @GetMapping("/notFoundGreet")
    public String notFoundGreet(){
        throw new ResourceNotFoundException();

    }

    @GetMapping("/notinmood")
    public void notInMood(){
        try {
            throw new Exception();
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Not in mood to search");
        }
    }
}
