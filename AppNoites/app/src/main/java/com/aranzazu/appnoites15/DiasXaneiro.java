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

/**
* Created by Aranzazu on 17/12/2014.
 */
public class DiasXaneiro extends ExpandableListActivity {

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
            lugar=res.getStringArray(R.array.Xaneiro1);
            /*actividades*/
            actividades.add(res.getStringArray(R.array.ax11));
            actividades.add(res.getStringArray(R.array.ax12));
            actividades.add(res.getStringArray(R.array.ax13));
                /*horas*/
            Horas.add(res.getStringArray(R.array.hx11));
            Horas.add(res.getStringArray(R.array.hx12));
            Horas.add(res.getStringArray(R.array.hx13));

            for (int i = 0; i < lugar.length; i++) {
                lugarData.add(new Lugar(lugar[i]));
                ArrayList<Actividad> children = new ArrayList<>();

                for (int j = 0; j < actividades.get(i).length; j++) {
                    imagen1=11;
                    imagen2=11;

                    children.add(new Actividad((Horas.get(i)[j]),(actividades.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
                }
                childData.add(children);
            }

            break;
            case 2:

            /*lugares*/
            lugar=res.getStringArray(R.array.Xaneiro2);
            /*actividades*/
            actividades.add(res.getStringArray(R.array.ax21));
            actividades.add(res.getStringArray(R.array.ax22));
            actividades.add(res.getStringArray(R.array.ax23));
            actividades.add(res.getStringArray(R.array.ax24));
            actividades.add(res.getStringArray(R.array.ax25));
                /*horas*/
            Horas.add(res.getStringArray(R.array.hx21));
            Horas.add(res.getStringArray(R.array.hx22));
            Horas.add(res.getStringArray(R.array.hx23));
            Horas.add(res.getStringArray(R.array.hx24));
            Horas.add(res.getStringArray(R.array.hx25));

            for (int i = 0; i < lugar.length; i++) {

                lugarData.add(new Lugar(lugar[i]));
                ArrayList<Actividad> children = new ArrayList<>();

                for (int j = 0; j < actividades.get(i).length; j++) {
                    if((j==0)&&(i==0))imagen1=3;
                    else imagen1=11;
                    imagen2=11;

                    children.add(new Actividad((Horas.get(i)[j]),(actividades.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
                }
                childData.add(children);
            }
            break;
            case 3:

            /*lugares*/
                lugar=res.getStringArray(R.array.Xaneiro3);
            /*actividades*/
                actividades.add(res.getStringArray(R.array.ax31));
                actividades.add(res.getStringArray(R.array.ax32));
                actividades.add(res.getStringArray(R.array.ax33));

                /*horas*/
                Horas.add(res.getStringArray(R.array.hx31));
                Horas.add(res.getStringArray(R.array.hx32));
                Horas.add(res.getStringArray(R.array.hx33));


                for (int i = 0; i < lugar.length; i++) {

                    lugarData.add(new Lugar(lugar[i]));
                    ArrayList<Actividad> children = new ArrayList<>();

                    for (int j = 0; j < actividades.get(i).length; j++) {
                        if((j==1)&&(i==1))imagen1=2;
                        else imagen1=11;
                        imagen2=11;

                        children.add(new Actividad((Horas.get(i)[j]),(actividades.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
                    }
                    childData.add(children);
                }
                break;
            case 4:

            /*lugares*/
                lugar=res.getStringArray(R.array.Xaneiro4);
            /*actividades*/
                actividades.add(res.getStringArray(R.array.ax41));
                actividades.add(res.getStringArray(R.array.ax42));
                actividades.add(res.getStringArray(R.array.ax43));
                actividades.add(res.getStringArray(R.array.ax44));
                actividades.add(res.getStringArray(R.array.ax45));

                /*horas*/
                Horas.add(res.getStringArray(R.array.hx41));
                Horas.add(res.getStringArray(R.array.hx42));
                Horas.add(res.getStringArray(R.array.hx43));
                Horas.add(res.getStringArray(R.array.hx44));
                Horas.add(res.getStringArray(R.array.hx45));


                for (int i = 0; i < lugar.length; i++) {

                    lugarData.add(new Lugar(lugar[i]));
                    ArrayList<Actividad> children = new ArrayList<>();

                    for (int j = 0; j < actividades.get(i).length; j++) {
                        if((i==0)&&(j==0))imagen1=7;
                        else if((i==1)&&(j==1)) imagen1=3;
                        else if((i==2)&&(j==1))imagen1=8;
                        else if((i==3)&&(j==1))imagen1=5;
                        else imagen1=11;
                        imagen2=11;

                        children.add(new Actividad((Horas.get(i)[j]),(actividades.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
                    }
                    childData.add(children);
                }
            break;
        }



        this.setListAdapter(exampleAdapter);
           // ListaDesplegable exampleAdapter= new ListaDesplegable(this, lugarData,childData);
            //return exampleAdapter;

        }

    public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
        Bundle datos = this.getIntent().getExtras();
        int dia = datos.getInt("variable_integer1");
        String[] mensaje;
        mensaje=creamensaje(groupPosition,childPosition,dia);
        Dialog d = crearDialogoAlerta(mensaje);
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
                    titulo.add(res.getStringArray(R.array.ax11));
                    titulo.add(res.getStringArray(R.array.ax12));
                    titulo.add(res.getStringArray(R.array.ax13));

                    String[]des1={desc[48],desc[60],desc[7],desc[14],desc[71],desc[126],desc[115]};
                    String[]des2={desc[110],desc[31],desc[12]};
                    String[]des3={desc[41]};

                    descripcion.add(des1);
                    descripcion.add(des2);
                    descripcion.add(des3);

                    mensaje[0]=titulo.get(posg)[posc];
                    mensaje[1]=descripcion.get(posg)[posc];
                    break;
                case 2:
                    titulo.add(res.getStringArray(R.array.ax21));
                    titulo.add(res.getStringArray(R.array.ax22));
                    titulo.add(res.getStringArray(R.array.ax23));
                    titulo.add(res.getStringArray(R.array.ax24));
                    titulo.add(res.getStringArray(R.array.ax25));

                    String[]des12={desc[85],desc[19],desc[115],desc[8],desc[100]};
                    String[]des22={desc[13],desc[51],desc[65]};
                    String[]des32={desc[58],desc[27]};
                    String[]des42={desc[117],desc[36]};
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
                    titulo.add(res.getStringArray(R.array.ax31));
                    titulo.add(res.getStringArray(R.array.ax32));
                    titulo.add(res.getStringArray(R.array.ax33));

                    String[]des13={desc[48],desc[54],desc[62],desc[115],desc[81],desc[7],desc[14],desc[97]};
                    String[]des23={desc[110],desc[77],desc[31],desc[12]};
                    String[]des33={desc[41]};

                    descripcion.add(des13);
                    descripcion.add(des23);
                    descripcion.add(des33);

                    mensaje[0]=titulo.get(posg)[posc];
                    mensaje[1]=descripcion.get(posg)[posc];
                    break;

                case 4:
                    titulo.add(res.getStringArray(R.array.ax41));
                    titulo.add(res.getStringArray(R.array.ax42));
                    titulo.add(res.getStringArray(R.array.ax43));
                    titulo.add(res.getStringArray(R.array.ax44));
                    titulo.add(res.getStringArray(R.array.ax45));

                    String[]des14={desc[84]};
                    String[]des24={desc[114],desc[85],desc[115],desc[120],desc[80],desc[126]};
                    String[]des34={desc[51],desc[40],desc[65]};
                    String[]des44={desc[58],desc[68]};
                    String[]des54={desc[57]};
                    descripcion.add(des14);
                    descripcion.add(des24);
                    descripcion.add(des34);
                    descripcion.add(des44);
                    descripcion.add(des54);

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

/*
        switch(mes){

            case 1:
                exampleAdapter=rellenaxaneiro(dia);
                break;
            case 2:
                exampleAdapter=rellenafebreiro(dia);
                break;
            case 3:
                exampleAdapter=rellenamarzo(dia);
                break;
            case 4:
                exampleAdapter=rellenaabril(dia);
                break;

            case 5:
                exampleAdapter=rellenamaio(dia);
                break;
        }
*/





    }



