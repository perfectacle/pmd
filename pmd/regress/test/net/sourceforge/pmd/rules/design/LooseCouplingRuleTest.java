package test.net.sourceforge.pmd.rules.design;

import net.sourceforge.pmd.rules.design.LooseCouplingRule;
import test.net.sourceforge.pmd.rules.RuleTst;

public class LooseCouplingRuleTest extends RuleTst {
    private LooseCouplingRule rule;

    public void setUp() {
        rule = new LooseCouplingRule();
        rule.setMessage("Avoid this stuff -> ''{0}''");
    }

    public void test1() throws Throwable {
        runTestFromFile("LooseCoupling1.java", 1, rule);
    }

    public void test2() throws Throwable {
        runTestFromFile("LooseCoupling2.java", 0, rule);
    }

    public void test3() throws Throwable {
        runTestFromFile("LooseCoupling3.java", 0, rule);
    }

    public void test4() throws Throwable {
        runTestFromFile("LooseCoupling4.java", 0, rule);
    }

    public void test5() throws Throwable {
        runTestFromFile("LooseCoupling5.java", 1, rule);
    }

    public void test6() throws Throwable {
        runTestFromFile("LooseCoupling6.java", 2, rule);
    }

    public void test7() throws Throwable {
        runTestFromFile("LooseCoupling7.java", 2, rule);
    }

    public void test8() throws Throwable {
        runTestFromFile("LooseCoupling8.java", 1, rule);
    }

    public void testVector() throws Throwable {
        runTestFromFile("LooseCoupling9.java", 1, rule);
    }
}
