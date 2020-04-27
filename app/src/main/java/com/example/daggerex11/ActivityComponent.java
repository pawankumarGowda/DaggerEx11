package com.example.daggerex11;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Subcomponent;

@PreActivity
@Subcomponent(modules = {WheelModule.class, PetrolEngineModule.class})

public interface ActivityComponent {
    Car getCar();

    void inject(MainActivity mainActivity);

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        ActivityComponent build();

    }
}
