package home.thend.springfeature.rest;

import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GreetingController {
	
	private static final Log logger = LogFactory.getLog(GreetingController.class);
	
	private static final String json_data_url = "http://localhost:8080/json";
	private static final String xml_data_url = "http://localhost:8080/xml";
	
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping("/json")
    public String json(HttpServletRequest request, HttpServletResponse response) {
        return Const.JSON_DATA;
    }
    
    @RequestMapping("/xml")
    public String xml(HttpServletRequest request, HttpServletResponse response) {
        return Const.XML_DATA;
    }
    
    @RequestMapping("/jsonAnalyze")
    public String jsonAnalyze(HttpServletRequest request, HttpServletResponse response) {
        RestTemplate restTemplate = new RestTemplate();
        NaviModel naviModel = restTemplate.getForObject(json_data_url, NaviModel.class);
        return naviModel.toString();
    }
    
    @RequestMapping("/xmlAnalyze")
    public String xmlAnalyze(HttpServletRequest request, HttpServletResponse response) {
        RestTemplate restTemplate = new RestTemplate();
        Greeting greeting = restTemplate.getForObject(xml_data_url, Greeting.class);
        return greeting.toString();
    }

}
