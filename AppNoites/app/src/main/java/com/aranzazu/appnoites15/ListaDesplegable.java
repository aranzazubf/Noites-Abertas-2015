package com.aranzazu.appnoites15;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListaDesplegable extends ListaAdapta {

    /*Constructor de la listadesplegable personalizada*/
	public ListaDesplegable(Context context, ArrayList<Lugar> lugarData, ArrayList<ArrayList<Actividad>> actividadData)
    {
	super(context, lugarData, actividadData);
	}

    /*Metodo de ListaAdapta que rellena el layout con los datos de las actividades*/

	@Override
	public View newChildView(boolean isLastChild, ViewGroup parent) {
	
	return getInflater().inflate(R.layout.childdia, parent, false);
	
	}
    /*Metodo que rellena los datos de cada actividad hora, nombre y avisos*/
	@Override
	public void bindChildView(int childPosition, int groupPosition,boolean isLastChild, View v, ViewGroup parent)
	{
	Actividad child = (Actividad) super.getChild(groupPosition, childPosition);

	TextView textView = (TextView) v.findViewById(R.id.line_ap);
	textView.setText(child.getHora());


	TextView textView2 = (TextView) v.findViewById(R.id.line_bp);
	textView2.setText(child.getNombre());

	ImageView im= (ImageView) v.findViewById(R.id.icp);
	im.setImageResource(child.getAviso1());
	ImageView im2= (ImageView) v.findViewById(R.id.icp2);
	im2.setImageResource(child.getAviso2());
	}

    /*Metodo que rellena el layout con los datos de los lugares*/
	@Override
	public View newGroupView(boolean isExpanded, ViewGroup parent)
    {
	return getInflater().inflate(R.layout.grupo, parent, false);
	}

	/*Metodo que rellena los datos de cada lugar*/
	@Override
	public void bindGroupView(int groupPosition, boolean isExpanded, View v, ViewGroup parent)
	{
	Lugar Lugar = (Lugar) super.getGroup(groupPosition);

    TextView textView = (TextView) v.findViewById(R.id.text_actividades);
	textView.setText(Lugar.getText());
	}

	}


