package petagram.joseanguiano.com.veterinaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Datos extends AppCompatActivity {

   // TextView edtnombre,edtemail,edttelefono,edtdescripcion, edtdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        TextView edtnombre = (TextView) findViewById(R.id.txtnombre);
        TextView edttelefono = (TextView) findViewById(R.id.txttelefono);
        TextView edtemail = (TextView) findViewById(R.id.txtemail);
        TextView edtdescripcion = (TextView) findViewById(R.id.txtdescripcion);
        TextView edtfecha = (TextView) findViewById(R.id.txtfecha);
       // Button btneditar = (Button) findViewById(R.id.btneditar);


        edtnombre.setText(getIntent().getExtras().getString("nombre"));
        edttelefono.setText(getIntent().getExtras().getString("telefono"));
        edtemail.setText(getIntent().getExtras().getString("email"));
        edtdescripcion.setText(getIntent().getExtras().getString("descripcion"));
        edtfecha.setText(getIntent().getExtras().getString("info"));

    }

    public void pasar(){
        Button btneditar = (Button) findViewById(R.id.btneditar);
        btneditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pasar = new Intent(Datos.this, MainActivity.class);
                finish();
            }
        });

    }










        public void pasar (View v){

//        startActivity(pasar);
            finish();
    }

    }



