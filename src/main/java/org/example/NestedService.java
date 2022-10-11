package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.boot.context.properties.source.ConfigurationPropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class NestedService {

    @Autowired
    private Environment environment;

    public Nested nested() {

        ConfigurationPropertySources.attach(environment);
        Binder binder = new Binder(ConfigurationPropertySources.get(environment));

        Nested record = binder.bindOrCreate("outer", Nested.class);
        return record;
    }

}
