package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.boot.context.properties.source.ConfigurationPropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


@Component
public class SimpleService {

    @Autowired
    private Environment environment;

    public SimpleRecord simple() {

        ConfigurationPropertySources.attach(environment);
        Binder binder = new Binder(ConfigurationPropertySources.get(environment));
        SimpleRecord record = binder.bindOrCreate("retry", SimpleRecord.class);
        return record;
    }

}
