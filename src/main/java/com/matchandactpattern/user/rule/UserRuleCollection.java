package com.matchandactpattern.user.rule;

import com.matchandactpattern.ruleengine.Context;
import com.matchandactpattern.ruleengine.Rule;

public class UserRuleCollection {
    public static Rule vip = new Rule() {
        @Override
        public Boolean match(Context context) {
            return Boolean.TRUE.equals(context.get("vip"));
        }

        @Override
        public void act(Context context) {
            System.out.println("Concedendo bônus vip");
        }
    };

    public static Rule firstLogin = new Rule() {
        @Override
        public Boolean match(Context context) {
            return Boolean.TRUE.equals(context.get("firstLogin"));
        }

        @Override
        public void act(Context context) {
            System.out.println("Ofertando produtos de primeiro login");
        }
    };
}
