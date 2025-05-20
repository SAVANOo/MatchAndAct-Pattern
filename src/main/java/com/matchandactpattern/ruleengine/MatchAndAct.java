package com.matchandactpattern.ruleengine;

import java.util.ArrayList;

public class MatchAndAct {

    private ArrayList<Rule> ruleList;

    public MatchAndAct() {
        ruleList = new ArrayList<>();
    }

    public void addRule(Rule rule) {
        ruleList.add(rule);
    };

    public void run(Context context) {
        for (Rule rule : ruleList) {
            if (rule.match(context)) {
                rule.act(context);
            }
        }
    }
}
