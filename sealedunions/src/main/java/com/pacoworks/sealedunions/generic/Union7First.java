/*
 * Copyright (c) pakoito 2016
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pacoworks.sealedunions.generic;

import com.pacoworks.sealedunions.Union7;

import java.util.function.Consumer;
import java.util.function.Function;

final class Union7First<A, B, C, D, E, F, G> implements Union7<A, B, C, D, E, F, G> {
    private final A value;

    public Union7First(A value) {
        this.value = value;
    }

    @Override
    public void continued(Consumer<A> continuationFirst, Consumer<B> continuationSecond,
            Consumer<C> continuationThird, Consumer<D> continuationFourth,
            Consumer<E> continuationFifth, Consumer<F> continuationSixth,
            Consumer<G> continuationSeventh) {
        continuationFirst.accept(value);
    }

    @Override
    public <R> R join(Function<A, R> mapFirst, Function<B, R> mapSecond, Function<C, R> mapThird,
            Function<D, R> mapFourth, Function<E, R> mapFifth, Function<F, R> mapSixth,
            Function<G, R> mapSeventh) {
        return mapFirst.apply(value);
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Union7First))
            return false;
        final Union7First other = (Union7First)o;
        final Object this$value = this.value;
        final Object other$value = other.value;
        return this$value == null ? other$value == null : this$value.equals(other$value);
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $value = this.value;
        result = result * PRIME + ($value == null ? 0 : $value.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
