//all of your "web page, post get blah blah" goes here

import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/tamagotchi", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/tamagotchi.vtl");
      Tamagotchi myPet = request.session().attribute("myPet");
      String namePet = request.queryParams("namePet");
      if (myPet == null){
        myPet = new Tamagotchi(namePet);
        request.session().attribute("myPet", myPet);
      }

      String petStatus = myPet.petStatus();

      model.put("namePet", namePet);
      model.put("petStatus", petStatus);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
