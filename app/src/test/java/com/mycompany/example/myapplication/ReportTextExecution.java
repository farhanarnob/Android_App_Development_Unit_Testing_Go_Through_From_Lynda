package com.mycompany.example.myapplication;

import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

/**
 * Created by ${farhanarnob} on ${06-Oct-16}.
 */

public class ReportTextExecution implements MethodRule {
    /**
     * @param base:   Statement, an object representing or encapsulating the
     *                unit test about to execute
     * @param method: frameworkMethod, the unit test method to be executed
     * @param target: Object, the unit test instance whose test method is
     *                to be executed; called the target
     * @return
     */
    @Override
    public Statement apply(final Statement base, FrameworkMethod method, Object target) {
        final String className = method.getMethod().getDeclaringClass().getSimpleName();
        final String methodName = method.getName();
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                System.out.println(String.format(
                        "Sending to Web service: about to execute %s's method %s", className, methodName));
                base.evaluate();
                System.out.println(String.format(
                        "Sending to Web service: done executing %s's method %s", className, methodName));
            }
        };
    }
}
