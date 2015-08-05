/*
 * Copyright 2015 Niek Haarman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nhaarman.triad;

import android.support.annotation.NonNull;

/**
 * An interface to provide a callback when a new screen is presented.
 *
 * @param <ActivityComponent> The MainComponent in the application.
 */
public interface OnScreenChangedListener<ApplicationComponent, ActivityComponent> {

  /**
   * Callback method which is called when a new screen is presented.
   *
   * @param screen The newly added screen.
   */
  void onScreenChanged(@NonNull Screen<ApplicationComponent, ActivityComponent, ?, ?> screen);
}
