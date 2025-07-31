package project.moonki.entity;

import jakarta.persistence.EntityManager;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
@Commit
class MUserTest {

    @Autowired EntityManager em;

    @Test
    public void test() {

        MUser user = new MUser("장문기");
        em.persist(user);

        assertThat(user.getId()).isNotNull();
        assertThat(user.getUsername()).isEqualTo("장문기");
    }
}