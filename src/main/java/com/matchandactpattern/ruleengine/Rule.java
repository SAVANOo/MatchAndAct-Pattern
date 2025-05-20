package com.matchandactpattern.ruleengine;

public interface Rule {

    public Boolean match(Context context);

    public void act(Context context);
}
