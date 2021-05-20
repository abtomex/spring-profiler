package dom.dima.learning.spring.springbootprofiler.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MySpringComponent {

    @Value("${profile.variable}")
    private String profileVar;

    @PostConstruct
    public void initMethod(){
        System.out.println(profileVar);
    }

}
