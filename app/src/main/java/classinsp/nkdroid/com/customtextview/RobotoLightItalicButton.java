package classinsp.nkdroid.com.customtextview;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

/**
 * Created by nirav on 10/10/15.
 */
public class RobotoLightItalicButton extends AppCompatButton {


    public RobotoLightItalicButton(Context context) {
        super(context);
        setTypeface(context);
    }

    public RobotoLightItalicButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(context);
    }

    public RobotoLightItalicButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setTypeface(context);
    }

    private void setTypeface(Context context)
    {
        if (context != null && !isInEditMode())
        {
            setTypeface(MyApplication.getRobotoLightItalic());
        }
    }
}
