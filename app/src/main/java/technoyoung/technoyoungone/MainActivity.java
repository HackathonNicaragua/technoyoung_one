package technoyoung.technoyoungone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;


public class MainActivity extends AppCompatActivity {

    Button openScratch;
    Button openC;
    Button openPy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button boton_salida = (Button)findViewById(R.id.salida_btn);
        boton_salida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

        openScratch = (Button)findViewById(R.id.scrt_btn);
        openScratch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent opscratch = new Intent(MainActivity.this, scratch.class);
                startActivity(opscratch);
            }
        });

        openC = (Button)findViewById(R.id.c_btn);
        openC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent opC = new Intent(MainActivity.this, C.class);
                startActivity(opC);
            }
        });

        openPy = (Button)findViewById(R.id.pyth_btn);
        openPy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent opPy = new Intent(MainActivity.this, Python.class);
                startActivity(opPy);
            }
        });
    }
}
