package com.example.algoview.common;

import java.io.Console;

import android.util.Log;

import com.example.algoview.BuildConfig;

public class Logger {

	public static void log(String value) {
		if (BuildConfig.DEBUG)
			Log.d("ALGOVIEW", value);
	}

}
