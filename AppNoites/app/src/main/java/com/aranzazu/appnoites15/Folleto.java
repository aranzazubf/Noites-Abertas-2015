package com.aranzazu.appnoites15;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import android.content.res.AssetManager;
import java.io.FileOutputStream;
import 	android.os.Environment;
import java.io.IOException;
import 	android.util.Log;
public class Folleto extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.folleto);

        Button button = (Button)findViewById(R.id.buttoner);
        button.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
	 descarga();	}
});

	}

	public void descarga() {

            try{

            AssetManager assetManager = this.getAssets();
            File sdCard = Environment.getExternalStorageDirectory();
             File dir = new File (sdCard.getAbsolutePath() + "/NoitesAbertas");
            dir.mkdirs();
            File file = new File(dir, "NoitesAbertas15.pdf");
            InputStream in;
            OutputStream out;

            try
            {
                in = assetManager.open("NoitesAbertas15.pdf");
                out = new FileOutputStream(file);
                copyFile(in, out);
                in.close();
                out.flush();
                out.close();
               } catch (Exception e)
                     {
                    Log.e("tag", e.getMessage());
                     }
            Uri path = Uri.fromFile(file);
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.setDataAndType(path, "application/pdf");
            startActivity(intent);

        }
           catch (ActivityNotFoundException e) {
 	                Toast.makeText(this,
                   "Necesitas descargarte unha applicación para poder visualizar o PDF",
                  Toast.LENGTH_SHORT).show();}}

    private void copyFile(InputStream in, OutputStream out) throws IOException
    {
        byte[] buffer = new byte[1024];
        int read;
        while ((read = in.read(buffer)) != -1)
        {
            out.write(buffer, 0, read);
        }
    }

	}
