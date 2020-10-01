package secondtrybooking.practice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import secondtrybooking.practice.model.Table;

@RestController
public class TableApiController {
    // Table objetk als json zurückgeben an webbrowser

    // im browser ein get request eingeben und ein table objekt als json zurückerhalten
    // URL -> localhost:8080/table
    @GetMapping("/api/table")
    public Table getTable(){
        return new Table();
    }

    @GetMapping("/api/othertable")
    public Table otherTable(){
        Table table = new Table();
        table.setPersonName("Philipp");
        table.setFrom(20);
        table.setTo(21);
        table.setNumberOfPersons(2);
        return table;
    }
}
