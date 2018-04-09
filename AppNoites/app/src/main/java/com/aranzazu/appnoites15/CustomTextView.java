package com.aranzazu.appnoites15;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomTextView extends TextView {
	 
  

    public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
            super(context, attrs, defStyle);

            try {
                    init(attrs);
            } catch (Exception e) {
                    e.getStackTrace();
            }

    }

    private void init(AttributeSet attrs) throws Exception {
      
        String fuente = attrs.getAttributeValue("http://schemas.android.com/apk/res/com.aranzazu.appnoites15", "fuente");
       
        String style = attrs.getAttributeValue("http://schemas.android.com/apk/res/android", "textStyle");
                 
        Typeface font;
                 
     
        if (fuente != null) {
        	
                if (style != null && style.equals("0x1")) { // Bold
                        font = Typeface.createFromAsset(getContext().getAssets(), fuente + "_300.ttf");
            } else if (style != null && style.equals("0x2")) { // Italic
                font = Typeface.createFromAsset(getContext().getAssets(), fuente + "_500.ttf");
            } else if(style != null && style.equals("0x3")) {
                font = Typeface.createFromAsset(getContext().getAssets(), fuente + "_700.ttf");
            }
            else font=Typeface.createFromAsset(getContext().getAssets(), fuente + "_900.ttf");
                         
                if (font != null) {
                	
                        setTypeface(font);
                }
                         
        }
     
}

	public CustomTextView(Context context, AttributeSet attrs) {
            super(context, attrs);

            try {
                    init(attrs);
            } catch (Exception e) {
                   e.notifyAll();
            }

    }
}