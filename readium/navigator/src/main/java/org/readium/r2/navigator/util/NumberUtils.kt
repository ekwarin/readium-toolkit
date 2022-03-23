package org.readium.r2.navigator.util

/*******************************************************************************
 * Copyright 2015 ShopGun
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

object NumberUtils {
    const val FLOAT_EPSILON = 0.001f
    const val DOUBLE_EPSILON = 0.001

    /**
     * Method for detecting if two floats are almost equal (epsilon [NumberUtils.FLOAT_EPSILON])
     * Inconsistencies are to be expected, due to the nature of float values in java
     *
     * @param lhs  a float
     * @param rhs another float
     * @return true if equal, else false
     */
    fun isEqual(lhs: Float, rhs: Float): Boolean {
        return NumberUtils.isEqual(lhs, rhs, NumberUtils.FLOAT_EPSILON)
    }

    /**
     * Method for detecting if two floats are almost equal
     * Inconsistencies are to be expected, due to the nature of float values in java
     *
     * @param lhs   a float
     * @param rhs  another float
     * @param epsilon The precision of the measurement
     * @return true if equal, else false
     */
    fun isEqual(lhs: Float, rhs: Float, epsilon: Float): Boolean {
        return java.lang.Float.compare(lhs, rhs) == 0 || Math.abs(lhs - rhs) <= epsilon
    }

    /**
     * Method for detecting if two floats are almost equal (epsilon [NumberUtils.DOUBLE_EPSILON])
     * Inconsistencies are to be expected, due to the nature of double values in java
     *
     * @param lhs  a float
     * @param rhs another float
     * @return true if equal, else false
     */
    fun isEqual(lhs: Double, rhs: Double): Boolean {
        return NumberUtils.isEqual(lhs, rhs, NumberUtils.DOUBLE_EPSILON)
    }

    /**
     * Method for detecting if two floats are almost equal
     * Inconsistencies are to be expected, due to the nature of double values in java
     *
     * @param lhs   a float
     * @param rhs  another float
     * @param epsilon The precision of the measurement
     * @return true if equal, else false
     */
    fun isEqual(lhs: Double, rhs: Double, epsilon: Double): Boolean {
        return java.lang.Double.compare(lhs, rhs) == 0 || Math.abs(lhs - rhs) <= epsilon
    }

    /**
     * Clamp the current value in between a min and max value.
     * @param min the lower bound
     * @param current value to check
     * @param max the upper bound
     * @return `min` if `current` if less than `min`,
     * or `max` if `current` is greater than `max`,
     * else `current`.
     */
    fun clamp(min: Float, current: Float, max: Float): Float {
        return Math.max(min, Math.min(current, max))
    }

    /**
     * Clamp the current value in between a min and max value.
     * @param min the lower bound
     * @param current value to check
     * @param max the upper bound
     * @return `min` if `current` if less than `min`,
     * or `max` if `current` is greater than `max`,
     * else `current`.
     */
    fun clamp(min: Long, current: Long, max: Long): Long {
        return Math.max(min, Math.min(current, max))
    }

    /**
     * Clamp the current value in between a min and max value.
     * @param min the lower bound
     * @param current value to check
     * @param max the upper bound
     * @return `min` if `current` if less than `min`,
     * or `max` if `current` is greater than `max`,
     * else `current`.
     */
    fun clamp(min: Int, current: Int, max: Int): Int {
        return Math.max(min, Math.min(current, max))
    }

    /**
     * Clamp the current value in between a min and max value.
     * @param min the lower bound
     * @param current value to check
     * @param max the upper bound
     * @return `min` if `current` if less than `min`,
     * or `max` if `current` is greater than `max`,
     * else `current`.
     */
    fun clamp(min: Double, current: Double, max: Double): Double {
        return Math.max(min, Math.min(current, max))
    }
}