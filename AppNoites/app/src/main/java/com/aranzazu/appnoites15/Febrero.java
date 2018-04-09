package com.aranzazu.appnoites15;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Window;
import android.widget.TabHost;

public class Febrero extends TabActivity {
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
	    	 
	    	String dias[]=res.getStringArray(R.array.febreiro);
	    	int[] resIDs = new int[] {
	    			//IMAGENES

	    			R.drawable.feb_vie6,
	    			R.drawable.feb_sab7,
	    			R.drawable.feb_vie13,
	    			R.drawable.feb_vie20,
	    			R.drawable.feb_vie27,
                    R.drawable.feb_sab28

	    		
	              
	            };
	    
	    	for(int i=1;i<=dias.length;i++){
	    		intent=new Intent().setClass(this, DiasFebreiro.class);
	    		intent.putExtra("variable_integer", 2);
	    		intent.putExtra("variable_integer1", i);
		    	spec =tabhost.newTabSpec("dia"+i).setIndicator("",res.getDrawable(resIDs[i-1])).setContent(intent);
		    	tabhost.addTab(spec);
	    		
	    		
	    	}
	    	
		    	
	    	
	    
	    	
	        
	        
	        

	    }
}
