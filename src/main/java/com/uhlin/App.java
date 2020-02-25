package com.uhlin;

import java.io.FileWriter;

import org.json.JSONArray;
import org.json.JSONObject;

public class App {
    public static void main(String[] args) {
    	new App().go();
    }

    void go() {
    	Queue list = new Queue();
    	JSONArray array = list.getList_jsonArray();

    	System.out.println(list.getList_jsonString());
    	dumpJson(list.getList_jsonString());

    	for (int i = 0; i < array.length(); i++) {
    		JSONObject obj = array.getJSONObject(i);

    		System.out.println("nr:  " + obj.getInt("nr"));
    		System.out.println("pos: " + obj.getInt("pos"));
    		System.out.println("------------------------------");
    	}
    }

    void dumpJson(final String s) {
    	try {
    		FileWriter fw = new FileWriter("json-dump.txt");

    		fw.write(s);
    		fw.close();
    	} catch (Exception ex) {
    		System.err.println("fatal: dumpJson: " + ex.getMessage());
    		System.exit(1);
    	}
    }
}
