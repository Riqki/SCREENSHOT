package com.Riqki0226.tebakgambartugas;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Selesai extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_selesai);
	}

	public void btn_klik (View v) {
		Intent panggil_class = new Intent(this, MainActivity.class);
		startActivity(panggil_class);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.selesai, menu);
		return true;
	}

}
