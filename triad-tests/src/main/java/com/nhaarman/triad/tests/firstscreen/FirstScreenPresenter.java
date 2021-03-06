/*
 * Copyright 2016 Niek Haarman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nhaarman.triad.tests.firstscreen;

import android.support.annotation.NonNull;
import com.nhaarman.triad.BasePresenter;
import com.nhaarman.triad.tests.ActivityComponent;

public class FirstScreenPresenter extends BasePresenter<FirstScreenContainer, ActivityComponent> {

    private int mCounter;

    @Override
    protected void onControlGained(@NonNull final FirstScreenContainer container, @NonNull final ActivityComponent activityComponent) {
        container.setText(String.valueOf(mCounter));
    }

    public void onButtonClicked() {
        mCounter++;

        if (!container().isPresent()) {
            return;
        }

        container().get().setText(String.valueOf(mCounter));
    }
}
