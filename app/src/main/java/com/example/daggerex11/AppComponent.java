package com.example.daggerex11;

import javax.inject.Singleton;

import dagger.Component;

@Component (modules = DriverModule.class)
@Singleton
public interface AppComponent {
    //factory method
    ActivityComponent.Builder getActivityComponentBuilder();

}
