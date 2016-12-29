package cn.javass.chapter7.web.controller.validate;

import cn.javass.chapter7.web.controller.validate.model.HardCodeMessageModel;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class MessageTestController {


    @RequestMapping("/validate/message/hardCode")
    public String hardCodeMessage(@Valid @ModelAttribute("model") HardCodeMessageModel model, Errors errors) {

        if (errors.hasErrors()) {
            return "validate/error";
        }
        return "redirect:/success";

    }


}
