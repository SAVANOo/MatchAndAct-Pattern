package com.matchandactpattern.ruleengine;

public abstract class Rule {
    public final void process(Context context) {
        if (!match(context)) return;

        act(context);
    }

    protected abstract Boolean match(Context context);

    protected abstract void act(Context context);
}
