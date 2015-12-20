package org.sr.media.glrecorder;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;


public class SRGLView extends GLSurfaceView {

    private SRGLRenderer renderer;

    public SRGLView(Context context) {
        super(context);

        init();
    }

    public SRGLView(Context context, AttributeSet attrs) {
        super(context, attrs);

        init();
    }

    private void init() {
        renderer = new SRGLRenderer();
        setRenderer(renderer);
    }


}
