package demo.test;

import org.databene.contiperf.PerfTest;
import org.databene.contiperf.Required;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.Rule;
import org.junit.Test;

@PerfTest(invocations = 500, threads = 50)
@Required(max = 1200, average = 250, totalTime = 60000)
public class ContiPerfTest {
    @Rule
    public ContiPerfRule rule = new ContiPerfRule();

    @Test
    public void test1() throws Exception {
        Thread.sleep(100);
        System.out.println(System.currentTimeMillis());
    }
}
