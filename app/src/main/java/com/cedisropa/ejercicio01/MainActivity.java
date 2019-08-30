package com.cedisropa.ejercicio01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.img_estado)
    ImageView image;


    @BindView(R.id.btn_MostrarImagen)
    Button btn_mostrar_Imagen;

    @OnTextChanged(R.id.txt_nombre)
    protected void textoCambio(CharSequence text) {
        if (text.length() > 5) {
            btn_mostrar_Imagen.setEnabled(true);

        }else {
            btn_mostrar_Imagen.setEnabled(false);
            image.setVisibility(View.GONE);






        }
    }

    @OnClick(R.id.btn_MostrarImagen)
    protected void btnmostrarimagen(){
        image.setVisibility(View.VISIBLE);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        image.setVisibility(View.GONE);
        btn_mostrar_Imagen.setEnabled(false);



    }
}
