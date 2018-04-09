package com.aranzazu.appnoites15;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ExpandableListActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DiasMarzo extends ExpandableListActivity {

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
       /*Establecemos que al tocar la lista el color de fondo sea transaparente
        *para que podamos ver la imagen de fondo
        */
        ExpandableListView elist=this.getExpandableListView();
        //est� deprecado ver alternativa
        elist.setCacheColorHint(Color.TRANSPARENT);

        /*Cogemos los datos que traemos de la anterior actividad "Xaneiro" para indicar en que
         *día estamos
         */
        Bundle datos = this.getIntent().getExtras();
        int dia= datos.getInt("variable_integer1");

        /*Instanciamos los elementos que vamos a usar, una lista de arrays de lugares,
         *una lista de listas de arrays de actividades
         * y la lista desplegable que incluíra los elementos anteriores
         */
        ArrayList<Lugar> lugarData = new ArrayList<>();
        ArrayList<ArrayList<Actividad>> childData= new ArrayList<>();
        ListaDesplegable exampleAdapter=new ListaDesplegable(this, lugarData,childData);
        int imagen1;
        int imagen2;

        ArrayList<String[]> actividades= new ArrayList<>();
        ArrayList<String[]> Horas= new ArrayList<>();
        String[] lugar;
        /*Cogemos los recursos para poder acceder a los datos*/
        Resources res=this.getResources();
        int[] resIDs = new int[] {
                R.drawable.cero,
                R.drawable.uno,
                R.drawable.dos,
                R.drawable.tres,
                R.drawable.cuatro,
                R.drawable.cinco,
                R.drawable.seis,
                R.drawable.siete,
                R.drawable.ocho,
                R.drawable.ocho,
                R.drawable.ocho,
                0
        };

        switch (dia){
            case 1:
            /*lugares*/
                lugar=res.getStringArray(R.array.Marzo1);
            /*actividades*/
                actividades.add(res.getStringArray(R.array.am11));
                actividades.add(res.getStringArray(R.array.am12));
                actividades.add(res.getStringArray(R.array.am13));
                actividades.add(res.getStringArray(R.array.am14));
                actividades.add(res.getStringArray(R.array.am15));
                /*horas*/
                Horas.add(res.getStringArray(R.array.hm11));
                Horas.add(res.getStringArray(R.array.hm12));
                Horas.add(res.getStringArray(R.array.hm13));
                Horas.add(res.getStringArray(R.array.hm14));
                Horas.add(res.getStringArray(R.array.hm15));

                for (int i = 0; i < lugar.length; i++) {
                    lugarData.add(new Lugar(lugar[i]));
                    ArrayList<Actividad> children = new ArrayList<>();

                    for (int j = 0; j < actividades.get(i).length; j++) {
                        if((i==2)&&(j==2))imagen1=1;
                        else imagen1=11;
                        imagen2=11;

                        children.add(new Actividad((Horas.get(i)[j]),(actividades.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
                    }
                    childData.add(children);
                }

                break;
            case 2:

            /*lugares*/
                lugar=res.getStringArray(R.array.Marzo2);
            /*actividades*/
                actividades.add(res.getStringArray(R.array.am21));
                actividades.add(res.getStringArray(R.array.am22));
                actividades.add(res.getStringArray(R.array.am23));
                actividades.add(res.getStringArray(R.array.am24));
                actividades.add(res.getStringArray(R.array.am25));
                actividades.add(res.getStringArray(R.array.am26));
                actividades.add(res.getStringArray(R.array.am27));

                /*horas*/
                Horas.add(res.getStringArray(R.array.hm21));
                Horas.add(res.getStringArray(R.array.hm22));
                Horas.add(res.getStringArray(R.array.hm23));
                Horas.add(res.getStringArray(R.array.hm24));
                Horas.add(res.getStringArray(R.array.hm25));
                Horas.add(res.getStringArray(R.array.hm26));
                Horas.add(res.getStringArray(R.array.hm27));

                for (int i = 0; i < lugar.length; i++) {

                    lugarData.add(new Lugar(lugar[i]));
                    ArrayList<Actividad> children = new ArrayList<>();

                    for (int j = 0; j < actividades.get(i).length; j++) {
                        if((j==0)&&(i==0))imagen1=7;
                        else imagen1=11;
                        imagen2=11;

                        children.add(new Actividad((Horas.get(i)[j]),(actividades.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
                    }
                    childData.add(children);
                }
                break;
            case 3:

            /*lugares*/
                lugar=res.getStringArray(R.array.Marzo3);
            /*actividades*/
                actividades.add(res.getStringArray(R.array.am31));
                actividades.add(res.getStringArray(R.array.am32));
                actividades.add(res.getStringArray(R.array.am33));
                actividades.add(res.getStringArray(R.array.am34));
                actividades.add(res.getStringArray(R.array.am35));

                /*horas*/
                Horas.add(res.getStringArray(R.array.hm31));
                Horas.add(res.getStringArray(R.array.hm32));
                Horas.add(res.getStringArray(R.array.hm33));
                Horas.add(res.getStringArray(R.array.hm34));
                Horas.add(res.getStringArray(R.array.hm35));


                for (int i = 0; i < lugar.length; i++) {

                    lugarData.add(new Lugar(lugar[i]));
                    ArrayList<Actividad> children = new ArrayList<>();

                    for (int j = 0; j < actividades.get(i).length; j++) {
                        if((i==0)&&(j==0))imagen1=0;
                        else if((i==2)&&(j==1))imagen1=1;
                        else if((i==4)&&(j==0))imagen1=7;
                        else imagen1=11;
                        imagen2=11;

                        children.add(new Actividad((Horas.get(i)[j]),(actividades.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
                    }
                    childData.add(children);
                }
                break;
            case 4:

            /*lugares*/
                lugar=res.getStringArray(R.array.Marzo4);
            /*actividades*/
                actividades.add(res.getStringArray(R.array.am41));
                actividades.add(res.getStringArray(R.array.am42));
                actividades.add(res.getStringArray(R.array.am43));
                actividades.add(res.getStringArray(R.array.am44));
            /*horas*/
                Horas.add(res.getStringArray(R.array.hm41));
                Horas.add(res.getStringArray(R.array.hm42));
                Horas.add(res.getStringArray(R.array.hm43));
                Horas.add(res.getStringArray(R.array.hm44));



                for (int i = 0; i < lugar.length; i++) {

                    lugarData.add(new Lugar(lugar[i]));
                    ArrayList<Actividad> children = new ArrayList<>();

                    for (int j = 0; j < actividades.get(i).length; j++) {
                        if((i==0)&&(j==1))imagen1=0;
                        else if((i==1)&&(j==4))imagen1=8;
                        else imagen1=11;
                        imagen2=11;

                        children.add(new Actividad((Horas.get(i)[j]),(actividades.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
                    }
                    childData.add(children);
                }
                break;
            case 5:

            /*lugares*/
                lugar=res.getStringArray(R.array.Marzo5);
            /*actividades*/
                actividades.add(res.getStringArray(R.array.am51));
                actividades.add(res.getStringArray(R.array.am52));
                actividades.add(res.getStringArray(R.array.am53));
                actividades.add(res.getStringArray(R.array.am54));
                actividades.add(res.getStringArray(R.array.am55));
                actividades.add(res.getStringArray(R.array.am56));
            /*horas*/
                Horas.add(res.getStringArray(R.array.hm51));
                Horas.add(res.getStringArray(R.array.hm52));
                Horas.add(res.getStringArray(R.array.hm53));
                Horas.add(res.getStringArray(R.array.hm54));
                Horas.add(res.getStringArray(R.array.hm55));
                Horas.add(res.getStringArray(R.array.hm56));



                for (int i = 0; i < lugar.length; i++) {

                    lugarData.add(new Lugar(lugar[i]));
                    ArrayList<Actividad> children = new ArrayList<>();

                    for (int j = 0; j < actividades.get(i).length; j++) {
                        if((i==0)&&(j==1))imagen1=0;
                        else if((i==2)&&(j==0))imagen1=3;
                        else if((i==3)&&(j==1))imagen1=1;
                        else if((i==5)&&(j==0))imagen1=7;
                        else imagen1=11;
                        imagen2=11;

                        children.add(new Actividad((Horas.get(i)[j]),(actividades.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
                    }
                    childData.add(children);
                }
                break;
            case 6:

            /*lugares*/
                lugar=res.getStringArray(R.array.Marzo6);
            /*actividades*/
                actividades.add(res.getStringArray(R.array.am61));
                actividades.add(res.getStringArray(R.array.am62));
                actividades.add(res.getStringArray(R.array.am63));
                actividades.add(res.getStringArray(R.array.am64));
            /*horas*/
                Horas.add(res.getStringArray(R.array.hm61));
                Horas.add(res.getStringArray(R.array.hm62));
                Horas.add(res.getStringArray(R.array.hm63));
                Horas.add(res.getStringArray(R.array.hm64));

                for (int i = 0; i < lugar.length; i++) {

                    lugarData.add(new Lugar(lugar[i]));
                    ArrayList<Actividad> children = new ArrayList<>();

                    for (int j = 0; j < actividades.get(i).length; j++) {
                        if((i==0)&&((j==1)||(j==2)))imagen1=0;
                        else if((i==2)&&(j==2))imagen1=1;
                        else imagen1=11;
                        imagen2=11;

                        children.add(new Actividad((Horas.get(i)[j]),(actividades.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
                    }
                    childData.add(children);
                }
                break;
            case 7:

            /*lugares*/
                lugar=res.getStringArray(R.array.Marzo7);
            /*actividades*/
                actividades.add(res.getStringArray(R.array.am71));

            /*horas*/
                Horas.add(res.getStringArray(R.array.hm71));

            /*Imágenes*/
                for (int i = 0; i < lugar.length; i++) {

                    lugarData.add(new Lugar(lugar[i]));
                    ArrayList<Actividad> children = new ArrayList<>();

                    for (int j = 0; j < actividades.get(i).length; j++) {
                                                imagen1=0;
                        imagen2=11;

                        children.add(new Actividad((Horas.get(i)[j]),(actividades.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
                    }
                    childData.add(children);
                }
                break;
            case 8:

            /*lugares*/
                lugar=res.getStringArray(R.array.Marzo8);
            /*actividades*/
                actividades.add(res.getStringArray(R.array.am81));
                actividades.add(res.getStringArray(R.array.am82));
                actividades.add(res.getStringArray(R.array.am83));
                actividades.add(res.getStringArray(R.array.am84));
                actividades.add(res.getStringArray(R.array.am85));

            /*horas*/
                Horas.add(res.getStringArray(R.array.hm81));
                Horas.add(res.getStringArray(R.array.hm82));
                Horas.add(res.getStringArray(R.array.hm83));
                Horas.add(res.getStringArray(R.array.hm84));
                Horas.add(res.getStringArray(R.array.hm85));

            /*Imágenes*/
                for (int i = 0; i < lugar.length; i++) {

                    lugarData.add(new Lugar(lugar[i]));
                    ArrayList<Actividad> children = new ArrayList<>();

                    for (int j = 0; j < actividades.get(i).length; j++) {
                        if((i==0)&&((j==1)||(j==2)))imagen1=0;
                        else if((i==2)&&(j==0))imagen1=3;
                        else if((i==3)&&(j==1))imagen1=1;
                        else imagen1=11;
                        imagen2=11;

                        children.add(new Actividad((Horas.get(i)[j]),(actividades.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
                    }
                    childData.add(children);
                }
                break;
            case 9:

            /*lugares*/
                lugar=res.getStringArray(R.array.Marzo9);
            /*actividades*/
                actividades.add(res.getStringArray(R.array.am91));
                actividades.add(res.getStringArray(R.array.am92));
                actividades.add(res.getStringArray(R.array.am93));
                actividades.add(res.getStringArray(R.array.am94));
                actividades.add(res.getStringArray(R.array.am95));
                actividades.add(res.getStringArray(R.array.am96));
                actividades.add(res.getStringArray(R.array.am97));

            /*horas*/
                Horas.add(res.getStringArray(R.array.hm91));
                Horas.add(res.getStringArray(R.array.hm92));
                Horas.add(res.getStringArray(R.array.hm93));
                Horas.add(res.getStringArray(R.array.hm94));
                Horas.add(res.getStringArray(R.array.hm95));
                Horas.add(res.getStringArray(R.array.hm96));
                Horas.add(res.getStringArray(R.array.hm97));

            /*Imágenes*/
                for (int i = 0; i < lugar.length; i++) {

                    lugarData.add(new Lugar(lugar[i]));
                    ArrayList<Actividad> children = new ArrayList<>();

                    for (int j = 0; j < actividades.get(i).length; j++) {
                        if((i==0)&&(j==1))imagen1=0;
                        else if((i==3)&&(j==0))imagen1=9;
                        else if((i==3)&&(j==1))imagen1=10;
                        else imagen1=11;
                        imagen2=11;

                        children.add(new Actividad((Horas.get(i)[j]),(actividades.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
                    }
                    childData.add(children);
                }
                break;
        }
        this.setListAdapter(exampleAdapter);
        }

    public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
        Bundle datos = this.getIntent().getExtras();
        int dia = datos.getInt("variable_integer1");
        String[] mensaje;
        mensaje=creamensaje(groupPosition,childPosition,dia);
        Dialog d = crearDialogoAlerta( mensaje);
        d.show();

        return false;
    }
    private String[] creamensaje(int posg, int posc, int dia)
    {

        String[] mensaje = {"","",""};
        try{
            Resources res =getResources();






            String[] desc=res.getStringArray(R.array.descripciones);

            ArrayList<String[]> titulo= new ArrayList<>();
            ArrayList<String[]> descripcion= new ArrayList<>();


            //Pensar en como puedo coger el contenido de la groupPosition. Lugardata(GroupPosition) y ChildData(childPositionn), para las actividades me basta con coger Actividades
            //las descripciones hay que hacerlas igual....
            switch(dia){
                case 1:
                    titulo.add(res.getStringArray(R.array.am11));
                    titulo.add(res.getStringArray(R.array.am12));
                    titulo.add(res.getStringArray(R.array.am13));
                    titulo.add(res.getStringArray(R.array.am14));
                    titulo.add(res.getStringArray(R.array.am15));

                    String[]des1={desc[46]};
                    String[]des2={desc[114],desc[66],desc[115],desc[97],desc[14],desc[109],desc[107]};
                    String[]des3={desc[79],desc[55],desc[76]};
                    String[]des4={desc[34]};
                    String[]des5={desc[28],desc[78]};


                    descripcion.add(des1);
                    descripcion.add(des2);
                    descripcion.add(des3);
                    descripcion.add(des4);
                    descripcion.add(des5);

                    mensaje[0]=titulo.get(posg)[posc];
                    mensaje[1]=descripcion.get(posg)[posc];
                    break;
                case 2:
                    titulo.add(res.getStringArray(R.array.am21));
                    titulo.add(res.getStringArray(R.array.am22));
                    titulo.add(res.getStringArray(R.array.am23));
                    titulo.add(res.getStringArray(R.array.am24));
                    titulo.add(res.getStringArray(R.array.am25));
                    titulo.add(res.getStringArray(R.array.am26));
                    titulo.add(res.getStringArray(R.array.am27));

                    String[]des12={desc[104]};
                    String[]des22={desc[73]};
                    String[]des32={desc[11],desc[93],desc[95]};
                    String[]des42={desc[13],desc[65]};
                    String[]des52={desc[30]};
                    String[]des62={desc[102],desc[117]};
                    String[]des72={desc[56]};
                    descripcion.add(des12);
                    descripcion.add(des22);
                    descripcion.add(des32);
                    descripcion.add(des42);
                    descripcion.add(des52);
                    descripcion.add(des62);
                    descripcion.add(des72);

                    mensaje[0]=titulo.get(posg)[posc];
                    mensaje[1]=descripcion.get(posg)[posc];
                    break;
                case 3:
                    titulo.add(res.getStringArray(R.array.am31));
                    titulo.add(res.getStringArray(R.array.am32));
                    titulo.add(res.getStringArray(R.array.am33));
                    titulo.add(res.getStringArray(R.array.am34));
                    titulo.add(res.getStringArray(R.array.am35));

                    String[]des13={desc[5],desc[49]};
                    String[]des23={desc[66],desc[115],desc[60],desc[80],desc[100]};
                    String[]des33={desc[55],desc[96],desc[99]};
                    String[]des43={desc[34]};
                    String[]des53={desc[82]};

                    descripcion.add(des13);
                    descripcion.add(des23);
                    descripcion.add(des33);
                    descripcion.add(des43);
                    descripcion.add(des53);

                    mensaje[0]=titulo.get(posg)[posc];
                    mensaje[1]=descripcion.get(posg)[posc];
                    break;

                case 4:
                    titulo.add(res.getStringArray(R.array.am41));
                    titulo.add(res.getStringArray(R.array.am42));
                    titulo.add(res.getStringArray(R.array.am43));
                    titulo.add(res.getStringArray(R.array.am44));


                    String[]des14={desc[69],desc[122]};
                    String[]des24={desc[114],desc[11],desc[115],desc[24],desc[40],desc[129],desc[9]};
                    String[]des34={desc[45],desc[33],desc[65]};
                    String[]des44={desc[57]};

                    descripcion.add(des14);
                    descripcion.add(des24);
                    descripcion.add(des34);
                    descripcion.add(des44);


                    mensaje[0]=titulo.get(posg)[posc];
                    mensaje[1]=descripcion.get(posg)[posc];
                    break;
                case 5:
                    titulo.add(res.getStringArray(R.array.am51));
                    titulo.add(res.getStringArray(R.array.am52));
                    titulo.add(res.getStringArray(R.array.am53));
                    titulo.add(res.getStringArray(R.array.am54));
                    titulo.add(res.getStringArray(R.array.am55));
                    titulo.add(res.getStringArray(R.array.am56));


                    String[]des15={desc[46],desc[10]};
                    String[]des25={desc[66],desc[90],desc[115],desc[26],desc[97]};
                    String[]des35={desc[72]};
                    String[]des45={desc[92],desc[125]};
                    String[]des55={desc[34]};
                    String[]des65={desc[91]};

                    descripcion.add(des15);
                    descripcion.add(des25);
                    descripcion.add(des35);
                    descripcion.add(des45);
                    descripcion.add(des55);
                    descripcion.add(des65);


                    mensaje[0]=titulo.get(posg)[posc];
                    mensaje[1]=descripcion.get(posg)[posc];
                    break;
                case 6:
                    titulo.add(res.getStringArray(R.array.am61));
                    titulo.add(res.getStringArray(R.array.am62));
                    titulo.add(res.getStringArray(R.array.am63));
                    titulo.add(res.getStringArray(R.array.am64));

                    String[]des16={desc[69],desc[101],desc[83]};
                    String[]des26={desc[11],desc[115],desc[51],desc[129],desc[89]};
                    String[]des36={desc[33],desc[63],desc[96]};
                    String[]des46={desc[117],desc[15]};
                     descripcion.add(des16);
                    descripcion.add(des26);
                    descripcion.add(des36);
                    descripcion.add(des46);


                    mensaje[0]=titulo.get(posg)[posc];
                    mensaje[1]=descripcion.get(posg)[posc];
                    break;
                case 7:
                    titulo.add(res.getStringArray(R.array.am71));

                    String[]des17={desc[130]};

                    descripcion.add(des17);


                    mensaje[0]=titulo.get(posg)[posc];
                    mensaje[1]=descripcion.get(posg)[posc];
                    break;
                case 8:
                    titulo.add(res.getStringArray(R.array.am81));
                    titulo.add(res.getStringArray(R.array.am82));
                    titulo.add(res.getStringArray(R.array.am83));
                    titulo.add(res.getStringArray(R.array.am84));
                    titulo.add(res.getStringArray(R.array.am85));

                    String[]des18={desc[47],desc[29],desc[112]};
                    String[]des28={desc[66],desc[39],desc[90],desc[115],desc[22]};
                    String[]des38={desc[72]};
                    String[]des48={desc[116],desc[125]};
                    String[]des58={desc[34]};
                    descripcion.add(des18);
                    descripcion.add(des28);
                    descripcion.add(des38);
                    descripcion.add(des48);
                    descripcion.add(des58);


                    mensaje[0]=titulo.get(posg)[posc];
                    mensaje[1]=descripcion.get(posg)[posc];
                    break;
                case 9:
                    titulo.add(res.getStringArray(R.array.am91));
                    titulo.add(res.getStringArray(R.array.am92));
                    titulo.add(res.getStringArray(R.array.am93));
                    titulo.add(res.getStringArray(R.array.am94));
                    titulo.add(res.getStringArray(R.array.am95));
                    titulo.add(res.getStringArray(R.array.am96));
                    titulo.add(res.getStringArray(R.array.am97));

                    String[]des19={desc[69],desc[50]};
                    String[]des29={desc[11],desc[115],desc[86],desc[129]};
                    String[]des39={desc[33],desc[63],desc[110]};
                    String[]des49={desc[38],desc[98],desc[38]};
                    String[]des59={desc[17],desc[30]};
                    String[]des69={desc[15],desc[37]};
                    String[]des79={desc[56]};
                    descripcion.add(des19);
                    descripcion.add(des29);
                    descripcion.add(des39);
                    descripcion.add(des49);
                    descripcion.add(des59);
                    descripcion.add(des69);
                    descripcion.add(des79);


                    mensaje[0]=titulo.get(posg)[posc];
                    mensaje[1]=descripcion.get(posg)[posc];
                    break;

                default: mensaje[0]="";
                    mensaje[1]="";}

        }catch(Exception e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT);

        }
        return mensaje;
    }
    private Dialog crearDialogoAlerta( String[] mensaje)
    {
        Context mContext = this;




        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.dialog,
                (ViewGroup) findViewById(R.id.dialog));

        TextView text = (TextView) layout.findViewById(R.id.text_d1);
        text.setText(mensaje[0]);
        TextView text2 = (TextView) layout.findViewById(R.id.text_d2);
        text2.setText(mensaje[1]);


        builder.setView(layout)

                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }});


        return builder.create();

    }



}
