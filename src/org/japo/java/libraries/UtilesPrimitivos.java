/*
 * Copyright 2019 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;

import java.util.Random;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public class UtilesPrimitivos {

    public static final int NUM;
    public static final int N_MIN;
    public static final int N_MAX;

    public static final int RANGE_IN = 0;
    public static final int RANGE_BELOW = 1;
    public static final int RANGE_ABOVE = 2;

    static {

        final Random RND = new Random();

        final int MAX = 10;
        final int MIN = 1;

        N_MAX = RND.nextInt(MAX - MIN + 1) + MIN;

        N_MIN = RND.nextInt(N_MAX - MIN + 1) + MIN;

        NUM = RND.nextInt(MAX - MIN + 1) + MIN;

    }

    public static final int analizarRango(double num, double min, double max) {
        int resultado;

        if (num > max) {
            resultado = RANGE_ABOVE;
        } else if (num < min) {
            resultado = RANGE_BELOW;
        } else {
            resultado = RANGE_IN;
        }

        return resultado;

    }

}
