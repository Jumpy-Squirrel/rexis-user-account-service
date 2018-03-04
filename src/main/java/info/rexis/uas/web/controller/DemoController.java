package info.rexis.uas.web.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping(value = "/demo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> demo() {
        return ResponseEntity.ok("{\"success\": true}");
    }
}
