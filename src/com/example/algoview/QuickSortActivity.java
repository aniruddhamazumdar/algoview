package com.example.algoview;

import com.example.algoview.common.ArrayItem;
import com.example.algoview.common.Constants;
import com.example.algoview.common.Utils;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.Menu;
import android.widget.ImageView;

public class QuickSortActivity extends BaseActivity {

	private ImageView img_draw_area;
	private ArrayItem[] sortItems;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quick_sort);

		initViews();
		populateItems();
	}

	private void initViews() {
		img_draw_area = (ImageView) findViewById(R.id.img_draw_area);
	}

	private void populateItems() {
		sortItems = Utils.getArrayItems();

		Bitmap bitmap = Bitmap.createBitmap((int) getWindowManager()
				.getDefaultDisplay().getWidth(), (int) getWindowManager()
				.getDefaultDisplay().getHeight(), Bitmap.Config.ARGB_8888);
		Canvas canvas = new Canvas(bitmap);
		img_draw_area.setImageBitmap(bitmap);

		Paint paint = new Paint();
		for (int i = 0; i < sortItems.length; i++) {
			paint.setColor(Color.BLACK);
			paint.setStyle(Paint.Style.FILL_AND_STROKE);
			paint.setStrokeWidth(10);
			float leftx = 10;
			float topy = Constants.ITEM_MARGIN + (i + 1) * 10;
			float rightx = sortItems[i].getWidth();
			float bottomy = topy + 10;
			canvas.drawRect(leftx, topy, rightx, bottomy, paint);
		}
	}
}
