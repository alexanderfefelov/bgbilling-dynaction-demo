package com.github.alexanderfefelov.bgbilling.dynaction.demo;

import bitel.billing.server.ActionBase;
import org.w3c.dom.Element;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MickeyMouse extends ActionBase {

    @Override
    public void doAction() throws Exception {
        Element mickeyMouse = createElement(rootNode, ROOT_NODE_NAME);
        mickeyMouse.setAttribute(ATTRIBUTE_SOURCE_NAME, ATTRIBUTE_SOURCE_VALUE);
        for (Map.Entry<String, String> entry : DATA.entrySet()) {
            String k = entry.getKey().toString();
            String v = entry.getValue().toString();
            addListItem(mickeyMouse, k, v);
        }
    }

    private static final String ROOT_NODE_NAME = "mickeyMouse";
    public static final String ATTRIBUTE_SOURCE_NAME = "source";
    public static final String ATTRIBUTE_SOURCE_VALUE = "https://disneydiary.com/2018/09/how-to-say-mickey-mouse-in-27-different-languages/";
    private final static Map<String, String> DATA = Collections.unmodifiableMap(new HashMap<String, String>() {{
        put("Arabic", "Mickey");
        put("Bulgarian", "Miki Maus");
        put("Chinese", "Mi Lao Shu");
        put("Czech", "Mickey Mouse");
        put("Danish", "Mickey Mouse");
        put("Dutch", "Mickey Mouse");
        put("Estonian", "Mikki Hiir");
        put("Faroese", "Mikkjal Mus");
        put("Finish", "Mikki Hiiri");
        put("Flemish", "Mickey Mouse");
        put("French", "Mickey");
        put("German", "Micky Maus");
        put("Greek", "Mikki Maous");
        put("Hungarian", "Miki Egér");
        put("Icelandic", "Mikki Mús");
        put("Indonesian", "Miki Tikus");
        put("Italian", "Topolino");
        put("Japanese", "Mikkīmausu");
        put("Norwegian", "Mikke Mus");
        put("Polish", "Myszka Mikey");
        put("Portuguese", "Mickey Mouse");
        put("Russian", "Mikki Maus");
        put("Serbo-Croatian", "Miki Maus");
        put("Slovak", "Mysiak Mickey");
        put("Spanish", "Mickey Mouse");
        put("Spanish in Spain", "El Ratón Mickey");
        put("Swedish", "Musse Pigg");
        put("Turkish", "Miki");
    }});

}
