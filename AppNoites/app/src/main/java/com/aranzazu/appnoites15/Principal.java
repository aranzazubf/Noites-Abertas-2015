package com.aranzazu.appnoites15;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class Principal extends Activity{
	//actividad principal que pone de fondo el layout "principal" 
	 @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
         this.setTheme(R.style.TemaPersonalizado);
      this.requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
      setContentView(R.layout.principal);
      getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title);
   
   
	}

	 public void sendMessagep(View view) {
			Intent intent=new Intent().setClass(this, 	Noites.class);
			startActivity(intent);

        }

	 public void principal1(View view) {
		 Intent emailIntent = new Intent(Intent.ACTION_SEND);   
		 emailIntent.setType("plain/text");   
		 emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"xuventude@pontevedra.eu"});   
		 startActivity(Intent.createChooser(emailIntent, "Enviar mail"));


} 
	 public void principal2(View view) {
		 Intent i = new Intent(Intent.ACTION_VIEW);
		 i.setData(Uri.parse("http://www.xuventude.pontevedra.eu"));
		 startActivity(Intent.createChooser(i,"Escoga un navegador"));
		
} 
	 public void principal3(View view) {
		 Intent i = new Intent(Intent.ACTION_VIEW);
		 i.setData(Uri.parse("http://www.noitesabertas.com"));
		 startActivity(Intent.createChooser(i,"Escoga un navegador"));
		

       }



	 public void principal4(View view) {
         Intent a = new Intent(Intent.ACTION_VIEW);
         a.setData(Uri.parse("http://www.facebook.com/noitesabertas"));
         Intent choose = Intent.createChooser(a, "Accede a la aplicación");
         startActivity(choose);
     }
    public void principal5(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://www.twitter.com/noitesabertas"));
        Intent chooser=Intent.createChooser(i,"Accede a la aplicación");
        startActivity(chooser);


    }
	 @Override
	public void onBackPressed ()
	 {Intent i = new Intent(this, Grid.class);
	 startActivityForResult(i, 1);
	 }
	 @Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {

		 if (requestCode == 1) {
		
		     this.finish();

		     

		 }
}}