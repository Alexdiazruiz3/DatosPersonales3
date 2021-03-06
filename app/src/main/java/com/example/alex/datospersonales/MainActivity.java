package com.example.alex.datospersonales;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtVNombre;
    TextView txtVApellidos;
    TextView txtVEdad;
    TextView txtVGenero;
    TextView txtVEstadoCivil;
    TextView txtVHijos;
    EditText txtNombre;
    EditText txtApellidos;
    EditText editText;
    RadioButton radioButtonHombre;
    RadioButton radioButtonMujer;
    Switch switchHijos;
    TextView txtResultado;
    RadioGroup RDGenero;
    Spinner lstEstado;
    String[] Estado;
    String switch5 = "";
    Typeface Guthen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVNombre = findViewById(R.id.txtVNombre);
        txtVApellidos = findViewById(R.id.txtVApellidos);
        txtVEdad = findViewById(R.id.txtVEdad);
        txtVGenero = findViewById(R.id.txtVGenero);
        txtVEstadoCivil = findViewById(R.id.txtVEstadoCivil);
        txtVHijos = findViewById(R.id.txtVHijos);
        txtNombre = findViewById(R.id.txtNombre);
        txtApellidos = findViewById(R.id.txtApellidos);
        editText = findViewById(R.id.editText);
        radioButtonHombre = findViewById(R.id.radioButtonHombre);
        radioButtonMujer = findViewById(R.id.radioButtonMujer);
        switchHijos = findViewById(R.id.switchHijos);
        RDGenero = findViewById(R.id.RDGenero);
        txtResultado = findViewById(R.id.txtResultado);
        //Spinner Ejercicio 5
        Estado = new String[]{"", getResources().getString(R.string.casado), getResources().getString(R.string.separado), getResources().getString(R.string.viudo), getResources().getString(R.string.otro)};
        ArrayAdapter adaptadorEstado = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, Estado);
        lstEstado = findViewById(R.id.lstEstado);
        lstEstado.setAdapter(adaptadorEstado);

        //Borrar Contenido
        Button btnLimpiar = findViewById(R.id.btnLimpiar);
        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNombre.setText("");
                txtApellidos.setText("");
                editText.setText("");
                txtResultado.setText("");
                radioButtonHombre.setChecked(false);
                radioButtonMujer.setChecked(false);
                switchHijos.setChecked(false);
                lstEstado.setSelection(0);
            }
        });
        //Genero
        RDGenero.setOnCheckedChangeListener(new
                                                    RadioGroup.OnCheckedChangeListener() {
                                                        @Override
                                                        public void onCheckedChanged(RadioGroup group, int checkedId) {
                                                            String generoSeleccionado = "";
                                                            if (checkedId == R.id.radioButtonHombre)
                                                                ;
                                                            if (checkedId == R.id.radioButtonMujer)
                                                                ;
                                                            //txtCursoSeleccionado.setText( cursoSeleccionado );
                                                        }
                                                    });
        //hijos
        switchHijos.setOnCheckedChangeListener(new
                                                       CompoundButton.OnCheckedChangeListener() {
                                                           @Override
                                                           public void onCheckedChanged(CompoundButton buttonView, boolean
                                                                   isChecked) {
                                                               if (switchHijos.isChecked() == true) {
                                                                   switch5 = "Si tiene Hijos";
                                                               }
                                                               if (switchHijos.isChecked() == false) {
                                                                   switch5 = "No tiene Hijos";
                                                               }
                                                           }
                                                       });
        //Resultado
        Button btnTexto = findViewById(R.id.btnTexto);
        btnTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.setText(txtApellidos.getText().toString() + ", " + txtNombre.getText().toString() + ", " + editText.getText().toString() + " " + getResources().getString(R.string.años) + ", " + lstEstado.getSelectedItem().toString() + " " + "y " + (switch5));
            }
        });

        //Fuentes
        String fuente1 = "fuentes/Guthen.ttf";
        this.Guthen = Typeface.createFromAsset(getAssets(),fuente1);
        txtVNombre.setTypeface(Guthen);

        String fuente2 = "fuentes/Guthen.ttf";
        this.Guthen = Typeface.createFromAsset(getAssets(),fuente2);
        txtVApellidos.setTypeface(Guthen);

        String fuente3 = "fuentes/Guthen.ttf";
        this.Guthen = Typeface.createFromAsset(getAssets(),fuente3);
        txtVEdad.setTypeface(Guthen);

        String fuente4 = "fuentes/Guthen.ttf";
        this.Guthen = Typeface.createFromAsset(getAssets(),fuente4);
        txtVGenero.setTypeface(Guthen);

        String fuente5 = "fuentes/Guthen.ttf";
        this.Guthen = Typeface.createFromAsset(getAssets(),fuente5);
        txtVEstadoCivil.setTypeface(Guthen);

        String fuente6 = "fuentes/Guthen.ttf";
        this.Guthen = Typeface.createFromAsset(getAssets(),fuente6);
        txtVHijos.setTypeface(Guthen);

        String fuente7 = "fuentes/Guthen.ttf";
        this.Guthen = Typeface.createFromAsset(getAssets(),fuente7);
        btnLimpiar.setTypeface(Guthen);

        String fuente8 = "fuentes/Guthen.ttf";
        this.Guthen = Typeface.createFromAsset(getAssets(),fuente8);
        btnTexto.setTypeface(Guthen);

        String fuente9 = "fuentes/Guthen.ttf";
        this.Guthen = Typeface.createFromAsset(getAssets(),fuente9);
        txtNombre.setTypeface(Guthen);

        String fuente10 = "fuentes/Guthen.ttf";
        this.Guthen = Typeface.createFromAsset(getAssets(),fuente10);
        txtApellidos.setTypeface(Guthen);

        String fuente11 = "fuentes/Guthen.ttf";
        this.Guthen = Typeface.createFromAsset(getAssets(),fuente11);
        editText.setTypeface(Guthen);

        String fuente12 = "fuentes/Guthen.ttf";
        this.Guthen = Typeface.createFromAsset(getAssets(),fuente12);
        radioButtonHombre.setTypeface(Guthen);

        String fuente13 = "fuentes/Guthen.ttf";
        this.Guthen = Typeface.createFromAsset(getAssets(),fuente13);
        radioButtonMujer.setTypeface(Guthen);

        /*
        String fuente14 = "fuentes/Guthen.ttf";
        this.Guthen = Typeface.createFromAsset(getAssets(),fuente14);
        lstEstado.setTypeface(Guthen);
        */

        String fuente15 = "fuentes/Guthen.ttf";
        this.Guthen = Typeface.createFromAsset(getAssets(),fuente15);
        switchHijos.setTypeface(Guthen);



    }
}
