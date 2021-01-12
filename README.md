# Overview
This is the first project in the Kotlin Android Developer Nanodegree.
The inventory app allows the user to save products of his store in a database and retrieve the list of all products and their details in the main page. 
The listing page will show the list of products and show a button for adding a new product, while the detail page will be for adding a product entry.

# Screenshots

![login](https://user-images.githubusercontent.com/35550711/104305853-80bf9480-54cd-11eb-9c72-2120023aeed5.jpg)   ![first](https://user-images.githubusercontent.com/35550711/104306417-34288900-54ce-11eb-86e8-2204e53edd2c.jpg)






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
