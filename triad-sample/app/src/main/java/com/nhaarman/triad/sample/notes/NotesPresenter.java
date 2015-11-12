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

package com.nhaarman.triad.sample.notes;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.nhaarman.triad.BasePresenter;
import com.nhaarman.triad.TransitionAnimator;
import com.nhaarman.triad.Triad;
import com.nhaarman.triad.sample.ActivityComponent;
import com.nhaarman.triad.sample.Note;
import com.nhaarman.triad.sample.editnote.EditNoteScreen;
import com.nhaarman.triad.sample.notes.noteslist.NotesListPresenter;

class NotesPresenter extends BasePresenter<NotesContainer, ActivityComponent> implements NotesListPresenter.OnNoteClickedListener {

  @NonNull
  private final Triad mTriad;

  NotesPresenter(@NonNull final Triad triad) {
    mTriad = triad;
  }

  public void onCreateNoteClicked() {
    mTriad.goTo(new EditNoteScreen());
  }

  @Override
  public void onNoteClicked(@NonNull final Note note) {
    mTriad.goTo(new EditNoteScreen(note));
  }
}
