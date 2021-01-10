package com.github.alexanderfefelov.bgbilling.dynaction.demo;

import bitel.billing.server.ActionBase;

public class HelloWorld extends ActionBase {

    @Override
    public void doAction() throws Exception {
        setMsg("Hello, World!");
    }

}
