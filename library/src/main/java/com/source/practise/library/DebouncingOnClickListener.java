package com.source.practise.library;

import android.view.View;

/**
 * <p>Class: com.source.practise.library.DebouncingOnClickListener</p>
 * <p>Description: </p>
 * <pre>
 *
 *  </pre>
 *
 * @author lujunjie
 * @date 2019/4/26/16:42.
 */
public abstract class DebouncingOnClickListener implements View.OnClickListener{
    @Override
    public void onClick(View v) {
        doClick(v);
    }

    protected abstract void doClick(View v);
}
