package technoyoung.technoyoungone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;

public class C extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        VideoView vidView = (VideoView)findViewById(R.id.myVideo);

        String vidAddress = "https://archive.org/download/cprogrammingforbigginers/programming-for-complete-beginners-in-csharp/programming-for-complete-beginners-in-csharp/01%20Introduction/001%20Why%20Learn%20C.mp4";
        Uri vidUri = Uri.parse(vidAddress);
        vidView.setVideoURI(vidUri);
        MediaController vidControl = new MediaController(this);
        vidControl.setAnchorView(vidView);
        vidView.setMediaController(vidControl);
        vidView.start();
    }
}
