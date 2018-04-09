package com.aranzazu.appnoites15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Programa extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        this.setTheme(R.style.TemaPersonalizado);
		setContentView(R.layout.programa);

	}
	
	
	public void sendMessage0(View view) {
		Intent intent=new Intent().setClass(this, Xaneiro.class);
	startActivity(intent);
	}
	
		public void sendMessage1(View view) {
			Intent intent=new Intent().setClass(this, Febrero.class);
		startActivity(intent);
			
	
		}
		public void sendMessage2(View view) {
			Intent intent=new Intent().setClass(this, Marzo.class);
			startActivity(intent);
	
		}

		public void sendMessage3(View view) {
			Intent intent=new Intent().setClass(this, Abril.class);
			startActivity(intent);
	
		}



}
