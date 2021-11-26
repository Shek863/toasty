package me.company.toasty;

import android.content.Context;
import android.widget.Toast;

public class Toasty {

    public static void Long(String msg ,Context context) {
        Toast.makeText(context, msg , Toast.LENGTH_LONG).show();
    }
    public static void Short(String msg ,Context context) {
        Toast.makeText(context, msg , Toast.LENGTH_SHORT).show();
    }

}
