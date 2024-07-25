package com.example.programgajipegawai;

import android.R.integer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	EditText Nama, Gaji, Tunjangan;
	TextView NamaP, GajiBersih;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Nama = (EditText)findViewById(R.id.txtNama);
        Gaji = (EditText)findViewById(R.id.txtGaji);
        Tunjangan = (EditText)findViewById(R.id.txtTunjangan);
        
        NamaP = (TextView)findViewById(R.id.txtHslNama);
        GajiBersih = (TextView)findViewById(R.id.txtHslGaji);
        
        
    }
    
    public void BtnCek(View v){
    	String NamaPegawai;
    	int InputGaji, InputTunjangan, TunjanganHasil, HasilGajiBersih,Pajak=0,TotalGaji;
    	
    	NamaPegawai = Nama.getText().toString();
    	InputGaji = Integer.parseInt(Gaji.getText().toString());
    	InputTunjangan = Integer.parseInt(Tunjangan.getText().toString());
    	
    	
    	TunjanganHasil = InputGaji*InputTunjangan/100;
    	TotalGaji = TunjanganHasil+InputGaji;
    	
    	if(TotalGaji>100000){
    		Pajak = 20000;
    	}else if(TotalGaji<=100000){
    		Pajak = 10000;
    	}
    	
    	HasilGajiBersih = TotalGaji-Pajak;
    	
    	NamaP.setText(NamaPegawai);
    	GajiBersih.setText(""+HasilGajiBersih);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
