/*
 *
 *  * Copyright [2020 - Present] [Lê Trần Ngọc Thành - 瑛太 (eita)] [kineita (Github)]
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  * http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package jp.eita.example.structure

class ScaleSizeRatioGenerator(val originalValue: Float) {

    private var rangeScaleRatio: FloatArray = floatArrayOf(
            originalValue * 0.4f,
            originalValue * 0.5f,
            originalValue * 0.6f,
            originalValue * 0.7f,
            originalValue,
            originalValue * 0.7f,
            originalValue * 0.6f,
            originalValue * 0.5f,
            originalValue * 0.4f
    )

    private var crawlerRangeScaleRatio: Int = 0

    val scaleRatioValue: Float
        get() {
            when {
                crawlerRangeScaleRatio >= rangeScaleRatio.size - 1 -> {
                    crawlerRangeScaleRatio = 0
                }
                else -> {
                    crawlerRangeScaleRatio += 1
                }
            }

            return rangeScaleRatio[crawlerRangeScaleRatio]
        }
}