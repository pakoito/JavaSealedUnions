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

import java.util.function.Consumer;
import java.util.function.Function;

import com.pacoworks.sealedunions.Union8;

class Union8Fifth<A, B, C, D, E, F, G, H> implements Union8<A, B, C, D, E, F, G, H> {
    private final E value;

    public Union8Fifth(E value) {
        this.value = value;
    }

    @Override
    public void continued(Consumer<A> continuationFirst, Consumer<B> continuationSecond,
            Consumer<C> continuationThird, Consumer<D> continuationFourth,
            Consumer<E> continuationFifth, Consumer<F> continuationSixth,
            Consumer<G> continuationSeventh, Consumer<H> continuationEighth) {
        continuationFifth.accept(value);
    }

    @Override
    public <R> R join(Function<A, R> mapFirst, Function<B, R> mapSecond, Function<C, R> mapThird,
            Function<D, R> mapFourth, Function<E, R> mapFifth, Function<F, R> mapSixth,
            Function<G, R> mapSeventh, Function<H, R> mapEighth) {
        return mapFifth.apply(value);
    }
}