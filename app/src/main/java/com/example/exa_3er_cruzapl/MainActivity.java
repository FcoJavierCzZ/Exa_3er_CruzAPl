package com.example.exa_3er_cruzapl;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    public VideoView videoPrueba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoPrueba=(VideoView)findViewById(R.id.vvPrueba);


        //para reproducir video
        Uri path = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.mlpatida);//recursos externos
        MediaController mc = new MediaController(this);//instancia para controles de video y reproduccion
        videoPrueba.setMediaController(mc);//Coloca los botones de reprocur, pausa y detener
        videoPrueba.setVideoURI(path);//llamado del URI es para identificar el cursos video a reproducir
        videoPrueba.setMediaController(new MediaController(this));//Integra los controles y el recurso URI
        videoPrueba.start();//ejecucion



    }
}