package com.nhaarman.gable.presenter;

import com.nhaarman.gable.container.Container;
import com.nhaarman.gable.container.ScreenContainer;
import com.nhaarman.gable.screen.Screen;

/**
 * A {@link Presenter} class that is used in combination with a {@link Screen} and a {@link ScreenContainer}.
 *
 * @param <P> The specialized {@link ScreenPresenter} type.
 * @param <C> The specialized {@link ScreenContainer} type.
 */
public abstract class ScreenPresenter<P extends Presenter<P, C>, C extends Container<P, C>> extends Presenter<P, C> {

  /**
   * Called when the back button has been pressed.
   *
   * @return true if the event has been handled, false otherwise.
   */
  public boolean onBackPressed() {
    return false;
  }
}
