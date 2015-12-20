
package org.sr.media.glrecorder;


import android.content.Context;

public class SRGLRecorder {

    private String filePath = "";
    private Context context;

    public SRGLRecorder(Context ctx) {
        context = ctx;
    }

    public void start(String path) {
        filePath = path;


    }

    public void stop() {

    }
}
