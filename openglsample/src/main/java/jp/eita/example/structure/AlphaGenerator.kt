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

class AlphaGenerator(val originalValue: Int) {

    private var rangeAlpha = intArrayOf(
            originalValue,
            (originalValue * 0.8).toInt(),
            (originalValue * 0.7).toInt(),
            (originalValue * 0.4).toInt(),
            (originalValue * 0.2).toInt(),
            (originalValue * 0.4).toInt(),
            (originalValue * 0.6).toInt(),
            (originalValue * 0.7).toInt(),
            (originalValue * 0.8).toInt(),
            originalValue
    )

    private var crawlerAlpha: Int = 0

    val alphaValue: Int
        get() {
            when {
                crawlerAlpha >= rangeAlpha.size - 1 -> {
                    crawlerAlpha = 0
                }
                else -> {
                    crawlerAlpha += 1
                }
            }

            return rangeAlpha[crawlerAlpha]
        }
}