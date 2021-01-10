package com.github.alexanderfefelov.bgbilling.dynaction.demo;

import bitel.billing.server.ActionBase;

public class Calculator extends ActionBase {

    @Override
    public void doAction() throws Exception {
        Float a = getFloatParameter("a", 0);
        Float b = getFloatParameter("b", 0);
        String op = getParameter("op", "/");

        rootNode.setAttribute("a", Float.toString(a));
        rootNode.setAttribute("b", Float.toString(b));
        rootNode.setAttribute("op", op);

        switch (op) {
            case "add":
                rootNode.setAttribute("result", Float.toString(a + b));
                break;
            case "divide":
                rootNode.setAttribute("result", Float.toString(a / b));
                break;
            case "multiply":
                rootNode.setAttribute("result", Float.toString(a * b));
                break;
            case "subtract":
                rootNode.setAttribute("result", Float.toString(a - b));
                break;
            default:
                rootNode.setAttribute("status", "error");
                rootNode.setAttribute("message", "Обратитесь к хрустальному шару");
                break;
        }
    }

}
