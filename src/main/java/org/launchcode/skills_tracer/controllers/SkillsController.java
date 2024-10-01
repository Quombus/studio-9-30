package org.launchcode.skills_tracer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String index() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list</h2>" +
                "<ol> <li>Java</li> <li>JavaScript</li> <li>Python</li> </ol>"+
                "</body>" +
                "</html>";
    }

//    @GetMapping("form")
//    public String skillForm() {
//        return "<html>" +
//                "<body>" +
//                "<form method = 'POST' action = '/form'>" +
//                "<label> Name" + "</label>" + "<input type = 'text' name = 'name'/>" +
//                "<label> My Favorite Language" + "</label>" +
//                "<select name = 'language1' id='language1'>" +
//                "<option value = 'Java'> Java " + "</option>" +
//                "<option value = 'JavaScript'> JavaScript" + "</option>" +
//                "<option value = 'Python'> Python" + "</option>" +
//                "</select>" +
//                "<select name = 'language2' id='language2'>" +
//                "<option value = 'Java'> Java " + "</option>" +
//                "<option value = 'JavaScript'> JavaScript" + "</option>" +
//                "<option value = 'Python'> Python" + "</option>" +
//                "</select>" +
//                "<select name = 'language3' id='language3'>" +
//                "<option value = 'Java'> Java " + "</option>" +
//                "<option value = 'JavaScript'> JavaScript" + "</option>" +
//                "<option value = 'Python'> Python" + "</option>" +
//                "</select>" +
//                " <input type = 'submit' value = 'submit'/>" +
//                "</form>" +
//                "</body>" +
//                "</html>";
//    }

    @GetMapping("form")
    public String skillForm(){
        String html =
                "<html>" +
                        "<head>" +
                        "<style>" +
                        "body{width:70vw;margin:auto;}" +
                        "form{display:flex;flex-wrap:wrap;}" +
                        "div{width:100%;margin:1rem 0;}" +
                        "select{width:100%;}" +
                        "label{width:100%;margin-top:0.5rem;}" +
                        "</style>" +
                        "</head>" +
                        "<body>" +
                        "<form method = 'post' action = '/form'>" +
                        "<label for='name'>Name:</label>" +
                        "<input id='name' type = 'text' name = 'name' />" +
                        "<div>" +
                        "<label for='first'>My favorite language:</label>" +
                        "<select id='first' name = 'first'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='C++'>C++</option>" +
                        "<option value='Go'>Go</option>" +
                        "</select>" +
                        "<label for='second'>My second favorite language:</label>" +
                        "<select name = 'second'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='C++'>C++</option>" +
                        "<option value='Go'>Go</option>" +
                        "</select>" +
                        "<label for='third'>My third favorite language:</label>" +
                        "<select name = 'third'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='C++'>C++</option>" +
                        "<option value='Go'>Go</option>" +
                        "</select>" +
                        "</div>" +
                        "<input type = 'submit' value = 'Submit' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @PostMapping("form")
    public String formResults(@RequestParam String name, @RequestParam String first, @RequestParam String second, @RequestParam String third ) {
        return "<html>" +
                "<body>" +
                "<h1>" +
                name +
                "</h1>" +
                "<ol> <li>"+first+"</li> <li>"+second+"</li> <li>"+third+"</li> </ol>"+
                "</body>" +
                "</html>";
    }
}
