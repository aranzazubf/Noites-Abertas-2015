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


public class DiasAbril extends ExpandableListActivity {

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

        //ArrayList<String[]> actividades= new ArrayList<String[]>();
        //ArrayList<String[]> Horas= new ArrayList<String[]>();
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
                R.drawable.nueve,
                R.drawable.diez,
                0
        };

        switch (dia){
            case 1:
            /*lugares*/
                lugar=res.getStringArray(R.array.Abril1);
            /*actividades*/
                actividades.add(res.getStringArray(R.array.aa11));
                actividades.add(res.getStringArray(R.array.aa12));
                actividades.add(res.getStringArray(R.array.aa13));

                /*horas*/
                Horas.add(res.getStringArray(R.array.ha11));
                Horas.add(res.getStringArray(R.array.ha12));
                Horas.add(res.getStringArray(R.array.ha13));


                for (int i = 0; i < lugar.length; i++) {
                    lugarData.add(new Lugar(lugar[i]));
                    ArrayList<Actividad> children = new ArrayList<>();

                    for (int j = 0; j < actividades.get(i).length; j++) {
                        if((i==0)&&(j==0))imagen1=4;
                        else imagen1=11;
                        imagen2=11;

                        children.add(new Actividad((Horas.get(i)[j]),(actividades.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
                    }
                    childData.add(children);
                }

                break;
            case 2:

            /*lugares*/
                lugar=res.getStringArray(R.array.Abril2);
            /*actividades*/
                actividades.add(res.getStringArray(R.array.aa21));

                /*horas*/
                Horas.add(res.getStringArray(R.array.ha21));


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
            case 3:

            /*lugares*/
                lugar=res.getStringArray(R.array.Abril3);
            /*actividades*/
                actividades.add(res.getStringArray(R.array.aa31));
                actividades.add(res.getStringArray(R.array.aa32));
                actividades.add(res.getStringArray(R.array.aa33));
                actividades.add(res.getStringArray(R.array.aa34));
                actividades.add(res.getStringArray(R.array.aa35));

                /*horas*/
                Horas.add(res.getStringArray(R.array.ha31));
                Horas.add(res.getStringArray(R.array.ha32));
                Horas.add(res.getStringArray(R.array.ha33));
                Horas.add(res.getStringArray(R.array.ha34));
                Horas.add(res.getStringArray(R.array.ha35));


                for (int i = 0; i < lugar.length; i++) {

                    lugarData.add(new Lugar(lugar[i]));
                    ArrayList<Actividad> children = new ArrayList<>();

                    for (int j = 0; j < actividades.get(i).length; j++) {
                        if((i==0)&&(j==0))imagen1=4;
                        else if((i==1)&&(j==0))imagen1=6;
                        else imagen1=11;
                        imagen2=11;

                        children.add(new Actividad((Horas.get(i)[j]),(actividades.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
                    }
                    childData.add(children);
                }
                break;
            case 4:

            /*lugares*/
                lugar=res.getStringArray(R.array.Abril4);
            /*actividades*/
                actividades.add(res.getStringArray(R.array.aa41));
                actividades.add(res.getStringArray(R.array.aa42));
                actividades.add(res.getStringArray(R.array.aa43));
                actividades.add(res.getStringArray(R.array.aa44));
                actividades.add(res.getStringArray(R.array.aa45));
            /*horas*/
                Horas.add(res.getStringArray(R.array.ha41));
                Horas.add(res.getStringArray(R.array.ha42));
                Horas.add(res.getStringArray(R.array.ha43));
                Horas.add(res.getStringArray(R.array.ha44));
                Horas.add(res.getStringArray(R.array.ha45));



                for (int i = 0; i < lugar.length; i++) {

                    lugarData.add(new Lugar(lugar[i]));
                    ArrayList<Actividad> children = new ArrayList<>();

                    for (int j = 0; j < actividades.get(i).length; j++) {
                        if((i==0)&&(j==0))imagen1=9;
                        else if((i==1)&&(j==1))imagen1=1;
                        else imagen1=11;
                        imagen2=11;

                        children.add(new Actividad((Horas.get(i)[j]),(actividades.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
                    }
                    childData.add(children);
                }
                break;
            case 5:

            /*lugares*/
                lugar=res.getStringArray(R.array.Abril5);
            /*actividades*/
                actividades.add(res.getStringArray(R.array.aa51));
                actividades.add(res.getStringArray(R.array.aa52));
                actividades.add(res.getStringArray(R.array.aa53));
                actividades.add(res.getStringArray(R.array.aa54));
                actividades.add(res.getStringArray(R.array.aa55));

            /*horas*/
                Horas.add(res.getStringArray(R.array.ha51));
                Horas.add(res.getStringArray(R.array.ha52));
                Horas.add(res.getStringArray(R.array.ha53));
                Horas.add(res.getStringArray(R.array.ha54));
                Horas.add(res.getStringArray(R.array.ha55));




                for (int i = 0; i < lugar.length; i++) {

                    lugarData.add(new Lugar(lugar[i]));
                    ArrayList<Actividad> children = new ArrayList<>();

                    for (int j = 0; j < actividades.get(i).length; j++) {
                        if((i==0)&&(j==0))imagen1=4;
                        else if((i==3)&&(j==0))imagen1=3;
                        else imagen1=11;
                        imagen2=11;

                        children.add(new Actividad((Horas.get(i)[j]),(actividades.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
                    }
                    childData.add(children);
                }
                break;
            case 6:

            /*lugares*/
                lugar=res.getStringArray(R.array.Abril6);
            /*actividades*/
                actividades.add(res.getStringArray(R.array.aa61));
                actividades.add(res.getStringArray(R.array.aa62));
                actividades.add(res.getStringArray(R.array.aa63));
                actividades.add(res.getStringArray(R.array.aa64));
            /*horas*/
                Horas.add(res.getStringArray(R.array.ha61));
                Horas.add(res.getStringArray(R.array.ha62));
                Horas.add(res.getStringArray(R.array.ha63));
                Horas.add(res.getStringArray(R.array.ha64));

                for (int i = 0; i < lugar.length; i++) {

                    lugarData.add(new Lugar(lugar[i]));
                    ArrayList<Actividad> children = new ArrayList<>();

                    for (int j = 0; j < actividades.get(i).length; j++) {
                        if((i==1)&&(j==0))imagen1=3;
                        else if((i==3)&&(j==0))imagen1=9;
                        else imagen1=11;
                        imagen2=11;

                        children.add(new Actividad((Horas.get(i)[j]),(actividades.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
                    }
                    childData.add(children);
                }
                break;
            case 7:

            /*lugares*/
                lugar=res.getStringArray(R.array.Abril7);
            /*actividades*/
                actividades.add(res.getStringArray(R.array.aa71));
                actividades.add(res.getStringArray(R.array.aa72));
                actividades.add(res.getStringArray(R.array.aa73));
                actividades.add(res.getStringArray(R.array.aa74));
                actividades.add(res.getStringArray(R.array.aa75));
                actividades.add(res.getStringArray(R.array.aa76));

            /*horas*/
                Horas.add(res.getStringArray(R.array.ha71));
                Horas.add(res.getStringArray(R.array.ha72));
                Horas.add(res.getStringArray(R.array.ha73));
                Horas.add(res.getStringArray(R.array.ha74));
                Horas.add(res.getStringArray(R.array.ha75));
                Horas.add(res.getStringArray(R.array.ha76));

            /*Imágenes*/
                for (int i = 0; i < lugar.length; i++) {

                    lugarData.add(new Lugar(lugar[i]));
                    ArrayList<Actividad> children = new ArrayList<>();

                    for (int j = 0; j < actividades.get(i).length; j++) {
                        if((i==0)&&(j==0))imagen1=4;
                        else if((i==3)&&(j==0))imagen1=3;
                        else  imagen1=11;
                        imagen2=11;

                        children.add(new Actividad((Horas.get(i)[j]),(actividades.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
                    }
                    childData.add(children);
                }
                break;
            case 8:

            /*lugares*/
                lugar=res.getStringArray(R.array.Abril8);
            /*actividades*/
                actividades.add(res.getStringArray(R.array.aa81));


            /*horas*/
                Horas.add(res.getStringArray(R.array.ha81));


            /*Imágenes*/
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

        }
        this.setListAdapter(exampleAdapter);
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
                    titulo.add(res.getStringArray(R.array.aa11));
                    titulo.add(res.getStringArray(R.array.aa12));
                    titulo.add(res.getStringArray(R.array.aa13));

                    String[]des1={desc[2]};
                    String[]des2={desc[66],desc[39],desc[115],desc[61],desc[35],desc[26]};
                    String[]des3={desc[42]};



                    descripcion.add(des1);
                    descripcion.add(des2);
                    descripcion.add(des3);


                    mensaje[0]=titulo.get(posg)[posc];
                    mensaje[1]=descripcion.get(posg)[posc];
                    break;
                case 2:
                    titulo.add(res.getStringArray(R.array.aa21));

                    String[]des12={desc[7],desc[115],desc[97],desc[44],desc[21],desc[107]};

                    descripcion.add(des12);


                    mensaje[0]=titulo.get(posg)[posc];
                    mensaje[1]=descripcion.get(posg)[posc];
                    break;
                case 3:
                    titulo.add(res.getStringArray(R.array.aa31));
                    titulo.add(res.getStringArray(R.array.aa32));
                    titulo.add(res.getStringArray(R.array.aa33));
                    titulo.add(res.getStringArray(R.array.aa34));
                    titulo.add(res.getStringArray(R.array.aa35));

                    String[]des13={desc[2]};
                    String[]des23={desc[119]};
                    String[]des33={desc[114],desc[39],desc[115],desc[52],desc[26],desc[93]};
                    String[]des43={desc[63],desc[128],desc[100]};
                    String[]des53={desc[17],desc[42]};

                    descripcion.add(des13);
                    descripcion.add(des23);
                    descripcion.add(des33);
                    descripcion.add(des43);
                    descripcion.add(des53);

                    mensaje[0]=titulo.get(posg)[posc];
                    mensaje[1]=descripcion.get(posg)[posc];
                    break;

                case 4:
                    titulo.add(res.getStringArray(R.array.aa41));
                    titulo.add(res.getStringArray(R.array.aa42));
                    titulo.add(res.getStringArray(R.array.aa43));
                    titulo.add(res.getStringArray(R.array.aa44));
                    titulo.add(res.getStringArray(R.array.aa45));


                    String[]des14={desc[67],desc[3],desc[18],desc[115],desc[114],desc[129],desc[86]};
                    String[]des24={desc[33],desc[96],desc[110]};
                    String[]des34={desc[63]};
                    String[]des44={desc[57]};
                    String[]des54={desc[20]};

                    descripcion.add(des14);
                    descripcion.add(des24);
                    descripcion.add(des34);
                    descripcion.add(des44);
                    descripcion.add(des54);


                    mensaje[0]=titulo.get(posg)[posc];
                    mensaje[1]=descripcion.get(posg)[posc];
                    break;
                case 5:
                    titulo.add(res.getStringArray(R.array.aa51));
                    titulo.add(res.getStringArray(R.array.aa52));
                    titulo.add(res.getStringArray(R.array.aa53));
                    titulo.add(res.getStringArray(R.array.aa54));
                    titulo.add(res.getStringArray(R.array.aa55));


                    String[]des15={desc[2]};
                    String[]des25={desc[39],desc[3],desc[90],desc[115],desc[52],desc[26],desc[71]};
                    String[]des35={desc[121]};
                    String[]des45={desc[103]};
                    String[]des55={desc[17],desc[42]};


                    descripcion.add(des15);
                    descripcion.add(des25);
                    descripcion.add(des35);
                    descripcion.add(des45);
                    descripcion.add(des55);


                    mensaje[0]=titulo.get(posg)[posc];
                    mensaje[1]=descripcion.get(posg)[posc];
                    break;
                case 6:
                    titulo.add(res.getStringArray(R.array.aa61));
                    titulo.add(res.getStringArray(R.array.aa62));
                    titulo.add(res.getStringArray(R.array.aa63));
                    titulo.add(res.getStringArray(R.array.aa64));

                    String[]des16={desc[114],desc[18],desc[115],desc[19],desc[86],desc[88],desc[32]};
                    String[]des26={desc[105]};
                    String[]des36={desc[121]};
                    String[]des46={desc[118]};
                    descripcion.add(des16);
                    descripcion.add(des26);
                    descripcion.add(des36);
                    descripcion.add(des46);


                    mensaje[0]=titulo.get(posg)[posc];
                    mensaje[1]=descripcion.get(posg)[posc];
                    break;
                case 7:
                    titulo.add(res.getStringArray(R.array.aa71));
                    titulo.add(res.getStringArray(R.array.aa72));
                    titulo.add(res.getStringArray(R.array.aa73));
                    titulo.add(res.getStringArray(R.array.aa74));
                    titulo.add(res.getStringArray(R.array.aa75));
                    titulo.add(res.getStringArray(R.array.aa76));

                    String[]des17={desc[2]};
                    String[]des27={desc[39],desc[115],desc[86], desc[26],desc[100],desc[107]};
                    String[]des37={desc[52]};
                    String[]des47={desc[72]};
                    String[]des57={desc[33]};
                    String[]des67={desc[17],desc[42]};

                    descripcion.add(des17);
                    descripcion.add(des27);
                    descripcion.add(des37);
                    descripcion.add(des47);
                    descripcion.add(des57);
                    descripcion.add(des67);


                    mensaje[0]=titulo.get(posg)[posc];
                    mensaje[1]=descripcion.get(posg)[posc];
                    break;
                case 8:
                    titulo.add(res.getStringArray(R.array.aa81));


                    String[]des18={desc[33],desc[39],desc[130],desc[43]};

                    descripcion.add(des18);



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

        builder.setView(layout).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });


        return builder.create();

    }
}