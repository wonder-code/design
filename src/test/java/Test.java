import com.zl.design.decorator.abstra.ConcreteComponent;
import com.zl.design.decorator.decorator.Decorator;
import com.zl.design.decorator.intef.Component;
import com.zl.design.strategy.context.Context;
import com.zl.design.strategy.intef.Strategy;
import com.zl.design.strategy.service.StrategyA;
import com.zl.design.strategy.service.StrategyB;

public class Test {
    @org.junit.Test
    public  void test() {
        StrategyA strategyA = new StrategyA();
        Context context = new Context(strategyA);
        context.showMethod();
        System.out.println("——————————");
        StrategyB strategyB = new StrategyB();
        Context context1 = new Context(strategyB);
        context1.showMethod();
    }
}
