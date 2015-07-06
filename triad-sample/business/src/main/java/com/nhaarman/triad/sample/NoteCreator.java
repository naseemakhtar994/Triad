/*
 * Copyright 2015 Niek Haarman
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

package com.nhaarman.triad.sample;

import javax.inject.Inject;
import android.support.annotation.NonNull;

public class NoteCreator {

  @NonNull
  private final NoteRepository mNoteRepository;

  @Inject
  public NoteCreator(@NonNull final NoteRepository noteRepository) {
    mNoteRepository = noteRepository;
  }

  @NonNull
  public Note createNote(final String title, final String contents) {
    Note note = new Note();

    note.setTitle(title);
    note.setContents(contents);
    note.setCreated(System.currentTimeMillis());

    mNoteRepository.create(note);

    return note;
  }
}
