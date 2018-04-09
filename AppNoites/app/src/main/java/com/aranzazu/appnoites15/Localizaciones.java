package com.aranzazu.appnoites15;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.view.View;

import java.util.ArrayList;

public class Localizaciones extends android.support.v4.app.FragmentActivity {

	 	GoogleMap mapa;

	      @Override
		public void onCreate(Bundle savedInstanceState) {

	    	
	    	try{
	            super.onCreate(savedInstanceState);
	          
	            setContentView(R.layout.localizaciones);
	            Resources res=this.getResources();
	          
	             mapa = ((SupportMapFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.map)).getMap();
	             // alternarVista();
	      
	             CameraUpdate center=
	            	        CameraUpdateFactory.newLatLng(new LatLng(42.437595,
	            	        		-8.634949));
	            	    CameraUpdate zoom=CameraUpdateFactory.zoomTo(15);

	            	    mapa.moveCamera(center);
	            	    mapa.animateCamera(zoom);
	             String[] lug=res.getStringArray(R.array.Lugares);
               String[] direcciones=res.getStringArray(R.array.Direcciones);
	       	  
	            int[] draw=new int[]{
	   	    		R.drawable.pink,
	   	    		 R.drawable.purple,
	   	    		  R.drawable.green,
	   	    		R.drawable.yellow,
	   	    		R.drawable.blue,
	   	    		R.drawable.pink,
	   	    		R.drawable.purple,
	   	    		 R.drawable.red,
	   	    		R.drawable.green,
	   	    		R.drawable.blue,
	   	    		R.drawable.purple,
	   	    		R.drawable.green,
	   	    		R.drawable.pink,
                        R.drawable.purple,
                        R.drawable.green,
                        R.drawable.yellow,
                        R.drawable.blue,
                        R.drawable.pink,
	   	    	};
          
                ArrayList<LatLng> coordenadas=new ArrayList<>();
                coordenadas.add(new LatLng(42.437493,-8.635046));

                coordenadas.add(new LatLng(42.433965,-8.646367));
                coordenadas.add(new LatLng(42.433456,-8.645793));
                coordenadas.add(new LatLng(42.419498,-8.636587));
                coordenadas.add(new LatLng(42.449301,-8.640368));
                coordenadas.add(new LatLng(42.438255,-8.637644));
                coordenadas.add(new LatLng(42.436731,-8.641748));
                coordenadas.add(new LatLng(42.435573,-8.637915));
                coordenadas.add(new LatLng(42.426458,-8.645318));
                coordenadas.add(new LatLng(42.458632,-8.574674));
                coordenadas.add(new LatLng(42.434234,-8.643526));
                coordenadas.add(new LatLng(42.432184,-8.645192));
                coordenadas.add(new LatLng(42.430837,-8.643687));
                coordenadas.add(new LatLng(42.432789,-8.647456));
                coordenadas.add(new LatLng(42.440088,-8.632889));
                coordenadas.add(new LatLng(42.421023,-8.638081));
                coordenadas.add(new LatLng(42.432661,-8.646265));
                coordenadas.add(new LatLng(42.421817,-8.637304));



	            for(int i=0;i<13;i++) {
                    mostrarMarcador(coordenadas.get(i), lug[i], direcciones[i], draw[i]);
                }
	            
	    	}catch(Exception e){
	    		throw new RuntimeException(e);
	    		
	    		
	    	}
	    	
	    	

		}

		private void mostrarMarcador(LatLng coor,String lug,String dir, int draw)
		{
			
		  mapa.addMarker(new MarkerOptions()
		        .position(coor)
		        .title(lug).icon(BitmapDescriptorFactory.fromResource(draw)).snippet(dir));

		}

        public void mapa(View view) {
        Intent a = new Intent(Intent.ACTION_VIEW);
        a.setData(Uri.parse("https://www.google.com/maps/d/embed?mid=zaZLJHtS2bK8.k8VUvjIRxLaQ"));
        Intent choose = Intent.createChooser(a, "Accede a la aplicación");
       startActivity(choose);
    }
}
//CREAR METODO PARA REDIRECCIONE A GOOGLE MAPS, CREAR MAPAEN GOOGLE MAPS NUEVO
