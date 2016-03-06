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

import com.pacoworks.sealedunions.*;

public final class GenericUnions {
    public static <Value> Result.Factory<Value> resultFactory() {
        return new Result.Factory<Value>() {
            @Override
            public Result<Value> present(Value value) {
                return new Present<>(value);
            }

            @Override
            public Result<Value> absent() {
                return new Absent<>();
            }
        };
    }

    public static <T, U> Either.Factory<T, U> eitherFactory() {
        return new Either.Factory<T, U>() {
            @Override
            public Either<T, U> left(T t) {
                return new Left<>(t);
            }

            @Override
            public Either<T, U> right(U u) {
                return new Right<>(u);
            }
        };
    }

    public static <T> Try.Factory<T> tryFactory() {
        return new Try.Factory<T>() {
            @Override
            public Try<T> success(T value) {
                return new Success<>(value);
            }

            @Override
            public Try<T> failure(Exception exception) {
                return new Failure<>(exception);
            }
        };
    }

    public static <Result> Union1.Factory<Result> singletFactory() {
        return new Union1.Factory<Result>() {
            @Override
            public Union1<Result> first(Result result) {
                return new Present<>(result);
            }

            @Override
            public Union1<Result> none() {
                return new Absent<>();
            }
        };
    }

    public static <T, U> Union2.Factory<T, U> dupletFactory() {
        return new Union2.Factory<T, U>() {
            @Override
            public Union2<T, U> first(T t) {
                return new Left<>(t);
            }

            @Override
            public Union2<T, U> second(U u) {
                return new Right<>(u);
            }
        };
    }

    public static <T, U, V> Union3.Factory<T, U, V> tripletFactory() {
        return new Union3.Factory<T, U, V>() {
            @Override
            public Union3<T, U, V> first(T t) {
                return new Union3First<>(t);
            }

            @Override
            public Union3<T, U, V> second(U u) {
                return new Union3Second<>(u);
            }

            @Override
            public Union3<T, U, V> third(V v) {
                return new Union3Third<>(v);
            }
        };
    }

    public static <A, B, C, D> Union4.Factory<A, B, C, D> quartetFactory() {
        return new Union4.Factory<A, B, C, D>() {
            @Override
            public Union4<A, B, C, D> first(A a) {
                return null;
            }

            @Override
            public Union4<A, B, C, D> second(B b) {
                return null;
            }

            @Override
            public Union4<A, B, C, D> third(C c) {
                return null;
            }

            @Override
            public Union4<A, B, C, D> fourth(D d) {
                return null;
            }
        };
    }

    public static <A, B, C, D, E> Union5.Factory<A, B, C, D, E> quintetFactory() {
        return new Union5.Factory<A, B, C, D, E>() {
            @Override
            public Union5<A, B, C, D, E> first(A a) {
                return null;
            }

            @Override
            public Union5<A, B, C, D, E> second(B b) {
                return null;
            }

            @Override
            public Union5<A, B, C, D, E> third(C c) {
                return null;
            }

            @Override
            public Union5<A, B, C, D, E> fourth(D d) {
                return null;
            }

            @Override
            public Union5<A, B, C, D, E> fifth(E e) {
                return null;
            }
        };
    }

    public static <A, B, C, D, E, F> Union6.Factory<A, B, C, D, E, F> sextetFactory() {
        return new Union6.Factory<A, B, C, D, E, F>() {
            @Override
            public Union6<A, B, C, D, E, F> first(A a) {
                return null;
            }

            @Override
            public Union6<A, B, C, D, E, F> second(B b) {
                return null;
            }

            @Override
            public Union6<A, B, C, D, E, F> third(C c) {
                return null;
            }

            @Override
            public Union6<A, B, C, D, E, F> fourth(D d) {
                return null;
            }

            @Override
            public Union6<A, B, C, D, E, F> fifth(E e) {
                return null;
            }

            @Override
            public Union6<A, B, C, D, E, F> sixth(F f) {
                return null;
            }
        };
    }

    public static <A, B, C, D, E, F, G> Union7.Factory<A, B, C, D, E, F, G> septetFactory() {
        return new Union7.Factory<A, B, C, D, E, F, G>() {
            @Override
            public Union7<A, B, C, D, E, F, G> first(A a) {
                return null;
            }

            @Override
            public Union7<A, B, C, D, E, F, G> second(B b) {
                return null;
            }

            @Override
            public Union7<A, B, C, D, E, F, G> third(C c) {
                return null;
            }

            @Override
            public Union7<A, B, C, D, E, F, G> fourth(D d) {
                return null;
            }

            @Override
            public Union7<A, B, C, D, E, F, G> fifth(E e) {
                return null;
            }

            @Override
            public Union7<A, B, C, D, E, F, G> sixth(F f) {
                return null;
            }

            @Override
            public Union7<A, B, C, D, E, F, G> seventh(G g) {
                return null;
            }
        };
    }

    public static <A, B, C, D, E, F, G, H> Union8.Factory<A, B, C, D, E, F, G, H> octetFactory() {
        return new Union8.Factory<A, B, C, D, E, F, G, H>() {
            @Override
            public Union8<A, B, C, D, E, F, G, H> first(A a) {
                return null;
            }

            @Override
            public Union8<A, B, C, D, E, F, G, H> second(B b) {
                return null;
            }

            @Override
            public Union8<A, B, C, D, E, F, G, H> third(C c) {
                return null;
            }

            @Override
            public Union8<A, B, C, D, E, F, G, H> fourth(D d) {
                return null;
            }

            @Override
            public Union8<A, B, C, D, E, F, G, H> fifth(E e) {
                return null;
            }

            @Override
            public Union8<A, B, C, D, E, F, G, H> sixth(F f) {
                return null;
            }

            @Override
            public Union8<A, B, C, D, E, F, G, H> seventh(G g) {
                return null;
            }

            @Override
            public Union8<A, B, C, D, E, F, G, H> eighth(H h) {
                return null;
            }
        };
    }

    public static <A, B, C, D, E, F, G, H, I> Union9.Factory<A, B, C, D, E, F, G, H, I> ninetetFactory() {
        return new Union9.Factory<A, B, C, D, E, F, G, H, I>() {
            @Override
            public Union9<A, B, C, D, E, F, G, H, I> first(A a) {
                return null;
            }

            @Override
            public Union9<A, B, C, D, E, F, G, H, I> second(B b) {
                return null;
            }

            @Override
            public Union9<A, B, C, D, E, F, G, H, I> third(C c) {
                return null;
            }

            @Override
            public Union9<A, B, C, D, E, F, G, H, I> fourth(D d) {
                return null;
            }

            @Override
            public Union9<A, B, C, D, E, F, G, H, I> fifth(E e) {
                return null;
            }

            @Override
            public Union9<A, B, C, D, E, F, G, H, I> sixth(F f) {
                return null;
            }

            @Override
            public Union9<A, B, C, D, E, F, G, H, I> seventh(G g) {
                return null;
            }

            @Override
            public Union9<A, B, C, D, E, F, G, H, I> eighth(H h) {
                return null;
            }

            @Override
            public Union9<A, B, C, D, E, F, G, H, I> ninth(I i) {
                return null;
            }
        };
    }
}