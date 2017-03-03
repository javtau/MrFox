package com.javier_lozano.mrfoxtest;

import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;

import com.javier_lozano.mrfox.MyLogin;
import com.javier_lozano.mrfox.R;

import org.junit.runner.RunWith;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest extends ActivityInstrumentationTestCase2<MyLogin> {
    private Button btn_entrar;
    private MyLogin actividad;

    public ExampleInstrumentedTest() {
//		super("com.example.calc", MainActivity.class);
        super(MyLogin.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        actividad = getActivity();
        btn_entrar = (Button) actividad.findViewById(R.id.btn_login);

    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testAddValues() {
        // now click the loggin button
        TouchUtils.clickView(this, btn_entrar);

        assertTrue("Add result should be...", btn_entrar.callOnClick());
    }
}
