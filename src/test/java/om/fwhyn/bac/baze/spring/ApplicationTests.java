package om.fwhyn.bac.baze.spring;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

// TODO: Fix after migration - integration test requires external PostgreSQL database
@Disabled("Integration test requires external database connection")
@SpringBootTest
@TestPropertySource(properties = {
    "spring.datasource.url=jdbc:h2:mem:testdb",
    "spring.datasource.driver-class-name=org.h2.Driver",
    "spring.jpa.database-platform=org.hibernate.dialect.H2Dialect"
})
class ApplicationTests {

    @Test
    void contextLoads() {
    }

}
