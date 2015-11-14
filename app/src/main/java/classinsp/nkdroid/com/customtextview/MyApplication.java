package classinsp.nkdroid.com.customtextview;

import android.app.Application;
import android.graphics.Typeface;

/**
 * Created by nirav on 10/10/15.
 */
public class MyApplication extends Application {

    private static Typeface robotoItalic;
    private static Typeface robotoLightItalic;
    private static Typeface robotMediumItalic;
    private static Typeface robotoRegularLight;
    private static Typeface robotoRegular;
    @Override
    public void onCreate() {
        super.onCreate();
        robotoItalic=Typeface.createFromAsset(getApplicationContext().getAssets(),"fonts/i.ttf");
        robotoLightItalic=Typeface.createFromAsset(getApplicationContext().getAssets(),"fonts/li.ttf");
        robotMediumItalic=Typeface.createFromAsset(getApplicationContext().getAssets(),"fonts/mi.ttf");
        robotoRegularLight=Typeface.createFromAsset(getApplicationContext().getAssets(),"fonts/rl.ttf");
        robotoRegular=Typeface.createFromAsset(getApplicationContext().getAssets(),"fonts/rr.ttf");
    }


    public static Typeface getRobotoItalic(){
        return robotoItalic;
    }

    public static Typeface getRobotoLightItalic(){
        return robotoLightItalic;
    }

    public static Typeface getRobotMediumItalic(){
        return robotMediumItalic;
    }

    public static Typeface getRobotoRegularLight(){
        return robotoRegularLight;
    }

    public static Typeface getRobotoRegular(){
        return robotoRegular;
    }

}
