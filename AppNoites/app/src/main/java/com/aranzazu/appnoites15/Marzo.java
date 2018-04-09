package com.aranzazu.appnoites15;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Window;
import android.widget.TabHost;

public class Marzo extends TabActivity {
	
	 @Override public void onCreate(Bundle savedInstanceState) {

	        super.onCreate(savedInstanceState);
	       this.requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
         this.setTheme(R.style.TemaPersonalizado);
	     
	        setContentView(R.layout.meses);
	        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title);
	        TabHost tabhost = getTabHost();
	    	TabHost.TabSpec spec;
	    	Intent intent;
	    			
	    	Resources res =getResources(); 			
	    	String dias[]=res.getStringArray(R.array.marzo);
	    	int[] resIDs = new int[] {
	    			
	    			//CAMBIAR IMAGENES
	    			R.drawable.mar_vie6,
                    R.drawable.mar_sab7,
	    			R.drawable.mar_vie13,
	                R.drawable.mar_sab14,
	                R.drawable.mar_vie20,
	                R.drawable.mar_sab21,
                    R.drawable.mar_xov26,
	                R.drawable.mar_vie27,
	                R.drawable.mar_sab28,

	             
	            };
	    	for(int i=1;i<=dias.length;i++){
	    		intent=new Intent().setClass(this, DiasMarzo.class);
	    		intent.putExtra("variable_integer", 3);
	    		intent.putExtra("variable_integer1", i);
		    	spec =tabhost.newTabSpec("dia"+i).setIndicator("",res.getDrawable(resIDs[i-1])).setContent(intent);
		    	tabhost.addTab(spec);
	    		
	    		
	    	}
	    	

}
}