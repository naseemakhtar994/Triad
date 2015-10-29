package com.nhaarman.triad;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.support.annotation.NonNull;

public class TriadUtil {

  private TriadUtil() {
  }

  @NonNull
  public static <ActivityComponent> ActivityComponent findActivityComponent(@NonNull final Context context) {
    Context baseContext = context;
    while (!(baseContext instanceof Activity) && baseContext instanceof ContextWrapper) {
      baseContext = ((ContextWrapper) baseContext).getBaseContext();
    }

    if (baseContext instanceof ActivityComponentProvider) {
      //noinspection unchecked
      return ((ActivityComponentProvider<ActivityComponent>) baseContext).getActivityComponent();
    } else {
      /* We return null, since the layout editor can not return the Activity Component. */
      //noinspection ConstantConditions
      return null;
    }
  }

  @NonNull
  public static <P extends Presenter<?, ?>> P findPresenter(@NonNull final Context context, @NonNull final Class<P> presenterClass) {
    Context baseContext = context;
    while (!(baseContext instanceof Activity) && baseContext instanceof ContextWrapper) {
      baseContext = ((ContextWrapper) baseContext).getBaseContext();
    }

    if (baseContext instanceof ScreenProvider) {
      //noinspection unchecked
      return (P) ((ScreenProvider) baseContext).getCurrentScreen().getPresenter(presenterClass);
    } else {
       /* We return null, since the layout editor can not return the ScreenProvider. */
      //noinspection ConstantConditions
      return null;
    }
  }
}