package petagram.joseanguiano.com.veterinaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity{

    private Button btnEnviar;
    private EditText edtnombre,edtemail,edttelefono,edtdescripcion;
    private DatePicker dtepiker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nombre =(EditText)findViewById(R.id.campo_nombre);
        final EditText email = (EditText)findViewById(R.id.campo_email);
        final EditText telefono = (EditText)findViewById(R.id.campo_telefono);
        final EditText descripcion = (EditText)findViewById(R.id.campo_descripcion);
        final TextView info = (TextView)findViewById(R.id.txtinfofecha);

        DatePicker date = (DatePicker)findViewById(R.id.datePicker);
        Button btnenviar = (Button)findViewById(R.id.btnenviar);

        Calendar today = Calendar.getInstance();

        date.init(
                today.get(Calendar.YEAR),
                today.get(Calendar.MONTH),
                today.get(Calendar.DAY_OF_MONTH),
                new DatePicker.OnDateChangedListener() {
                    @Override
                    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        Toast.makeText(getApplicationContext(),"Fecha Seleccionada", Toast.LENGTH_SHORT).show();

                        info.setText(
                                " " + year + "/"+ monthOfYear + "/" + dayOfMonth);
                }
                }

        );

        btnenviar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Datos.class);
                intent.putExtra("nombre",nombre.getText().toString());
                intent.putExtra("telefono",telefono.getText().toString());
                intent.putExtra("email",email.getText().toString());
                intent.putExtra("descripcion",descripcion.getText().toString());
                intent.putExtra("info",info.getText().toString());


                startActivity(intent);
            }
        });

    }


   }
