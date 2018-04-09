package com.aranzazu.appnoites15;


import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Window;
import android.widget.TabHost;

public class Abril extends TabActivity {
	 @Override public void onCreate(Bundle savedInstanceState) {

	        super.onCreate(savedInstanceState);
         this.setTheme(R.style.TemaPersonalizado);
	       this.requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
	       
	        setContentView(R.layout.meses);
	        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title);
	       TabHost tabhost = getTabHost();
	    	TabHost.TabSpec spec;
	    	Intent intent;
	    	Resources res =getResources();
	    	
	    	String dias[]=res.getStringArray(R.array.abril);
		    
	    	int[] resIDs = new int[] {
	    			R.drawable.abr_vie3,
	    			R.drawable.abr_sab4,
	                R.drawable.abr_vie10,
	                R.drawable.abr_sab11,
	                R.drawable.abr_vie17,
	                R.drawable.abr_sab18,
	                R.drawable.abr_vie24,
	               R.drawable.abr_sab25,
	             
	            };
	    	for(int i=1;i<=dias.length;i++){
	    		intent=new Intent().setClass(this, DiasAbril.class);
	    		intent.putExtra("variable_integer", 4);
	    		intent.putExtra("variable_integer1", i);
		    	spec =tabhost.newTabSpec("dia"+i).setIndicator("",res.getDrawable(resIDs[i-1])).setContent(intent);

		    	tabhost.addTab(spec);
	    		
	    		
	    	}
	    	
}
}