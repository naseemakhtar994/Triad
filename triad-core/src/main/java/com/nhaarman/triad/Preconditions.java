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

package com.nhaarman.triad;

import org.jetbrains.annotations.NonNls;

@SuppressWarnings("BooleanParameter")
final class Preconditions {

    private static final Object[] NO_ARGS = {};

    private Preconditions() {
    }

    /**
     * Ensures that an object reference passed as a parameter to the calling method is not null.
     *
     * @param reference an object reference
     *
     * @return the non-null reference that was validated
     *
     * @throws NullPointerException if {@code reference} is null
     */
    static <T> T checkNotNull(final T reference, @NonNls final String errorMessage) {
        return checkNotNull(reference, errorMessage, NO_ARGS);
    }

    /**
     * Ensures that an object reference passed as a parameter to the calling method is not null.
     *
     * @param reference an object reference
     *
     * @return the non-null reference that was validated
     *
     * @throws NullPointerException if {@code reference} is null
     */
    @SuppressWarnings("OverloadedVarargsMethod")
    static <T> T checkNotNull(final T reference, @NonNls final String errorMessage, @NonNls final Object... args) {
        if (reference == null) {
            throw new NullPointerException(String.format(errorMessage, args));
        }

        return reference;
    }

    /**
     * @throws IllegalArgumentException if condition is false.
     */
    static void checkArgument(final boolean condition, @NonNls final String errorMessage) {
        checkArgument(condition, errorMessage, NO_ARGS);
    }

    /**
     * @throws IllegalArgumentException if condition is false.
     */
    @SuppressWarnings("OverloadedVarargsMethod")
    static void checkArgument(final boolean condition, @NonNls final String errorMessage, @NonNls final Object... args) {
        if (!condition) {
            throw new IllegalArgumentException(String.format(errorMessage, args));
        }
    }

    /**
     * @throws IllegalArgumentException if expression is false.
     */
    static void checkState(final boolean expression, @NonNls final String errorMessage) {
        checkState(expression, errorMessage, NO_ARGS);
    }

    /**
     * @throws IllegalArgumentException if expression is false.
     */
    @SuppressWarnings("OverloadedVarargsMethod")
    static void checkState(final boolean expression, @NonNls final String errorMessage, @NonNls final Object... args) {
        if (!expression) {
            throw new IllegalStateException(String.format(errorMessage, args));
        }
    }
}