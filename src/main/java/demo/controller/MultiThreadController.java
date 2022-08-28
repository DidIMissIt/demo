package demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/multi")
public class MultiThreadController {
//    //引入 ContiPerf 进行性能测试
//    @Rule
//    public ContiPerfRule rule = new ContiPerfRule();


//    //10个线程 执行100次
//    @Test
//    @PerfTest(invocations = 100,threads = 10)
//    public void test(){
//        System.out.println("demo");
//    }


    @GetMapping("/demo")
    public String getDemo() {
        return "demo";
    }
}
