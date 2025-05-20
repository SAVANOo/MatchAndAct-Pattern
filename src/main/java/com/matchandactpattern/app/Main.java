package com.matchandactpattern.app;

import com.matchandactpattern.ruleengine.Context;
import com.matchandactpattern.ruleengine.MatchAndAct;
import com.matchandactpattern.user.rule.UserRuleCollection;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.set("vip", true);
        context.set("firstLogin", false);

        MatchAndAct engine = new MatchAndAct();
        engine.addRule(UserRuleCollection.vip);
        engine.addRule(UserRuleCollection.firstLogin);

        engine.run(context);
    }
}
