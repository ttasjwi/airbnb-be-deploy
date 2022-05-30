package codesquad.airbnb.deploy.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deploy")
public class DeployCheckController {

    @Value("${my-logging.version}")
    private String version;

    @GetMapping
    public String version() {
        return String.format("Project.version : %s", version);
    }

    @GetMapping("/health")
    public String checkHealth() {
        return "healthy";
    }
}
