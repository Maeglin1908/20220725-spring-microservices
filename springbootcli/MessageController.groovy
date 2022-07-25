@Controller
@Grab('spring-boot-starter-freemarker')

class MessageController{

    @RequestMapping("/msg/{message}")
    String getMessage(Model model, @PathVariable("message") String message) {
        return message;
    }

}
