
package org.sr.media.glrecorder.example;

import android.app.Activity;
import android.os.Bundle;

import com.example.jianhua.glrecorder_android.R;

import org.sr.media.glrecorder.SRGLRecorder;


public class MainActivity extends Activity {

    private SRGLRecorder glRecorder = new SRGLRecorder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_layout);

        glRecorder.start("");
    }
}
