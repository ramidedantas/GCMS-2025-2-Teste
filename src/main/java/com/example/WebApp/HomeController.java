package com.example.WebApp; 
 
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody; 
 
@Controller 
public class HomeController { 
 
  @RequestMapping("/") 
  public @ResponseBody String greeting() { 
    return "Hello, World!!!!!!!!!!!!!!!!!"; // teste 3
  }
  
  @RequestMapping("/ramide") 
  public @ResponseBody String greetingRamide() {
    return "Hello, Ramide!!!!!!";
  } 
  
  @RequestMapping("/rasd") 
  public @ResponseBody String greetingRasd() {
    return "Hello, Rasd!!!!!!";
  }
  
  @RequestMapping("/hotfix") 
  public @ResponseBody String greetingHotfix() {
    return "Hello, Hotfix!";
  }  
  
  @RequestMapping("/conflict") 
  public @ResponseBody String greetingConflit() {
    return "Hello, Conflict?";
  } 
  
  @RequestMapping("/rasd_branch") 
  public @ResponseBody String greetingRasdBranch() {
    return "Hello, RASD Branch?";
  } 

  @RequestMapping("/rasd_fork") 
  public @ResponseBody String greetingRasdFork() {
    return "Hello, RASD Fork";
  } 

}  