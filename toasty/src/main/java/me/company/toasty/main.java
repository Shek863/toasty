package me.company.toasty;

import android.content.Context;
import android.widget.Toast;

public class main {

    public static void toastyLong(String msg ,Context context) {
        Toast.makeText(context, msg , Toast.LENGTH_LONG).show();
    }
    public static void toastyShort(String msg ,Context context) {
        Toast.makeText(context, msg , Toast.LENGTH_SHORT).show();
    }

}
