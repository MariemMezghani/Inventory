# Overview
This is the first project in the Kotlin Android Developer Nanodegree.
The inventory app allows the user to save products of his store in a database and retrieve the list of all products and their details in the main page. 
The listing page will show the list of products and show a button for adding a new product, while the detail page will be for adding a product entry.

# Screenshots
![login](https://user-images.githubusercontent.com/35550711/104339335-c3966200-54f7-11eb-97bc-2c53a1e68779.jpg)   ![first](https://user-images.githubusercontent.com/35550711/104339481-ec1e5c00-54f7-11eb-9a71-7f98d54bea75.jpg)   ![second](https://user-images.githubusercontent.com/35550711/104339663-21c34500-54f8-11eb-9a32-48652df04371.jpg)   ![third](https://user-images.githubusercontent.com/35550711/104339861-59ca8800-54f8-11eb-8a7f-1375817befe5.jpg)   ![main](https://user-images.githubusercontent.com/35550711/104339994-854d7280-54f8-11eb-9874-aed7dd96379c.jpg)   ![detail](https://user-images.githubusercontent.com/35550711/104340164-b463e400-54f8-11eb-9abf-5f7c10f903f2.jpg)

# Dependencies
    // Room and Lifecycle dependencies
    implementation "androidx.room:room-runtime:$version_room"
    kapt "androidx.room:room-compiler:$version_room"
    implementation "androidx.lifecycle:lifecycle-extensions:$version_lifecycle_extensions"

    // Coroutines
    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version_coroutine"
    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version_coroutine"

    // Navigation
    implementation "android.arch.navigation:navigation-fragment-ktx:$version_navigation"
    implementation "android.arch.navigation:navigation-ui-ktx:$version_navigation"

    // ViewModel and LiveData
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$version_lifecycle"
    implementation "androidx.activity:activity-ktx:$activity_version"
    implementation "androidx.fragment:fragment-ktx:$fragment_version"

    // Kotlin Extensions and Coroutines support for Room
    implementation "androidx.room:room-ktx:$version_room"
    testImplementation 'junit:junit:4.+'
    androidTestImplementation 'androidx.test.ext:junit:1.1.2'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.3.0'
    implementation "android.arch.navigation:navigation-fragment-ktx:$version_navigation"
    implementation "android.arch.navigation:navigation-ui-ktx:$version_navigation"
    kapt 'androidx.room:room-compiler:2.2.6'

    //RecyclerView dependency
    implementation "androidx.recyclerview:recyclerview:1.1.0"
    // For control over item selection of both touch and mouse driven selection
    implementation "androidx.recyclerview:recyclerview-selection:1.1.0-rc03"
    
# Built With

- AndroidX Room
- AndroidX Navigation
- KotlinX Coroutines
- AndroidX ViewModel 
- AndroidX RecyclerView

# License

Copyright 2021 Mariem Mezghani

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.


