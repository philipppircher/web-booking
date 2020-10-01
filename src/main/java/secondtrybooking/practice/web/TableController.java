package secondtrybooking.practice.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import secondtrybooking.practice.model.Table;

@Controller
public class TableController {

    @GetMapping("/table")
    public String tableForm(Model model) {
        Table table = new Table();
        model.addAttribute("table", table);
        //return "table";
        return "table";
    }

    @PostMapping("/table")
    public String tableSubmit(@ModelAttribute Table table){
        return "result";
    }

    /*
    public String tableSubmit(@ModelAttribute Table table, Model model) {
        model.addAttribute("table", table);
        return "result";
    }
    */
}
