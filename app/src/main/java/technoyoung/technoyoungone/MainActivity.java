package technoyoung.technoyoungone;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import static technoyoung.technoyoungone.R.id.default_activity_button;
import static technoyoung.technoyoungone.R.id.salida_btn;


public class MainActivity extends AppCompatActivity {

    Button openScratch;
    Button openC;
    Button openPy;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);

        Button boton_salida = (Button)findViewById(salida_btn);
        boton_salida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*finish();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);*/
                builder.setMessage("¿Desea Salir de la Aplicación?")
                        .setTitle("Confirme Salida")
                        .setCancelable(false)
                        .setNegativeButton("Cancelar",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                })
                        .setPositiveButton("Salir",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        finish();
                                        System.exit(0);
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        openScratch = (Button)findViewById(R.id.scrt_btn);
        openScratch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent opscratch = new Intent(MainActivity.this, FrameScratch.class);
                startActivity(opscratch);
            }
        });

        openC = (Button)findViewById(R.id.c_btn);
        openC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent opC = new Intent(MainActivity.this, FrameC.class);
                startActivity(opC);
            }
        });

        openPy = (Button)findViewById(R.id.pyth_btn);
        openPy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent opPy = new Intent(MainActivity.this, FramePython.class);
                startActivity(opPy);
            }
        });

        Button facebook = (Button)findViewById(R.id.fb);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.facebook.com/technoyoungone/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menu)
    {
        switch (menu.getItemId()){
            case R.id.about:
                Intent opAb = new Intent(MainActivity.this, Acerca.class);
                startActivity(opAb);
                return true;

            default:
                return super.onOptionsItemSelected(menu);
        }
    }

}
