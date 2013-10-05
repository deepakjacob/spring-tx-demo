package spring.tx.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Programmatic API usage tests.
 *
 * @author Deepak Jacob
 */
@ContextConfiguration("/app-ctx-declarative.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTxDeclarativeTest {

    @Autowired
    private BookShop bookShop;

    @Test
    public void testProgrammaticTxMgmt() {
        assertNotNull(bookShop);
        bookShop.purchase("1", "Deepak");

    }
}
