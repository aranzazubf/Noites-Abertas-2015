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

public class DiasFebreiro extends ExpandableListActivity {

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
                lugar=res.getStringArray(R.array.Febreiro1);
            /*actividades*/
                actividades.add(res.getStringArray(R.array.af11));
                actividades.add(res.getStringArray(R.array.af12));
                actividades.add(res.getStringArray(R.array.af13));
                /*horas*/
                Horas.add(res.getStringArray(R.array.hf11));
                Horas.add(res.getStringArray(R.array.hf12));
                Horas.add(res.getStringArray(R.array.hf13));

                for (int i = 0; i < lugar.length; i++) {
                    lugarData.add(new Lugar(lugar[i]));
                    ArrayList<Actividad> children = new ArrayList<>();

                    for (int j = 0; j < actividades.get(i).length; j++) {
                        if((i==1)&&(j==2))imagen1=2;
                        else if((i==1)&&(j==3))imagen1=1;
                        else imagen1=11;
                        imagen2=11;

                        children.add(new Actividad((Horas.get(i)[j]),(actividades.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
                    }
                    childData.add(children);
                }

                break;
            case 2:

            /*lugares*/
                lugar=res.getStringArray(R.array.Febreiro2);
            /*actividades*/
                actividades.add(res.getStringArray(R.array.af21));
                actividades.add(res.getStringArray(R.array.af22));
                actividades.add(res.getStringArray(R.array.af23));
                actividades.add(res.getStringArray(R.array.af24));
                actividades.add(res.getStringArray(R.array.af25));
                /*horas*/
                Horas.add(res.getStringArray(R.array.hf21));
                Horas.add(res.getStringArray(R.array.hf22));
                Horas.add(res.getStringArray(R.array.hf23));
                Horas.add(res.getStringArray(R.array.hf24));
                Horas.add(res.getStringArray(R.array.hf25));

                for (int i = 0; i < lugar.length; i++) {

                    lugarData.add(new Lugar(lugar[i]));
                    ArrayList<Actividad> children = new ArrayList<>();

                    for (int j = 0; j < actividades.get(i).length; j++) {
                        if((j==0)&&(i==0))imagen1=3;
                        else if((i==0)&&(j==2))imagen1=8;
                        else imagen1=11;
                        imagen2=11;

                        children.add(new Actividad((Horas.get(i)[j]),(actividades.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
                    }
                    childData.add(children);
                }
                break;
            case 3:

            /*lugares*/
                lugar=res.getStringArray(R.array.Febreiro3);
            /*actividades*/
                actividades.add(res.getStringArray(R.array.af31));
                actividades.add(res.getStringArray(R.array.af32));
                actividades.add(res.getStringArray(R.array.af33));

                /*horas*/
                Horas.add(res.getStringArray(R.array.hf31));
                Horas.add(res.getStringArray(R.array.hf32));
                Horas.add(res.getStringArray(R.array.hf33));


                for (int i = 0; i < lugar.length; i++) {

                    lugarData.add(new Lugar(lugar[i]));
                    ArrayList<Actividad> children = new ArrayList<>();

                    for (int j = 0; j < actividades.get(i).length; j++) {
                        if((i==1)&&(j==1))imagen1=2;
                        else if((i==1)&&(j==3))imagen1=1;
                        else imagen1=11;
                        imagen2=11;

                        children.add(new Actividad((Horas.get(i)[j]),(actividades.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
                    }
                    childData.add(children);
                }
                break;
            case 4:

            /*lugares*/
                lugar=res.getStringArray(R.array.Febreiro4);
            /*actividades*/
                actividades.add(res.getStringArray(R.array.af41));
                actividades.add(res.getStringArray(R.array.af42));
                actividades.add(res.getStringArray(R.array.af43));
                actividades.add(res.getStringArray(R.array.af44));


                /*horas*/
                Horas.add(res.getStringArray(R.array.hf41));
                Horas.add(res.getStringArray(R.array.hf42));
                Horas.add(res.getStringArray(R.array.hf43));
                Horas.add(res.getStringArray(R.array.hf44));



                for (int i = 0; i < lugar.length; i++) {

                    lugarData.add(new Lugar(lugar[i]));
                    ArrayList<Actividad> children = new ArrayList<>();

                    for (int j = 0; j < actividades.get(i).length; j++) {
                        if((i==1)&&(j==0))imagen1=3;
                        else if((i==2)&&(j==1)) imagen1=1;
                        else imagen1=11;
                        imagen2=11;

                        children.add(new Actividad((Horas.get(i)[j]),(actividades.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
                    }
                    childData.add(children);
                }
                break;
            case 5:

            /*lugares*/
                lugar=res.getStringArray(R.array.Febreiro5);
            /*actividades*/
                actividades.add(res.getStringArray(R.array.af51));
                actividades.add(res.getStringArray(R.array.af52));
                actividades.add(res.getStringArray(R.array.af53));
                actividades.add(res.getStringArray(R.array.af54));


                /*horas*/
                Horas.add(res.getStringArray(R.array.hf51));
                Horas.add(res.getStringArray(R.array.hf52));
                Horas.add(res.getStringArray(R.array.hf53));
                Horas.add(res.getStringArray(R.array.hf54));



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
            case 6:

            /*lugares*/
                lugar=res.getStringArray(R.array.Febreiro6);
            /*actividades*/
                actividades.add(res.getStringArray(R.array.af61));
                actividades.add(res.getStringArray(R.array.af62));
                actividades.add(res.getStringArray(R.array.af63));
                actividades.add(res.getStringArray(R.array.af64));
                actividades.add(res.getStringArray(R.array.af65));
                actividades.add(res.getStringArray(R.array.af66));
            /*horas*/
                Horas.add(res.getStringArray(R.array.hf61));
                Horas.add(res.getStringArray(R.array.hf62));
                Horas.add(res.getStringArray(R.array.hf63));
                Horas.add(res.getStringArray(R.array.hf64));
                Horas.add(res.getStringArray(R.array.hf65));
                Horas.add(res.getStringArray(R.array.hf65));



                for (int i = 0; i < lugar.length; i++) {

                    lugarData.add(new Lugar(lugar[i]));
                    ArrayList<Actividad> children = new ArrayList<>();

                    for (int j = 0; j < actividades.get(i).length; j++) {
                        if((i==1)&&(j==1))imagen1=0;
                        else if((i==2)&&(j==0))imagen1=3;
                        else if((i==4)&&(j==1))imagen1=5;
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
                    titulo.add(res.getStringArray(R.array.af11));
                    titulo.add(res.getStringArray(R.array.af12));
                    titulo.add(res.getStringArray(R.array.af13));

                    String[]des1={desc[48],desc[59],desc[115],desc[108],desc[114],desc[14],desc[23],desc[107]};
                    String[]des2={desc[110],desc[53],desc[77],desc[76]};
                    String[]des3={desc[41],desc[87]};

                    descripcion.add(des1);
                    descripcion.add(des2);
                    descripcion.add(des3);

                    mensaje[0]=titulo.get(posg)[posc];
                    mensaje[1]=descripcion.get(posg)[posc];
                    break;
                case 2:
                    titulo.add(res.getStringArray(R.array.af21));
                    titulo.add(res.getStringArray(R.array.af22));
                    titulo.add(res.getStringArray(R.array.af23));
                    titulo.add(res.getStringArray(R.array.af24));
                    titulo.add(res.getStringArray(R.array.af25));

                    String[]des12={desc[85],desc[115],desc[40],desc[0],desc[70]};
                    String[]des22={desc[13],desc[24],desc[65]};
                    String[]des32={desc[58],desc[27],desc[30]};
                    String[]des42={desc[102],desc[15]};
                    String[]des52={desc[56]};
                    descripcion.add(des12);
                    descripcion.add(des22);
                    descripcion.add(des32);
                    descripcion.add(des42);
                    descripcion.add(des52);

                    mensaje[0]=titulo.get(posg)[posc];
                    mensaje[1]=descripcion.get(posg)[posc];
                    break;
                case 3:
                    titulo.add(res.getStringArray(R.array.af31));
                    titulo.add(res.getStringArray(R.array.af32));
                    titulo.add(res.getStringArray(R.array.af33));

                    String[]des13={desc[48],desc[59],desc[115],desc[124],desc[124],desc[14],desc[25]};
                    String[]des23={desc[110],desc[77],desc[31],desc[76]};
                    String[]des33={desc[41],desc[87]};

                    descripcion.add(des13);
                    descripcion.add(des23);
                    descripcion.add(des33);

                    mensaje[0]=titulo.get(posg)[posc];
                    mensaje[1]=descripcion.get(posg)[posc];
                    break;

                case 4:
                    titulo.add(res.getStringArray(R.array.af41));
                    titulo.add(res.getStringArray(R.array.af42));
                    titulo.add(res.getStringArray(R.array.af43));
                    titulo.add(res.getStringArray(R.array.af44));


                    String[]des14={desc[48],desc[115],desc[124],desc[124],desc[14],desc[23]};
                    String[]des24={desc[105]};
                    String[]des34={desc[110],desc[76]};
                    String[]des44={desc[41],desc[87]};

                    descripcion.add(des14);
                    descripcion.add(des24);
                    descripcion.add(des34);
                    descripcion.add(des44);


                    mensaje[0]=titulo.get(posg)[posc];
                    mensaje[1]=descripcion.get(posg)[posc];
                    break;
                case 5:
                    titulo.add(res.getStringArray(R.array.af51));
                    titulo.add(res.getStringArray(R.array.af52));
                    titulo.add(res.getStringArray(R.array.af53));
                    titulo.add(res.getStringArray(R.array.af54));


                    String[]des15={desc[1],desc[25]};
                    String[]des25={desc[127],desc[54],desc[115],desc[14],desc[4]};
                    String[]des35={desc[24],desc[16],desc[125]};
                    String[]des45={desc[87]};

                    descripcion.add(des15);
                    descripcion.add(des25);
                    descripcion.add(des35);
                    descripcion.add(des45);


                    mensaje[0]=titulo.get(posg)[posc];
                    mensaje[1]=descripcion.get(posg)[posc];
                    break;
                case 6:
                    titulo.add(res.getStringArray(R.array.af61));
                    titulo.add(res.getStringArray(R.array.af62));
                    titulo.add(res.getStringArray(R.array.af63));
                    titulo.add(res.getStringArray(R.array.af64));
                    titulo.add(res.getStringArray(R.array.af65));
                    titulo.add(res.getStringArray(R.array.af66));


                    String[]des16={desc[123]};
                    String[]des26={desc[74],desc[75]};
                    String[]des36={desc[85],desc[115],desc[51],desc[0]};
                    String[]des46={desc[97],desc[13]};
                    String[]des56={desc[58],desc[64],desc[30]};
                    String[]des66={desc[57]};

                    descripcion.add(des16);
                    descripcion.add(des26);
                    descripcion.add(des36);
                    descripcion.add(des46);
                    descripcion.add(des56);
                    descripcion.add(des66);


                    mensaje[0]=titulo.get(posg)[posc];
                    mensaje[1]=descripcion.get(posg)[posc];
                    break;

                default: mensaje[0]="";
                    mensaje[1]="";}

        }catch(Exception e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();

        }
        return mensaje;
    }
    private Dialog crearDialogoAlerta(String[] mensaje)
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