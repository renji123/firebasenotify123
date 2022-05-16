package com.example.firebasenotify

import io.flutter.app.FlutterApplication
import io.flutter.plugin.common.PluginRegistry
import io.flutter.plugin.common.PluginRegistry.PluginRegistrantCallback
import io.flutter.view.FlutterMain
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;

class Application : FlutterApplication(), PluginRegistrantCallback {

    override fun onCreate() {
        super.onCreate()
//        FlutterFirebaseMessagingBackgroundService.startBackgroundIsolate(1, null)
        FlutterMain.startInitialization(this)
    }

    override fun registerWith(registry: PluginRegistry?) {
    }
}