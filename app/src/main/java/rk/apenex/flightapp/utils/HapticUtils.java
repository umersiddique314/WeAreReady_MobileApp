package rk.apenex.flightapp.utils;

import android.content.Context;
import android.os.VibrationEffect;
import android.os.Vibrator;

public class HapticUtils {

    public static void performHapticFeedback(Context context) {
        Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);

        // Check if the device has a vibrator
        if (vibrator != null && vibrator.hasVibrator()) {
            // Vibrate for 50 milliseconds
            vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE));
        }
    }
}

