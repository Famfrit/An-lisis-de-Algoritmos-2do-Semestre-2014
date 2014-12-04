package com.example.prueba;

//Librerias utilizadas para la implementacion
import java.util.Random;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements OnCheckedChangeListener, OnClickListener{
	//definición de los 64 botones que incluye el tablero
	ToggleButton tb1;
	ToggleButton tb2;
	ToggleButton tb3;
	ToggleButton tb4;
	ToggleButton tb5;
	ToggleButton tb6;
	ToggleButton tb7;
	ToggleButton tb8;
	ToggleButton tb9;
	ToggleButton tb10;
	ToggleButton tb11;
	ToggleButton tb12;
	ToggleButton tb13;
	ToggleButton tb14;
	ToggleButton tb15;
	ToggleButton tb16;
	ToggleButton tb17;
	ToggleButton tb18;
	ToggleButton tb19;
	ToggleButton tb20;
	ToggleButton tb21;
	ToggleButton tb22;
	ToggleButton tb23;
	ToggleButton tb24;
	ToggleButton tb25;
	ToggleButton tb26;
	ToggleButton tb27;
	ToggleButton tb28;
	ToggleButton tb29;
	ToggleButton tb30;
	ToggleButton tb31;
	ToggleButton tb32;
	ToggleButton tb33;
	ToggleButton tb34;
	ToggleButton tb35;
	ToggleButton tb36;
	ToggleButton tb37;
	ToggleButton tb38;
	ToggleButton tb39;
	ToggleButton tb40;
	ToggleButton tb41;
	ToggleButton tb42;
	ToggleButton tb43;
	ToggleButton tb44;
	ToggleButton tb45;
	ToggleButton tb46;
	ToggleButton tb47;
	ToggleButton tb48;
	ToggleButton tb49;
	ToggleButton tb50;
	ToggleButton tb51;
	ToggleButton tb52;
	ToggleButton tb53;
	ToggleButton tb54;
	ToggleButton tb55;
	ToggleButton tb56;
	ToggleButton tb57;
	ToggleButton tb58;
	ToggleButton tb59;
	ToggleButton tb60;
	ToggleButton tb61;
	ToggleButton tb62;
	ToggleButton tb63;
	ToggleButton tb64;
	
	int contadorReinas = 0;
	TextView tv1;
	Button b1;
	Button b2;
	ToggleButton [][] m = new ToggleButton [8][8];
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//definición de botones generar y reiniciar
		b1 = (Button)findViewById(R.id.button1);
		b1.setOnClickListener(this);
		b2 = (Button)findViewById(R.id.button2);
		b2.setOnClickListener(this);
		
		tv1=(TextView)findViewById(R.id.textView);
		//Activación del boton para su funcionamientos
		tb1=(ToggleButton)findViewById(R.id.A1);
		tb2=(ToggleButton)findViewById(R.id.A2);
		tb3=(ToggleButton)findViewById(R.id.A3);
		tb4=(ToggleButton)findViewById(R.id.A4);
		tb5=(ToggleButton)findViewById(R.id.A5);
		tb6=(ToggleButton)findViewById(R.id.A6);
		tb7=(ToggleButton)findViewById(R.id.A7);
		tb8=(ToggleButton)findViewById(R.id.A8);
		tb9=(ToggleButton)findViewById(R.id.B1);
		tb10=(ToggleButton)findViewById(R.id.B2);
		tb11=(ToggleButton)findViewById(R.id.B3);
		tb12=(ToggleButton)findViewById(R.id.B4);
		tb13=(ToggleButton)findViewById(R.id.B5);
		tb14=(ToggleButton)findViewById(R.id.B6);
		tb15=(ToggleButton)findViewById(R.id.B7);
		tb16=(ToggleButton)findViewById(R.id.B8);
		tb17=(ToggleButton)findViewById(R.id.C1);
		tb18=(ToggleButton)findViewById(R.id.C2);
		tb19=(ToggleButton)findViewById(R.id.C3);
		tb20=(ToggleButton)findViewById(R.id.C4);
		tb21=(ToggleButton)findViewById(R.id.C5);
		tb22=(ToggleButton)findViewById(R.id.C6);
		tb23=(ToggleButton)findViewById(R.id.C7);
		tb24=(ToggleButton)findViewById(R.id.C8);
		tb25=(ToggleButton)findViewById(R.id.D1);
		tb26=(ToggleButton)findViewById(R.id.D2);
		tb27=(ToggleButton)findViewById(R.id.D3);
		tb28=(ToggleButton)findViewById(R.id.D4);
		tb29=(ToggleButton)findViewById(R.id.D5);
		tb30=(ToggleButton)findViewById(R.id.D6);
		tb31=(ToggleButton)findViewById(R.id.D7);
		tb32=(ToggleButton)findViewById(R.id.D8);
		tb33=(ToggleButton)findViewById(R.id.E1);
		tb34=(ToggleButton)findViewById(R.id.E2);
		tb35=(ToggleButton)findViewById(R.id.E3);
		tb36=(ToggleButton)findViewById(R.id.E4);
		tb37=(ToggleButton)findViewById(R.id.E5);
		tb38=(ToggleButton)findViewById(R.id.E6);
		tb39=(ToggleButton)findViewById(R.id.E7);
		tb40=(ToggleButton)findViewById(R.id.E8);
		tb41=(ToggleButton)findViewById(R.id.F1);
		tb42=(ToggleButton)findViewById(R.id.F2);
		tb43=(ToggleButton)findViewById(R.id.F3);
		tb44=(ToggleButton)findViewById(R.id.F4);
		tb45=(ToggleButton)findViewById(R.id.F5);
		tb46=(ToggleButton)findViewById(R.id.F6);
		tb47=(ToggleButton)findViewById(R.id.F7);
		tb48=(ToggleButton)findViewById(R.id.F8);
		tb49=(ToggleButton)findViewById(R.id.G1);
		tb50=(ToggleButton)findViewById(R.id.G2);
		tb51=(ToggleButton)findViewById(R.id.G3);
		tb52=(ToggleButton)findViewById(R.id.G4);
		tb53=(ToggleButton)findViewById(R.id.G5);
		tb54=(ToggleButton)findViewById(R.id.G6);
		tb55=(ToggleButton)findViewById(R.id.G7);
		tb56=(ToggleButton)findViewById(R.id.G8);
		tb57=(ToggleButton)findViewById(R.id.H1);
		tb58=(ToggleButton)findViewById(R.id.H2);
		tb59=(ToggleButton)findViewById(R.id.H3);
		tb60=(ToggleButton)findViewById(R.id.H4);
		tb61=(ToggleButton)findViewById(R.id.H5);
		tb62=(ToggleButton)findViewById(R.id.H6);
		tb63=(ToggleButton)findViewById(R.id.H7);
		tb64=(ToggleButton)findViewById(R.id.H8);
		
		
		//direccionamiento de la matriz de ToggleButton para cada botón
		m[0][0] = tb1;
		m[0][1] = tb2;
		m[0][2] = tb3;
		m[0][3] = tb4;
		m[0][4] = tb5;
		m[0][5] = tb6;
		m[0][6] = tb7;
		m[0][7] = tb8;
		m[1][0] = tb9;
		m[1][1] = tb10;
		m[1][2] = tb11;
		m[1][3] = tb12;
		m[1][4] = tb13;
		m[1][5] = tb14;
		m[1][6] = tb15;
		m[1][7] = tb16;
		m[2][0] = tb17;
		m[2][1] = tb18;
		m[2][2] = tb19;
		m[2][3] = tb20;
		m[2][4] = tb21;
		m[2][5] = tb22;
		m[2][6] = tb23;
		m[2][7] = tb24;
		m[3][0] = tb25;
		m[3][1] = tb26;
		m[3][2] = tb27;
		m[3][3] = tb28;
		m[3][4] = tb29;
		m[3][5] = tb30;
		m[3][6] = tb31;
		m[3][7] = tb32;
		m[4][0] = tb33;
		m[4][1] = tb34;
		m[4][2] = tb35;
		m[4][3] = tb36;
		m[4][4] = tb37;
		m[4][5] = tb38;
		m[4][6] = tb39;
		m[4][7] = tb40;
		m[5][0] = tb41;
		m[5][1] = tb42;
		m[5][2] = tb43;
		m[5][3] = tb44;
		m[5][4] = tb45;
		m[5][5] = tb46;
		m[5][6] = tb47;
		m[5][7] = tb48;
		m[6][0] = tb49;
		m[6][1] = tb50;
		m[6][2] = tb51;
		m[6][3] = tb52;
		m[6][4] = tb53;
		m[6][5] = tb54;
		m[6][6] = tb55;
		m[6][7] = tb56;
		m[7][0] = tb57;
		m[7][1] = tb58;
		m[7][2] = tb59;
		m[7][3] = tb60;
		m[7][4] = tb61;
		m[7][5] = tb62;
		m[7][6] = tb63;
		m[7][7] = tb64;
	
	
		
		//Acción de activado de cada Botón
		tb1.setOnCheckedChangeListener(this);
		tb2.setOnCheckedChangeListener(this);
		tb3.setOnCheckedChangeListener(this);
		tb4.setOnCheckedChangeListener(this);
		tb5.setOnCheckedChangeListener(this);
		tb6.setOnCheckedChangeListener(this);
		tb7.setOnCheckedChangeListener(this);
		tb8.setOnCheckedChangeListener(this);
		tb9.setOnCheckedChangeListener(this);
		tb10.setOnCheckedChangeListener(this);
		tb11.setOnCheckedChangeListener(this);
		tb12.setOnCheckedChangeListener(this);
		tb13.setOnCheckedChangeListener(this);
		tb14.setOnCheckedChangeListener(this);
		tb15.setOnCheckedChangeListener(this);
		tb16.setOnCheckedChangeListener(this);
		tb17.setOnCheckedChangeListener(this);
		tb18.setOnCheckedChangeListener(this);
		tb19.setOnCheckedChangeListener(this);
		tb20.setOnCheckedChangeListener(this);
		tb21.setOnCheckedChangeListener(this);
		tb22.setOnCheckedChangeListener(this);
		tb23.setOnCheckedChangeListener(this);
		tb24.setOnCheckedChangeListener(this);
		tb25.setOnCheckedChangeListener(this);
		tb26.setOnCheckedChangeListener(this);
		tb27.setOnCheckedChangeListener(this);
		tb28.setOnCheckedChangeListener(this);
		tb29.setOnCheckedChangeListener(this);
		tb30.setOnCheckedChangeListener(this);
		tb31.setOnCheckedChangeListener(this);
		tb32.setOnCheckedChangeListener(this);
		tb33.setOnCheckedChangeListener(this);
		tb34.setOnCheckedChangeListener(this);
		tb35.setOnCheckedChangeListener(this);
		tb36.setOnCheckedChangeListener(this);
		tb37.setOnCheckedChangeListener(this);
		tb38.setOnCheckedChangeListener(this);
		tb39.setOnCheckedChangeListener(this);
		tb40.setOnCheckedChangeListener(this);
		tb41.setOnCheckedChangeListener(this);
		tb42.setOnCheckedChangeListener(this);
		tb43.setOnCheckedChangeListener(this);
		tb44.setOnCheckedChangeListener(this);
		tb45.setOnCheckedChangeListener(this);
		tb46.setOnCheckedChangeListener(this);
		tb47.setOnCheckedChangeListener(this);
		tb48.setOnCheckedChangeListener(this);
		tb49.setOnCheckedChangeListener(this);
		tb50.setOnCheckedChangeListener(this);
		tb51.setOnCheckedChangeListener(this);
		tb52.setOnCheckedChangeListener(this);
		tb53.setOnCheckedChangeListener(this);
		tb54.setOnCheckedChangeListener(this);
		tb55.setOnCheckedChangeListener(this);
		tb56.setOnCheckedChangeListener(this);
		tb57.setOnCheckedChangeListener(this);
		tb58.setOnCheckedChangeListener(this);
		tb59.setOnCheckedChangeListener(this);
		tb60.setOnCheckedChangeListener(this);
		tb61.setOnCheckedChangeListener(this);
		tb62.setOnCheckedChangeListener(this);
		tb63.setOnCheckedChangeListener(this);
		tb64.setOnCheckedChangeListener(this);
		
		
		
		
			
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) { 
		// TODO Auto-generated method stub
		
		 contadorReinas++;
	
		if(tb1.isChecked()){
			Lineas(0,0,m);	 
			
		}
		if(tb2.isChecked()){
			Lineas(0,1,m);
		}
		if(tb3.isChecked()){
			Lineas(0,2,m);	
			
		}
		if(tb4.isChecked()){
			Lineas(0,3,m);	
			
		}
		
		if(tb5.isChecked()){
			Lineas(0,4,m);	
			
		}
		
		if(tb6.isChecked()){
			Lineas(0,5,m);
			
		}
		if(tb7.isChecked()){
			Lineas(0,6,m);	
			
		}
		if(tb8.isChecked()){
			Lineas(0,7,m);	
			
		}
		if(tb9.isChecked()){
			Lineas(1,0,m);	
			
		}
		if(tb10.isChecked()){
			Lineas(1,1,m);	
			
		}
		if(tb11.isChecked()){
			Lineas(1,2,m);	
			
		}
		if(tb12.isChecked()){
			Lineas(1,3,m);	
			
		}
		if(tb13.isChecked()){
			Lineas(1,4,m);	
			
		}
		if(tb14.isChecked()){
			Lineas(1,5,m);	
			
		}
		if(tb15.isChecked()){
			Lineas(1,6,m);	
			
		}
		if(tb16.isChecked()){
			Lineas(1,7,m);	
			
		}
		if(tb17.isChecked()){
			Lineas(2,0,m);	
			
		}
		if(tb18.isChecked()){
			Lineas(2,1,m);	
			
		}
		if(tb19.isChecked()){
			Lineas(2,2,m);	
			
		}
		if(tb20.isChecked()){
			Lineas(2,3,m);	
			
		}
		if(tb21.isChecked()){
			Lineas(2,4,m);	
			
		}
		if(tb22.isChecked()){
			Lineas(2,5,m);	
			
		}
		if(tb23.isChecked()){
			Lineas(2,6,m);	
			
		}
		if(tb24.isChecked()){
			Lineas(2,7,m);	
			
		}
		if(tb25.isChecked()){
			Lineas(3,0,m);	
			
		}
		if(tb26.isChecked()){
			Lineas(3,1,m);	
			
		}
		if(tb27.isChecked()){
			Lineas(3,2,m);	
			
		}
		if(tb28.isChecked()){
			Lineas(3,3,m);	
			
		}
		if(tb29.isChecked()){
			Lineas(3,4,m);	
			
		}
		if(tb30.isChecked()){
			Lineas(3,5,m);	
			
		}
		if(tb31.isChecked()){
			Lineas(3,6,m);	
			
		}
		if(tb32.isChecked()){
			Lineas(3,7,m);	
			
		}
		if(tb33.isChecked()){
			Lineas(4,0,m);	
			
		}
		if(tb34.isChecked()){
			Lineas(4,1,m);	
			
		}
		if(tb35.isChecked()){
			Lineas(4,2,m);	
			
		}
		if(tb36.isChecked()){
			Lineas(4,3,m);	
			
		}
		if(tb37.isChecked()){
			Lineas(4,4,m);	
			
		}
		if(tb38.isChecked()){
			Lineas(4,5,m);	
			
		}
		if(tb39.isChecked()){
			Lineas(4,6,m);	
			
		}
		if(tb40.isChecked()){
			Lineas(4,7,m);	
			
		}
		if(tb41.isChecked()){
			Lineas(5,0,m);	
			
		}
		if(tb42.isChecked()){
			Lineas(5,1,m);	
			
		}
		if(tb43.isChecked()){
			Lineas(5,2,m);	
			
		}
		if(tb44.isChecked()){
			Lineas(5,3,m);	
			
		}
		if(tb45.isChecked()){
			Lineas(5,4,m);
			
		}
		if(tb46.isChecked()){
			Lineas(5,5,m);	
			
		}
		if(tb47.isChecked()){
			Lineas(5,6,m);	
			
		}
		if(tb48.isChecked()){
			Lineas(5,7,m);	
			
		}
		if(tb49.isChecked()){
			Lineas(6,0,m);	
			
		}
		if(tb50.isChecked()){
			Lineas(6,1,m);	
			
		}
		if(tb51.isChecked()){
			Lineas(6,2,m);	
			
		}
		if(tb52.isChecked()){
			Lineas(6,3,m);	
			
		}
		if(tb53.isChecked()){
			Lineas(6,4,m);	
			
		}
		if(tb54.isChecked()){
			Lineas(6,5,m);
			
		}
		if(tb55.isChecked()){
			Lineas(6,6,m);	
			
		}
		if(tb56.isChecked()){
			Lineas(6,7,m);	
			
		}
		if(tb57.isChecked()){
			Lineas(7,0,m);	
			
		}
		if(tb58.isChecked()){
			Lineas(7,1,m);	
			
		}
		if(tb59.isChecked()){
			Lineas(7,2,m);	
			
		}
		if(tb60.isChecked()){
			Lineas(7,3,m);	
			
		}
		if(tb61.isChecked()){
			Lineas(7,4,m);
			
		}
		if(tb62.isChecked()){
			Lineas(7,5,m);	
			
		}
		if(tb63.isChecked()){
			Lineas(7,6,m);	
			
		}
		if(tb64.isChecked()){		
			Lineas(7,7,m);	
			
		}
		
		
		
		
		
	}
	
	public void Lineas(int i, int j, ToggleButton A[][]){ 
		//determina los movimientos de una reina
				
		
		   int c=0;
	       int vertical = 7;
	       int horizontal = 7;

	       int a1 = i;
	       int a2 = i;
	       int a3 = i;
	       int a4 = i;
	       int b1 = j;
	       int b2 = j;
	       int b3 = j;
	       int b4 = j;

	    while (c<8){
		if(vertical >=0 && horizontal >=0 ){ //movimientos verticales y horizontales
		//	A[vertical][j].setChecked(true);
			A[vertical][j].setEnabled(false);
			vertical--;
		//	A[i][horizontal].setChecked(true);
			A[i][horizontal].setEnabled(false);
			horizontal--;
		}
		
		if(a1<=7 && b1<=7){ //inf der
		//	A[a1][b1].setChecked(true);
			A[a1][b1].setEnabled(false);
			a1++;
			b1++;
		}
		
		if(a2>=0 && b2>=0){ // sup izq
		//	A[a2][b2].setChecked(true);
			A[a2][b2].setEnabled(false);
			a2--;
			b2--;
		}
		
		if(a3>=0 && b3<=7){ //sup der
		//	A[a3][b3].setChecked(true);
			A[a3][b3].setEnabled(false);
			a3--;
			b3++;
		}
		
		if(a4<=7 && b4>=0){ //inf izq
		//	A[a4][b4].setChecked(true);
			A[a4][b4].setEnabled(false);
			a4++;
			b4--;
		}
		
		c++;
		
	    }
	    
	    tv1.setText("Reinas puestas: "+contadorReinas);
	    if(contadorReinas>=8){
	    	contadorReinas=0;
	    	tv1.setText("Reinas puestas: "+contadorReinas);
			 AlertDialog.Builder builder = new AlertDialog.Builder(this);
		     builder.setTitle("Anuncio");
		     builder.setMessage("Juego completado!");
		     builder.setPositiveButton("OK",null);
		     builder.create();
		     builder.show();
		     
		}
	}


	
	
	@Override
	public void onClick(View v) { 
		
		
		
		switch (v.getId()){	
		//boton reiniciar
				
		case R.id.button1:
			
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){
					m[i][j].setEnabled(true);
					m[i][j].setChecked(false);
					contadorReinas = 0;
				}
			}
			tv1.setText("Reinas puestas: "+contadorReinas);
			break;
			
		case R.id.button2:
			
			Random r = new Random();
			int i = r.nextInt(8 - 0) + 0;
			int j = r.nextInt(8 - 0) + 0;
			Lineas(i,j,m);
			
			
			break;
		
		
		}
		
		
			
			
		    
			
		
		
		
		
	}
	
	

	
}
