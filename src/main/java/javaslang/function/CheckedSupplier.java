/**    / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javaslang.function;

import java.io.Serializable;

/**
 * Checked version of java.util.function.Supplier.
 * Essentially the same as {@code CheckedFunction0<R>}, or short {@code X0<R>}.
 *
 * @param <R> Return type
 */
@FunctionalInterface
public interface CheckedSupplier<R> extends Serializable {

    R get() throws Throwable;
}
