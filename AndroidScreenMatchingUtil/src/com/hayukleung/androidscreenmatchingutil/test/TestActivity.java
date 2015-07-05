/**
 * 
 */
package com.hayukleung.androidscreenmatchingutil.test;

import com.cndatacom.cdcutils.method.LogMgr;
import com.hayukleung.androidscreenmatchingutil.Screen;

import android.app.Activity;
import android.os.Bundle;

/**
 * @author hayukleung
 *
 */
public class TestActivity extends Activity {

    /* (non-Javadoc)
     * @see android.app.Activity#onCreate(android.os.Bundle)
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        
        Screen screen = Screen.getInstance(TestActivity.this);
        LogMgr.showLog(TestActivity.this, "widthPx      --> " + screen.widthPx);
        LogMgr.showLog(TestActivity.this, "heightPx     --> " + screen.heightPx);
        LogMgr.showLog(TestActivity.this, "densityDpi   --> " + screen.densityDpi);
        LogMgr.showLog(TestActivity.this, "densityScale --> " + screen.densityScale);
        LogMgr.showLog(TestActivity.this, "fontScale    --> " + screen.fontScale);
        LogMgr.showLog(TestActivity.this, "orientation  --> " + screen.orientation);
    }
}
