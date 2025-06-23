# Flutter
-keep class io.flutter.app.** { *; }
-keep class io.flutter.plugin.** { *; }
-keep class io.flutter.util.** { *; }
-keep class io.flutter.view.** { *; }
-keep class io.flutter.** { *; }

# Keep model classes
-keep class com.example.asma_ul_husna.model.** { *; }
# Keep Gson or other JSON libraries if used
-keep class com.google.gson.** { *; }
-keepattributes Signature
-keepattributes *Annotation*