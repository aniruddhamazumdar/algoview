package com.example.algoview;

import java.util.ArrayList;
import java.util.List;

import com.example.algoview.common.Logger;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HomeActivity extends BaseActivity {

	private ListView lvAlgoList;
	private ArrayAdapter<String> algoListAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

		initViews();
		initAdapter();
	}

	private void initViews() {
		lvAlgoList = (ListView) findViewById(R.id.lv_algo_list);
	}

	private void initAdapter() {
		final String[] algoArray = new String[] { "Quick Sort", "Heap Sort",
				"Radix Sort" };
		algoListAdapter = new ArrayAdapter<String>(HomeActivity.this,
				android.R.layout.simple_list_item_1, algoArray);

		lvAlgoList.setAdapter(algoListAdapter);
		algoListAdapter.notifyDataSetChanged();

		lvAlgoList
				.setOnItemClickListener(new AdapterView.OnItemClickListener() {

					@Override
					public void onItemClick(AdapterView<?> arg0, View arg1,
							int position, long arg3) {
						Logger.log("Item Clicked");
						launchActivity(algoArray[position]);
					}

				});
	}

	private void launchActivity(String name) {
		try {
			String activityName = name.replace(" ", "") + "Activity";
			Logger.log(activityName);
			Intent launchIntent = new Intent(HomeActivity.this,
					Class.forName(activityName));
			startActivity(launchIntent);
		} catch (ClassNotFoundException e) {
			Logger.log(e.getMessage());
		}
	}
}
