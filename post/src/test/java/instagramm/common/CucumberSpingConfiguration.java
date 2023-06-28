package instagramm.common;

import instagramm.PostApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { PostApplication.class })
public class CucumberSpingConfiguration {}
