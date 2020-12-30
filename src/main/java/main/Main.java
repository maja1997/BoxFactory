package main;

import box.Box;
import box.BoxBuilder;
import json.JsonLoader;
import order.BoxOrderGenerator;
import org.json.simple.JSONObject;

public class Main {
    public static void main(String[] args) {
        BoxOrderGenerator.createBoxOrder();
        JSONObject boxJsonObject = JsonLoader.loadBoxOrder("boxes.json");
        Box customerOrderedBox = BoxBuilder.createBox(boxJsonObject);
        customerOrderedBox.printBox();
    }
}
