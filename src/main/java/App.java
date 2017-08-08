
import models.CD;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        post("/posts/new", (request, response) -> { //URL to make new post on POST route
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("name");
            String artist = request.queryParams("artist");
            Integer year = Integer.parseInt(request.queryParams("year"));
            Double price = Double.parseDouble(request.queryParams("price"));
            CD newCD = new CD(name, artist, year, price);
            ArrayList allCDs = CD.getAll();
            model.put("myCDs", allCDs);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());
    }
}