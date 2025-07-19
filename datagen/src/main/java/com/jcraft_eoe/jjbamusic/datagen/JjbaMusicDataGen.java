package com.jcraft_eoe.jjbamusic.datagen;

import com.jcraft_eoe.jjbamusic.datagen.provider.assets.JMModelProvider;
import com.jcraft_eoe.jjbamusic.datagen.provider.data.JMTagProviders;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class JjbaMusicDataGen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        final FabricDataGenerator.Pack pack = generator.createPack();
        pack.addProvider(JMModelProvider::new);
        pack.addProvider(JMTagProviders.JMItemTags::new);
    }
}
