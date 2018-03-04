package info.rexis.uas;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = {RexisUserAccountServiceApplication.class})
public abstract class Oauth2Base {
    @LocalServerPort
    private String port;

    public String getFullUrl(String path) {
        if (!path.startsWith("/"))
            path = "/" + path;
        return "http://localhost:" + port + path;
    }
}
