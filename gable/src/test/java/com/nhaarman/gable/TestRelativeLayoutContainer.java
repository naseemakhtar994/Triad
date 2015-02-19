package com.nhaarman.gable;

import android.content.Context;
import android.util.AttributeSet;
import com.nhaarman.gable.container.RelativeLayoutContainer;
import com.nhaarman.gable.container.ScreenContainer;

public class TestRelativeLayoutContainer extends RelativeLayoutContainer<TestPresenter, TestRelativeLayoutContainer>
    implements ScreenContainer<TestPresenter, TestRelativeLayoutContainer> {

  public TestRelativeLayoutContainer(final Context context) {
    super(context);
  }

  public TestRelativeLayoutContainer(final Context context, final AttributeSet attrs) {
    super(context, attrs);
  }

  public TestRelativeLayoutContainer(final Context context, final AttributeSet attrs, final int defStyle) {
    super(context, attrs, defStyle);
  }

  @Override
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
  }

  @Override
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
  }
}