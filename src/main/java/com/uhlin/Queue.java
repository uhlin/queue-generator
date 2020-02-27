package com.uhlin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.json.JSONArray;

import com.google.gson.Gson;

public class Queue {
	private List<Patient> list;

	Queue() {
		list = new ArrayList<Patient>();

		Random rnd = new Random();
		final int upperbound = 200;
		final int lowerbound = 1;

		for (int i = 1; i < 50; i++) {
			final int nr = rnd.nextInt(upperbound-lowerbound) + lowerbound;

			list.add(new Patient(nr, i));
		}
	}

	public String getList_jsonString() {
		return (new Gson().toJson(list));
	}

	public JSONArray getList_jsonArray() {
		String s = new Gson().toJson(list);

		return (new JSONArray(s));
	}
}
