package edu.wgu.d387_sample_code.timezones;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TimeZoneConverterController {

    @GetMapping("/presentation")
    public ResponseEntity presentationMessage(){
        String message = "ANNOUNCEMENT: " +
                "We will be hosting an online, live presentation at the Landon Hotel at: " + TimeZoneConverter.getTimes();
        return new ResponseEntity(message, HttpStatus.OK);

    }
}
