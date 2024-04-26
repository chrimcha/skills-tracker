package org.launchcode.skillstrackers.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class SkillsController {

    //TODO create a route with some html to display a hello message and a list of skills //goes to /8080

    @RequestMapping(value = "")
    public String skillTracker() {
        String html = "<h1>Skills Tracker</h1>" +
                "<h2>We have some skills we want to learn! Here is a list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "<li>SQL</li>" +
                "<li>html</li>" +
                "<li>JavaScript</li>" +
                "</ol>";

        return html;
    }

    //TODO create a route that hosts a form for me to enter my name and to rank my abilities //goes to /form
    @GetMapping("form")
    public String skillTrackerForm() {
        String html = "<form method='post'>" +
                "Name<br>" +
                "<input type='text' name='name'>" +
                "<br>My Favorite Language:<br>" +
                "<select name='firstChoice'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='SQL'>SQL</option>" +
                "<option value='html'>html</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "</select>" +
                "<br>My Second Favorite Language:<br>" +
                "<select name='secondChoice'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='SQL'>SQL</option>" +
                "<option value='html'>html</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "</select>" +
                "<br>My Third Favorite Language:<br>" +
                "<select name='thirdChoice'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='SQL'>SQL</option>" +
                "<option value='html'>html</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "</select><br>" +
                "<input type='submit' value='Submit!'>" +
                "</form>";

        return html;
    }


    //TODO create a route that will handle that request with my choices once I submit

    @PostMapping("form")
    public String mySkillsPage(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice) {
        String html = "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>"+firstChoice+"</li>" +
                "<li>"+secondChoice+"</li>" +
                "<li>"+thirdChoice+"</li>" +
                "</ol>";

        return html;
    }
}
