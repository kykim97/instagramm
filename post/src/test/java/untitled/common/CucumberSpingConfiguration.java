package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.PostApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { PostApplication.class })
public class CucumberSpingConfiguration {}
