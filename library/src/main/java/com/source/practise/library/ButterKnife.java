package com.source.practise.library;

import android.app.Activity;

/**
 * <p>Class: com.source.practise.library.ButterKnife</p>
 * <p>Description: </p>
 * <pre>
 *
 *  </pre>
 *
 * @author lujunjie
 * @date 2019/4/26/16:02.
 */
public class ButterKnife {
    public static void bind(Activity activity) {
        String className = activity.getClass().getName() + "$ViewBinder";

        try {
            Class<?> viewBindClass = Class.forName(className);
            ViewBinder viewBinder = (ViewBinder) viewBindClass.newInstance();
            viewBinder.bind(activity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
