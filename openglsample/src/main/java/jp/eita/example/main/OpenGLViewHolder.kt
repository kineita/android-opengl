/*
 * Copyright [2020 - Present] [Lê Trần Ngọc Thành - 瑛太 (eita)] [kineita (Github)]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jp.eita.example.main

import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import jp.eita.example.R


class OpenGLViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val buttonResearch: Button = itemView.findViewById(R.id.button_research_view)

    var openGLParameters: OpenGLParameters = OpenGLParameters()
        set(value) {
            field = value
            buttonResearch.text = value.name
            itemView.tag = value.name
        }
}