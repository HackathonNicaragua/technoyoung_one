package technoyoung.technoyoungone;


import android.os.Bundle;

import java.net.HttpURLConnection;
import java.net.URL;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import android.widget.Toast;

public class C extends Activity {

    private ImageView imagenView;
    private Bitmap loadedimage;
    private String url = "http://archive.org/download/ImagesProgramming/C.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        imagenView = (ImageView) findViewById(R.id.image_view);
        downloadFile(url);
    }

    void downloadFile(String url) {
        URL image = null;
        try
        {
            image = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) image.openConnection();
            conn.connect();;
            loadedimage = BitmapFactory.decodeStream(conn.getInputStream());
            imagenView.setImageBitmap(loadedimage);
        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(), "Error al cargar la imagen: "+ e.getMessage(), Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }

}
